package D4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * W pliku Main3.java napisz program który:

    Będzie wczytywał kolejne linie tekstu z pliku tekstowego wypełnionego poniższą zawartością:

1.1, 1.2, 1.3, 2.0, 1.8
1.3, aa, 4.5, 6.7, 2.1
3.5, 7.7, 9.9, 4.1, 2.1

    Jeżeli dane są poprawnymi danymi liczbowymi program policzy ich sumę i wypisze na konsoli.

 */
public class Files03 {

	public static void main(String[] args) {
		String fileName = "Files03.txt";
		printFile(fileName);
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.println(format.format(sumFromFile(fileName)));
	}

	static void printFile(String fileName) {
		File file = new File(fileName);
		try (Scanner scan = new Scanner(file)) {
			while (scan.hasNextLine()) {
				String text = scan.nextLine();
				System.out.println(text);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Pliku nie odnaleziono!");
			e.printStackTrace();
		}
	}

	static double sumFromFile(String fileName) {
		double result = 0;
		File file = new File(fileName);
		try (Scanner scan = new Scanner(file)) {
			while (scan.hasNext()) {
				String text = scan.next().replaceAll(",", " ");
				if (isDouble(text)) {
					result += Double.parseDouble(text);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Pliku nie odnaleziono!");
			e.printStackTrace();
		}

		return result;
	}

	static boolean isDouble(String text) {
		try {
			Double.parseDouble(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
