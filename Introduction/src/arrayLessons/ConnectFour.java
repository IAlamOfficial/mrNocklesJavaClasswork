package arrayLessons;

import java.util.Scanner;

public class ConnectFour {

	public static boolean[][]arr2D;
	public static String[][]pic;
	
	public static Scanner in;
	
	public static void main(String[] args){
		arr2D = new boolean[5][5];
		pic = new String[5][5];
		makeGrid(pic);
		startGame();
		
	}
	private static void makeGrid(String[][] picArray) {
				String[][] array = new String[((picArray.length*3)+1)][((picArray[0].length*4)+1)];
				for(int y = 0; y < array.length; y++){
					
					for(int x = 0; x < array[y].length; x++){
						array[y][x] = " ";
						if(y%3 == 0)array[y][x] = "_";
						if(x%4 == 0)array[y][x] = "|";
						
					}
				}
				for(int i = 0; i < array.length; i++){
					for(int j = 0; j < array[i].length; j++){
						System.out.print(array[i][j]);
					}
					System.out.println();
				}
	}
	private static void startGame() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("Choose where to drop your token");
			System.out.println("01234");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter an int from 0-4");
				input = in.nextLine();
			}
			int result = Integer.parseInt(input);
			interpretInput(result);
			printGrid();
		}
	}
	private static void interpretInput(int input) {
		if(arr2D[0][input] == true){
			System.out.println("The column is full. Input another answer");
		}else{
			for(int i = arr2D.length-1; i>=0; i --){
				if(arr2D[i][input] == false){
				arr2D[i][input] = true;
				}
			}
		}
		
		
	}
	private static boolean isValid(String input) {
		String[] keys = {"0","1","2","3","4"};
		for(String key:keys){
			if(key.equals(input))return true;
		}
		return false;
	}
	private static void printGrid() {
		
		
	}
}
