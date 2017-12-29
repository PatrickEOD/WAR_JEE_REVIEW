package D3;

/*
 * W pliku Main5.java umieść metodę o sygnaturze static int elementExist(int[] elements, int value).

    Uzupełnij ciało metody tak, aby sprawdzała czy w tablicy elements istnieje element o wartości value.
    Jeżeli wartość nie istnieje metoda zwróci wyjątek typu Exception z komentarzem Nie ma takiego numeru!.
    Uzupełnij sygnaturę metody informacją że może ona zwracać wyjątek typu Exception.

 */
public class HomeWork05 {

	public static void main(String[] args) {
		
		int[] elements = {4, 2, 6, 2, 65, 34, 0446};
    	int value = 635;
    	try {
			int number = elementExist(elements, value);
			System.out.println(number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static int elementExist(int[] elements, int value) throws Exception{
		int count = 0;
		int result = 0;
		for(int elem : elements) {
			if(elem == value) {
				count++;
				result = elem;
			}
		}
		if(count == 0) {
			throw new Exception("Number not found!");
		}
		return result;
	}
}
