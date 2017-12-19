package D2;

/*
 * W pliku Main6.java została umieszczona metoda o sygnaturze static String firstHalf(String str).

    Uzupełnij ciało metody tak aby zwracała połowę napisu.
    Uwzględniamy tylko część całkowitą podziału. Przykład: dla napisu CodersLab zwróci Code.

 */
public class Strings06 {

	public static void main(String[] args) {
		
		String str = "Coders Labasa";
		System.out.println(firstHalf(str));
	}
	
	static String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}
}
