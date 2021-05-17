package testStuff;

import java.util.HashMap;

public class AlienAlpha {
	
	String alphaStr = "abcdefghijklmnopqrstuvwxyz"; 
	
	char[] alphabet2 = alphaStr.toCharArray();  
			
	public static void main(String[] args) {
		
		String word1 = "blam"; 
		String word2 = "blah"; 
		AlienAlpha aa = new AlienAlpha(); 
		System.out.println(":: " + aa.run(word1, word2)); 
		
	}

	public boolean run (String word1, String word2) {
		
		HashMap<Character, Integer> map = buildMap(alphabet2); 
		System.out.println("running... ");
		char[] arr1 = word1.toCharArray(); 
		char[] arr2 = word2.toCharArray(); 
		int shortest = getShortestSize(word1, word2); 
		
		
		
		for (int i = 0; i < shortest ; i++) {
			if (arr1[i] == arr2[i]) {
				continue; 
				
			}
			//not eq. 
			if (map.get(arr1[i]) < map.get(arr2[i])) {
				return true; 
			} else return false; 
			//which is lower in the alien alpha 
			
		
		}
		
		return true; //true = they are in alien alpha order 
	}
	
	public int getShortestSize(String s1, String s2) {
		
		if (s1.length() > s2.length()) return s2.length(); 
		
		return s1.length(); 
	}
	
	public HashMap<Character, Integer> buildMap(char[] ca){
		
		HashMap<Character, Integer> map = new HashMap<>(); 
 
		for (int i = 0; i < ca.length; i++) {
			map.put(ca[i], i); 
		}
		
		return map; 
		
	}
	
}
	
	
