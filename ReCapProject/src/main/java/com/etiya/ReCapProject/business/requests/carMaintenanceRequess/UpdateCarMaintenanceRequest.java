package com.etiya.ReCapProject.business.requests.carMaintenanceRequess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarMaintenanceRequest {
	
	private int id;	
	private int carId;
	private String description;

}
