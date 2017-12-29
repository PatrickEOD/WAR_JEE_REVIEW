package D3;

/*
 * 

W pliku Main1.java umieść metodę o sygnaturze static void average(String a, String b).

    Uzupełnij ciało metody tak, aby dokonała konwersji zmiennych a i b na typ liczbowy int.
    Wykonała dzielenie zmiennej a przez zmienną b.
    Zabezpiecz program przed możliwymi błędam
 */
public class HomeWork01 {

	public static void main(String[] args) {
		String a = "4";
		String b = "s";
		average(a, b);
	}
	
	static void average(String a, String b) {
		try {
			int newA = Integer.parseInt(a);
			int newB = Integer.parseInt(b);
			int c = newA / newB;
			System.out.println("Wynik dzielenia: " + c );
		} catch (NumberFormatException e) {
			System.out.println("Wrong format, type digits!");
			e.printStackTrace();
		}
	}
}
