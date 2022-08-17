package validationUtils;

import java.lang.reflect.Method;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * @author MohdSharik
 * 
 * 
*/
public class validationHelper {
	
	
	private static final String SUCCESS = "SUCCESS";
	
	public String checkValidatio(Object object)
	{
		try
		{
			Class noparam[] = {};
			Method method = object.getClass().getMethod("validate", noparam);
			String check =  (String)method.invoke(object);
			return (check != null && !check.isEmpty()) ? check : SUCCESS;
		}
		catch (Exception ex) {
			// TODO: handle exception
			return ExceptionUtils.getRootCauseMessage(ex);
		}
	}
	
	public String checkValidationAndThrow(Object object)
	{
		try
		{
			Class noparam[] = {};
			Method method = object.getClass().getMethod("validation", noparam);
			String check = (String)method.invoke(object);
			return (check != null && !check.isEmpty()) ? check : SUCCESS;
		}
		catch (Exception e) {
			// TODO: handle exception
			return ExceptionUtils.getRootCauseMessage(e);
		}
		
	}

}
