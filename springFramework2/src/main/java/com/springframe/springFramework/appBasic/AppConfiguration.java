package com.springframe.springFramework.appBasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record Person(String name,int age) {};

@Configuration
public class AppConfiguration {

	@Bean
	public String name() {
		return "Sarvesh";
	}
	
	@Bean(name="name1")
	public String name1() {
		return "Sarvesh Tiwari";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	//creating a new bean person2 using method call, with the help of existing beans i.e. name, age
	//@Bean
//	public Person person2MethodCall() {
//		return new Person(name(),age());// it will work in JDK version 16 or more
//	}
	
//other alternative is by using bean name as parameters 
	
//	public Person person3Parameter(String name,int age, Address address2) {//name,age
//		return new Person(name,age,address2);// it will work in JDK version 16 or more
//	}
}
