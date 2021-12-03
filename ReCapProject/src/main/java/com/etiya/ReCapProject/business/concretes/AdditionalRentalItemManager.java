package com.etiya.ReCapProject.business.concretes;

import com.etiya.ReCapProject.business.abstracts.AdditionalRentalItemService;
import com.etiya.ReCapProject.business.constants.Messages;
import com.etiya.ReCapProject.business.dtos.AdditionalRentalItemSearchListDto;
import com.etiya.ReCapProject.business.requests.additionalRentalItemRequests.CreateAdditionalRentalItemRequest;
import com.etiya.ReCapProject.business.requests.additionalRentalItemRequests.DeleteAdditionalRentalItemRequest;
import com.etiya.ReCapProject.business.requests.additionalRentalItemRequests.UpdateAdditionalRentalItemRequest;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.AdditionalRentalItemDao;
import com.etiya.ReCapProject.entities.concretes.AdditionalRentalItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdditionalRentalItemManager implements AdditionalRentalItemService {


    private ModelMapperService modelMapperService;
    private AdditionalRentalItemDao additionalRentalItemDao;
    @Autowired
    public AdditionalRentalItemManager(ModelMapperService modelMapperService, AdditionalRentalItemDao additionalRentalItemDao) {
        this.modelMapperService = modelMapperService;
        this.additionalRentalItemDao = additionalRentalItemDao;
    }

    @Override
    public DataResult<List<AdditionalRentalItemSearchListDto>> getAll() {
        List<AdditionalRentalItem> additionalRentalItems=this.additionalRentalItemDao.findAll();
        List<AdditionalRentalItemSearchListDto> additionalRentalItemSearchListDtos=additionalRentalItems.stream()
                .map(additional-> modelMapperService.forDto().map(additional,AdditionalRentalItemSearchListDto.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(additionalRentalItemSearchListDtos,Messages.ADDITIONALSERVICELIST);

    }
    @Override
    public Result add(CreateAdditionalRentalItemRequest createAdditionalRentalItemRequest) {

        AdditionalRentalItem additionalRentalItem=modelMapperService.forRequest().map(createAdditionalRentalItemRequest,AdditionalRentalItem.class);
        this.additionalRentalItemDao.save(additionalRentalItem);
        return new SuccessResult(Messages.ADDITIONALSERVICEADD);
    }

    @Override
    public Result delete(DeleteAdditionalRentalItemRequest deleteAdditionalRentalItemRequest) {
        AdditionalRentalItem additionalRentalItem = modelMapperService.forRequest()
                .map(deleteAdditionalRentalItemRequest, AdditionalRentalItem.class);
        this.additionalRentalItemDao.delete(additionalRentalItem);
        return new SuccessResult(Messages.ADDITIONALRENTALITEMDELETE);
    }

    @Override
    public Result update(UpdateAdditionalRentalItemRequest updateAdditionalRentalItemRequest) {
        AdditionalRentalItem additionalRentalItem = modelMapperService.forRequest()
                .map(updateAdditionalRentalItemRequest, AdditionalRentalItem.class);
        this.additionalRentalItemDao.save(additionalRentalItem);
        return new SuccessResult(Messages.ADDITIONALRENTALITEMUPDATE);
    }

    @Override
    public DataResult<List<AdditionalRentalItem>> getByRentalId(int rentalId) {
        return new SuccessDataResult<>(this.additionalRentalItemDao.getByRentalId(rentalId));
    }
}
