package D1;

/*
 * W pliku Main9.java Napisz metodę factorial, 
 * która przyjmie jako parametr liczbę naturalną n. Funkcja ma zwrócić wartość n!,
 *  czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1..n .
 */
public class Methods09 {

	public static void main(String[] args) {
		int fact = 5;
		System.out.println(fact + "! = " + factorial(fact));
	}
	
	static int factorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
