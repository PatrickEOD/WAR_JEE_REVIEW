package D2;

/*
 * W pliku Main7.java umieść metodę o sygnaturze static String censor(String str, String[] words).

    Metoda:

    rozbije łańcuch tekstowy na tablicę wyrazów,
    sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy words,
    jeśli tak -- zamieni je na cztery gwiazdki (****)
    ponownie połączy tablicę w string i zwróci wartość.

 */
public class HomeWork07 {

	public static void main(String[] args) {
		String[] censorArray = {"kot", "pies"};
		String test = "Ten tekst zawiera treść o pies i kot ale kot to nie pies";
		System.out.println(censor(test, censorArray));
	}
	
	static String censor(String str, String[] words) {
		String result = "";
		String[] text = str.split(" ");
		StringBuffer buff = new StringBuffer();
		for(String element : text) {
			if(contains(element, words)) {
				buff.append(" **** ");
			} else {
				buff.append(element + " ");
			}
		}
		result = buff.toString();
		return result;
	}
	
	static boolean contains(String text, String[] words) {
		for(String element : words) {
			if(text.equals(element)) {
				return true;
			}
		}
		return false;
	}
}
