package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * W pliku Main5.java napisz program który:

    Wczyta zawartość z załączonego pliku text2.txt, następnie posortuje znajdujące się tam nazwy języków programowania i zapisze wynik. 
    Lista języków pobrana z rankingu: http://www.tiobe.com/tiobe-index/ , zgadnij jaki język jest na samej górze.

 */
public class Files05 {

	public static void main(String[] args) {
		sort();
	}
	
	static void sort() {
		File file = new File("./src/D4/text2.txt");
		StringBuffer langBuff = new StringBuffer();
		try (Scanner scan = new Scanner(file)){
			while(scan.hasNextLine()) {
				langBuff.append(scan.nextLine()).append("\n");
			}
			String lang = langBuff.toString();
			String[] langArray = lang.split("\n");
			Arrays.sort(langArray);
			for(String s : langArray) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnaleziono pliku!");
			e.printStackTrace();
		}
		
	}
}
