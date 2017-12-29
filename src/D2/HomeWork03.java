package D2;

/*
 * W pliku Main3.java umieść metodę o sygnaturze static String upperCase(String str, int index) .

    Metoda zwraca napis str, w którym znaki zostały zamienione na duże z pozycji podzielnych przez index

 */
public class HomeWork03 {

	public static void main(String[] args) {
		
		String text = "ala mam kota blablabla";
		System.out.println(upperCase(text, 2));
	}
	
	static String upperCase(String str, int index) {
		String result = "";
		for(char c : str.toCharArray()) {
			if(str.indexOf(c) % index == 0) {
				result += String.valueOf(c);
			}
		}
		return result.toUpperCase();
	}
}
