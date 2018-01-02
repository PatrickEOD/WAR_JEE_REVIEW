package E1;

import java.util.Arrays;
import java.util.Random;

/*
 * W pliku Main3.java umieść metodę o sygnaturze static int[] div(int size, int interval).

    Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu [1 - interval].
    Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
    Ilość elementów w tablicy ma być równa parametrowi size.
    Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu int to 0)

Przykład dla size = 4 oraz interval = 20

[8,4,20,16]

 */
public class Exam03 {

	public static void main(String[] args) {
		int size = 10;
		int interval = 20;
		System.out.println(Arrays.toString(div(size, interval)));
	}
	
	static int[] div(int size, int interval) {
		int[] number = new int[size];
		for(int i = 0; i < number.length;) {
			int temp = new Random().nextInt(interval - 1) + 1;
			if((temp % 2 == 0) && (temp % 3 != 0)) {
				number[i] = temp;
				i++;
			}
		}
		return number;
	}
}
