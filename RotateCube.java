package testStuff;

public class RotateCube {
	
	
	public static void main(String[] args) {
		
//		int[][] cube = {
//				{1,2,3}, 
//				{4,5,6}, 
//				{7,8,9}						
//		}; 
		
		int[][] cube = {
				{1,2,3,4,5}, 
				{6,7,8,9,10}, 
				{11,12,13,14,15},						
				{16,17,18,19,20},						
				{21,22,23,24,25},						
		}; 
		
		
		RotateCube rc = new RotateCube(); 
		rc.printCube(cube); 
		cube = rc.rotateCW2(cube, 1); 
		rc.printCube(cube); 

	}

	
	private void run() {
		
		System.out.println("===>> ");
		
		int[][] cube = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}						
		}; 
		
	}
	
		
	private void printCube(int[][] cubeIN) {
		
		System.out.println("=================\n");
		for (int i = 0; i < cubeIN.length; i++){
			for (int j = 0; j < cubeIN[i].length; j++){
			
				System.out.print("." + cubeIN[i][j]); 

			}
			System.out.println("");
		}
		System.out.println("=================\n");
		
		
	}
	
	/** 
	 * 
	 * Rotate cube with single tmp variable 
	 * 
	 * @param cubeIN
	 * @return
	 * 
	 */
	private int[][] rotateCW2(int[][] cubeIN, int n) {
	    
		final int XL = cubeIN.length; 	//Outter Len
	    final int YL = cubeIN[0].length; //Inner Len 

		for (int i = 0; i < n; i++) {
		    
	        int topRight = cubeIN[0][cubeIN.length-1]; 
	    
		    //move right col up 
		    //start at 2nd row down 
	  	    for (int y = 1; y < YL; y++) {
	  	    	cubeIN[y-1][cubeIN.length-1] = cubeIN[y][cubeIN.length-1]; 
	  	    	
	  	    }
	
	  	    //bottom row 
	  	    for (int x = cubeIN[0].length-1; x > 0; x--) {
	  	    	
	  	    	int y = cubeIN.length-1; 
	  	    	//pull everything right 
	  	    	cubeIN[y][x] = cubeIN[y][x-1]; 
	  	    	
	  	    }
	
	  	    //left col 
	  	    for (int y = cubeIN.length-1; y > 0; y--) {
	  	    	int x = 0; 
	  	    	cubeIN[y][x] = cubeIN[y-1][x];
	  	    	 	    	
	  	    }
	  	    
	  	    //top row except top right corner 
	  	    for (int x = cubeIN[0].length-2; x > 0; x--) {
	  	    	
	  	    	int y = 0; 
	  	    	//pull everything left  
	  	    	cubeIN[y][x-1] = cubeIN[y][x]; 
	  	    	
	  	    }
	  	    
	  	    //last replace [y][x-1] w/ topRight 
	  	    cubeIN[0][cubeIN.length-2] = topRight; 
  	    }
  	    
	    return cubeIN;
	}
	
}
