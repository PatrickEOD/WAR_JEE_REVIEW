package D1;

/*
 * W pliku Main7.java Napisz metodę checkEven, która:

    przyjmie parametr liczbowy number,
    będzie zwracać wartość typu String,
    jeśli liczba jest parzysta, zwróci wynik "even",
    jeśli liczba jest nieparzysta, zwróci wynik "odd".

 */
public class Methods07 {
	
	public static void main(String[] args) {
		System.out.println(checkEven(45));
	}
	
	static String checkEven(int number) {
		String result = "";
		if(number % 2 == 0) {
			result = "even";
		} else {
			result = "odd";
		}
		return result;
	}
}
