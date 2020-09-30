package com.SpringBootPractice.Practice1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationLayerController {
	
	
	@GetMapping(value="/helloworld")
	private static String  getHelloWorld() {
		return "HELLO WORLD";
	}
	
	@GetMapping(value="/pathvariable/{value}")
	private static String getPathVariable(@PathVariable(value="value") String values)
	{
		System.out.println("helloasdkasbkaa");
		
		return values;
	}
	
}
