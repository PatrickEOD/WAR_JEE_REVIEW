package D4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * W pliku Main7.java stwórz metodę o sygnaturze static boolean rewrite().

    Uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku.
    Sprawdzi czy plik istnieje i jeżeli istnieje stworzy drugi plik z sufiksem "_2", do którego 2-krotnie zostanie zapisana zawartość pliku wzorcowego.

Przykład: wczytana nazwa pliku text1.txt, z zawartością abc, zostanie utworzony plik o nazwie text1_2.txt o zawartości:

abc
abc

 */
public class HomeWork07 {
	public static void main(String[] args) {
		rewrite();
	}

	static void rewrite() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadź nazwę pliku");
		String file = mustBeString(scan) + ".txt";
		File txtFile = new File(file);
		scan.close();
		if (txtFile.exists()) {
			System.out.println("Plik o zadanej nazwie istnieje. Tworze plik z suffixem 2");
			File txtFile2 = new File(file.replace(".txt", "2.txt"));
			try (FileWriter newTxt = new FileWriter(txtFile2, true); 
					Scanner scan2 = new Scanner(txtFile)) {
				
				System.out.println("Tworzenie nowego pliku " + txtFile2);
				String[] fileContent = prepareContent(scan2);
				
				fillFile(fileContent, newTxt);
				fillFile(fileContent, newTxt);
			} catch (IOException e) {
				System.out.println("Błąd zapisywania do pliku!");
				e.printStackTrace();
			}
		} else {
			System.out.println("Plik nie istnieje, tworzę plik!");
			try {
				FileWriter fileWriter = new FileWriter(file);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku.");
				e.printStackTrace();
			}
		}
	}

	static String[] prepareContent(Scanner scan2) {
		StringBuffer buff = new StringBuffer();
		while(scan2.hasNextLine()) {
			buff.append(scan2.nextLine()).append("\n");
		}
		String text = buff.toString();
		return text.split("\n");
	}
	
	static void fillFile(String[] content, FileWriter newTxt) {
		for(String c : content) {
			try {
				newTxt.append(c).append("\n");
				System.out.println("Wypełnianie treścią...");
			} catch (IOException e) {
				System.out.println("Błąd zapisywania do pliku fillFile()");
				e.printStackTrace();
			}
		}
	}

	static String mustBeString(Scanner scan) {
		String result = scan.nextLine();
		while (result.equals("") || result.substring(0, 1).equals(" ")) {
			System.out.println("Wprowadź nazwę!");
			result = scan.nextLine();
		}
		return result;
	}
}
