package E1;
/*
 * W pliku Main2.java umieść metodę o sygnaturze static String shorten(String str, int length).

    Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego skrót o ilości znaków podanych w parametrze length.

 */
public class Exam02 {

	public static void main(String[] args) {
		String text = "Coders Lab";
		int length = 4;
		System.out.println("Skrócony string: " + shorten(text, length));
	}
	
	static String shorten(String str, int length) {
		return str.substring(0, length);
	}
}
