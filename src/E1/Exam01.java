package E1;

/*
 * W pliku Main1.java umieść metodę o sygnaturze static int rectangle(int a, int b).

    Uzupełnij ciało metody tak, by obliczyła i zwróciła pole prostokąta.

 */
public class Exam01 {
	
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		System.out.println("Pole prostokąta wynosi: " + rectangle(a, b));
	} 
	
	static int rectangle(int a, int b) {
		return a * b;
	}
}
