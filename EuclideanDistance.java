package com.blz.coreprograms;

import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) {
		int x, y;
		float Distance;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of X point");
		x = sc.nextInt();

		System.out.println("Enter the value of Y point");
		y = sc.nextInt();
		sc.close();

		Distance = (float) Math.sqrt((x * x) + (y * y));
		System.out.println("Euclidean Distance of (" + x + "," + y + ") is " + Distance);
	}

}
