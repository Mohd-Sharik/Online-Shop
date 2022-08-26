package logginShopLogging;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author MohdSharik
*/

public class LoggerFactory {
	
	
	private static final Map<Class<?> , ILogger> CACHED_LOGGER = new ConcurrentHashMap<Class<?>, ILogger>();
	
	
	
	
	public static ILogger getLogger(Class<?> logClass)
	{
		if(CACHED_LOGGER.containsKey(logClass))
			return CACHED_LOGGER.get(logClass);
		
		ILogger logger = new ILogger(logClass);
		return CACHED_LOGGER.put(logClass, logger);
		
	}

}
