package testStuff;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {


	public static void main(String[] args) {
	
		
		RotateArray ra = new RotateArray(); 
		
		List<Integer> a = new ArrayList<Integer>() ; 
		a.add(1); 
		a.add(2); 
		a.add(3); 
		a.add(4); 
		a.add(5); 
		ra.printArr(a); 
		ra.rotate(a, 4); 
		
	}

	//rotate array left by d 
	private void rotate(List<Integer> a, int d) {
		System.out.println("run()==> ");
		List<Integer> b = new ArrayList<Integer>() ; 
		
		for(int i = d; i<a.size(); i++) {
			b.add(a.get(i)); 
		}
		
		for(int i = 0; i < d; i++) {

			b.add(a.get(i)); 
		}
		
		this.printArr(b);
	}
	
	private void printArr(List<Integer> a) {
		for (Integer i : a) {
			System.out.println(i);
			
		}
	}
}





