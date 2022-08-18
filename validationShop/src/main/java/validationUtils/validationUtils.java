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
	
	public static boolean isNull(final Object object)
	{
		if(object == null)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(final Object object)
	{
		if(object == null || "".equals(object))
		{
			return true;
		}
		return false;
	}

	public static boolean isValidSize(final Object object, final int size)
	{
		return object != null && object.toString().length() == size;
	}
	
	public static boolean isBlowinLimit(final Object object, final int sizeLimit)
	{
		return object != null && object.toString().length() <= sizeLimit;
	}
	
	public static boolean isNumaricBlowLimit(Object object, int limitSize)
	{
		return getValueBeforePreciasion(object).length() <= limitSize;
	}
	
	public static String getValueBeforePreciasion(Object object)
	{
		if(object != null)
		{
				try
				{
					if(NumberUtils.isNumaric(object))
					{
						String s = object.toString();
						if(s.contains("."))
						{
							s = s.substring(0, s.indexOf("."));
						}
						s = s.replaceAll("[+-]", "");
						return s;
					}
				}
		catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}
		return "";
	}
	
	public static boolean isBoolean(Object object)
	{
		if(isEmpty(object))
		{
			try
			{
				if(Boolean.parseBoolean(object.toString()) == true)
				{
					return true;
				}
				else
				if(Boolean.parseBoolean(object.toString()) == false)
				{
					if("false".equalsIgnoreCase(object.toString()))
							{
						return true;
							}
					else
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		return true;
	}
	
	
	
	public static class NumberUtils
	{
		public static boolean isNumaric(Object object)
		{
			if(object == null)
			{
				return false;
			}
			try
			{
				Double.parseDouble(object.toString());
			}catch (Exception e) {
				// TODO: handle exception
				return false;
			}
			return true;
		}
	}

}
