package D1;

/*
 * W pliku Main4.java Napisz metodę createName, która przyjmie następujące parametry:

    name: imię,
    surname: nazwisko,
    nickname: pseudonim.

Funkcja ma zwrócić łańcuch tekstowy z połączonymi parametrami w postaci Imię "Pseudonim" Nazwisko.
 */
public class Methods04 {
	
	public static void main(String[] args) {
		String name = "Jan";
		String surname = "Kowalski";
		String nickname = "Grom";
		System.out.println(createName(name, surname, nickname));
	}
	
	static String createName(String name, String surname, String nickname) {
		return name + " \"" + nickname + "\" " + surname;
	}
}
