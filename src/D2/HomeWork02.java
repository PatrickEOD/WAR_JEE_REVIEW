package D2;

/*
 * W pliku Main2.java umieść zmodyfikowaną metodę z zadania domowego 1 o sygnaturze static String encode(String str, int shift).

    shift - oznacza przesunięcie znaków
    Dodaj metodę deszyfrującą static String decode(String str, int shift) .
    
    potem odszyfruj to oryginalnego tekstu

 */
public class HomeWork02 {

	final static String ALPHABET = "abcdefghijklmnoprstuwxyz. ";
	
	public static void main(String[] args) {
		
		int shift = 3;
		String text = "kolejna ala ma kota.";
		System.out.println("Tekst zaszyfrowany: ");
		System.out.println(encrypt(text, 3));
		System.out.println("Teksty odszyfrowany: ");
		System.out.println(decrypt(encrypt(text, 3), shift));
	}
	
	static String encrypt(String text, int shift) {
		String result = "";
		for(char c : text.toCharArray()) {
			int index = ALPHABET.indexOf(c);
			int nextIndex = index + shift;
			if(nextIndex > ALPHABET.length() - 1) {
				nextIndex = 3 - (ALPHABET.length() - index);
			}
			result += ALPHABET.charAt(nextIndex);
		}
		return result;
	}
	
	static String decrypt(String encrypted, int shift) {
		String result = "";
		for(char c : encrypted.toCharArray()) {
			int index = ALPHABET.indexOf(c);
			int backIndex = index - shift;
			if(index < shift) {
				backIndex = ALPHABET.length() - (shift - index);
			}
			result += ALPHABET.charAt(backIndex);
		}
		return result;
	}
}
