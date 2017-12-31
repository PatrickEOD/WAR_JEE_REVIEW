package D4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * W pliku Main1.java napisz program który:

    Będzie wczytywał kolejne linie tekstu z konsoli, a następnie je zapisywał je do pliku o nazwie Main1.txt, program ma zakończyć działanie po wpisaniu quit.

 */
public class Files01 {

	public static void main(String[] args) {
	
		try (FileWriter files1 = new FileWriter("Files01.txt", true);
			 Scanner scan = new Scanner(System.in)) {
			System.out.println("Wprowadź nową linię");
			while(scan.hasNextLine()) {
				String text = scan.nextLine();
				if(text.equals("quit")) {
					System.out.println("Program zakończy działanie");
					break;
				}
				files1.append(text).append("\n");
			}
		} catch (IOException e) {
			System.out.println("Problem z zapisywanie do pliku");
			e.printStackTrace();
		}
		
	}
}
