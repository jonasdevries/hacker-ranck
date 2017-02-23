package com.hackerrank.intro;

import java.util.Scanner;

public class StaticBlockTest {

	static boolean flag;
	static int B,H;

	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if(B>0 && H>0){
		   flag = true;
		} else {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
		sc.close();
	}


	public static void main (String args[]){
		if(flag){
			int area=B*H;
		}
	}
}