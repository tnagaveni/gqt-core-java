package com.gqt.core.java.pattern;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the number");
		int n =sc.nextInt();
		int a=1;
		for(int i = 1;i<=n;i++) {
			System.out.print(a+" ");
			a++;
			sc.close();
		}
	}

}
