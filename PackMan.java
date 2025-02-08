package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GamingConsole;

public class PackMan implements GamingConsole{
	
	public void up() {
		System.out.println("fight");
	}
	
	public void down() {
		System.out.println("war");
		
	}
	
	public void left() {
		System.out.println("laughing");
	}
	
	public void right() {
		System.out.println("do not do ");
	}
}
