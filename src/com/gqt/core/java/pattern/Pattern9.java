package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("enter the Number");
		int n = a.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j= 1;j<=n;j++) {
				System.out.print(i+"");
			}
			System.out.println();
			a.close();
		}

	}

}
