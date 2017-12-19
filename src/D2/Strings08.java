package D2;

/*
 * W pliku Main8.java została umieszczona metoda o sygnaturze static String stringFromArray(String[] str).

    Uzupełnij ciało metody tak aby zwracała napis powstały z połączenia wszystkich napisów występujących w tablicy str.

 */
public class Strings08 {

	public static void main(String[] args) {
		
		String[] str = { "Coders", "Lab",  "Lorem",  "ipsum"};
		System.out.println(stringFromArray(str));
	}
	
	static String stringFromArray(String[] str) {
		return String.join(" ", str);
	}
}
