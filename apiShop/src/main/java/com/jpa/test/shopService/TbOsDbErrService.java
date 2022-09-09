package com.jpa.test.shopService;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jpa.test.shopModel.TbOsDbErrModel;

import UtilModel.FilterParameter;
import commonModel.DatabaseOperationResult;
import commonModel.PaginationAttribute;
import commonModel.ServiceOperationResult;
import commonUtilMethods.CommonConstant;
import commonUtilMethods.CommonUtilityHelper;
import commonUtilMethods.FilterUtil;
import commonUtilMethods.SearchCriteria;
import commonUtilMethods.SearchOperation;
import exception.BusinessException;
import exception.DatabaseException;
import shopEntity.TbOsDbErrEntity;
import shopPersistance.TbOsDbErrPersistance;

@Service
public class TbOsDbErrService {

	@Autowired(required = false)
	private TbOsDbErrPersistance dbErrPersistance;
	

	// getting dbErr list of all record for table
	public ServiceOperationResult<List<TbOsDbErrModel>> dbErrList(FilterParameter filterparameter) {
		ServiceOperationResult<List<TbOsDbErrModel>> response = new ServiceOperationResult<>();

		try {
			DatabaseOperationResult<List<TbOsDbErrEntity>> dbList = getDbErr(filterparameter);
			List<TbOsDbErrModel> list = new ArrayList<>();
			for (TbOsDbErrEntity entity : dbList.getModelOrEntity()) {
				TbOsDbErrModel model = new TbOsDbErrModel();

				setEntityToModel(entity, model);

				list.add(model);
			}
			response.setPageAttribute(dbList.getPageAttribute());
			response.setResponse(list);

		} catch (DatabaseException e) {
			throw new BusinessException(e);
		}
		catch (Exception e2) {
			throw new BusinessException(e2);
		}
		return response;

	}

	// here we doing operation to set record from entity to model
	private void setEntityToModel(TbOsDbErrEntity entity, TbOsDbErrModel model) {
		model.setId(entity.getId());
		model.setRefCd(entity.getRefCd());
		model.setErrCd(entity.getErrCd());
		model.setErrMsg(entity.getErrMsg());
		model.setRefNm(entity.getRefNm());
		model.setCrtBy(entity.getCrtBy());
		model.setCrtTs(entity.getCrtTs());
		model.setCrtTsString(CommonUtilityHelper.DateUtil.getStringFromDate(entity.getCrtTs(),
				CommonConstant.DateFormat.DD_MMM_YYYY_HHMMSS_SSS_A));
	}

	private DatabaseOperationResult<List<TbOsDbErrEntity>> getDbErr(FilterParameter filterparameter) throws Exception {
		DatabaseOperationResult<List<TbOsDbErrEntity>> modelOrEntity = new DatabaseOperationResult<>();

		List<TbOsDbErrEntity> dbEntityList = new ArrayList<>();
		// calculate pagination
		Integer showRecordOnOnePage = filterparameter.getRecordToShowOnOnePage() != null
				? filterparameter.getRecordToShowOnOnePage()
				: 25;
		Integer from = filterparameter.getPageIndex();
		Integer to = showRecordOnOnePage;
		Long totalRecord = filterparameter.getRecordTotal();

		// Business Logic
		String id = filterparameter.getId();
		String refCd = filterparameter.getRefCd();

		List<SearchCriteria> list1 = new ArrayList<>();
		SearchCriteria sc = new SearchCriteria();

		if (StringUtils.isNoneEmpty(id)) {
			sc = new SearchCriteria("id", id, SearchOperation.EQUAL);
			list1.add(sc);
		}
		if (StringUtils.isNotEmpty(refCd)) {
			sc = new SearchCriteria("refCd", refCd, SearchOperation.EQUAL);
			list1.add(sc);
		}

		FilterUtil<TbOsDbErrEntity> filterUtil = new FilterUtil<>();

		if (totalRecord == null) {
			totalRecord = dbErrPersistance.count(filterUtil.getSpecification(list1));
		}
		if (from != null && to != null) {
			Pageable page = PageRequest.of(from, to, Sort.by(Sort.Direction.DESC, "id"));
			dbEntityList = dbErrPersistance.findAll(filterUtil.getSpecification(list1), page);
		}

		PaginationAttribute pageAttr = modelOrEntity.getPageAttribute();
		pageAttr.setPageIndex(filterparameter.getPageIndex());
		pageAttr.setTotalPages((int) Math.ceil(totalRecord.intValue() * 1.0 / showRecordOnOnePage));
		pageAttr.setFetchrecords(dbEntityList.size());
		pageAttr.setShowRecordOnOnePage(showRecordOnOnePage);
		pageAttr.setTotalRecords(totalRecord);
		modelOrEntity.setModelOrEntity(dbEntityList);

		return modelOrEntity;

	}

	// save bdErr record in the table
	public ServiceOperationResult<TbOsDbErrModel> save(TbOsDbErrModel model) {
		ServiceOperationResult<TbOsDbErrModel> response = new ServiceOperationResult<>();
		try {
			TbOsDbErrEntity entity = new TbOsDbErrEntity();

			entity.setRefCd(model.getRefCd());
			entity.setErrCd(model.getErrCd());
			entity.setErrMsg(model.getErrMsg());
			entity.setRefNm(model.getRefNm());
			String crt = model.getCrtBy() != null ? model.getCrtBy() : "SYSTEM";
			entity.setCrtBy(crt);

			dbErrPersistance.save(entity);
			response.setResponse(model);

		} catch (DatabaseException e) {
			throw new BusinessException(e);
		}
		catch(Exception e2)
		{
			throw new BusinessException(e2);
		}

		return response;
	}

	public String SqlErrCode(Exception e) {
		SQLException result = null;
		Throwable throwable = e;
		while (throwable != null && !(throwable instanceof SQLException)) {
			throwable = throwable.getCause();
		}
		if (throwable instanceof SQLException) {
			result = (SQLException) throwable;
		}
		return result != null ? String.valueOf(result.getErrorCode()) : null;
	}

}
