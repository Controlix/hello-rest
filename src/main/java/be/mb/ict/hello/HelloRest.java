package be.mb.ict.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HelloRest {
	
    public static void main(String[] args) {
    	SpringApplication.run(HelloRest.class, args);
    }
}
