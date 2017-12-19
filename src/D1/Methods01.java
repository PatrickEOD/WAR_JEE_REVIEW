package D1;

/*
 * W pliku Main1.java

    Napisz metodę static int square(int num), która zwróci wartość num podniesioną do kwadratu.

 */
public class Methods01 {
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Wartość " + num + " do kwadratu to: " + square(num));
		
	}
	
	static int square(int num) {
		return (int) Math.pow(num, 2);
	}
}
