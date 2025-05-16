package com.springframe.springFramework.businessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBService implements DataService{

	@Override
	public int[] retrieveData() {
	
		return new int[] {1,2,0,3,4,10};
	}

}
