package com.blz.coreprograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int power, num = 2;
		System.out.println("Enter the power of 2 : ");
		Scanner sc = new Scanner(System.in);
		power = sc.nextInt();
		sc.close();

		System.out.println("2 to the Power of" + power + Math.pow(num, power));

	}

}
