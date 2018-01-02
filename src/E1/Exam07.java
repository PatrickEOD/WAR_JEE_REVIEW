package E1;
/*
 * W pliku Main7.java umieść metodę o sygnaturze static int countNumbers(String str).

    Uzupełnij ciało metody tak aby zwracała sumę cyfr umieszczonych w napisie Przykład: dla napisu Wynik dodawania 1 i 2 to 3 zwróci 6.

Aby zamienić napis na wartość liczbową typu int możesz skorzystać z poniższego przykładu:

int num = Integer.parseInt("3");

Dodaj obsługę możliwego wyjątku.
 */
public class Exam07 {

	public static void main(String[] args) {
		String text = "1 i 2 to 3 - 2 + 2";
		System.out.println(countNumbers(text));
	}
	
	static int countNumbers(String str) {
		int sum = 0;
		for(char c : str.toCharArray()) {
			if(isDigit(c)) {
				sum += Integer.parseInt(String.valueOf(c));
			}
		}
		return sum;
	}
	
	static boolean isDigit(char c) {
		if(Character.isDigit(c)) {
			return true;
		}
		return false;
	}
}
