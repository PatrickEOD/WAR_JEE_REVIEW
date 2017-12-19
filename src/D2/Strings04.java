package D2;

/*
 * W pliku Main4.java została umieszczona metoda o sygnaturze static String toogleChar(String str).

    Uzupełnij ciało metody tak, aby zamieniała duże litery na małe i odwrotnie a następnie zwracała wynik. Przykład: dla napisu TaK wyświetli tAk.

 */
public class Strings04 {
	
	public static void main(String[] args) {
		
		String str = "TaK";
		System.out.println(toogleChar(str));
	}
	
	static String toogleChar(String str) {
		String result = "";
		for(char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result += String.valueOf(c).toLowerCase();
			} else {
				result += String.valueOf(c).toUpperCase();
			}
		}
		return result;
	}

}
