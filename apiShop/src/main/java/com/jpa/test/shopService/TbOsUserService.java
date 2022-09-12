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
import com.jpa.test.commonUtilMethods.CommonUtilityHelper;
import com.jpa.test.commonUtilMethods.FilterUtil;
import com.jpa.test.commonUtilMethods.SearchCriteria;
import com.jpa.test.commonUtilMethods.SearchOperation;
import com.jpa.test.exception.BusinessException;
import com.jpa.test.exception.DatabaseException;
import com.jpa.test.shopEntity.TbOsUserEntity;
import com.jpa.test.shopModel.TbOsUserModel;
import com.jpa.test.shopPersistance.TbOsUSerPersistance;

import UtilModel.FilterParameter;

@Service
public class TbOsUserService {

	@Autowired
	private TbOsUSerPersistance userPersistance;

	// getting list of User Detail's
	public ServiceOperationResult<List<TbOsUserModel>> userList(FilterParameter filter) {
		ServiceOperationResult<List<TbOsUserModel>> response = new ServiceOperationResult<>();
		try {
			DatabaseOperationResult<List<TbOsUserEntity>> dbList = userDb(filter);

			
				List<TbOsUserModel> list = new ArrayList<TbOsUserModel>();
				for (TbOsUserEntity entity : dbList.getModelOrEntity()) {
					TbOsUserModel model = new TbOsUserModel();

					setEntityToModel(entity, model);
					list.add(model);
				}

				response.setPageAttribute(dbList.getPageAttribute());
				response.setResponse(list);
			

		} catch (DatabaseException e) {
			throw new BusinessException(e);
		} catch (Exception e) {
			throw new BusinessException(e);
		}

		return response;
	}

	// set Entity to Model
	private void setEntityToModel(TbOsUserEntity entity, TbOsUserModel model) {
		model.setId(entity.getId());
		model.setRefId(entity.getRefId());
		model.setPswd(entity.getPswd());
		model.setFullNm(entity.getFullNm());
		model.setDsplNm(entity.getDsplNm());
		model.setEmail(entity.getEmail());
		model.setCntctInfo(entity.getCntctInfo());
		model.setCntctNumber(entity.getCntctNum());
		model.setLocation(entity.getLocation());
		model.setFldLgnCnt(entity.getFldLgnCnt());
		model.setLstLgnCnt(entity.getLstLgnTs());
		model.setExprTs(entity.getExprTs());
		model.setPswdCrtBy(entity.getPswdCrtBy());
		model.setUserState(entity.getUserState());
		model.setSessionId(entity.getSessionId());
		model.setLdapAuth(entity.getLdapAuth());
		model.setSkipInactvn(entity.getSkipInactvn());
		model.setCrtBy(entity.getCrtBy());
		model.setCrtTs(entity.getCrtTs());
		model.setUpdBy(entity.getUpdBy());
		model.setUpdTs(entity.getUpdTs());
		model.setDltBy(entity.getDltBy());
		model.setDltTs(entity.getDltTs());

		model.setCrtTsString(CommonUtilityHelper.DateUtil.getStringFromDate(entity.getCrtTs(),
				CommonConstant.DateFormat.DD_MMM_YYYY_HHMMSS_SSS_A));
		model.setUpdTsString(CommonUtilityHelper.DateUtil.getStringFromDate(entity.getUpdTs(),
				CommonConstant.DateFormat.DD_MMM_YYYY_HHMMSS_SSS_A));
		model.setDltTsString(CommonUtilityHelper.DateUtil.getStringFromDate(entity.getDltTs(),
				CommonConstant.DateFormat.DD_MMM_YYYY_HHMMSS_SSS_A));

	}

	// getting list of user's from database;
	private DatabaseOperationResult<List<TbOsUserEntity>> userDb(FilterParameter filter) {
		DatabaseOperationResult<List<TbOsUserEntity>> dbList = new DatabaseOperationResult<>();

		List<TbOsUserEntity> modelOrEntity = new ArrayList<>();

		Integer showRecordOnOnePage = filter.getRecordToShowOnOnePage() != null ? filter.getRecordToShowOnOnePage()
				: CommonConstant.showRecord;
		Integer to = filter.getPageIndex();
		Integer from = showRecordOnOnePage;
		Long totalRecord = filter.getRecordTotal();

		// business Logic
		List<SearchCriteria> list = new ArrayList<>();
		SearchCriteria sc = new SearchCriteria();

		String id = filter.getId();
		String fullNm = filter.getFullNm();
		String dsplNm = filter.getDsplNm();
		String cntctNumber = filter.getCntctNumber();

		if (StringUtils.isEmpty(id)) {
			sc = new SearchCriteria("id", id, SearchOperation.EQUAL);
			list.add(sc);
		}

		if (StringUtils.isEmpty(fullNm)) {
			sc = new SearchCriteria("fullNm", fullNm, SearchOperation.MATCH);
			list.add(sc);
		}

		if (StringUtils.isEmpty(dsplNm)) {
			sc = new SearchCriteria("dsplNm", dsplNm, SearchOperation.MATCH);
			list.add(sc);
		}

		if (StringUtils.isEmpty(cntctNumber)) {
			sc = new SearchCriteria("cntctNumber", cntctNumber, SearchOperation.MATCH);
			list.add(sc);
		}

		FilterUtil<TbOsUserEntity> filterUtil = new FilterUtil<TbOsUserEntity>();
		if (totalRecord == null) {
			totalRecord = userPersistance.count(filterUtil.getSpecification(list));
		}

		if (to != null && from != null) {
			Pageable page = PageRequest.of(from, to, Sort.by(Sort.Direction.ASC, "id"));
			modelOrEntity = userPersistance.findAll(filterUtil.getSpecification(list), page);
		}

		PaginationAttribute pageAttr = dbList.getPageAttribute();
		pageAttr.setPageIndex(filter.getPageIndex());
		pageAttr.setTotalPages((int) Math.ceil(totalRecord.intValue() * 1.0 / showRecordOnOnePage));
		pageAttr.setFetchrecords(modelOrEntity.size());
		pageAttr.setShowRecordOnOnePage(showRecordOnOnePage);
		pageAttr.setTotalRecords(totalRecord);

		dbList.setModelOrEntity(modelOrEntity);

		return dbList;
	}

}
