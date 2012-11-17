package com.baur.gdxpong.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.baur.gdxpong.GameScreen;
import com.baur.gdxpong.Player;
import com.baur.gdxpong.components.PhysicsComponent;

public class Goal implements Entity{

	protected GameScreen screen;
	protected PhysicsComponent physicsComponent;
	protected Player player;	
	
	protected Rectangle bounds;
	
	public Goal(GameScreen screen, Player player, Rectangle bounds){
		this.screen = screen;
		this.player = player;
		this.bounds = bounds;
		
		physicsComponent = new PhysicsComponent(this, screen.getWorld(), bounds);
		
		physicsComponent.getBody().setType(BodyType.StaticBody);
		physicsComponent.getFixture().setSensor(true);
		
	}
	
	@Override
	public String getType() {
		return "Goal";
	}

	@Override
	public void update(float deltaT) {
	}

	@Override
	public void render(SpriteBatch batch) {
	}

	@Override
	public void dispose() {
		physicsComponent.dispose();
	}

	@Override
	public void handleCollision(Contact contact) {
		String typeA = ((Entity)contact.getFixtureA().getUserData()).getType();
		String typeB = ((Entity)contact.getFixtureB().getUserData()).getType();
		if(typeA.equals("Ball") || typeB.equals("Ball")){
			player.score();
		}
	}

	@Override
	public Rectangle getBounds() {
		return bounds;
	}

}
