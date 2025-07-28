package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		for(int i = 0;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int s= i;s>=0;s--) {
				System.out.print(s+" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

			sc.close();

	}

}
