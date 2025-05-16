package com.springframe.springFramework.businessCalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class BusinessCalculationRuner {

	public static void main(String[] args) {
		
	try(var context = new AnnotationConfigApplicationContext(BusinessCalculationRuner.class)){
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("Maximum value : "+context.getBean(BusinessCalculationService.class).findMax());
		
		
	}
		
	}

}
