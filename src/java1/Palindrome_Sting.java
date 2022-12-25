package java1;
//palindrome
public class Palindrome_Sting {
	public static void main(String[] args) {
		String str = "malayalam";
		String rev = "";
		for (int i = str.length()-1; i>=0 ; i--) {
			rev = rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}
