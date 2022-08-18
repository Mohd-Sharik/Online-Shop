package validationUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author MohdSharik
 *
 */
public class validationUtils {

	public validationUtils() {

	}

	public static boolean isNull(final Object object) {
		if (object == null) {
			return true;
		}
		return false;
	}

	public static boolean isEmpty(final Object object) {
		if (object == null || "".equals(object)) {
			return true;
		}
		return false;
	}

	public static boolean isValidSize(final Object object, final int size) {
		return object != null && object.toString().length() == size;
	}

	public static boolean isBlowinLimit(final Object object, final int sizeLimit) {
		return object != null && object.toString().length() <= sizeLimit;
	}

	public static boolean isNumaricBlowLimit(Object object, int limitSize) {
		return getValueBeforePreciasion(object).length() <= limitSize;
	}

	public static String getValueBeforePreciasion(Object object) {
		if (object != null) {
			try {
				if (NumberUtils.isNumeric(object)) {
					String s = object.toString();
					if (s.contains(".")) {
						s = s.substring(0, s.indexOf("."));
					}
					s = s.replaceAll("[+-]", "");
					return s;
				}
			} catch (Exception e) {
				// TODO: handle exception
				return "";
			}
		}
		return "";
	}

	public static boolean isBoolean(Object object) {
		if (isEmpty(object)) {
			try {
				if (Boolean.parseBoolean(object.toString()) == true) {
					return true;
				} else if (Boolean.parseBoolean(object.toString()) == false) {
					if ("false".equalsIgnoreCase(object.toString())) {
						return true;
					} else {
						return false;
					}
				} else {
					return false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		return true;
	}

	public static boolean isCharOnly(String str) {
		if (str == null) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)))
				;
			return false;
		}
		return true;
	}

	public static int length(CharSequence ch) {
		return ch != null ? ch.length() : 0;
	}

	public static class DateUtils {
		public static final String COMMON_DATE_FORMAT = "yyyy-MM-dd";

		public static final String MIN_BASELINE_DATE = "1900-01-01";

		public static final String COMMON_DATE_TIME_FORMAT = "yyyyMMddHHmmss";

		public static final String MIN_BASELINE_DATE_TIME = "19000101000000";

		public DateUtils() {

		}

		public static boolean isValidDate(String value) {
			return isValidDate(value, COMMON_DATE_FORMAT);
		}

		public static boolean isValidDate(String value, String format) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			dateFormat.setLenient(false);
			try {
				Date inputDate = dateFormat.parse(value.trim());
				Date minBaseLineDate = new SimpleDateFormat(COMMON_DATE_FORMAT).parse(MIN_BASELINE_DATE);
				if (inputDate.before(minBaseLineDate)) {
					return false;
				}
				return true;
			} catch (ParseException pe) {
				return false;
			}
		}

		public static boolean isValidDateTime(String dateTime, String dateTimeFormat) {
			SimpleDateFormat dateTimeFormatObj = new SimpleDateFormat(dateTimeFormat);
			dateTimeFormatObj.setLenient(false);
			try {
				Date minBaseLineDate = new SimpleDateFormat(dateTimeFormat).parse(MIN_BASELINE_DATE_TIME);
				Date inputDate = dateTimeFormatObj.parse(dateTime.trim());
				if (inputDate.before(minBaseLineDate)) {
					return false;
				}
				return true;
			} catch (ParseException pe) {
				return false;
			}
		}

	}

	public static class NumberUtils {

		private NumberUtils() {

		}

		public static boolean isNumeric(Object object) {
			if (object == null) {
				return false;
			}
			try {
				Double.parseDouble(object.toString());
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
			return true;
		}

		public static String format(final String number, final int scale) {
			BigDecimal value = new BigDecimal(number);
			value = value.setScale(scale, RoundingMode.DOWN);
			return value.stripTrailingZeros().toPlainString();

		}

		public static boolean validNumeric(String value, String uptoPlace) {
			if (value == null || uptoPlace == null)
				return false;
			if (!isNumeric(value) || !isNumeric(uptoPlace))
				return false;

			final String regExp = "[0-9]+([.][0-9]{1," + uptoPlace + "})?";
			final Pattern pattern = Pattern.compile(regExp);

			Matcher matcher = pattern.matcher(value);
			return matcher.matches();
		}

		public static boolean isFloat(final Object object) {
			if (object == null)
				return false;

			try {
				Float.parseFloat(object.toString());
			} catch (Exception ex) {
				return false;
			}
			return true;
		}

		public static boolean isInteger(final Object object) {
			if (object == null)
				return false;

			try {
				Integer.parseInt(object.toString());
			} catch (Exception ex) {
				return false;
			}
			return true;
		}

		public static boolean isLong(final Object object) {
			if (object == null)
				return false;

			try {
				Long.parseLong(object.toString());
			} catch (Exception ex) {
				return false;
			}
			return true;
		}

		public static boolean isPositve(final Object object) {
			if (object != null) {
				try {
					if (Integer.parseInt(object.toString()) >= 0) {
						return true;
					} else {
						return false;
					}
				} catch (Exception ex) {
					return false;
				}
			}
			return true;
		}

		public static boolean validateMaxIntegerLength(final String value, final int maxLength) {
			int number = Integer.parseInt(value);
			final int length = number == 0 ? 1 : (1 + (int) Math.floor(Math.log10(Math.abs(number))));
			return (length <= maxLength ? true : false);
		}

		public static boolean isNegative(final String value) {
			if (value != null) {
				try {
					return (Integer.parseInt(value.toString()) < 0);
				} catch (Exception ex) {
					return false;
				}
			}
			return true;
		}

		public static boolean isBigDecimal(final String value) {
			if (value != null) {
				try {
					new BigDecimal(value);
				} catch (Exception ex) {
					return false;
				}
			}
			return true;
		}

		public static boolean isValidNumber(final String value, final int maxLength) {
			final String regExp = "^\\s*-?0*[0-9]{1," + maxLength + "}\\s*$";
			final Pattern pattern = Pattern.compile(regExp);

			Matcher matcher = pattern.matcher(value);
			return matcher.matches();
		}

	}

	public static boolean isStringOnlyAlphabet(String str) {
		return ((str != null) && (!str.equals("")) && (str.replaceAll("\\s+", "").matches("^[a-zA-Z]*$")));
	}

}
