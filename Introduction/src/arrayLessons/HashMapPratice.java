package arrayLessons;

public class HashMapPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = createHashMap(3,3);
		populate(array);
		print();
	}

	private static void print() {
		// TODO Auto-generated method stub
		
	}

	private static void populate(String[][] array) {
		// TODO Auto-generated method stub
			for(int r = 0; r<array.length; r++){
				for(int c = 0; c <array[r].length; c++){
					array[r][c] = "-";
				}
			}	
	}

	private static String[][] createHashMap(int i, int j) {
		String[][] array = new String[(i*3)+1][(j*3)+1]; 
		return array;
	}

}
