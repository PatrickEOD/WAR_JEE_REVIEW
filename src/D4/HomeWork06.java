package D4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * W pliku Main6.java stwórz metodę o sygnaturze static boolean checkFileExist().

    Uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku.
    Sprawdzi czy plik istnieje a następnie wypisze true lub false

 */
public class HomeWork06 {

	public static void main(String[] args) {
		System.out.println(checkFileExist());
	}
	
	static boolean checkFileExist() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz nazwe pliku");
		String file = scan.next() + ".txt";
		Path path = Paths.get(file);
		scan.close();
		if(!Files.exists(path)) {
			return false;
		}
		return true;
	}
}
