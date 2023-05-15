package com.onlineShop.example.contriller;

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

import com.onlineShop.example.commonModel.ServiceOperationResult;
import com.onlineShop.example.commonUtilMethods.CommonConstant;
import com.onlineShop.example.exception.DatabaseException;
import com.onlineShop.example.loggingShopLogging.ILogger;
import com.onlineShop.example.loggingShopLogging.LoggerFactory;
import com.onlineShop.example.model.FilterParameter;
import com.onlineShop.example.model.TbOsDbErrModel;
import com.onlineShop.example.model.TbOsUserModel;
import com.onlineShop.example.service.TbOsDbErrService;
import com.onlineShop.example.service.TbOsUserService;
import com.onlineShop.example.validationUtils.validationHelper;

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
		 //String servletPath = request.getServletPath();
		try {
			result = userService.userList(filter);
			validationHelper.checkValidationAndThrow(result);
		} catch (Exception ex) {
			LOGGER.error(CommonConstant.EXCEPTION_MSG_LIST, null, request.getServerName(), ex);

			TbOsDbErrModel errModel = new TbOsDbErrModel(null, null, dbErrService.SqlErrCode(ex),
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
	
	
	// soft Delete user
	@RequestMapping(value = "/UsersoftDelete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ServiceOperationResult<TbOsUserModel> softDelete(HttpServletRequest request, @RequestBody TbOsUserModel model)
	{
		ServiceOperationResult<TbOsUserModel> result = new ServiceOperationResult<>();
		String servletPath = request.getServletPath();
		try
		{
			result = userService.softDelete(model);
			validationHelper.checkValidationAndThrow(result);
			
		}
		catch(Exception e)
		{
			LOGGER.error(CommonConstant.EXCEPTION_MSG_LIST,null, servletPath,e);
			TbOsDbErrModel errModel = new TbOsDbErrModel(null, servletPath, dbErrService.SqlErrCode(e), ExceptionUtils.getStackTrace(e), null);
			dbErrService.save(errModel);
			result = new ServiceOperationResult<>();
			result.getErrParam().setErrCode(CommonConstant.NOCODE);
			result.getErrParam().setErrDesc(CommonConstant.ERRCONSTANT+request.getServletPath()+CommonConstant.LOGCONSTANT);
		}
		
		return result;
	}
	
	
	
	
	
}
