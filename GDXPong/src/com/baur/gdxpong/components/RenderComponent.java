package com.baur.gdxpong.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;

public class RenderComponent {
	
	protected Sprite sprite;
	protected Texture texture;
	
	public RenderComponent(String fileName, Vector2 size){
		loadSprite(fileName, size);
	}
	
	protected void loadSprite(String fileName, Vector2 size){
		texture = new Texture(Gdx.files.internal(fileName));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Nearest);
		TextureRegion region = new TextureRegion(texture);

		sprite = new Sprite(region);
		sprite.setOrigin(sprite.getWidth()/2.0f, sprite.getHeight()/2.0f);
		
		sprite.setSize(size.x, size.y);
	}
	
	public Sprite getSprite(){
		return sprite;
	}
	
	public void setX(float x){
		sprite.setX(x);
	}
	public void setY(float y){
		sprite.setY(y);
	}
		
	public void dispose(){
		texture.dispose();
	}
	
	public void render(SpriteBatch batch){
		sprite.draw(batch);
	}
	
	public void followBody(Body body){
		setX(body.getPosition().x-sprite.getWidth()/2);
		setY(body.getPosition().y-sprite.getHeight()/2);
		getSprite().setRotation(body.getTransform().getRotation());
	}
}
