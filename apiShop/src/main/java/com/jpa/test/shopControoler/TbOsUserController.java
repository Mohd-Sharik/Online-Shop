package com.jpa.test.shopControoler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.BeanParam;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.commonModel.ServiceOperationResult;
import com.jpa.test.commonUtilMethods.CommonConstant;
import com.jpa.test.shopModel.TbOsDbErrModel;
import com.jpa.test.shopModel.TbOsUserModel;
import com.jpa.test.shopService.TbOsDbErrService;
import com.jpa.test.shopService.TbOsUserService;

import UtilModel.FilterParameter;
import logginShopLogging.ILogger;
import logginShopLogging.LoggerFactory;
import validationUtils.validationHelper;

@RestController
@CrossOrigin
@RequestMapping("/UserController")
public class TbOsUserController {
	
	private static final ILogger LOGGER = LoggerFactory.getLogger(TbOsUserController.class);
	
	
	@Autowired
	private TbOsUserService userService;
	
	@Autowired
	private TbOsDbErrService dbErrService;
	
	
	
	
	
	
	//getting list of User's
	@RequestMapping(value = "/userList", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ServiceOperationResult<List<TbOsUserModel>> list(HttpServletRequest request, @BeanParam FilterParameter filter)
	{
		ServiceOperationResult<List<TbOsUserModel>> result = new ServiceOperationResult<>();
		String userName = request.getUserPrincipal().getName();
		String servletPath = request.getServletPath();
		
		try
		{
			result = userService.userList(filter);
			
			validationHelper.checkValidation(result);
			
		}
		catch(Exception ex)
		{
			LOGGER.error( CommonConstant.EXCEPTION_MSG_LIST,userName, servletPath, ex);
			
			TbOsDbErrModel errModel = new TbOsDbErrModel(null, request.getServletPath(), dbErrService.SqlErrCode(ex),
					ExceptionUtils.getStackTrace(ex), request.getUserPrincipal().getName());
			dbErrService.save(errModel);

			result = new ServiceOperationResult<>();
			result.getErrParam().setErrCode(CommonConstant.NOCODE);
			result.getErrParam().setErrDesc(
					CommonConstant.ERRCONSTANT + request.getServletPath() + CommonConstant.LOGCONSTANT);
			
		}
		
		return result;
	}
	
	

}
