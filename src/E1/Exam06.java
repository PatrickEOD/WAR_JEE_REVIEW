package E1;

/*
 * W pliku Main6.java umieść metodę o sygnaturze static String replaceStr(String str, String forReplace, String replacement).

    Uzupełnij ciało metody tak aby zwracała napis powstały z zamiany w napisie str wszystkich wystąpień napisu forReplace przez napis replacement.

 */
public class Exam06 {

	public static void main(String[] args) {
		String txt = "Coders Lab Coders  Lab Coders Labbbb";
		String forReplace = "Lab";
		String replacement = "***";
		System.out.println(replaceStr(txt, forReplace, replacement));
	}
	
	static String replaceStr(String str, String forRepace, String replacement) {
		return str.replaceAll(forRepace, replacement);
	}
}
