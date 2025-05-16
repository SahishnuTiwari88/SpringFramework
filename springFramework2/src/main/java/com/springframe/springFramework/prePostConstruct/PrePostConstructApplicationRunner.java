package com.springframe.springFramework.prePostConstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component// we can use @Named at place of component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependency are ready");
		
	}
	@PostConstruct
	public void initialize() {
		System.out.println("Post construct");
		someDependency.getReady();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Clean up");
	}
}

@Component
class SomeDependency{

	public void getReady() {
		System.out.println("Everything is ready in SomeDependency");
		
	}
	
}

@Configuration
@ComponentScan
public class PrePostConstructApplicationRunner {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostConstructApplicationRunner.class)){
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(SomeClass.class);
			
		}

	}

}
