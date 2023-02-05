package com.mbm.practice;

import java.util.Scanner;

public class CheckStrcharNumSpl {
	public static void main(String[] args) {

		System.out.println("Enter a String");
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		System.out.println(str);
		if (str.matches("^[a-zA-Z0-9!#$%&(*+),-/@]*$")) {
			System.out.println("valid password");
		} else {
			System.out.println("Invalid Password");
		}

		scanner.close();
	}

}
