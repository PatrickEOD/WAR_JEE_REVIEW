package D2;

/*
 * W pliku Main3.java napisz program który:

    Dla znajdującej się w pliku zmiennej str wyświetli na konsoli odwrócony napis. Przykład: dla napisu Tak wyświetli kaT.

 */
public class Strings03 {

	public static void main(String[] args) {
		
		String str = "codersLabxyz";
		System.out.println(reverseText(str));
	}
	
	static String reverseText(String text) {
		String revString = "";
		for(int i = 0; i < text.length(); i++) {
			revString += text.charAt(text.length() - 1 - i);
		}
		return revString;
	}
}
