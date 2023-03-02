package com.jpa.test.shopService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
import com.jpa.test.SecurityUtility.SecurityHelper;
import com.jpa.test.SecurityUtility.SecurityHelper.MessageDiagestUtil;

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
		Integer to = showRecordOnOnePage;
		Integer from = filter.getPageIndex();
		Long totalRecord = filter.getRecordTotal();

		// business Logic
		List<SearchCriteria> list = new ArrayList<>();
		SearchCriteria sc = new SearchCriteria();

		String id = filter.getId();
		String fullNm = filter.getFullNm();
		String dsplNm = filter.getDsplNm();
		String cntctNumber = filter.getCntctNumber();

		if (StringUtils.isNotBlank(id)) {
			sc = new SearchCriteria("id", id, SearchOperation.EQUAL);
			list.add(sc);
		}

		if (StringUtils.isNotBlank(fullNm)) {
			sc = new SearchCriteria("fullNm", fullNm, SearchOperation.MATCH);
			list.add(sc);
		}

		if (StringUtils.isNotBlank(dsplNm)) {
			sc = new SearchCriteria("dsplNm", dsplNm, SearchOperation.MATCH);
			list.add(sc);
		}

		if (StringUtils.isNotBlank(cntctNumber)) {
			sc = new SearchCriteria("cntctNumber", cntctNumber, SearchOperation.MATCH);
			list.add(sc);
		}

		FilterUtil<TbOsUserEntity> filterUtil = new FilterUtil<TbOsUserEntity>();
		if (totalRecord == null) {
			totalRecord = userPersistance.count(filterUtil.getSpecification(list));
		}

		if (to != null && from != null) {
			Pageable page = PageRequest.of(from, to, Sort.by(Sort.Direction.DESC, "id"));
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
	
	
	
	
	//add or Update User
	
	public ServiceOperationResult<TbOsUserModel> addOrUpdate(TbOsUserModel model)
	{
		ServiceOperationResult<TbOsUserModel> response = new ServiceOperationResult<>();
		
		try
		{
			String valiResult = CommonConstant.SUCCESS;
			
			Long id = model.getId() != null ? model.getId() : null;
			
			String mail = model.getEmail();
			
			String contact = model.getCntctNumber();
			
			List<TbOsUserEntity> record = userPersistance.findAll();   // get All record of user's from database
			
			for(TbOsUserEntity en : record)         // check every  user-Detail to current user-Detail  
			{
				if(id == null) 
				{
					if(mail.equalsIgnoreCase(en.getEmail()))
					{
						valiResult = "Email Already exist : "+en.getEmail();
					}
				}
					else
					{
						if(id.longValue() != en.getId().longValue() && mail.equalsIgnoreCase(en.getEmail()))
						{
							valiResult = "Email already exist : "+en.getEmail();
						}
					}
				
				if(id == null)
				{
					if(contact.equalsIgnoreCase(en.getCntctNum()))
					{
						valiResult = "Contact Number Already Exist : "+en.getCntctNum();
					}
				}
				else
				{
					if(id.longValue() != en.getId().longValue() && contact.equalsIgnoreCase(en.getCntctNum()))
					{
						valiResult = "Contact Number Already Exist : "+en.getCntctNum();
					}
				}
				
				
			}
			
			if(valiResult == CommonConstant.SUCCESS)
			{	
				if(id != null)
				{
					
					TbOsUserEntity entity = userPersistance.findById(id).get();
					
					entity.setId(id);
					setModelToEntity(model, entity);
					entity.setUpdBy(model.getCrtBy());
					entity.setUpdTs(new Date());
					
					userPersistance.save(entity);
				}
				else
				{
					TbOsUserEntity entity = new TbOsUserEntity();
					entity.setId(null);
					String password =  CommonConstant.NOCODE; //CommonUtilityHelper.getAlphaNumericString(16);
					entity.setPswd(password);
					entity.setLdapAuth(model.getLdapAuth());
					setModelToEntity(model, entity);
					entity.setRefId(CommonConstant.SCRIPT_USER);
					entity.setCrtBy(model.getCrtBy());
					entity.setCrtTs(new Date());
					userPersistance.save(entity);
					
					if(StringUtils.equals(entity.getLdapAuth(), CommonConstant.N))
					{
						entity.setRefId(entity.getFullNm().substring(0, 2).toUpperCase()+entity.getId());
						String hashpassword = entity.getRefId()+entity.getPswd();
						entity.setPswd(MessageDiagestUtil.getHash(hashpassword));
						entity.setPswdCrtBy(CommonConstant.SCRIPT_USER);
					}
					else
						if(StringUtils.equals(entity.getLdapAuth(), CommonConstant.Y))
						{
							entity.setRefId(model.getRefId());
							String passw = entity.getRefId()+password;
							entity.setCrtBy(CommonConstant.SCRIPT_USER);
						}
					userPersistance.save(entity);
					
				}
				response.setResponse(model);
				
			}
			else
			{
				response.setSucces(false);
				response.getErrParam().setErrCode("No-Code");
				response.getErrParam().setErrDesc(valiResult);
			}
			
		}catch(DatabaseException e)
		{
			throw new BusinessException(e);
			
		}
		catch(Exception ex)
		{
			throw new BusinessException(ex);
		}
		
		return response;
	}
	
	// set Model to entity 
	private void setModelToEntity(TbOsUserModel model, TbOsUserEntity entity)
	{
		entity.setRefId(model.getRefId() != null ? model.getRefId() : entity.getRefId());
		entity.setPswd(model.getPswd() != null ? model.getPswd() : entity.getPswd());
		entity.setFullNm(model.getFullNm() != null ? model.getFullNm() : entity.getFullNm());
		entity.setDsplNm(model.getDsplNm() != null ? model.getDsplNm() : entity.getDsplNm());
		entity.setEmail(model.getEmail() != null ? model.getEmail() : entity.getEmail());
		entity.setCntctInfo(model.getCntctInfo() != null ? model.getCntctInfo() : entity.getCntctInfo());
		entity.setCntctNum(model.getCntctNumber() != null ? model.getCntctNumber() : entity.getCntctNum());
		entity.setLocation(model.getLocation() != null ? model.getLocation() : entity.getLocation());
		entity.setFldLgnCnt(model.getFldLgnCnt() != null ? model.getFldLgnCnt() : entity.getFldLgnCnt());
		entity.setLstLgnTs(model.getLstLgnCnt() != null ? model.getLstLgnCnt() : entity.getLstLgnTs());
		entity.setExprTs(model.getExprTs() != null ? model.getExprTs() : entity.getExprTs());
		entity.setPswdCrtBy(model.getPswdCrtBy() != null ? model.getPswdCrtBy() : entity.getPswdCrtBy());
		entity.setUserState(model.getUserState() != null ? model.getUserState() : entity.getUserState());
		entity.setSessionId(model.getSessionId() != null ? model.getSessionId() : entity.getSessionId());
		entity.setLdapAuth(model.getLdapAuth() != null ? model.getLdapAuth() : entity.getLdapAuth());
		entity.setSkipInactvn(model.getSkipInactvn() != null ? model.getSkipInactvn() : entity.getSkipInactvn());
		entity.setDltBy(model.getDltBy() != null ? model.getDltBy() : entity.getDltBy());
		entity.setDltTs(model.getDltTs() != null ? model.getDltTs() : entity.getDltTs());
		entity.setEncKeyId(model.getEncKeyId() != null ? model.getEncKeyId() : entity.getEncKeyId());
	}
	
	
	
	//soft DeleteUser 
	public ServiceOperationResult<TbOsUserModel> softDelete(TbOsUserModel model)
	{
		ServiceOperationResult<TbOsUserModel> response = new ServiceOperationResult<TbOsUserModel>();
		try
		{
			
			if(model.getId() == null)
			{
				throw new BusinessException("id must not be null : ");
			}
			TbOsUserEntity entity = userPersistance.findById(model.getId()).get();
			
			if(entity != null)
			{
				entity.setDltBy(model.getFullNm());
				entity.setDltTs(new Date());
				userPersistance.save(entity);
				response.setResponse(model);
			}
			else
			{
				response.getErrParam().setErrCode("404");
			}
			
			
		}catch(DatabaseException e)
		{
			throw new BusinessException(e);
		}
		catch(Exception ex)
		{
			throw new BusinessException(ex);
		}
		
		return response;
	}
	
	//find by id
	public TbOsUserEntity findByRefId(String id)
	{
		try
		{
			Optional<TbOsUserEntity> user = userPersistance.findByRefId(id);
			if(user.isPresent())
			{
				return user.get();
			}
			else
				return null;
		}catch (Exception e) {
			throw new BusinessException(e);
		}
	}
	
	
	
	
	
	
	
	

}
