package E1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * W pliku Main8.java umieść metodę o sygnaturze static void create(int max).

    Uzupełnij ciało metody tak aby pobrała z konsoli parametr n - oznaczający ilość osób w grupie.

    Następnie dla podanej ilości osób pobierze z konsoli loginy github oraz ilość punktów z egzaminu ,zapisze je do pliku exam.txt, każde imię razem 
    z oceną w nowej lini oddzielone znakiem spacji.

    Przykład pobierania dla 2 osób:

Podaj login:
arek-jozwiak-coderslab
Podaj ilość punktów:
11
Podaj login:
pawel321a
Podaj ilość punktów:
20

Przykład wynikowego pliku (struktura pliku musi być dokładnie taka):

arek-jozwiak-coderslab 11
pawel321a 20

    Następnie wczytamy dane z pliku exam.txt i na ich podstawie utworzymy nowy plik exam_passed.txt , w którym znajdą się tylko te osoby, których ilość punktów przekracza 60% z maksymalnej ilości punktów określonych w parametrze max.
    Struktura pliku exam_passed.txt musi być taka sama jak pliku exam.txt.

Pliki muszą się znajdować w katalogu głównym projektu
Możemy utworzyć dodatkowe metody pomocnicze natomiast całość programu ma się wykonać po wywołaniu metody create()
Pliki exam.txt oraz exam_passed.txt nie powinny być dodane do repozytorium.
 */
public class Exam08 {

	public static void main(String[] args) {
		create(10);
	}

	static void create(int max) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj ilość osób w grupie");
		int members = chkInt(scan);
		String[] positions = new String[members * 2];
		int count = 0;
		for (int i = 0; i < members; i++) {
			System.out.println("Podaj login uczestnika nr " + (i + 1) + ":");
			positions[count] = scan.next();
			count++;
			System.out.println("Podaj ilość punktów jakie zdobył");
			positions[count] = String.valueOf(chkInt(scan));
			count++;
		}
		String examFileName = writeToFile(positions);
		gradingMembers(examFileName, max);
	}

	static int chkInt(Scanner scan) {
		int result = 0;
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Nieprawidłowe dane, podaj ilość w liczbach!");
		}
		result = scan.nextInt();
		while (result <= 0) {
			System.out.println("Nieprawidłowe dane, podaj wartość dodatnią!");
			result = scan.nextInt();
		}
		return result;
	}

	static String writeToFile(String[] positions) {
		String fileName = "exam.txt";
		try (FileWriter newFile = new FileWriter(fileName, true)) {
			System.out.println("Zapisuje do pliku " + fileName);
			for (String s : positions) {
				newFile.append(s).append("\n");
			}
		} catch (IOException e) {
			System.out.println("Błąd tworzenia pliku " + fileName);
			e.printStackTrace();
		}
		return fileName;
	}

	static void gradingMembers(String examFile, int max) {
		File file = new File(examFile);
		String name = "";
		String grade = "";
		String passedFile = "passed.txt";
		try (Scanner scan = new Scanner(file);
				FileWriter passed = new FileWriter(passedFile, true)) {
			while(scan.hasNextLine()) {
				System.out.println("Wczytuję dane i obliczam.");
				name = scan.nextLine();
				grade = scan.nextLine();
				if(Double.parseDouble(grade) >= (0.6 * max)) {
					System.out.println("Zapisuje do nowego pliku osoby które zdały.");
					passed.append(name).append(" " + grade).append("\n");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnaleziono pliku!");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Błąd tworzenia pliku " + passedFile);
			e1.printStackTrace();
		}
		System.out.println("Zakończono pracę programu.");

	}
}
