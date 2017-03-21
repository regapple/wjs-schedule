package com.wjs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

	static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");
	public static Integer addIntDate(Integer intdate, int offset) {
		
		if(null == intdate){
			return null;
		}
		Date date = DateUtils.addDays(parseIntDate(intdate), offset);
		return getIntDay(date);
	}
	
	public static Date parseIntDate(Integer intdate){
		
		try {
			Date date = dayFormat.parse(String.valueOf(intdate));
			return date;
		} catch (ParseException e) {
			LOGGER.error("format int date error");
		}
		return null;
	}
	
	public static Integer getIntDay(Date date){
		
		return Integer.valueOf(getStringDay(date));
	}
	
	public static String getStringDay(Date date){
		
		return dayFormat.format(date);
	}

	public static Long getLongTime(String strDate, String format) {
		
		return parseDate(strDate, format).getTime();
	}

	public static Date parseDate(String strDate, String format) {
		try {
			return new SimpleDateFormat(format).parse(strDate);
		} catch (ParseException e) {
			return new Date();
		}
	}

	public static String getStringDay(Long time, String format) {
		
		try {
			if(time == null || time == 0L){
				return "";
			}
			return new SimpleDateFormat(format).format(new Date(time));
		} catch (Exception e) {

			return "";
		}
	}

}
