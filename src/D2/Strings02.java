package D2;

/*
 * 

Palindrom to słowo lub zdanie, które czytane wspak brzmi tak samo, jak od początku, np. "kajak", "radar", czy "Kobyła ma mały bok". 
W pliku Main2.java napisz program, który:

    Dla znajdującej się w pliku zmiennej str sprawdzi czy jest on palindromem
    Podczas sprawdzania palindromu, zignoruj spacje.

 */
public class Strings02 {

	public static void main(String[] args) {
			
		String text1 = "kajak";
		String text2 = "Kobyła ma mały bok";
		String text3 = "Olo test";
		System.out.println("Czy tekst " + text1 + " jest palindromem?");
		System.out.println(checkPalindrom(text1));
		System.out.println("Czy tekst " + text2 + " jest palindromem?");
		System.out.println(checkPalindrom(text2));
		System.out.println("Czy tekst " + text3 + " jest palindromem?");
		System.out.println(checkPalindrom(text3));
	}
	
	static boolean checkPalindrom(String text) {
		boolean result = false;
		String palindrom = text.toLowerCase().replaceAll(" ", "");
		for(int i = 0; i < palindrom.length(); i++) {
			if(palindrom.charAt(i) != (palindrom.charAt(palindrom.length() - 1 - i))) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		return result;
	}
}
