package E1;

import java.util.Scanner;

/*
 * W pliku Main5.java umieść metodę o sygnaturze static double ball().

    Uzupełnij ciało metody tab by pobierała z konsoli promień r.
    Zwracała obliczoną objętość kuli.

 */
public class Exam05 {

	public static void main(String[] args) {
		System.out.println("Objętość kuli: " + ball());
	}
	
	static double ball() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj promień kuli.");
		double r =chkInt(scan);
		double sphere = (4/3) * Math.PI * Math.pow(r, 3);
		return sphere;
	}
	
	static double chkInt(Scanner scan) {
		double result = 0;
		while(!scan.hasNextDouble()) {
			scan.next();
			System.out.println("Niepoprawne dane, wprowadź liczbę!");
		}
		result = scan.nextDouble();
		while(result <= 0) {
			System.out.println("Wprowadź liczbę dodatnią!");
			result = scan.nextDouble();
		}
		return result;
	}
}
