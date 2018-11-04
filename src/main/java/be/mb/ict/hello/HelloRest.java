package be.mb.ict.hello;

import org.infinispan.manager.DefaultCacheManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class HelloRest {
	
    public static void main(String[] args) {
    	SpringApplication.run(HelloRest.class, args);
    }

}


