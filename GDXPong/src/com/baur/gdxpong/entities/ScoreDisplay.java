package com.baur.gdxpong.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Contact;
import com.baur.gdxpong.GameScreen;
import com.baur.gdxpong.Player;

public class ScoreDisplay implements Entity{

	private final static int digitWidth = 5;
	private final static int digitHeight = 7;
	
	protected GameScreen screen;

	protected Rectangle bounds;
	protected Player player;
	protected int lastScore;
	
	protected Texture font;
	protected TextureRegion[] rawDigits;
	protected Sprite displayDigit1;
	protected Sprite displayDigit2;

	
	public ScoreDisplay(GameScreen screen, Rectangle bounds, Player player){
		this.screen = screen;
		this.bounds = bounds;
		this.player = player;
		
		lastScore = 0;
		
		font = new Texture(Gdx.files.internal("data/digits.png"));
		font.setFilter(TextureFilter.Linear, TextureFilter.Nearest);
		
		rawDigits = new TextureRegion[10];
		TextureRegion[][] digitGrid = TextureRegion.split(font, 5, 7);
		int rowLen = digitGrid[0].length;
		for(int i=0; i<=9; i++){
			rawDigits[i] = digitGrid[i/rowLen][i%rowLen];
		}
		
		displayDigit1 = new Sprite(rawDigits[0]);
		displayDigit2 = new Sprite(rawDigits[0]);
		
		float scale = Math.min(bounds.width/((11.0f/5.0f)*digitWidth),bounds.height/((float)digitHeight));
		displayDigit1.setScale(scale);
		displayDigit2.setScale(scale);
		
		Vector2 padding = new Vector2(bounds.width-2.0f*digitWidth*scale,bounds.height-2.0f*digitHeight*scale);
		displayDigit1.setPosition(bounds.x+padding.x/2, bounds.y+padding.y/2);
		displayDigit2.setPosition(bounds.x+padding.x/2+displayDigit1.getWidth()*(6.0f/5.0f)*scale,bounds.y+padding.y/2);
	}

	
	@Override
	public String getType() {
		return "ScoreDisplay";
	}

	@Override
	public void update(float deltaT) {
		if(lastScore != player.getScore()){
			// should be listening instead of polling, but we'll worry about that when other "observers" come up
			lastScore = player.getScore();
			displayDigit1.setRegion(rawDigits[(lastScore/10)%10]);
			displayDigit2.setRegion(rawDigits[lastScore%10]);
		}
	}

	@Override
	public void render(SpriteBatch batch) {
		displayDigit1.draw(batch);
		displayDigit2.draw(batch);
	}

	@Override
	public void dispose() {
		font.dispose();
	}

	@Override
	public void handleCollision(Contact contact) {
		//no physicsComponent for this entity
		//handleCollision should be associated with PhysicsComponent instead of Entity, 
		//but it is not worth extending PhysicsComponent until subclasses can be used more than once
	}


	@Override
	public Rectangle getBounds() {
		return bounds;
	}

}
