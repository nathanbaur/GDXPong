package com.baur.gdxpong.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Contact;

public interface Entity {

	public String getType();
	
	public void update(float deltaT);
	public void render(SpriteBatch batch);
	public void dispose();
	
	public void handleCollision(Contact contact);
	public Rectangle getBounds();
	
}
