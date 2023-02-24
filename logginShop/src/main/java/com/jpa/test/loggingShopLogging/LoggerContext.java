package com.jpa.test.loggingShopLogging;

import java.lang.management.ManagementFactory;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.ThreadContext;



/**
 * LoggerContext class is used to store the logging Activity information and
 * custom level application context information using log4j ThreadContext class.
 * 
 * @author MohdSharik
 * 
 */

public class LoggerContext {
	
	
	private static final String ACTIVITY_ID = "activityId";
	private static final String APP_NAME = "applicationName";
	private static final String METHOD_NAME = "methodName";
	private static final String PROCESS_ID = "processId";
	private static final String PROCESS_NAME = "processName";
	private static final String THREAD_ID = "threadId";
	private static final String USER_ID = "userId";
	private static final String ID = "id";

	private static String processID = ManagementFactory.getRuntimeMXBean().getName();

	/**
	 * Sets the Activity information into ThreadContext.
	 *
	 * @param activity the activity object to store.
	 */
	protected static void setActivity(Activity activity) {
		if (null != activity) {
			ThreadContext.put(ACTIVITY_ID, activity.getActivityId().toString());
		} else {
			ThreadContext.put(ACTIVITY_ID, null);
		}
	}

	/**
	 * Retrieves current activityId and parentActivityId from ThreadContext.
	 *
	 * @return the Activity Object
	 */
	/**
	 * The method return current activity.
	 */
	protected static Activity getCurrentActivity() {
		Activity activity = new Activity();
		activity.setActivityId(UUID.fromString(ThreadContext.get(ACTIVITY_ID)));
		return activity;
	}

	/**
	 * Stores the custom level application specific information in to ThreadContext
	 * from CurrentThread.
	 */
	protected static void setContext(StackTraceElement stackTrace) {
		ThreadContext.put(APP_NAME, stackTrace.getClassName());
		ThreadContext.put(METHOD_NAME, stackTrace.getMethodName());
		ThreadContext.put(PROCESS_ID, processID);
		ThreadContext.put(PROCESS_NAME, System.getProperty("java.vm.vendor"));
		ThreadContext.put(THREAD_ID, String.valueOf(Thread.currentThread().getId()));
		ThreadContext.put(USER_ID, System.getProperty("user.name"));
	}

	/**
	 * Method to get log of StackTrace Element.
	 *
	 * @param stackTraces  the stack traces
	 * @param callingClass the calling class
	 * @return the log strack trace element
	 */
	public static StackTraceElement getLogStrackTraceElement(StackTraceElement[] stackTraces, Class<?> callingClass) {

		StackTraceElement stackTraceElement = null;
		for (int index = 0; index < stackTraces.length; index++) {
			if (stackTraces[index].getClassName().equalsIgnoreCase(callingClass.getName())) {
				stackTraceElement = (index == (stackTraces.length - 1)) ? stackTraces[index] : stackTraces[index + 1];
				break;
			}
		}
		return stackTraceElement;
	}

	/**
	 * Sets the Activity information into ThreadContext.
	 *
	 * @param activityId the activity Id to store.
	 */
	public static void setActivityId(String activityId) {
		ThreadContext.put(ACTIVITY_ID, activityId);
	}

	/**
	 * Retrieves current ActivityId from ThreadContext.
	 *
	 * @return the activityId
	 */
	protected static String getCurrentActivityId() {
		return ThreadContext.get(ACTIVITY_ID);
	}

	public static void setId(Long id) {
		if (id != null)
			ThreadContext.put(ID, String.valueOf(id));
	}

	public static Long getId() {
		Long result = null;
		String idString = ThreadContext.get(ID);
		if (StringUtils.isNotEmpty(idString))
			result = Long.valueOf(idString);
		return result;
	}

	public static void setUserId(String userId) {
		ThreadContext.put(USER_ID, userId);
	}

	private LoggerContext() {
		super();

	}

}
