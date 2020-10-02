package com.SpringBootPractice.Practice1.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.SpringBootPractice.Practice1.APIModel.APIModel;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;


import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


@Log4j
@Slf4j
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
	
	//using https://api.spacexdata.com/v4/launches/latest
	@GetMapping(value="/tesla")
	private static APIModel getTesla()
	{
		RestTemplate resTemplate = new RestTemplate();
		APIModel apiModel = new APIModel();
		String url = "https://api.spacexdata.com/v4/launches/latest";
		try
		{
		apiModel = resTemplate.getForObject(url, APIModel.class);
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
			
		}
		return apiModel;
		
	}
	
	
}
