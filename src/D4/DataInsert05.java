package D4;

import java.util.Scanner;

/*
 * W pliku Main5.java stwórz metodę o sygnaturze static void textLines(), która:

    Wczyta kolejne linie tekstu z konsoli, a następnie je wyświetlał, program ma zakończyć działanie po wpisaniu quit.
    Wywołaj metodę w metodzie main.

 */
public class DataInsert05 {

	public static void main(String[] args) {
		textLines();
	}
	
	static void textLines() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadź tekst");
		String text = "";
		while(scan.hasNextLine()) {
			System.out.println("Wprowadź tekst");
			text = scan.nextLine();
			System.out.println("##########################");
			System.out.println("##########################");
			System.out.println(text);
			System.out.println("==========================");
			if(text.equals("quit")) {
				System.out.println("Wychodze z programu");
				break;
			}
		}
		scan.close();
		
	}
}
