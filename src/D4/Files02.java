package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * W pliku Main2.java napisz program który:

    Będzie wczytywał kolejne linie tekstu z pliku Main1.txt, a następnie wypisze je na konsoli.

 */
public class Files02 {

	public static void main(String[] args) {

		File file = new File("Files01.txt");
		try (Scanner scan = new Scanner(file)){
			while(scan.hasNextLine()) {
				String text = scan.nextLine();
				System.out.println(text);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Pliku nie odnaleziono!");
			e.printStackTrace();
		}
	}
}
