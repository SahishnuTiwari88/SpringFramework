package com.springframe.springFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame")
public class SuperContraGame implements GamingConsole{
	public void up() {
		System.out.println("Jump UP-SuperContraGame");
	}
	
	public void down() {
		System.out.println("SIT down");
	}
	
	public void left() {
		System.out.println("Back");
	}
	
	public void right() {
		System.out.println("Shoot bullet");
	}

}
