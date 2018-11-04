package be.mb.ict.hello;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	private static int greetingId = 1;

	@Cacheable("greetings")
	public Greeting greet(String name) {
		return new Greeting(greetingId++, name);
	}

}
