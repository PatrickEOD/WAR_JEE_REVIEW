package D1;

/*
 * W pliku Main2.java umieść metodę o sygnaturze static boolean divisibleBy(int a, int b ):

    Uzupełnij ciało metody tak aby zwracała true bądź false w zależności czy zmienna a jest podzielna przez b.

 */
public class HomeWork02 {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 9;
		System.out.println("Czy " + a + " jest podzielne przez " + b + "? \n" + divisibleBy(a, b));
	}
	
	static boolean divisibleBy(int a, int b) {
		
		if(a % b == 0) {
			return true;
		}
		return false;
	}
}
