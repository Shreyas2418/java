package java1;

import java.util.Scanner;

public class Count_the_given_letter_in_string {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine().toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("Number is:"+count);
	}
}
