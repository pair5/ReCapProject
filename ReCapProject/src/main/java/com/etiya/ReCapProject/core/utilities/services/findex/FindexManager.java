package com.etiya.ReCapProject.core.utilities.services.findex;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.core.utilities.services.findex.externalFindexCalculator.FindexCalculator;

@Service
public class FindexManager implements FindexService{
	
	private final FindexCalculator findexCalculator;
	
	@Autowired
	public FindexManager(FindexCalculator findexCalculator) {
		super();
		this.findexCalculator = findexCalculator;
	}

	@Override
	public int calculateCustomerFindexScore() {
		return findexCalculator.calculateCustomerFindex();
	}
	
}
