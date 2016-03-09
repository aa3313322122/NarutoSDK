package com.naruto.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties readProperties(String fileName) {
		Properties prop = new Properties();
		try {
			prop.load(getResourceFile(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static InputStream getResourceFile(String fileName) {
		return Object.class.getResourceAsStream("/" + fileName);
	}

}
