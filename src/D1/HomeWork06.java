package D1;

/*
 * W pliku Main6.java umieść metodę o sygnaturze static int evenSum(int[][] arr).

    Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów z nieparzystych indeksów.
    Metoda ma zwrócić sumę. Przykład: dla tablicy int arr[][] = {{1,2,3},{4,5,6}}; int sum = 2 + 5;

 */
public class HomeWork06 {
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6}};
		System.out.println(evenSum(arr));
	}
	
	static int evenSum(int[][] arr) {
		int evenSum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j += 2) {
				evenSum += arr[i][j];
			}
		}
		return evenSum;
	}
}
