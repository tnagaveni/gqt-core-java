/**
 * 
 */
package com.gqt.core.java.pattern;

import java.util.Scanner;

/**
 * 
 */
public class PatternName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1||i==n/2)

				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||i==n/2||j==n-1&&i>n/2)

				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1||i==n/2)

				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0&&i<n/2||i-j==n/2||i+j==(n-1)+(n/2)||j==n-1&&i<n/2)

				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||i==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==n/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
			
			
			
			
			
			

		}sc.close();
	

	}

}
