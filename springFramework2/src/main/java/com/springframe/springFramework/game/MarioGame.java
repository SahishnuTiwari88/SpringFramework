package com.springframe.springFramework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("Jump UP - Mario Game");
	}
	
	public void down() {
		System.out.println("SIT down");
	}
	
	public void left() {
		System.out.println("Back");
	}
	
	public void right() {
		System.out.println("Forward");
	}
}
