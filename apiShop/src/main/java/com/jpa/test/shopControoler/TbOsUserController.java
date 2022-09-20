package com.jpa.test.shopControoler;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;

import org.apache.catalina.core.ApplicationContext;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.commonModel.ServiceOperationResult;
import com.jpa.test.commonUtilMethods.CommonConstant;
import com.jpa.test.exception.DatabaseException;
import com.jpa.test.loggingShopLogging.ILogger;
import com.jpa.test.loggingShopLogging.LoggerFactory;
import com.jpa.test.shopModel.TbOsDbErrModel;
import com.jpa.test.shopModel.TbOsUserModel;
import com.jpa.test.shopService.TbOsDbErrService;
import com.jpa.test.shopService.TbOsUserService;
import com.jpa.test.validationUtils.validationHelper;

import UtilModel.FilterParameter;

@RestController
@CrossOrigin
@RequestMapping("/userController")
public class TbOsUserController {

	private static final ILogger LOGGER = LoggerFactory.getLogger(TbOsUserController.class);

	@Autowired
	private TbOsUserService userService;

	@Autowired
	private TbOsDbErrService dbErrService;

	// getting list of User's
	@RequestMapping(value = "/userList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ServiceOperationResult<List<TbOsUserModel>> list(HttpServletRequest request,
			@RequestBody FilterParameter filter) {
		ServiceOperationResult<List<TbOsUserModel>> result = new ServiceOperationResult<>();
		//String userName = request.getUserPrincipal().getName();
		 String servletPath = request.getServletPath();
		try {
			result = userService.userList(filter);
			validationHelper.checkValidationAndThrow(result);
		} catch (Exception ex) {
			LOGGER.error(CommonConstant.EXCEPTION_MSG_LIST, null, request.getServerName(), ex);

			TbOsDbErrModel errModel = new TbOsDbErrModel(null, servletPath, dbErrService.SqlErrCode(ex),
					ExceptionUtils.getStackTrace(ex), request.getUserPrincipal().getName());
			dbErrService.save(errModel);

			result = new ServiceOperationResult<>();
			result.getErrParam().setErrCode(CommonConstant.NOCODE);
			result.getErrParam()
					.setErrDesc(CommonConstant.ERRCONSTANT + request.getServletPath() + CommonConstant.LOGCONSTANT);
		}
		return result;
	}
	
	
	
	
	// Add or Update User 
	@RequestMapping(value = "/addOrUpdateUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ServiceOperationResult<TbOsUserModel> addOrUpdateUser(HttpServletRequest request, @RequestBody TbOsUserModel model)
	{
		ServiceOperationResult<TbOsUserModel> result = new ServiceOperationResult<TbOsUserModel>();
		String ServletPath = request.getServletPath();
		try
		{
			result = userService.addOrUpdate(model);
			validationHelper.checkValidationAndThrow(result);
			
		}
		catch(DatabaseException ex)
		{
			LOGGER.error(CommonConstant.EXCEPTION_MSG_LIST, null, request.getServerName(), ex);
			
			TbOsDbErrModel errModel = new TbOsDbErrModel(null,ServletPath, dbErrService.SqlErrCode(ex), ExceptionUtils.getStackTrace(ex), request.getUserPrincipal().getName());
			dbErrService.save(errModel);
			result = new ServiceOperationResult<>();
			result.getErrParam().setErrCode(CommonConstant.NOCODE);
			result.getErrParam().setErrDesc(CommonConstant.ERRCONSTANT+request.getServletPath()+CommonConstant.LOGCONSTANT);
			
		}
		
		
		
		return result;
		
	}
	
	

}
