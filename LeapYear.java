package com.blz.coreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		year = sc.nextInt();
		sc.close();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("yes! it is leap year");
		} else {
			System.out.println("No, it is not a leap year");
		}

	}

}