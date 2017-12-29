package D3;

/*
 * W pliku Main4.java umieść metodę o sygnaturze static int toInt(String str).

    Uzupełnij ciało metody tak, aby zwracała zamieniony napis str na typ int.
    Obsłuż możliwe wyjątki.

 */
public class HomeWork04 {

	public static void main(String[] args) {
		String str = "y";
		System.out.println(toInt(str));
	}
	
	static int toInt(String str) {
		int result = 0;
		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Nieprawidłowy format");
			e.printStackTrace();
		}
		return result;
	}
}
