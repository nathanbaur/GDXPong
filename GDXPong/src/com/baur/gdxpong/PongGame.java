package com.baur.gdxpong;


import com.badlogic.gdx.Game;

public class PongGame extends Game {

	@Override
	public void create() {
		this.setScreen(new GameScreen());
	}
	
	@Override
	public void dispose(){
		this.getScreen().dispose();
		super.dispose();
	}
}
