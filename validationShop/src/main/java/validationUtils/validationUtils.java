package validationUtils;


/**
 * 
 * @author MohdSharik
 *
 */
public class validationUtils {
	
	public validationUtils()
	{
		
	}
	
	public static boolean isNull(Object object)
	{
		if(object == null)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(Object object)
	{
		if(object == null || "".equals(object))
		{
			return true;
		}
		return false;
	}

}
