package com.etiya.ReCapProject.business.requests.UserRequests;

import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserRequest {
	
	@Email
	private String email;
	
	private String password;


}
