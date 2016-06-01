package com.naruto.utils;

import java.text.NumberFormat;

public class MathUtil
{
	public static void main(String[] args)
	{
		Double amount = 112312323.551213123451;
		NumberFormat format =NumberFormat.getNumberInstance();
		format.setMaximumFractionDigits(4);
		String s = format.format(amount);
		System.out.println(s);
	}

}
