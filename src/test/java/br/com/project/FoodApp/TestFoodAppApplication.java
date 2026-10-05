package br.com.project.FoodApp;

import org.springframework.boot.SpringApplication;

public class TestFoodAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(FoodAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
