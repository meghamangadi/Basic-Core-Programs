package com.blz.coreprograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		num = sc.nextInt();
		sc.close();

		if (num % 2 == 0) {
			System.out.println("It is Even Number");
		} else {
			System.out.println("It is Odd Number");
		}

	}

}
