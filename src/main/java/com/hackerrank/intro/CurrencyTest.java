package com.hackerrank.intro;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyTest {

	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public static void main (String args[]){
		double value = sc.nextDouble();
		sc.close();
		// 12324.134
		NumberFormat nf;
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.printf("US: %s%n", nf.format(value));

		nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		System.out.printf("India: %s%n", nf.format(value));

		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.printf("China: %s%n", nf.format(value));

		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.printf("France: %s%n", nf.format(value));



		/*
		US: $12,324.13
		India: Rs.12,324.13
		China: ￥12,324.13
		France: 12 324,13 €*/
	}
}