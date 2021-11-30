package com.etiya.ReCapProject.business.requests.individualRequests;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndividualCustomerRequest {
	
	@JsonIgnore
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	private String email;
	private String password;
}
