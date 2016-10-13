package chatBox6Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes 
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		String[] someStrings = new String[100];
		
		changeString(someStrings[34]);
		changeString(someStrings[99]);
		
		populateArray(someStrings);
		printArray(someStrings);
		long endTime = System.currentTimeMillis();
		System.out.println(" \n completed method in " +(endTime-startTime)+ " miliseconds");
	}
		
	private static void changeString(String s) {
		s = "This string has been changed";
		
	}

	private static void printArray(String[] a) {
		for (String s: a){
			System.out.print(s);
		}
		
	}

	private static void populateArray(String[] a) {
		for (int index = 0; index < a.length; index ++){
			a[index] = "\n value " +(index + 1);
			
		}
		
	}

	public static void arrayIntroMethod(){	
		// construct 3 integer arrays
		// these 2 do the same
		// primitive type arrays fill with Zeros 0 , 0.0 false
		// primitive type int, double, or boolean
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int [3];
		
		// example
		boolean[] booleans = new boolean[3];
		
		//iterate 2 different for loops
		// first method
		//When to use this loop
		//	-The index of the data is important to reference
		//	-You need to customize how you iterate
		//(increase by 2, backwards, etc...)
		for(int index = 0; index < booleans.length; index ++){
			System.out.println(index+ ") " +booleans[index]);
			
		}
		
		//Second method
		//When to use this loop
		//	-Always goes in order, does not keep track of index
		//	-easier to type
		
		for(boolean b: booleans){
			System.out.println(b);
		}
		
		
		//these 2 constructors are different
		String[] strings = {"","",""};
		String[] string2 = new String[3];
		
		for(String s: strings){
			System.out.println(s);
		}
		for(String s: string2){
			System.out.println(s);
		}
		
		for (int index = 0; index < string2.length; index ++){
			string2[index] = "value " +(index + 1);
			
		}
		for (String s: string2){
			System.out.print(s);
		}
	}

}
