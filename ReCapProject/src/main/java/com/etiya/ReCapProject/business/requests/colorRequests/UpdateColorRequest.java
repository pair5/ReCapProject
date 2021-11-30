package com.etiya.ReCapProject.business.requests.colorRequests;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateColorRequest {
	private int id;
	private String colorName;
}
