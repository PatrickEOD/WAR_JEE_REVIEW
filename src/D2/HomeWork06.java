package D2;

/*
 * W pliku Main6.java umieść metodę o sygnaturze static String replaceStr(String str, String forReplace, String replacement).

    Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie str wszystkich wystąpień napisu forReplace przez napis replacement.

 */
public class HomeWork06 {

	public static void main(String[] args) {
		
		String text = "Ala ma kota Ala ma kota Ala ma kota.";
		String forReplace = "Ala";
		String replacement = "Ola";
		System.out.println(replaceStr(text, forReplace, replacement));
	}
	
	static String replaceStr(String str, String forReplace, String replacement) {
		return str.replaceAll(forReplace, replacement);
	}
}
