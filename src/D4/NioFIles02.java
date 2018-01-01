package D4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * W pliku Main2.java stwórz metodę o sygnaturze static void createFile (String fileName).

    Uzupełnij ciało metody tak, aby tworzyła plik o zadanej nazwie.
    Sprawdzaj czy plik nie istnieje.
    Wykorzystaj metody klas pakietu java.nio.file .

 */
public class NioFIles02 {

	public static void main(String[] args) {
		String fileName = "nio2.txt";
		createFile(fileName);
	}
	
	static void createFile(String fileName) {
		if(fileName == null || fileName.equals("")) {
			return;
		}
		Path path = Paths.get(fileName);
		if(!Files.exists(path)) {
			System.out.println("Tworze plik o nazwie " + fileName);
			try {
				Files.createFile(path);
				return;
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku!");
				e.printStackTrace();
			}
		} else {
			System.out.println("Plik już istnieje");
		}
	}
}
