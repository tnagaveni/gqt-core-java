package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("enter the number");
		int n = a.nextInt();
		int b = n*n;
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print(b);
				b--;
			}
			System.out.println();
			
		}a.close();
	}

}
