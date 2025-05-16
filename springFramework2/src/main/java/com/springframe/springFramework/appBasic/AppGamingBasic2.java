package com.springframe.springFramework.appBasic;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic2 {

	public static void main(String[] args) {
		
		//step 1: Launch spring context
//	var context = new	AnnotationConfigApplicationContext(AppConfiguration.class);
	//we are getting warning at context which can be resolved using try-catch block or by using try with resources block.
	try(var context = new	AnnotationConfigApplicationContext(AppConfiguration.class)){
		System.out.println(context.getBean("name"));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBeanDefinitionCount());
	}
	//use var instead of AnnotationConfigApplicationContext
		
		//step 2: configure the things that we want spring to manage i.e. @Configuration
//	System.out.println(context.getBean("name"));
//		
//	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//	
//	System.out.println(context.getBeanDefinitionCount());
	}

}
