package com.gqt.core.java.pattern;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			int a=1;
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j= i;j>=1;j--) {
				System.out.print(a+" ");
				a++;
			}
			a--;
			for(int j=2;j<=i;j++) {
				a--;
				System.out.print(a+" ");
				
				
				
			}
			
			System.out.println();
		}
		for(int i = n-1;i>=1;i--) {
			int a=1;
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j= i;j>=1;j--) {
				System.out.print(a+" ");
				a++;
			}
			a--;
			for(int j=2;j<=i;j++) {
				a--;
				System.out.print(a+" ");
				
				
				
			}
			
			System.out.println();
		}


	}

}
