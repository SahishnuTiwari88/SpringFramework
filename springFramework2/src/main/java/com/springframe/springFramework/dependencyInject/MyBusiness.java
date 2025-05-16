package com.springframe.springFramework.dependencyInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MyBusiness {
	@Autowired
	Person1 person1; ////field injection : which is done without setter or constructor
	@Autowired
	Person2 person2;
	
	public String toString() {
		person1.name();
		return "Using "+ person1 + " and " + person2 ; 
	}

}
