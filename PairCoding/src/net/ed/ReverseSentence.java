package net.ed;

public class ReverseSentence {
	
	public static void main(String[] args) {

		// output: dlroW ereht olleH
		String sentence = "Hello there World";
		
		char letters[] = sentence.toCharArray();
		int len = letters.length;
		
		for(int i = 0; i < letters.length/2; i++, len--) {
			char tmp = letters[i];
			letters[i] = letters[len - 1];
			letters[len - 1] = tmp;
		}
		
		for(char letter : letters) {
			System.out.print(letter);
		}
	}

}
