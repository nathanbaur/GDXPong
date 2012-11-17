package com.baur.gdxpong.components;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.baur.gdxpong.entities.Entity;

public class PhysicsComponent {

	protected World world;
	protected Body body;
	protected Fixture fixture;
	
	protected Entity owner;
	
	public PhysicsComponent(Entity owner, World world, Rectangle bounds){
		this.owner = owner;
		this.world = world;
		
		BodyDef bodyDef = new BodyDef();
		bodyDef.position.set(bounds.getX()+bounds.getWidth()/2, bounds.getY()+bounds.getHeight()/2);
		bodyDef.linearDamping = 0.0f;
		
		body = world.createBody(bodyDef);
		
		FixtureDef fixDef = new FixtureDef();
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(bounds.getWidth()/2, bounds.getHeight()/2);
		fixDef.shape = shape;
		
		fixture = body.createFixture(fixDef);
		
		shape.dispose();
		
		fixture.setUserData(owner);
	}
	
	public void setPosition(float x, float y){
		body.setTransform(x, y, 0);
	}
		
	public Body getBody(){
		return body;
	}
	
	public Fixture getFixture(){
		return fixture;
	}
	
	public void dispose(){
	}
}
