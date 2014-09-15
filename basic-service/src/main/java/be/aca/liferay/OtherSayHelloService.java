package be.aca.liferay;

import org.springframework.stereotype.Service;

@Service
public class OtherSayHelloService {

	public String sayHello(String name) {
		return String.format("Hello other, %s!", name);
	}

	public MyPojo getPojo() {
		return new MyPojo();
	}
	
}
