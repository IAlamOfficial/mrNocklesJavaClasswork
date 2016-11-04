package arrayLessons;

import java.util.Scanner;

public class TwoDPratice {
	
	public static String[][]arr2D;
	public static String[][]pic;
	
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args){
		arr2D = new String[5][4];
		pic = new String[5][4];
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "(" + row + "," + col + ")";
			}
			
		}
		// start position
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		startExploring();
	}

	private static void startExploring() {
		// TODO Auto-generated method stub
		while(true){
			printPic(pic);
			System.out.println("You are in room " + arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter W, A, S, or D.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
			
		}
	}

		private static void interpretInput(String input) {
			int iOrig = i;
			int jOrig = j;
			if(input.equals("w") && i > 0) i--;
			else if(input.equals("a") && j > 0) j--;
			else if(input.equals("s") && i < arr2D.length-1) i++;
			else if(input.equals("d") && j < arr2D[i].length-1) j++;
			
			if(iOrig == i && jOrig == j){
				System.out.println("There is a wall in your path");
			}
	}

		private static boolean isValid(String input) {
			String lc = input.toLowerCase().trim();
			String[] keys = {"w","a","s","d"};
			for(String key:keys){
				if(key.equals(lc))return true;
			}
			return false;
	}

		/*
	 * Lesson 2
	 */
		private static void mines() {
			// Lesson 2 on the mines
			boolean [][] mines = new boolean[100][100];
			createMines(mines, 5000);
			String[][] field =	new String[mines.length][mines[0].length];
			matchValue(field,mines);	
			printPic(field);	
		}
	
		public static void printPic(String[][] pic){
			for(int y = 0; y < pic.length; y++){
				for(int x = 0; x < pic[y].length; x++){
					if(y == i && x ==j){
						pic[y][x] = "X";
					}else{
						pic[y][x] = " ";						
					}
					System.out.print(pic[y][x]);
				}
				System.out.println();
			}
		}
	
		private static void matchValue(String[][] field, boolean[][] mines) {
			
			for(int row = 0; row < field.length; row++){
				for(int col = 0; col < field[0].length; col++){
					if(mines[row][col]){
						field[row][col] = "X";
					}else{
						field[row][col] = countAdjacent(mines, row, col);
					}
				}
			}
		}
	
		private static String countAdjacent(boolean[][] mines, int r, int c) {
			
			int count = 0;
	
	//		Version 1
	//		for(int row = r-1; row  <= r+1; row++){
	//			for(int col = c-1; col <= c+1; col++){
	//				if(row != r && col != c){
	//					if(row >0 && row <mines.length && col >= 0 && col < mines[row].length){
	//						
	//					}
	//				}
	//			}		
	//		}
	
	//		Version 2
	//		for(int row = 0; row < mines.length; row++){
	//			for(int col = 0; col < mines[row].length; col++){
	//				if(Math.abs(row - r)+Math.abs(col - c) == 1 && mines[row][col]){
	//					count++;
	//				}
	//			}
	//		}
			
	//		Version 3
			count += vaildAndTrue(mines, r-1, c); 	//top
			count += vaildAndTrue(mines, r+1, c); 	//bottom
			count += vaildAndTrue(mines, r, c-1);	//left
			count += vaildAndTrue(mines, r, c+1);	//right
			
			
			return count + "";
		}
	
		private static int vaildAndTrue(boolean[][] mines, int i, int j) {
			
			
			if(i>0 && i <mines.length && j>=0 && j <mines[1].length && mines[i][j]){
				return 1;
			}
			return 0;
		}
	
		private static void createMines(boolean[][] mines, int numberOfMines) {
			
			while(numberOfMines > 0){
				int row = (int)(Math.random()*mines.length);
				int col = (int)(Math.random()*mines[0].length);
				if(!mines[row][col]){
					mines[row][col]= true;
					numberOfMines --;
				}
			}	
		}
		
		
/*
 * Lesson 1
 * 	
 */
	
	
	
//	public static void main(String[] args){
//		String[][] pic = new String[12][100];
//		for(int i = 0; i<pic.length; i++){
//			for(int x = 0; x <pic[i].length; x++){
//				pic[i][x] = " ";
//			}
//		}
//		drawSun(2,10,pic);
//
//		
//		for(int i = 9; i<pic.length; i++){
//			for(int x = 0; x <pic[i].length; x++){
//				pic[i][x] = "M";
//			}
//		}
//		
//		for(int col = 0; col< pic[0].length; col ++){
//			pic[0][col] = "_";
//			pic[pic.length-1][col]="_";
//		}
//		for(int row = 1; row < pic.length; row++){
//			pic[row][0] = "|";
//			pic[row][pic[0].length-1] = "|";
//		}
//		pintPic(pic);
//	}
//	
//	
//	private static void drawSun(int i, int j, String[][] pic) {
//		pic[1+i][2+j] = "O";
//		pic[0+i][2+j] = "|";
//		pic[2+i][2+j] = "|";
//		pic[1+i][1+j] = "-";
//		pic[1+i][3+j] = "-";
//		pic[0+i][1+j] = "\\";
//		pic[2+i][3+j] = "\\";
//		pic[0+i][3+j] = "/";
//		pic[2+i][1+j] = "/";
//		
//	}
//
//
//	public static void pintPic(String[][] pic){
//		for(int i =0; i<pic.length; i++){
//			for(int x = 0; x <pic[i].length; x++){
//				System.out.print(pic[i][x]);
//			}
//			System.out.println();
//		}
//	}

}

