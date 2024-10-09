package jwt.example.jwtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JwtdemoApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(JwtdemoApplication.class, args);
	}

}
