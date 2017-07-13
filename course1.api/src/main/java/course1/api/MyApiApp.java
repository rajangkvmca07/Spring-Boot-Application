package course1.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApiApp {

	public static void main(String[] args) {
		System.out.println("-------Added print Statement-----");
		SpringApplication.run(MyApiApp.class, args);

	}

}
