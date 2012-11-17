package com.baur.gdxpong;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.baur.gdxpong.entities.Paddle;

public class PaddleInput implements InputProcessor{

	protected Array<Paddle> paddles;
	protected Camera camera;
	protected GameScreen screen;
	
	public PaddleInput(GameScreen screen, Camera camera){
		this.camera = camera;
		this.screen = screen;
		paddles = new Array<Paddle>(false,2);
	}
	
	public void addPaddle(Paddle paddle){
		paddles.add(paddle);
	}
	
	@Override
	public boolean touchDown(int x, int y, int pointer, int button) {
		return touchedOrDragged(x, y);
	}
	
	@Override
	public boolean touchDragged(int x, int y, int pointer) {
		return touchedOrDragged(x, y);
	}
	
	private boolean touchedOrDragged(int screenX, int screenY){
		boolean handled = false;
		Vector3 position = new Vector3(screenX, screenY, 0);
		camera.unproject(position, screen.viewport.x, screen.viewport.y, screen.viewport.width, screen.viewport.height);
		float x = position.x;
		float y = position.y;
		
		for(Paddle paddle : paddles){
			if(paddle.getInputRegion().contains(x, y)){
				paddle.setY(MathUtils.clamp(y, -GameScreen.gameHeight/2+paddle.getBounds().height/2+1, GameScreen.gameHeight/2-paddle.getBounds().height/2-1));
				handled = true;
			}
		}
		return handled;
	}
	

	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int x, int y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean touchMoved(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	


}
