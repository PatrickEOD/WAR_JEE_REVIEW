package D2;

import java.util.StringTokenizer;

/*
 * W pliku Main1.java napisz program, który:

    Dla znajdującej się w pliku zmiennej str podzieli napis na wyrazy.
    Wyświetli na konsoli każdy w oddzielnej lini.

 */
public class StringsDivide01 {

	public static void main(String[] args) {
		
		String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
		System.out.println("Metoda 1: " + splitString1(str));
		System.out.println();
		System.out.println("Metoda 2: " + splitString2(str));
		System.out.println();
		System.out.println("Metoda 3: " + splitString3(str));
	}
	
	static String splitString1(String str) {
		return str.replaceAll(" ", "\n");
	}
	
	static String splitString2(String str) {
		StringBuffer splitBuffer = new StringBuffer();
		String[] strArr = str.split(" ");
		for(int i = 0; i < strArr.length; i++) {
			splitBuffer.append(String.valueOf(strArr[i])).append("\n");
		}
		return splitBuffer.toString();
	}
	
	static String splitString3(String str) {
		String tokens = "";
		StringTokenizer tokenizer = new StringTokenizer(str);
		while(tokenizer.hasMoreTokens()) {
			tokens += tokenizer.nextToken() + "\n";
		}
		return tokens;
	}
}
