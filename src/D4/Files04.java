package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * W pliku Main4.java napisz program który:

    Wczyta zawartość z załączonego pliku text1.txt, następnie wypisze na konsoli wszystkie linie zawierające napis Javy ignorując wielkość znaków w nazwie.

 */
public class Files04 {

	public static void main(String[] args) {
		printJava();
	}
	
	static void printJava() {
		File file = new File("./src/D4/text1.txt");
		try (Scanner scan = new Scanner(file)){
			while(scan.hasNextLine()) {
				String line = scan.nextLine().toLowerCase();
				if(line.contains("javy")) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku");
			e.printStackTrace();
		}
		
	}
}
