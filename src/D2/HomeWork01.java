package D2;

/*
 * Szyfr Cezara jest to szyfr za pomocą, którego Juliusz Cezar szyfrował swoje listy do Cycerona.

W pliku Main1.java umieść metodę o sygnaturze static String encode(String str).

    Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara

 */
public class HomeWork01 {

	final static String ALPHABET = "abcdefghijkalmnoperstuwxyz. ";
	
	public static void main(String[] args) {
		
		String text = "kolejna ala ma kotax.";
		System.out.println(encrypt(text, ALPHABET, 3));
	}
	
	static String encrypt(String text, String ALPHABET, int step) {
		String result = "";
		for(char c: text.toCharArray()) {
			int index = ALPHABET.indexOf(c);
			int newIndex = index + step;
			if(newIndex > ALPHABET.length() - 1) {
				newIndex = 3 - (ALPHABET.length() - index);
			}
			result += ALPHABET.charAt(newIndex);
		}
		return result;
	}
}
