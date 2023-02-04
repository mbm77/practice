package com.mbm.practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.nextLine();
		int len = str.length();
		String palindromStr = "";

		for (int i = len - 1; i >= 0; i--) {
			palindromStr = palindromStr + str.charAt(i);
		}

		if (str.equalsIgnoreCase(palindromStr)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}

		scanner.close();
	}

}
