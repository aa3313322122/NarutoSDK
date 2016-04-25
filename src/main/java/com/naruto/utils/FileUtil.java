package com.naruto.utils;

import java.io.File;

public class FileUtil
{
	public static void main(String[] args)
	{
		fileExist("C:\\Users\\yy\\Desktop\\666\\888");
	}
	
	public static void fileExist(String path)
	{
	    File file = new File(path);  
	    if  (!file.exists() && !file.isDirectory())      
	    {       
	        file.mkdirs();
	    }
	}
}
