package com.example.learn_spring_framework;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.GamingConsole;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.PacmanGame;
import com.example.learn_spring_framework.game.SuperContraGame;

@Configuration

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguration.class)) {
		
			context.getBean(GamingConsole.class).up();	
			
			context.getBean(GameRunner.class).run(); 
		}

	}

}
