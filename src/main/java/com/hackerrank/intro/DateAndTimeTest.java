package com.hackerrank.intro;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndTimeTest {

	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public static void main (String args[])
	{

		// solution 1
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();
		Calendar c =  new GregorianCalendar(year, month-1, day); // month-1 because january starts as 0 / use parse in solution 2 to have january as 1
		DateFormat fullDay = new SimpleDateFormat("EEEE");
		System.out.println(fullDay.format(c.getTime()).toUpperCase());

		// solution 2
		String input = day+"/"+month+"/"+year;
		DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			Date d = inputFormat.parse(input);
			System.out.println(fullDay.format(d).toUpperCase());
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
	}
}