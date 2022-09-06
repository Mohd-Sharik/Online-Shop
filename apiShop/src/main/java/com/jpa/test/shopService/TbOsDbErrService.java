package com.jpa.test.shopService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.jpa.test.shopModel.TbOsDbErrModel;

import UtilModel.FilterParameter;
import commonModel.DatabaseOperationResult;
import commonModel.ServiceOperationResult;
import commonUtilMethods.FilterUtil;
import commonUtilMethods.SearchCriteria;
import commonUtilMethods.SearchOperation;
import shopEntity.TbOsDbErrEntity;
import shopPersistance.TbOsDbErrPersistance;

@Service
public class TbOsDbErrService {
	
	@Autowired
	private TbOsDbErrPersistance dbErrPersistance;
	
	
	//getting dbErr list of all record for table
	public ServiceOperationResult<List<TbOsDbErrModel>> dbErrList(FilterParameter filterparameter)
	{
		ServiceOperationResult<List<TbOsDbErrModel>> response = new ServiceOperationResult<>();
		
		
		try
		{
			DatabaseOperationResult<List<TbOsDbErrEntity>> bdList = getDbErr(filterparameter);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in DbErr List Service : ");
		}
		return response;
		
	}
	
	public DatabaseOperationResult<List<TbOsDbErrEntity>> getDbErr(FilterParameter filterparameter) throws Exception
	{
		DatabaseOperationResult<List<TbOsDbErrEntity>> modelOrEntity = new DatabaseOperationResult<>();
		
		List<TbOsDbErrEntity> dbEntityList = new ArrayList<>();
		//calculate pagination
		Integer showRecordOnOnePage = filterparameter.getRecordToShowOnOnePage() != null ? filterparameter.getRecordToShowOnOnePage() : 25;
		Integer from = filterparameter.getPageIndex();
		Integer to = showRecordOnOnePage;
		Long totalRecord = filterparameter.getRecordTotal();
		
		//Business Logic
		String id = filterparameter.getId();
		String refCd = filterparameter.getRefCd();
		
		
		List<SearchCriteria> list1 = new ArrayList<>();
		SearchCriteria sc = new SearchCriteria();
		
		
		if(StringUtils.isNoneEmpty(id))
		{
			sc = new SearchCriteria("id", id, SearchOperation.EQUAL);
			list1.add(sc);
		}
		if(StringUtils.isNotEmpty(refCd))
		{
			sc = new SearchCriteria("refCd", refCd, SearchOperation.EQUAL);
			list1.add(sc);
		}
		
		FilterUtil<TbOsDbErrEntity> filterUtil = new FilterUtil<>();
		
		if(totalRecord == null)
		{
			totalRecord = dbErrPersistance.count(filterUtil.getSpecification(list1));
		}
		if(from != null && to != null)
		{
			Pageable page = PageRequest.of(from, to, Sort.by(Sort.Direction.DESC,"id"));
			dbEntityList = dbErrPersistance.findAll(filterUtil.getSpecification(list1), page);
		}
		
		
		
	}
	
	
	//save bdErr record in the table
	public ServiceOperationResult<TbOsDbErrModel> saveDbErr(TbOsDbErrModel model)
	{
		ServiceOperationResult<TbOsDbErrModel> response = new ServiceOperationResult<>();
		try
		{
			TbOsDbErrEntity entity = new TbOsDbErrEntity();
			
			
			entity.setRefCd(model.getRefCd());
			entity.setErrCd(model.getErrCd());
			entity.setErrMsg(model.getErrMsg());
			entity.setRefNm(model.getRefNm());
			String crt = model.getCrtBy() != null ? model.getCrtBy() : "SYSTEM" ;
			entity.setCrtBy(crt);
			
			
			dbErrPersistance.save(entity);
			response.setResponse(model);
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("occure in the DbErr Service Catch block");
			
		}
		
		
		return response;
	}
	

}
