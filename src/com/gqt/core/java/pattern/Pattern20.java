package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print("_"+ " ");
			}
				for(int k =1;k<=n;k++) {
					System.out.print("@"+"");
		
					
				}
				System.out.println( );
				sc.close();
			}
		}
		

	}


