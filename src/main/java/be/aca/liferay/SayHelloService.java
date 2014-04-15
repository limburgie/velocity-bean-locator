package be.aca.liferay;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {

	public String sayHello(String name) {
		return String.format("Hello, %s!", name);
	}
	
}
