package com.etiya.ReCapProject.business.requests.rentalRequests;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {

	private int id;
	private LocalDate rentDate;
	private LocalDate returnDate;
	private int carId;
	private int individualCustomerId;

}
