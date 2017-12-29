package D2;

/*
 * 

W pliku Main4.java umieść metodę o sygnaturze static int tripple(String str)

    Metoda zwraca ilość potrójnych wystąpień znaków w napisie Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2

 */
public class HomeWork04 {

	public static void main(String[] args) {
		
		String text1 = "gazbbbwsx";
		String text2 = "aaawsxbbb";
		String text3 = "asdpoesssdfosfeeedddeee sdfeeee";
		System.out.println(tripple(text1));
		System.out.println(tripple(text2));
		System.out.println(tripple(text3));
	}
	
	static int tripple(String str) {
		int result = 0;
//		StringBuffer patBuf = new StringBuffer();
//		StringBuffer textBuf = new StringBuffer();
		for(int i = 0; i < str.length() - 2; i ++) {
			StringBuffer patBuf = new StringBuffer();
			StringBuffer textBuf = new StringBuffer();
			patBuf.append(str.charAt(i)).append(str.charAt(i)).append(str.charAt(i));
			textBuf.append(str.charAt(i)).append(str.charAt(i + 1)).append(str.charAt(i + 2));
			String pattern = patBuf.toString();
			String text = textBuf.toString();
			if(pattern.equals(text)) {
				result++;
				i += 2;
			}
		}
		return result;
	}
}
