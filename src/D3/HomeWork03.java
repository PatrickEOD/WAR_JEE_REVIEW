package D3;

/*
 * W pliku Main3.java umieść metodę o sygnaturze static int getLength(String str).

    Uzupełnij ciało metody tak, aby zwracała długość napisu str.
    Obsłuż wyjątek wywołania metody getLength(null).

 */
public class HomeWork03 {

	public static void main(String[] args) {
		
		String text1 = "Text1";
		String text2 = null;
		String text3 = "Text3";
		System.out.println(getLength(text2));
	}
	
	static int getLength(String str) {
		int result = 0;
		try {
			result = str.length();
		} catch (NullPointerException e) {
			System.out.println("Wartośc nie może byc null");
			e.printStackTrace();
		}
		return result;
	}
}
