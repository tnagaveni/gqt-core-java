package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		for( int i=1;i<=n;i++) {
			 char c='A';
			for (int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(c+" ");
				c++;
				}
			c--;
			for(int j=2;j<=i;j++) {
				c--;
				System.out.print(c+" ");
				
			}
			System.out.println();
		}
	sc.close();
}


	}


