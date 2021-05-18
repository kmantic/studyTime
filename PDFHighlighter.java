package testStuff;

import java.util.HashMap;

//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem 
public class PDFHighlighter {

	
	public static void main (String[] args) {
		
		
		int[] arrIN = {1 ,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,}; 
		
		
		PDFHighlighter phl = new PDFHighlighter();
		System.out.println(phl.getArea(arrIN, "abc"));
		
	}
	
	private int getArea(int[] a, String w) {

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 

		HashMap<Character, Integer> map = new HashMap<>(); 
		for (int i = 0; i < a.length; i++) {
			map.put(alphabet[i], a[i]); 
		}

		int area = 0; 

		for (int i = 0; i < w.length(); i++) {
			if ( map.get(w.charAt(i)) > area ) {
				area = map.get(w.charAt(i)); 
				if (area == 5) break; 
			}
		}
		
		area *= w.length(); 
		return area; 
	}
	
	
}



