package D4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * W pliku Main4.java stwórz metodę o sygnaturze static void writeToFile(String fileName).

    Uzupełnij ciało metody tak, aby utworzyła (jeżeli nie istnieje) plik o nazwie fileName.
    Metoda pobierze z konsoli całe linie, a następnie zapisze je do pliku. Wykorzystaj odpowiednią metodę klasy Scanner.

 */
public class NioFiles04 {

	public static void main(String[] args) {
		String file = "nio4.txt";
		writeToFile(file);
	}

	static void writeToFile(String fileName) {
		chkFileExist(fileName);
		Path path = Paths.get(fileName);
			try {
				System.out.println("Rozpoczynam zapisywania do pliku");
				Files.write(path, getText());
			} catch (IOException e) {
				System.out.println("Błąd zapisywania do pliku!");
				e.printStackTrace();
			}
	}

	static void chkFileExist(String fileName) {
		Path path = Paths.get(fileName);
		if (!Files.exists(path)) {
			try {
				System.out.println("Plik o wskazanej nazwie nie istnieje, tworzenie pliku!");
				Files.createFile(path);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku");
				e.printStackTrace();
			}
		} else {
			System.out.println("Plik istnieje, program kontynuje działanie.");
		}
	}

	static ArrayList<String> getText() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> out = new ArrayList<>();
		System.out.println("Wprowadz tekst");
		while (scan.hasNextLine()) {
			String text = scan.nextLine();
			System.out.println("Wprowadź tekst. Jeśli zakończyłeś wpisz quit.");
			if (quit(text)) {
				System.out.println("Program zakończy działanie");
				scan.close();
				break;
			}
			out.add(text);
		}
		scan.close();
		return out;
	}

	static boolean quit(String text) {
		if (text.equals("quit")) {
			return true;
		} else {
			return false;
		}
	}
}
