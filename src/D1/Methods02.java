package D1;

/*
 * Napisz metodę static int multiply(int multipler, int index), która zwróci wartość zmiennej multipler pomnożoną przez wartość argumentu index.
 */
public class Methods02 {

	public static void main(String[] args) {
		int multipler = 5;
		int index = 7;
		System.out.println(multiply(multipler, index));

	}
	
	static int multiply(int multipler, int index) {
		return multipler * index;
	}
}
