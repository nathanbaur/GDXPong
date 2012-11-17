package com.baur.gdxpong;

public class Player {

	protected int playerNum;
	protected int score;
	
	public Player(int number){
		this.playerNum = number;
		this.score = 0;
	}
	
	public int getScore(){
		return score;
	}
	
	public void score(){
		score += 1;
	}
	
}
