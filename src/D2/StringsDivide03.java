package D2;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * W pliku Main3.java umieść metodę o sygnaturze static int countTokent(String str).

    Uzupełnij ciało metody tak, aby zwracała ilość elementów w ciągu znaków.
    Metoda powinna pomijać białe znaki.

 */
public class StringsDivide03 {

	public static void main(String[] args) {
		
		String str = "Coders Lab Lorem Ipsum texttext i text";
		System.out.println("Ilość wyrazów: " + String.valueOf(countToken(str)));
		String charactersCount = Arrays.toString(Arrays.copyOfRange(countChar(str), 1, countChar(str).length));
		System.out.println("Ilość znaków wynosi: " + String.valueOf(countChar(str)[0]) + "\nIlość wyrazów w każdym wyrazie: " + charactersCount);
	}
	// method counts each word;
	static int countToken(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		int count = 0;
		while(tokenizer.hasMoreTokens()) {
			tokenizer.nextToken(); // erasing token from stack
			count++;
		}
		return count;
	}
	
	// method counts each character
	static int[] countChar(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str);
		int[] tokens = new int[tokenizer.countTokens() + 1];
		int i = 0;
		while(tokenizer.hasMoreTokens()) {
			++i;
			String s = tokenizer.nextToken();
			tokens[i] = s.length();
			tokens[0] += s.length();
		}
		return tokens;
	}
}
