package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import sun.applet.Main;

/*
 * W pliku Main2.java stwórz metodę o sygnaturze static int count(String fileName).

    Uzupełnij ciało metody tak, aby zliczyła i zwracała ilość słów z pliku.

 */
public class HomeWork02 {

	public static void main(String[] args) {
		String file = "hw1.txt";
		System.out.println(count(file));
	}
	
	static int count(String fileName) {
		File file = new File(fileName);
		StringBuffer buff = new StringBuffer();
		try (Scanner scan = new Scanner(file)) {
			while(scan.hasNext()) {
				buff.append(scan.next()).append(" ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie znaleziono pliku!");
			e.printStackTrace();
		}
		String[] fileContent = buff.toString().split(" ");
		return fileContent.length;
	}
}
