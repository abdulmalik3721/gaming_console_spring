package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		var game = new PackMan();
		
		//var game = new SuperContra();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
