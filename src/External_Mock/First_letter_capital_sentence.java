package External_Mock;

public class First_letter_capital_sentence {
	public static void main(String[] args) {
	String s="i am mamata";
	
	String[] words = s.split(" ");
			for(String word:words) {
		System.out.print(word.substring(0,1).toUpperCase()+word.subSequence(1, word.length())+" ");
	}

}
}