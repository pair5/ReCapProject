package com.etiya.ReCapProject.business.requests.additionalRentalItemRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdditionalRentalItemRequest
{
    private  int additionalServiceId;
    private int rentalId;
}


