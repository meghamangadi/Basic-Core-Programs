package com.blz.coreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number as A");
		num1 = sc.nextInt();

		System.out.println("Enter the Second Number as B");
		num2 = sc.nextInt();
		sc.close();

		System.out.println("Numbers before Swapping A=" + num1 + "," + " B=" + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after Swapping A=" + num1 + "," + " B=" + num2);
	}

}
