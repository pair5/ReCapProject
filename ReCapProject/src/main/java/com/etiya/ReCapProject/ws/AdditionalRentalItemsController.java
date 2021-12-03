package com.etiya.ReCapProject.ws;

import com.etiya.ReCapProject.business.abstracts.AdditionalRentalItemService;
import com.etiya.ReCapProject.business.requests.additionalRentalItemRequests.CreateAdditionalRentalItemRequest;
import com.etiya.ReCapProject.business.requests.additionalRentalItemRequests.DeleteAdditionalRentalItemRequest;
import com.etiya.ReCapProject.business.requests.additionalRentalItemRequests.UpdateAdditionalRentalItemRequest;
import com.etiya.ReCapProject.business.requests.additionalServiceRequests.UpdateAdditionalServiceRequest;
import com.etiya.ReCapProject.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/additionalRentalItems")
public class AdditionalRentalItemsController {

    private AdditionalRentalItemService additionalRentalItemService;

    @Autowired
    public AdditionalRentalItemsController(AdditionalRentalItemService additionalRentalItemService) {
        this.additionalRentalItemService = additionalRentalItemService;
    }




    @PostMapping("add")
    public Result add(CreateAdditionalRentalItemRequest createAdditionalRentalItemRequest){
        return this.additionalRentalItemService.add(createAdditionalRentalItemRequest);
    }

    @GetMapping("delete")
    public Result delete(DeleteAdditionalRentalItemRequest deleteAdditionalRentalItemRequest){
        return  this.additionalRentalItemService.delete(deleteAdditionalRentalItemRequest);
    }

    @PutMapping("update")
    public Result update(UpdateAdditionalRentalItemRequest updateAdditionalRentalItemRequest){
        return this.additionalRentalItemService.update(updateAdditionalRentalItemRequest);
    }
}
