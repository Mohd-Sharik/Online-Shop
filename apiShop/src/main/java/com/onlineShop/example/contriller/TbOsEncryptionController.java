package com.onlineShop.example.contriller;
/*
 * package com.jpa.test.shopControoler;
 * 
 * import java.util.List;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.apache.commons.lang3.exception.ExceptionUtils; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.MediaType; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.jpa.test.SecurityUtility.SecurityHelper; import
 * com.jpa.test.SecurityUtility.SecurityHelper.PasswordSecurityCheck; import
 * com.jpa.test.commonModel.ServiceOperationResult; import
 * com.jpa.test.commonUtilMethods.CommonConstant; import
 * com.jpa.test.exception.DatabaseException; import
 * com.jpa.test.loggingShopLogging.ILogger; import
 * com.jpa.test.loggingShopLogging.LoggerFactory; import
 * com.jpa.test.shopModel.CustodianRequestModel; import
 * com.jpa.test.shopModel.TbOsDbErrModel; import
 * com.jpa.test.shopModel.TbOsEncryptioModel; import
 * com.jpa.test.shopService.TbOsDbErrService; import
 * com.jpa.test.shopService.TbOsEncryptionService; import
 * com.jpa.test.validationUtils.validationHelper;
 * 
 * import UtilModel.FilterParameter;
 * 
 * @RestController
 * 
 * @CrossOrigin
 * 
 * @RequestMapping("/Encryption") public class TbOsEncryptionController {
 * 
 * @Autowired TbOsEncryptionService encryptionService;
 * 
 * @Autowired TbOsDbErrService dbErrService;
 * 
 * 
 * private static final ILogger logger =
 * LoggerFactory.getLogger(TbOsEncryptionController.class);
 * 
 * 
 * 
 * @RequestMapping(value = "/getList", method = RequestMethod.POST, produces =
 * MediaType.APPLICATION_JSON_VALUE) public
 * ServiceOperationResult<List<TbOsEncryptioModel>> getList(HttpServletRequest
 * request, @RequestBody FilterParameter filter) {
 * 
 * // String name = request.getUserPrincipal().getName(); // String path =
 * request.getServletPath();
 * 
 * ServiceOperationResult<List<TbOsEncryptioModel>> result = new
 * ServiceOperationResult<List<TbOsEncryptioModel>>(); try { result =
 * this.encryptionService.getAllEncryption(filter);
 * validationHelper.checkValidationAndThrow(result); } catch(DatabaseException
 * ex) { logger.error(CommonConstant.EXCEPTION_MSG_LIST, null,
 * request.getServerName(), ex);
 * 
 * TbOsDbErrModel errModel = new TbOsDbErrModel(null, null,
 * dbErrService.SqlErrCode(ex), ExceptionUtils.getStackTrace(ex),
 * request.getUserPrincipal().getName()); dbErrService.save(errModel);
 * 
 * result = new ServiceOperationResult<>();
 * result.getErrParam().setErrCode(CommonConstant.NOCODE); result.getErrParam()
 * .setErrDesc(CommonConstant.ERRCONSTANT + request.getServletPath() +
 * CommonConstant.LOGCONSTANT); }
 * 
 * return result; }
 * 
 * 
 * // add custodian
 * 
 * @RequestMapping(value ="/addCustodian", method = RequestMethod.POST, produces
 * = MediaType.APPLICATION_JSON_VALUE) public
 * ServiceOperationResult<TbOsEncryptioModel> addCustodian(HttpServletRequest
 * request, @RequestBody CustodianRequestModel custodianRequest) throws
 * Exception { ServiceOperationResult<TbOsEncryptioModel> result = new
 * ServiceOperationResult<TbOsEncryptioModel>();
 * 
 * try { SecurityHelper security = new SecurityHelper(); PasswordSecurityCheck
 * check = security.new PasswordSecurityCheck(custodianRequest.getKey());
 * 
 * check.checkEmpty(); check.checkLenght(8); check.checkAlphaNumericPattern();
 * 
 * 
 * PasswordSecurityCheck check1 = security.new
 * PasswordSecurityCheck(custodianRequest.getSalt()); check1.checkEmpty();
 * check1.checkLenght(8); check1.checkAlphaNumericPattern();
 * 
 * if(!)
 * 
 * } catch(DatabaseException ex) {
 * logger.error(CommonConstant.EXCEPTION_MSG_LIST, null,
 * request.getServerName(), ex);
 * 
 * TbOsDbErrModel errModel = new TbOsDbErrModel(null, null,
 * dbErrService.SqlErrCode(ex), ExceptionUtils.getStackTrace(ex),
 * request.getUserPrincipal().getName()); dbErrService.save(errModel);
 * 
 * result = new ServiceOperationResult<>();
 * result.getErrParam().setErrCode(CommonConstant.NOCODE); result.getErrParam()
 * .setErrDesc(CommonConstant.ERRCONSTANT + request.getServletPath() +
 * CommonConstant.LOGCONSTANT); }
 * 
 * 
 * return result; }
 * 
 * 
 * 
 * }
 */