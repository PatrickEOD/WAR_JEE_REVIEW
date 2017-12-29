package D3;

/*
 * W pliku Main2.java umieść metodę o sygnaturze static String safeGet(String[] str, int index).

    Uzupełnij ciało metody tak aby zwracała element tablicy str zawarty pod indeksem index.
    Dodaj obsługę odpowiedniego wyjątku.

 */
public class HomeWork02 {

	public static void main(String[] args) {
		
		String[] table = {"text1", "text2", "text3", "text4"};
		System.out.println(safeGet(table, 4));
	}
	
	static String safeGet(String[] str, int index) {
		String result = "";
		try {
			result = str[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong index exception ha ha ha");
			e.printStackTrace();
		}
		return result;
		
	}
}
