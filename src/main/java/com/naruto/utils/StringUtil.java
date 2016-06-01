package com.naruto.utils;

public class StringUtil
{
	public static void main(String[] args)
	{
		String s = "123a.234b.cc.xml";
		int index = s.lastIndexOf(".");
		System.out.println(s.substring(index));
		System.out.println(s.substring(0, index));
	    
		String str= "GDSZ001";
		System.out.println(str.startsWith(str));
		StringBuffer sb = new StringBuffer();
		if(sb.length() == 0)
		{
			System.out.println("q");
		}
		
	}
	


}
