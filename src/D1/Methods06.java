package D1;

/*
 * W pliku Main6.java Napisz metodę checkMaturity, która:

    przyjmie parametr liczbowy age, który oznacza wiek użytkownika,
    sprawdzi czy użytkownik jest pełnoletni,
    jeśli jest – zwróci wartość true,
    jeśli nie – zwróci wartość false.

 */
public class Methods06 {
	
	public static void main(String[] args) {
		
		System.out.println(checkMaturity(18));
	}
	
	static boolean checkMaturity(int age) {
		if(age >= 18) {
			return true;
		}
		return false;
	}
}
