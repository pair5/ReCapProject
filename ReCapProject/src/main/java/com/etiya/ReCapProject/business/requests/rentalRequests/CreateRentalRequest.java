package com.etiya.ReCapProject.business.requests.rentalRequests;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRequest {

	@JsonIgnore
	private int id;
	 
	@NotNull
	private int carId;
	
	@NotNull
	private int customerId;
	
	@JsonIgnore
	private LocalDate rentDate;
	@JsonIgnore
	private LocalDate returnDate;
}
