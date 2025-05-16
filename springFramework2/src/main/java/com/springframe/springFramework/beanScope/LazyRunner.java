package com.springframe.springFramework.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)// we can use this or "prototype"
@Component
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		//System.out.println("Lazy loading...");
		this.classA = classA;
	}
	
}

@ComponentScan
public class LazyRunner {
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyRunner.class)){
			
			System.out.println("Application context startup done");
			
			System.out.println("Class A");
			System.out.println(context.getBean(ClassA.class));
			System.out.println(context.getBean(ClassA.class));
			System.out.println(context.getBean(ClassA.class));
			System.out.println(context.getBean(ClassA.class));
			
			
			System.out.println("Class B");
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class));
			context.getBean(ClassB.class);
		}
		
	}

}

//bean having two scopes 1. Singleton : in which it's reference(hash value) remain same all time we call it
//2. Prototype : it's reference changes in each call. using ConfigurableBeanFactory
