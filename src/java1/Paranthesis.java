package java1;
//Paranthesis
import java.util.Scanner;

public class Paranthesis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter paranthesis:");
		String str = scan.next();
		int count1 = 0, count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='(') {
				count1++;
			}
			else if(str.charAt(i)==')') {
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println("NO ERROR");
		}else {
			System.out.println("ERROR");
		}
	}
}
