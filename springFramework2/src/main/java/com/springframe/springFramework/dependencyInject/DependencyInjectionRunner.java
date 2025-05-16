package com.springframe.springFramework.dependencyInject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass{
	//@Autowired
	Dependency1 dependency1;//field injection, in same way if we have to use setter injection then @Autowired will be used on setter method
	
	//@Autowired
	Dependency2 dependency2;

	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Using @Autowire on setter - Dependency1");
		this.dependency1 = dependency1;
	}

	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Using @Autowire on setter - Dependency2");
		this.dependency2 = dependency2;
	}



	public String toString() {
		return "Using "+ dependency1  + " and " + dependency2 ; 
	}
	
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyInjectionRunner {

	public static void main(String[] args) {
		
	try(var context = new AnnotationConfigApplicationContext(DependencyInjectionRunner.class)){
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BusinessClass.class));
//		System.out.println(context.getBean(MyBusiness.class));
//		MyBusiness bean = context.getBean(MyBusiness.class);
//		bean.person1.name();
		
	}
		
	}

}
