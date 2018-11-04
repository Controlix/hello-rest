package be.mb.ict.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {
	
	private final GreetingService helloService;
	

	public HelloController(GreetingService helloService) {
		this.helloService = helloService;
	}


	@GetMapping
	public Greeting sayHello(@RequestParam(defaultValue = "World") String name) {
		return helloService.greet(name);
	}
}
