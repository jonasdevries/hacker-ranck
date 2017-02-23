package com.hackerrank.intro;

import java.util.Scanner;

public class EOFTest {

	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	public static void main (String args[]){
		int i=1;
		while(sc.hasNext()){
			System.out.printf("%d %s%n",i++, sc.nextLine());
		}
	}
}