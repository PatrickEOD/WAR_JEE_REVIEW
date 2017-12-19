package D2;

/*
 * W pliku Main7.java została umieszczona metoda o sygnaturze static boolean containsStr(String str, String search).

    Uzupełnij ciało metody tak aby zwracała informacje czy zmienna str zawiera w sobie element napisu ze zmiennej search.

 */
public class Strings07 {

	public static void main(String[] args) {
		
		String str = "Coders Lab Lorem Ipsum";
		String search = "as Lab";
		System.out.println(String.valueOf(containsStr(str, search)));
	}
	
	static boolean containsStr(String str, String search) {
		if(str.contains(search)) {
			return true;
		}
		return false;
	}
}
