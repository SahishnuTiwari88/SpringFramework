package com.springframe.springFramework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;		
	}
	
	
	//using getter setter
//	public game getgame() {
//		return game;
//	}
//
//	public void setgame(game game) {
//		this.game = game;
//	}

	public void run() {
		game.up();	
		game.down();	
		game.left();	
		game.right();	
}
}
