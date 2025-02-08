package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole{
	
	
	public void up() {
		System.out.println("fly");
	}
	
	public void down() {
		System.out.println("go in hole");
		
	}
	
	public void left() {
		System.out.println("move left");
	}
	
	public void right() {
		System.out.println("move right");
	}
}
