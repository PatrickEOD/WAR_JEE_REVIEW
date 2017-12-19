package D1;

import java.util.Arrays;

/*
 * W pliku Main3.java umieść metodę o sygnaturze static int[] minimum(int[][] arr).

    Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej dla każdego jej wiersza wyznaczyła minimalną wartość.
    Poszczególne minimalne wartości mają być umieszczone w tablicy, którą metoda zwraca.

 */
public class HomeWork03 {

	public static void main(String[] args) {
		
		int[][] specificArray = { 
				{ 2345, 45, 2309, 132, 54, 45, 4533, }, 
				{ 345, 567, 245, 3425, 76, 68, 112, 357 },
				{ 23, 665, 3, 876, 45, 245, 764 } 
				};
		
		System.out.println("Wartości nimilane to: " + Arrays.toString(minimum(specificArray)));
	}
	
	static int[] minimum(int[][] arr) {
		int[] tab = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			tab[i] = arr[i][0];
			for(int j = 1; j < arr[i].length; j++) {
				if(tab[i] >= arr[i][j]) {
					tab[i] = arr[i][j];
				}
			}
		}
		
		return tab;
	}
}
