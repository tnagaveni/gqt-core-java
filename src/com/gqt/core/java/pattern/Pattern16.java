package com.gqt.core.java.pattern;
import java.util.Scanner;


public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("enter the Number");
		int n = a.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j= 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		a.close();
		}
		

	}

}
