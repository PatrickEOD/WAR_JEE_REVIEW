package D2;

import java.util.ArrayList;

/*
 * W pliku Main5.java została umieszczona metoda o sygnaturze static int charPos(String str, char c).

    Uzupełnij ciało metody tak aby zwracała pozycje na której w ciągu str znajduje się znak c.

 */
public class Strings05 {
	
	public static void main(String[] args) {
		
		String str = "asdcdcadcadscadadcascdasdca";
		char c = 'd';
		System.out.println(String.valueOf(charPos(str, c)));
		System.out.println("Wszystkie wystąpienia " + c + " są na miejscach " + everyCharPos(str, c));
			
	}
	// zwraca pierwsza pozycję c
	static int charPos(String str, char c) {
		return str.indexOf(c) + 1;
		
	}
	
	// zwraca wszystie pozycje c
	static String everyCharPos(String str, char c) {
		ArrayList<String> pos = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			if(c == str.charAt(i)) {
				pos.add(String.valueOf(i + 1));
			}
		}
		String cPos = String.join(", ", pos);
		return cPos;
	}
}
