package java1;
//count the number of words in a sentence
public class Count_the_number_of_words_in_a_sentence {
	public static void main(String[] args) {
		String S = "I am studying String concept of a java now";
		String []t = S.trim().split(" ");
		System.out.println(t.length);
		
		for (String u : t) {
			System.out.println(u);
		}
	}
}