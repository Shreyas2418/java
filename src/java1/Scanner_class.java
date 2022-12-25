package java1;
//scanner class
import java.util.Scanner;

public class Scanner_class {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = scan. nextLine();
		System.out.println(name);
		
		System.out.println("enter your age:");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("is your name shreyas?:");
		boolean ans = scan. nextBoolean();
		System.out.println(ans);
		
		System.out.println("enter your weight:");
		float weight = scan. nextFloat();
		System.out.println(weight);
		
		}
}
