package com.etiya.ReCapProject.business.requests.individualRequests;

import java.time.LocalDate;

import io.swagger.annotations.ApiKeyAuthDefinition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateIndividualCustomerRequest {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate birthdate;

}
