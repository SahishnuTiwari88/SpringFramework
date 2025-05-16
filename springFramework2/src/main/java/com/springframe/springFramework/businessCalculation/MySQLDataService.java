package com.springframe.springFramework.businessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		
		return new int[] {11,10,15,55,20,500};
	}

}
