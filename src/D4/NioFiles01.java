package D4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * W pliku Main1.java stwórz metodę o sygnaturze static void createDirectory(String fileName).

    Uzupełnij ciało metody tak, aby tworzyła katalog o zadanej nazwie.
    Sprawdzaj czy katalog nie istnieje.
    Wykorzystaj metody klas pakietu java.nio.file - Files.exists(directory) oraz Files.createDirectory(directory);.

 */
public class NioFiles01 {

	public static void main(String[] args) {
		String filename = "nio1";
		createDirectory(filename);
	}
	
	static void createDirectory(String filename) {
		if(filename == null || filename.equals("")) {
			return;
		}
		Path path = Paths.get(filename);
		if(!Files.exists(path)) {
			try {
				System.out.println("Tworzę katalog " + filename);
				Files.createDirectory(path);
			} catch (IOException e) {
				System.out.println("Nie można utworzyć katalogu!");
				e.printStackTrace();
			}
		}
	}
}
