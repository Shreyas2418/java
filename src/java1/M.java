  package java1;
//if opening and closing bracket are not equal give me error
import java.util.Scanner;

public class M {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the paranthesis - ():");
		String msd = scan.nextLine();
		int ssd1 =0;
		int ssd2 =0;
		for (int zc = 0; zc < msd.length(); zc++) {
			if(msd.charAt(zc)=='(') {
				ssd1++;
			}
			else if(msd.charAt(zc)==')') {
				ssd2++;
			}
		}
		if(ssd1==ssd2) {
			System.out.println("NO ERROR");
		}
		else {
			System.out.println("ERROR");
		}
	}
}
