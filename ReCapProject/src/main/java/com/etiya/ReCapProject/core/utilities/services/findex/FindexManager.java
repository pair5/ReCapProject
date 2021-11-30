package com.etiya.ReCapProject.core.utilities.services.findex;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class FindexManager implements FindexService{

	@Override
	public int individualCustomerFindexScore() {
		Random random=new Random();
		int tempNumber=random.nextInt(1899)+1;
		return tempNumber;
	}
	
}
