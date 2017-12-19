package D1;

/*
 * W pliku Main8.java Napisz metodę maxOfThree, która przyjmie trzy parametry liczbowe. Funkcja ma zwrócić największą liczbę.
 */
public class Methods08 {

	public static void main(String[] args) {
		
		System.out.println(maxOfThree(7, 5, 2));
	}

	static int maxOfThree(int a, int b, int c) {
		int max = a;
		if (a < b) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}
