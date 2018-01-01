package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * W pliku Main1.java stwórz metodę o sygnaturze static int count(String fileName).

    Uzupełnij ciało metody tak, aby zliczała i zwracała ilość znaków z pliku.

 */
public class HomeWork01 {

	public static void main(String[] args) {
		String file = "hw1.txt";
		System.out.println(count(file));
	}
	
	static ArrayList<String> count(String fileName) {
		File file = new File(fileName);
		ArrayList<String> out = new ArrayList<>();
		try (Scanner scan = new Scanner(file)) {
			while(scan.hasNextLine()) {
				String line = scan.nextLine().replaceAll(" ", "");
				int length = line.length();
				out.add(String.valueOf(length));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Plik nie istnieje! Program zakończy działanie.");
			e.printStackTrace();
		}
		return out;
	}
}
