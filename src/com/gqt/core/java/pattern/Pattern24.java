package com.gqt.core.java.pattern;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j= i;j>=1;j--) {
				System.out.print(i+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

			sc.close();
			
		}

	}


