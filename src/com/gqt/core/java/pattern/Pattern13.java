package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("enter the Number");
		int n = a.nextInt();
		int b ;
		for(int i = 1;i<=n;i++) {
			b=i;
			for(int j= 1;j<=n;j++) {
				System.out.print(b+"	");
				b=b+n;
			}
			System.out.println();
			a.close();
		}


	}

}
