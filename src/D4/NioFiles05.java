package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * W pliku Main4.java stwórz metodę o sygnaturze static void readFromFile(String fileName).

    Uzupełnij ciało metody tak, aby wczytała zawartość pliku podanego w parametrze metody.
    Utworzy nowy plik o rozszerzeniu html i nazwie takiej samej jak plik wczytywany.
    Wpisze do nowego pliku dane w postaci html, gdzie każda linia pliku wczytanego będzie się znajdować w tagu <p>.

Przykład:

<html>
<body>
<p>pierwsza linia</p>
<p>druga linia</p>
</body>
</html>

 */
public class NioFiles05 {

	public static void main(String[] args) {
		String fileName = "nio5.txt";
		readFromFile(fileName);
	}

	static void readFromFile(String fileName) {
		Path path = Paths.get(fileName);
		if (!fileExists(path)) {
			System.out.println("Plik źródłowy nie istnieje! Program zakończy działanie.");
			return;
		}
		String file = fileName.replace("txt", "html");
		createFile(file);
		writeToFile(file, fileName);
	}

	static boolean fileExists(Path fileName) {
		if (Files.exists(fileName)) {
			return true;
		}
		return false;
	}

	static ArrayList<String> readFile(String fileName) {
		ArrayList<String> in = new ArrayList<>();
		File file = new File(fileName);
		try (Scanner scan = new Scanner(file)) {
			while (scan.hasNextLine()) {
				System.out.println("Wczytywanie z pliku " + fileName);
				in.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku!");
			e.printStackTrace();
		}
		System.out.println("Zakończono wczytywanie z pliku " + fileName);
		return in;
	}

	static void createFile(String file) {
		Path path = Paths.get(file);
		if (!Files.exists(path)) {
			System.out.println("Tworzenie pliku " + file);
			try {
				Files.createFile(path);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku!");
				e.printStackTrace();
			}
		}
	}

	static void writeToFile(String file, String txtFile) {
		Path path = Paths.get(file);
		try {
			System.out.println("Zapisuję do pliku " + file);
			ArrayList<String> out = new ArrayList<>();
			out.add("<html>");
			out.add("<head>");
			out.add("</head>");
			out.add("<body>");
			ArrayList<String> in = readFile(txtFile);
			for(int i = 0; i < in.size(); i++) {
				out.add("<p>" + in.get(i) + "</p>");
			}
			out.add("</body>");
			out.add("</html>");
			Files.write(path, out);
		} catch (IOException e) {
			System.out.println("Błąd zapisywania do pliku!");
			e.printStackTrace();
		}
	}
}
