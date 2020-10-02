package com.SpringBootPractice.Practice1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresentationLayerController{
	
	
	@GetMapping(value="/helloworld")
	private static String  getHelloWorld() {
		return "HELLO WORLD";
	}
	
	@GetMapping(value="/pathvariable/{value}") 
	private static Integer getPathVariable(@PathVariable(value="value") Integer values)
	{
		
		return values;
	}
	
	@GetMapping(value="/requestParam")
	private static String getRequestParam(@RequestParam String name,@RequestParam(value="id") String hi)
	{
		return name;
	}
	
	
}
