package com.naruto.utils;

import java.sql.Timestamp;
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

}
