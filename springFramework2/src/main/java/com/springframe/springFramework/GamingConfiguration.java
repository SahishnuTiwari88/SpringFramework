package com.springframe.springFramework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springframe.springFramework.game")
public class GamingConfiguration {

//	@Bean
//	public GamingConsole game() {
//		var game = new MarioGame();
//		return game;
//	}
	
//	@Bean
//	public GameRunner gameRun(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		// gameRunner.run();
//		return gameRunner;
//		
//	}
}
