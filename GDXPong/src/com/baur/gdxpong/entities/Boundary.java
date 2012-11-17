package com.baur.gdxpong.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.baur.gdxpong.GameScreen;
import com.baur.gdxpong.components.PhysicsComponent;
import com.baur.gdxpong.components.RenderComponent;

public class Boundary implements Entity{
	
	protected GameScreen screen;
	protected Rectangle bounds;
	
	protected PhysicsComponent physicsComponent;
	protected RenderComponent renderComponent;
	
	public Boundary(GameScreen screen, Rectangle bounds){
		this.screen = screen;
		this.bounds = bounds;
		
		physicsComponent = new PhysicsComponent(this, screen.getWorld(), bounds);
		physicsComponent.getBody().setType(BodyType.StaticBody);
		
		renderComponent = new RenderComponent("data/2by2.png",new Vector2(bounds.getWidth(),bounds.getHeight()));
		renderComponent.followBody(physicsComponent.getBody());
	}
	
	@Override
	public String getType() {
		return "Boundary";
	}

	@Override
	public void update(float deltaT) {
		
	}

	@Override
	public void render(SpriteBatch batch) {
		renderComponent.render(batch);
	}

	@Override
	public void dispose() {
		physicsComponent.dispose();
		renderComponent.dispose();
	}

	@Override
	public void handleCollision(Contact contact) {
		
	}

	@Override
	public Rectangle getBounds() {
		return bounds;
	}

}
