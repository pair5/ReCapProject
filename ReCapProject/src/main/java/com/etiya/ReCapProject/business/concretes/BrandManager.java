package com.etiya.ReCapProject.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.ReCapProject.business.abstracts.BrandService;
import com.etiya.ReCapProject.business.dtos.BrandSearchListDto;
import com.etiya.ReCapProject.business.dtos.CarSearchListDto;
import com.etiya.ReCapProject.business.requests.brandRequests.CreateBrandRequest;
import com.etiya.ReCapProject.business.requests.brandRequests.DeleteBrandRequest;
import com.etiya.ReCapProject.business.requests.brandRequests.UpdateBrandRequest;
import com.etiya.ReCapProject.core.utilities.mapping.ModelMapperService;
import com.etiya.ReCapProject.core.utilities.results.DataResult;
import com.etiya.ReCapProject.core.utilities.results.Result;
import com.etiya.ReCapProject.core.utilities.results.SuccessDataResult;
import com.etiya.ReCapProject.core.utilities.results.SuccessResult;
import com.etiya.ReCapProject.dataAccess.abstracts.BrandDao;
import com.etiya.ReCapProject.entities.concretes.Brand;
import com.etiya.ReCapProject.entities.concretes.Car;

@Service
public class BrandManager implements BrandService{
	private BrandDao brandDao;
	private ModelMapperService modelMapperService;
	
	@Autowired
	public BrandManager(BrandDao brandDao, ModelMapperService modelMapperService) {
		super();
		this.brandDao = brandDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<BrandSearchListDto>> getAll() {
		List<Brand> result = this.brandDao.findAll();
		List<BrandSearchListDto> response = result.stream().map(brand -> modelMapperService.forDto().map(brand, BrandSearchListDto.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<List<BrandSearchListDto>>(response, "Markalar listelendi.");
	}

	@Override
	public Result add(CreateBrandRequest createBrandRequest) {
		Brand result = modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		this.brandDao.save(result);
		return new SuccessResult("Marka eklendi.");
	}

	@Override
	public Result delete(DeleteBrandRequest deleteBrandRequest) {
		Brand result = modelMapperService.forRequest().map(deleteBrandRequest, Brand.class);
		this.brandDao.delete(result);
		return new SuccessResult("Marka silindi.");
	}

	@Override
	public Result update(UpdateBrandRequest updateBrandRequest) {
		Brand result = modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandDao.save(result);
		return new SuccessResult("Marka silindi.");
	}

	@Override
	public DataResult<BrandSearchListDto> getByBrandId(int brandId) {
		Brand brand= this.brandDao.findById(brandId).get();
		BrandSearchListDto brandSearchListDto=modelMapperService.forDto().map(brand, BrandSearchListDto.class);
		return new SuccessDataResult<BrandSearchListDto>(brandSearchListDto);
		
	}
}
