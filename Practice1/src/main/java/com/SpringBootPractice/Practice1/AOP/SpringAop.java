package com.SpringBootPractice.Practice1.AOP;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Aspect
public class SpringAop {
	private static final Logger logger =  LoggerFactory.getLogger(SpringAop.class);

	@Before("execution(public * *(..))")
	private void before()
	{
		System.out.println("aya");
		logger.info("helloworld");
	}

}
