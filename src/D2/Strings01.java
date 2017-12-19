package D2;

/*
 * W pliku Main1.java napisz program, który:

    Dla znajdującej się w pliku zmiennej str pobierze przedostatnią literę.
    Wyświetli na konsoli ilość jej wystąpień w naszym ciągu znaków.

 */
public class Strings01 {

	public static void main(String[] args) {

		String str = "CodersLab jak dobrze zacząć programować";
		char letter = almostLastLetter(str);
		System.out.println("Litera na przedostatnim miejscu to : " + letter);
		System.out.println("Ilość wystąpień litery " + letter + " to: " + letterCount(str, letter));
	}

	static char almostLastLetter(String text) {
		return text.charAt(text.length() - 2);
	}

	static int letterCount(String text, char letter) {
		int count = 0;
		for(char c : text.toCharArray()) {
			if(c == letter) {
				count++;
			}
		}
		return count;
	}
}
