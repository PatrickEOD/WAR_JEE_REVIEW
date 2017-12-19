package D2;

/*
 * W pliku Main2.java napisz program, który:

    Dla znajdującej się w pliku zmiennej str podzieli napis na zdania. Znakiem podziału jest kropka (.) .
    Wyświetli na konsoli każde zdanie w oddzielnej lini.

 */
public class StringsDivide02 {

	public static void main(String[] args) {
		
		String str = "Z Coders Lab niezależnie od wykształcenia możesz zmienić swoją karierę."
				+ " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania."
				+ " Przygotujemy Cię do pracy na stanowisku junior web developera i pomożemy znaleźć zatrudnienie po kursie.";
		
		splitStrings(str);
	}
	
	static void splitStrings(String str) {
		String[] phrase = str.split("\\.");
		for(String c : phrase) {
			System.out.println(c.trim() + ".");
		}
	}
	
}
