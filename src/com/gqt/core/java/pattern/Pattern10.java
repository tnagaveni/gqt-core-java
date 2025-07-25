package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.println("enter the number");
		int n = b.nextInt();
		int a = 1;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print(a+"");
				a++;
			}
			System.out.println();
			b.close();
		}

	}

}
