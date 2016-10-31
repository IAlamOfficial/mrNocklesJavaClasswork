package caveExplorer;

import java.util.Arrays;

public class TwoDimensionArrayIntro {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		//System.out.println(Arrays.toString(arr));
		
		String[][] arr2D = new String[4][3];
		
		for(int row = 0; row < arr2D.length; row ++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] =  "(" + row + "," + col + ")";
			}
		}
		for(String[] row: arr2D){
			System.out.println(Arrays.toString(row));
		}
	}

}
