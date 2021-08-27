package com.blz.coreprograms;

import java.util.Scanner;

public class VowelConsonantCheck {

	public static void main(String[] args) {
		char ch;

		System.out.println("Enter any Alphabet");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		sc.close();
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It is Vowel");
		} else {
			System.out.println("It is Consonant");
		}

	}

}
