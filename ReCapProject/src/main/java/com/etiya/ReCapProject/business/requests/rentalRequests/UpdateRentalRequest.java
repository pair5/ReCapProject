package com.etiya.ReCapProject.business.requests.rentalRequests;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {

	@NonNull
	private int id;

	@NotNull
	private LocalDate rentDate;

	private LocalDate returnDate;

	@NotNull
	private int carId;
	
	@NotNull
	private int individualCustomerId;

}
