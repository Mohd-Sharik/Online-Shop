package com.onlineShop.example.commonUtilMethods;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

import com.onlineShop.example.commonUtilMethods.CommonConstant.DateFormat;


public class CommonUtilityHelper {
	
	
	/**
	 * @author MohdSharik
	 */
	
	
	private static final SimpleDateFormat DD_MM_YYYY_HHMMSS = new SimpleDateFormat(DateFormat.DD_MMM_YYYY_HHMMSS, Locale.ENGLISH);
	private static final SimpleDateFormat DD_MM_YYYY = new SimpleDateFormat(DateFormat.DD_MMM_YYYY, Locale.ENGLISH);
	private static final SimpleDateFormat Time_00_00_00 = new SimpleDateFormat(DateFormat.HHMMSS, Locale.ENGLISH);
	private static final SimpleDateFormat HH_MM_SS = new SimpleDateFormat(DateFormat.HHMMSS, Locale.ENGLISH);
	private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat(DateFormat.YYYY_MM_DD, Locale.ENGLISH);
	private static final SimpleDateFormat YYYY_MM_DD_HH_MM_SS_SSS = new SimpleDateFormat(DateFormat.YYYY_MM_DD_HH_MM_SS_SSS, Locale.ENGLISH);

	private static final SimpleDateFormat YYYY_MMM_DD = new SimpleDateFormat(DateFormat.YYYY_MMM_DD, Locale.ENGLISH);
	private static final SimpleDateFormat DD_MMM_YYYY_HHMMSS_SSS_A = new SimpleDateFormat(DateFormat.DD_MMM_YYYY_HHMMSS_SSS_A, Locale.ENGLISH);
	
	
	private static SimpleDateFormat getSimpleDateFormat(String pattern)
	{
		SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
		
		return format;
	}
	
	
	
	public static class DateUtil {

		/**
		 * This method is use to get the current date as String object by using the
		 * specified pattern.
		 *
		 * @param pattern the pattern
		 * @return String
		 */
		public static String getCurrentDateAsString(final String pattern) {
			SimpleDateFormat sf = getSimpleDateFormat(pattern);
			return sf.format(new Date());
		}

		public static Date getCurrentDate(final String pattern) throws ParseException {
			SimpleDateFormat sf = getSimpleDateFormat(pattern);
			String currentDateInString = getCurrentDateAsString(pattern);
			return sf.parse(currentDateInString);

		}

		public static String getStringFromDate(Date date, String pattern) {
			if (date == null)
				return null;
			if (pattern == null)
				return null;

			SimpleDateFormat sf = getSimpleDateFormat(pattern);
			return sf.format(date);
		}

		public static Date getDateFromString(String date, String pattern) throws ParseException {

			if (pattern == null)
				return null;
			if (date == null)
				return null;

			SimpleDateFormat sf = getSimpleDateFormat(pattern);
			return sf.parse(date);
		}

		public static Date addSecondsToDate(Date date, Long seconds) {

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.SECOND, seconds.intValue());
			return cal.getTime();
		}

		public static Date addDaysToDate(Date date, Long days) {

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DAY_OF_MONTH, days.intValue());
			return cal.getTime();
		}

		public static Date addHoursToDate(Date date, Long hours) {

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.HOUR_OF_DAY, hours.intValue());
			return cal.getTime();
		}

		public static Date addTimeIntoMinutes(Date date, int minus) throws ParseException {

			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.MINUTE, minus);
			return c.getTime();
		}

		public static Map<String, String> dateSplit(final Map<String, String> input, final Date date) {

			final Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			final String time = getStringFromDate(date, CommonConstant.DateFormat.HHMMSS);

			String dateString = String.valueOf(calendar.get(Calendar.DATE));

			if (dateString.length() == 1) {
				dateString = CommonConstant._0 + dateString;
			}
			String mm = String.valueOf(calendar.get(Calendar.MONTH) + 1);
			if (mm.length() == 1) {
				mm = CommonConstant._0 + mm;
			}
			final String yyyy = String.valueOf(calendar.get(Calendar.YEAR));
			final String yy = yyyy.substring(2, yyyy.length());

			final String hh = time.substring(0, 2);
			final String mms = time.substring(2, 4);
			final String ss = time.substring(4, 6);
			final String day = getStringFromDate(date, CommonConstant.EEE);
			calendar.getTime();

			input.put(DateFormat.DD, dateString);
			input.put(DateFormat.YY, yy);
			input.put(DateFormat.MM, mm);
			input.put(DateFormat.YYYY, yyyy);
			input.put(DateFormat.DAY, day);
			input.put(DateFormat.HH, hh);
			input.put(DateFormat.SS, ss);

			return input;
		}

		public static Map<String, Date> getDbBetweenDate(String startDate, String endDate) throws ParseException {
			Map<String, Date> dateMap = new HashMap<>();
			SimpleDateFormat sdfmt = getSimpleDateFormat(DateFormat.YYYY_MM_DD_HH_MM_SS_SSS);
			dateMap.put(CommonConstant.FROM,
					sdfmt.parse(startDate + CommonConstant.SPACE + DateFormat.TIME_00_00_00_000));
			dateMap.put(CommonConstant.TO,
					sdfmt.parse(endDate + CommonConstant.SPACE + DateFormat.TIME_23_59_59_999));
			return dateMap;
		}

		public static String getDateFromMillisecond(Long millisec, String pattern) {
			if (millisec == null)
				return null;
			if (pattern == null)
				return null;

			SimpleDateFormat sf = getSimpleDateFormat(pattern);
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(millisec);
			return sf.format(calendar.getTime());
		}

		/**
		 * Checks if is date fall in weekends.
		 *
		 * @param date the date
		 * @return true, if is date fall in weekends
		 */
		public boolean isWeekend(final Date date) {
			final Calendar cal1 = Calendar.getInstance();

			cal1.setTime(date);
			boolean flag = false;

			if (Calendar.SUNDAY == cal1.get(Calendar.DAY_OF_WEEK)
					|| Calendar.SATURDAY == cal1.get(Calendar.DAY_OF_WEEK)) {
				flag = true;
			}

			return flag;

		}

		/**
		 * Gets the previous working day.
		 *
		 * @param date the date
		 * @return the previous working day
		 */
		public Date getPreviousWorkingDay(final Date date) {
			final Calendar cal = Calendar.getInstance();
			cal.setTime(date);

			int dayOfWeek;
			do {
				cal.add(Calendar.DAY_OF_MONTH, -1);
				dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			} while (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);

			return cal.getTime();
		}

		public boolean isTimeToRun(final String timeToCheck, final int delayInSecs) throws ParseException {
			boolean isTimeToRun = false;

			final int delayInMins = delayInSecs / 60;

			// get current time
			final Date currentTime = DateUtil.getCurrentDate(CommonConstant.DateFormat.DD_MM_YYYY_HH24MISS);
			final String currentTimeStr = getStringFromDate(currentTime, CommonConstant.DateFormat.TIME_HH_MM_SS);
			final Calendar calStart = getCalForTime(timeToCheck);
			// reduce time by a minute for start time
			calStart.set(Calendar.MINUTE, calStart.get(Calendar.MINUTE) - delayInMins);

			final Calendar calEnd = getCalForTime(timeToCheck);
			// add a minute to the time to get end time
			calEnd.set(Calendar.MINUTE, calEnd.get(Calendar.MINUTE) + delayInMins);

			// get Mexican current time calendar
			final Calendar calCurrentTime = getCalForTime(currentTimeStr);

			final Date dateToCheck = calCurrentTime.getTime();

			if (dateToCheck.after(calStart.getTime()) && dateToCheck.before(calEnd.getTime())) {
				isTimeToRun = true;

			} else {
				isTimeToRun = false;
			}

			return isTimeToRun;
		}

		private Calendar getCalForTime(final String start) throws ParseException {
			final Date startTime = new SimpleDateFormat(CommonConstant.DateFormat.TIME_HH_MM_SS).parse(start);
			final Calendar cal = Calendar.getInstance();
			cal.setTime(startTime);
			return cal;
		}
	}
	
	
	public static String getAlphaNumericString(int n)
	{
		StringBuilder sb = new StringBuilder();
		Random ran = new Random();
		for(int i =0; i <= n; i++)
		{
			int index = (int)( CommonConstant.ALPH_NMR_STR.length() * ran.nextDouble());
			
			sb.append(CommonConstant.ALPH_NMR_STR.charAt(index));
		}
		
		return sb.toString();
	}

}
