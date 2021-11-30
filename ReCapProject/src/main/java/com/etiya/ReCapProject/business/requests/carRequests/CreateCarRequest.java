package com.etiya.ReCapProject.business.requests.carRequests;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
    
    @JsonIgnore
    private int id;
	
    int colorId;
	private int brandId;
	@NotNull
	@Min(10)
	@Max(1000)
	private double dailyPrice;
	private int findexScore;
	private int modelYear;
	private String description;

}
