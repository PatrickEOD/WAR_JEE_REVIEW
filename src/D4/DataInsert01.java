package D4;

import java.util.Scanner;

/*
 * W pliku Main1.java stwórz metodę o sygnaturze static void getInfo().

W ciele metody dodaj kod który:

    Poprosi Cię o podanie imienia.
    Poprosi Cię o podanie wieku.
    Wypisze na konsoli informacje w formacie "{imię} ma {wiek} lat".
    Wywołaj metodę w metodzie main.

 */
public class DataInsert01 {

	public static void main(String[] args) {
		getInfo();
	}
	
	static void getInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj imię: ");
		String name = isName(scan);
		System.out.println("Podaj wiek: ");
		int age = hasInt(scan);
		scan.close();
		System.out.println(name + " ma " + age + " lat");
	}
	
	static int hasInt(Scanner scan) {
		int age = 0;
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.println("Podaj wiek w cyfrach! ");
		}
		age = scan.nextInt();
		return age; 
	}
	
	static boolean chkDigit(String name) {
		for(char c : name.toCharArray()) {
			if(Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	static String isName(Scanner scan) {
		String name = scan.next();
		while(!chkDigit(name)) {
			System.out.println("Nieprawidłowy format danych, wprowadź imię");
			name = scan.next();
		}
		return name;
	}
}
