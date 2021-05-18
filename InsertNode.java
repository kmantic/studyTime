package testStuff;

import java.util.LinkedList;

//https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class InsertNode {
	
	public static void main (String[] args) {
		
//		3 list size 
//		16
//		13
//		7
//		1 -- insert data 
//		2 --position 
		
		
		LinkedList<Integer> myList = new LinkedList<Integer>(); 
		myList.add(16); 
		myList.add(13); 
		myList.add(7); 
		InsertNode in = new InsertNode(); 
		in.insert(myList, 1, 2); 
		
	}
	
	private void insert(LinkedList<Integer> listIN, int newInt, int pos) {
		
		listIN.add(pos, newInt);
		
		System.out.println(" :=> " + listIN);
	}
	

}
