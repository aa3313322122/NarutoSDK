package com.naruto.utils;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final String DATE_FORMAT = "yyy-MM-dd HH:mm:ss";
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	
	public static void main(String[] args) {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date();
		System.out.println(dateToString(date));
		System.out.println(timestampToString(ts));
		System.out.println(Timestamp.valueOf(dateToString(date)).getTime());
		
	}
	
	public static Timestamp dateToTimestamp(Date date) {
		return stringToTimestamp(dateToString(date));
	}
	
	public static Date timestampToDate(Timestamp ts) {
		return new Date(ts.getTime());
	}
	
	public static String dateToString(Date date) {
		
		return sdf.format(date);
	}
	
	public static Date stringToDate(String date) {
		try {
			return new SimpleDateFormat().parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Timestamp stringToTimestamp(String date) {
		return Timestamp.valueOf(date);
	}
	
	public static String timestampToString(Timestamp ts) {
		return dateToString(ts);
	}
	
	/**
	 * 时间相减+格式化
	 * @Title
	 * @param @param startTime
	 * @param @param endTime
	 * @param @param format
	 * @param @return
	 * @return String
	 */
	public static String minusTime(String startTime, String endTime, String format)
	{
		SimpleDateFormat sf = new SimpleDateFormat(format);
		Date st;
		Date et;
		try
		{
			st = sf.parse(startTime);
			et = sf.parse(endTime);
		}
		catch (ParseException e)
		{
			return null;
		}
		return getTime(et.getTime() - st.getTime());
	}

	public static String getTime(long time)
	{
		Double dt = time / 60.0 / 60 / 1000;
		DecimalFormat df = new DecimalFormat("0.0");
		return df.format(dt);
	}

}
