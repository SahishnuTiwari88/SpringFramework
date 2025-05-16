package com.springframe.springFramework.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy  //it is used when we just want to initialized any bean specifically while calling it only.
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Lazy loading...");
		this.classA = classA;
	}
	
}

@ComponentScan
public class LazyRunner {
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyRunner.class)){
			
			System.out.println("Application context startup done");
			context.getBean(ClassB.class);
		}
		
	}

}
