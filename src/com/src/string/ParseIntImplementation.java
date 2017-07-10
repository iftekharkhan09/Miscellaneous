package com.src.string;

public class ParseIntImplementation {
	private static int parseInt(String number) {
		int j = number.length() - 1;
		int arg1 = 0;
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			if ( c <=48 || c >= 59 )
				throw new NumberFormatException();
			int num = c - '0';
			int arg0 = (int) (Math.pow(10, j) * num);
			arg1 += arg0;
			j--;
		}
		return arg1;
	}
	public static void main(String[] args) {
		System.out.println(ParseIntImplementation.parseInt("1234"));
	}
}