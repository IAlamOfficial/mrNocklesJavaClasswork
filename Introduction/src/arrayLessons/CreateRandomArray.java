package arrayLessons;

public class CreateRandomArray {

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		int[] randomArray = new int[5];
		randomArray = addRandom(array, randomArray.length);
		testPrimes(50000000);

	}

	private static void testPrimes(int numberToTest) {
		int lastTocheck = (int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i = 0; i< numberToTest; i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		for(int prime = 2; prime <= lastTocheck; prime++){
			//When checking 50 numbers,
			//test 2,3,4,5,6,7 as if prime
			if(theNumbers[prime]){
				// only checks numbers that are prime
				//(numbers that haven't been crossed off) 
				//won't check 4 and 6 (crossed off by 2)
				System.out.println(prime + " is prime. Crossing off:");
					for(int test = prime*2; test < numberToTest; test = test + prime){
							//System.out.println(test+" , ");
							theNumbers[test] = false;
					}
				
			}
		}
		int ctr = 0;
		for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
				ctr++;
				System.out.println(i + " is prime.");
			}
		}
		System.out.println("There are " + ctr + " prime numbers");
	}

	private static int[] addRandom(int[] array, int length) {
		shuffle(array);
		int[] newArray = new int[length];
		for(int i = 0; i<length; i++){
			newArray[i] = array[i];
			//System.out.println(newArray[i] + "");
		}
		return newArray;
	}
	
	private static void shuffle(int[] array) {
		for (int i = 0 ; i < array.length; i ++){
			int random = (int)(Math.random()*(array.length-1));
			swap(array,i,random);
		}
	}
	private static void swap(int[] array, int i, int j) {
		int placeHolder = array[j];
		array[j] = array [i];
		array[i] = placeHolder;
		
	}
	

}
