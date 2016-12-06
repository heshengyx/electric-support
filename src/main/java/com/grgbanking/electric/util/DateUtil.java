package com.grgbanking.electric.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final SimpleDateFormat DATE_TIME = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	
	private DateUtil() {}
	
	public static String getDateTime(Date date) {
		return DATE_TIME.format(date);
	}
}
