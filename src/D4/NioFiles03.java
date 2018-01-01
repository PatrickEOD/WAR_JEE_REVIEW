package D4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * W pliku Main3.java stwórz metodę o sygnaturze static void copyFile(String directory, String fileName, String secondFileName).

    Uzupełnij ciało metody tak, aby z katalogu directory kopiowała plik o nazwie fileName do pliku o nazwie secondFileName.
    Sprawdzaj czy plik nie istnieje.

 */
public class NioFiles03 {

	public static void main(String[] args) {
		String directory = "test";
		String file = "file1.txt";
		String file2 = "file2.txt";
		copyFile(directory, file, file2);
	}
	
	static void copyFile(String directory, String fileName, String secondFileName) {
		Path path1 = Paths.get(directory + "/" + fileName);
		Path path2 = Paths.get(directory + "/" + secondFileName);
		if(!Files.exists(path1)) {
			System.out.println("Nie ma skąd skopiować! Tworze strukture katalogów!");
			File dir = new File(directory);
			dir.mkdir();
			try {
				Files.createFile(path1);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku!");
				
				e.printStackTrace();
			}
			return;
		} else {
			try {
				System.out.println("Kopiuję plik!");
				Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku!");
				e.printStackTrace();
			}
		}
	}
}
