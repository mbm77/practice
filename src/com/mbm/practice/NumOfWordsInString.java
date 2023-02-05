package com.mbm.practice;

public class NumOfWordsInString {

	public static void main(String[] args) {
		String str1 = "Visibility of Element Located Presence of element located ";
		String str = str1.trim();
		int len = str.length();
		String text = "";
		int count = 1;
		for (int i = 0; i < len; i++) {
			text = text + str.charAt(i);
			if (str.contains(text + " ")) {
				count++;
			}
		}

		System.out.println(count);
	}

}
