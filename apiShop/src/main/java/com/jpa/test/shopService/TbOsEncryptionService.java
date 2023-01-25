package com.jpa.test.shopService;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jpa.test.commonModel.DatabaseOperationResult;
import com.jpa.test.commonModel.PaginationAttribute;
import com.jpa.test.commonModel.ServiceOperationResult;
import com.jpa.test.commonUtilMethods.CommonConstant;
import com.jpa.test.commonUtilMethods.FilterUtil;
import com.jpa.test.commonUtilMethods.SearchCriteria;
import com.jpa.test.commonUtilMethods.SearchOperation;
import com.jpa.test.exception.BusinessException;
import com.jpa.test.exception.DatabaseException;
import com.jpa.test.shopEntity.TbOsEncryptionEntity;
import com.jpa.test.shopModel.TbOsEncryptioModel;
import com.jpa.test.shopPersistance.TbOsEncryptionPersistance;

import UtilModel.FilterParameter;

@Service
public class TbOsEncryptionService {
	
	
	@Autowired
	private TbOsEncryptionPersistance encryptionPersistance;
	
	
	
	public ServiceOperationResult<List<TbOsEncryptioModel>> getAllEncryption(FilterParameter filterParameter)
	{
		ServiceOperationResult<List<TbOsEncryptioModel>> response = new ServiceOperationResult<List<TbOsEncryptioModel>>();
		List<TbOsEncryptioModel> list = new ArrayList<>();
		
		try
		{
			DatabaseOperationResult<List<TbOsEncryptionEntity>> dbList = getAll(filterParameter);
			
			for(TbOsEncryptionEntity entity : dbList.getModelOrEntity())
			{
				TbOsEncryptioModel model = new TbOsEncryptioModel();
				
				setEntityToModel(entity, model);
				
				list.add(model);
			}
			
			response.setPageAttribute(dbList.getPageAttribute());
			response.setResponse(list);
			
		}
		catch(DatabaseException e)
		{
			throw new BusinessException(e);
		}
		catch(Exception ex)
		{
			throw new BusinessException(ex);
		}
		
		return response;
	}
	
	// set data in model from entity one by one
	private void setEntityToModel(TbOsEncryptionEntity entity, TbOsEncryptioModel model)
	{
		model.setId(entity.getId());
		model.setKey(entity.getKey());
		model.setSalt(entity.getSalt());
		model.setIsActv(entity.getIsActv());
		model.setKekJksPath(entity.getKekJksPath());
		model.setKekJksPswd(entity.getKekJksPswd());
		model.setCustodian1Salt(entity.getSalt());
		model.setCustodian2Salt(entity.getCustodian2Salt());
		model.setCustodian1Key(entity.getCustodian1Key());
		model.setCustodian2Key(entity.getCustodian2Key());
		model.setUpdBy(entity.getUpdBy());
		model.setCrtBy(entity.getCrtBy());
		model.setUpdTs(entity.getUpdTs());
		model.setCrtTs(entity.getCrtTs());
	}
	
	private DatabaseOperationResult<List<TbOsEncryptionEntity>> getAll(FilterParameter filterParameter)
	{
		DatabaseOperationResult<List<TbOsEncryptionEntity>> dbList = new DatabaseOperationResult<>();
		
		List<TbOsEncryptionEntity> listEntity = new ArrayList<>();
		// pagination
		Integer totalRecordShowOnePage = filterParameter.getRecordToShowOnOnePage() != null ? filterParameter.getRecordToShowOnOnePage() : CommonConstant.showRecord;
		Integer from = filterParameter.getPageIndex();
		Integer to = totalRecordShowOnePage;
		Long totalRecord = filterParameter.getRecordTotal();
		
		// business Filter
		List<SearchCriteria> list = new ArrayList<>();
		
		String id = filterParameter.getId();
		
		if(StringUtils.isNoneBlank(id))
		{
			list.add(new SearchCriteria("id", id, SearchOperation.EQUAL));
		}
		
		
		FilterUtil<TbOsEncryptionEntity> filterUtil = new FilterUtil<>();
		
		if(totalRecord == null)
		{
			totalRecord = encryptionPersistance.count(filterUtil.getSpecification(list));
		}
		
		if(from != null && to != null)
		{
			Pageable page = PageRequest.of(from, to, Sort.by(Sort.Direction.DESC, "id"));
			
			listEntity = encryptionPersistance.findAll(filterUtil.getSpecification(list), page);
		}
		PaginationAttribute pageAttr = dbList.getPageAttribute();
		pageAttr.setPageIndex(filterParameter.getPageIndex());
		pageAttr.setTotalPages((int) Math.ceil(totalRecord.intValue() * 1.0 / totalRecordShowOnePage));
		pageAttr.setFetchrecords(listEntity.size());
		pageAttr.setShowRecordOnOnePage(totalRecordShowOnePage);
		pageAttr.setTotalRecords(totalRecord);
		dbList.setModelOrEntity(listEntity);
		
		return dbList;
	}

}

