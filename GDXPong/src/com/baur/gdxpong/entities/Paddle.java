package com.baur.gdxpong.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.baur.gdxpong.GameScreen;
import com.baur.gdxpong.components.PhysicsComponent;
import com.baur.gdxpong.components.RenderComponent;

public class Paddle implements Entity{
	
	protected GameScreen screen;
	protected Rectangle inputRegion;
	
	protected RenderComponent renderComponent;
	protected PhysicsComponent physicsComponent;
	
	public Paddle(GameScreen screen, Rectangle bounds, Rectangle inputRegion){
		this.screen = screen;		
		this.inputRegion = inputRegion;
		
		renderComponent = new RenderComponent("data/2by2.png",new Vector2(bounds.getWidth(),bounds.getHeight()));
//		renderComponent.getSprite().setColor(1f,0.8f,0.6f,1f);
		
		physicsComponent = new PhysicsComponent(this, screen.getWorld(), bounds);
		physicsComponent.getBody().setType(BodyType.KinematicBody);
	}
	
	public Rectangle getInputRegion(){
		return inputRegion;
	}
	
	public void setInputRegion(Rectangle inputRegion){
		this.inputRegion = inputRegion;
	}
	
	public void setY(float y){
		physicsComponent.getBody().setTransform(physicsComponent.getBody().getTransform().getPosition().x, y, 0);
	}
	
	@Override
	public String getType() {
		return "Paddle";
	}

	
	@Override
	public void update(float deltaT) {
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
		
	}

	@Override
	public void handleCollision(Contact contact) {
		String typeA = ((Entity)contact.getFixtureA().getUserData()).getType();
		String typeB = ((Entity)contact.getFixtureB().getUserData()).getType();
		if(typeA.equals("Ball") || typeB.equals("Ball")){
			Ball ball;
			if(typeA.equals("Ball")){
				ball = ((Ball)contact.getFixtureA().getUserData());
			}else{
				ball = ((Ball)contact.getFixtureB().getUserData());
			}
			float dist = (ball.getBounds().getY()+ball.getBounds().getHeight()/2) - (this.getBounds().getY()+this.getBounds().getHeight()/2);			
			Body ballBody = ball.physicsComponent.getBody();
			Vector2 currentVel = ballBody.getLinearVelocity();
			ballBody.setLinearVelocity(new Vector2(currentVel.x,MathUtils.clamp(currentVel.y+5f*dist,-40,40)));
			
		}
	}

	@Override
	public Rectangle getBounds() {
		return renderComponent.getSprite().getBoundingRectangle();
	}

}
