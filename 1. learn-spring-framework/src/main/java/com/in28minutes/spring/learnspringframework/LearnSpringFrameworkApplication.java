package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		System.out.println("yo world");

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

//		Game game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();
//
//		game = new SuperContraGame();
//		runner = new GameRunner(game);
//		runner.run();
//
//		game = new PacManGame();
//		runner = new GameRunner(game);
//		runner.run();

//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
