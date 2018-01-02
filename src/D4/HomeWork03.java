package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Scanner;

/*
 * W pliku Main3.java napisz program, który:

    Pobierze z konsoli nazwę pliku.
    Wczyta dane w określonym formacie:

Nazwisko Imie RokUrodzenia Płeć np:

Kowalski Marek 1955 M
Krzak Marianna 1966 K

    Stworzy i zwróci tablicę String (imię + nazwisko) osób które mogą przejść na emeryturę, sygnatura metody static String[] retirement(). 
    Dla kobiet będzie to 60 lat, dla mężczyzn 65.

 */
public class HomeWork03 {

	public static void main(String[] args) {
//		String[] content = readFile();
		String file = createFile();
		retirement(file, readFile(file));
	}
	
	static String createFile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nazwę pliku");
		String file = scan.next() + "Output.txt";
		Path path = Paths.get(file);
		if(!Files.exists(path)) {
			try {
				System.out.println("Plik nie istnieje, tworzenie pliku");
				Files.createFile(path);
				scan.close();
				return file;
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku!");
				e.printStackTrace();
			}
		}
		System.out.println("Plik o zadaniej nazwie istnieje, uruchom ponownie program i podaj inną nazwę pliku.");
		scan.close();
		return null;
	}
	
	static String[] readFile(String filename) {
//		Scanner scanRead = new Scanner(System.in);
//		System.out.println("Podaj nazwę pliku z którego dane bedą czytane...");
		String file = filename.replace("Output", "");
		File sourceFile = new File(file);
		StringBuffer buff = new StringBuffer();
		try (Scanner scanSource = new Scanner(sourceFile)) {
			System.out.println("Czytam plik...");
			while(scanSource.hasNext()) {
				buff.append(scanSource.next()).append(" ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnaleziono pliku "+ file);
			e.printStackTrace();
		}
//		scanRead.close();
		return buff.toString().split(" ");
		
	}
	
	static void retirement(String outFileName, String[] data) {
		try (FileWriter out = new FileWriter(outFileName, true)){
			int year = Calendar.getInstance().get(Calendar.YEAR);
			for(int i = 2; i < data.length; i += 4) {
				if(data[i + 1].equals("K")) {
					if((year - Integer.parseInt(data[i])) >= 60) {
						out.append(data[i - 2] + " " + data[i - 1] + "\n");
					}
				} else if (data[i + 1].equals("M")) {
					if((year - Integer.parseInt(data[i])) >= 66) {
						out.append(data[i - 2] + " " + data[i - 1] + "\n");
					}
				}
			}
			System.out.println("Zakończon program!");
		} catch (IOException e) {
			System.out.println("Błąd zapisywania do pliku!");
			e.printStackTrace();
		}
	}
}
