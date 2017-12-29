package D2;

/*
 * W pliku Main5.java umieść metodę o sygnaturze static String replaceChar(String str, char forReplace, char replacement).

    Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie str wszystkich zmaków forReplace przez znaki replacement.

 */
public class HomeWork05 {

	public static void main(String[] args) {
		
		String text = "Ala ma kota Ala ma kota Ala ma kota.";
		char forReplace = 'A';
		char replacement = 'O';
		System.out.println(replaceChar(text, forReplace, replacement));
	}
	
	static String replaceChar(String str, char forReplace, char replacement) {
		return str.replaceAll(String.valueOf(forReplace), String.valueOf(replacement));
	}
}
