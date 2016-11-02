package arrayLessons;

public class TwoDPratice {
	
	public static void main(String[] args){
		String[][] pic = new String[10][100];
		for(int i = 0; i<pic.length; i++){
			for(int x = 0; x <pic[i].length; x++){
				pic[i][x] = " ";
			}
		}
		drawSun(1,10,pic);
		drawSun(6,55,pic);
//		pic[1][2] = "O";
//		pic[0][2] = "|";
//		pic[2][2] = "|";
//		pic[1][1] = "-";
//		pic[1][3] = "-";
//		pic[0][1] = "\\";
//		pic[2][3] = "\\";
//		pic[0][3] = "/";
//		pic[2][1] = "/";
		
		for(int i = 8; i<pic.length; i++){
			for(int x = 0; x <pic[i].length; x++){
				pic[i][x] = "M";
			}
		}
		
		for(int col = 0; col< pic[0].length; col ++){
			pic[0][col] = "_";
			pic[pic.length-1][col]="_";
		}
		for(int row = 1; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|";
		}
		pintPic(pic);
	}
	
	
	private static void drawSun(int i, int j, String[][] pic) {
		pic[1+i][2+j] = "O";
		pic[0+i][2+j] = "|";
		pic[2+i][2+j] = "|";
		pic[1+i][1+j] = "-";
		pic[1+i][3+j] = "-";
		pic[0+i][1+j] = "\\";
		pic[2+i][3+j] = "\\";
		pic[0+i][3+j] = "/";
		pic[2+i][1+j] = "/";
		
	}


	public static void pintPic(String[][] pic){
		for(int i =0; i<pic.length; i++){
			for(int x = 0; x <pic[i].length; x++){
				System.out.print(pic[i][x]);
			}
			System.out.println();
		}
	}

}

