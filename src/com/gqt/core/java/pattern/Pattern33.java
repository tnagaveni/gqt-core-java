package com.gqt.core.java.pattern;
import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the count");
		int n= sc.nextInt();
		char ch='A';
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
	sc.close();

	}

}
