package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.PacmanGame;
import com.example.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		
		var game = new PacmanGame(); // 1. 객체 생성
		
		var gameRunner = new GameRunner(game);
				// 2. 객체 생성 + Wiring of Dependencies
				// Game is a Dependency of GameRunner
		
		gameRunner.run();

	}

}
