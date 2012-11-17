package com.baur.gdxpong.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.baur.gdxpong.GameScreen;
import com.baur.gdxpong.components.PhysicsComponent;
import com.baur.gdxpong.components.RenderComponent;

public class Ball implements Entity{
	
	protected GameScreen screen;
	
	protected RenderComponent renderComponent;
	protected PhysicsComponent physicsComponent;
	
	protected Sound sound;
	
	private boolean mustReset; // Box2D won't let you move the ball during collision handling
	
	public Ball(GameScreen screen, Rectangle bounds){
		this.screen = screen;
		renderComponent = new RenderComponent("data/2by2.png",new Vector2(bounds.getWidth(),bounds.getHeight()));

		physicsComponent = new PhysicsComponent(this, screen.getWorld(), bounds);
		physicsComponent.getBody().setBullet(true);
		physicsComponent.getBody().setType(BodyType.DynamicBody);
		physicsComponent.getFixture().setRestitution(1.1f);
		physicsComponent.getFixture().setFriction(0.0f);
		physicsComponent.getFixture().setDensity(1.0f);
		
		sound = Gdx.audio.newSound(Gdx.files.internal("data/bip.mp3"));
		
		mustReset = false;
		reset();
		
	}	

	private void reset(){
		physicsComponent.getBody().setTransform(0, 0, 0);
		Vector2 newVelocity = new Vector2(50.0f,0);
		
		float[] possibleAngles = {45f,135f,125f,315f};
		newVelocity.rotate(possibleAngles[MathUtils.random(possibleAngles.length-1)]+ MathUtils.random(-10f, 10f));
		
		physicsComponent.getBody().setLinearVelocity(newVelocity.x, newVelocity.y);
		mustReset = false;
	}
	
	@Override
	public String getType() {
		return "Ball";
	}

	@Override
	public void update(float deltaT) {
		if(mustReset | Math.abs(physicsComponent.getBody().getLinearVelocity().x) <= 0.1){ // in case it gets stuck
			reset();
		}
	}

	@Override
	public void render(SpriteBatch batch) {
		renderComponent.followBody(physicsComponent.getBody());
		renderComponent.render(batch);
	}

	@Override
	public void dispose() {
		renderComponent.dispose();
		physicsComponent.dispose();
		sound.dispose();
	}

	@Override
	public void handleCollision(Contact contact) {

		String typeA = ((Entity)contact.getFixtureA().getUserData()).getType();
		String typeB = ((Entity)contact.getFixtureB().getUserData()).getType();
		if(typeA.equals("Goal") || typeB.equals("Goal")){
			mustReset = true;
		}
		if(typeA.equals("Paddle") || typeB.equals("Paddle")){
			float pitch = MathUtils.clamp((physicsComponent.getBody().getLinearVelocity().len()-25) / 150f,0.25f,0.5f);
			sound.play(1f,pitch,0f);
		}
	}

	@Override
	public Rectangle getBounds() {
		return renderComponent.getSprite().getBoundingRectangle();
	}

}
