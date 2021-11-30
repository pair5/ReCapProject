package com.etiya.ReCapProject.business.requests.UserRequests;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserRequest {
	
	@Email
	private String email;
	
	@Size(min = 6,max = 20)
	private String password;
}
