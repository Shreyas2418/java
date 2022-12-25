package java1;
//length and reverse of a String
public class Reverse_a_given_string {
	public static void main(String[] args) {
		String str = ")udanelam(ILLAHAHTRIHT morf m'i dna VH SAYERHS si eman yM";
		System.out.println(str.length());
		for (int i =str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
			
		}
	}
}
