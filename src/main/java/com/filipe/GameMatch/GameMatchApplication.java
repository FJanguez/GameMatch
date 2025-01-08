package com.filipe.GameMatch;

import com.filipe.GameMatch.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GameMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.showMenu();
	}
}
