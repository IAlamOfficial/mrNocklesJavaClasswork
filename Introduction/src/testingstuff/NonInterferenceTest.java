package testingstuff;

public class NonInterferenceTest {

	public static void main(String[] args) {
    }
    public static void print(double[] array) {
		for(double a: array){
			System.out.println(a+"");
		}
		
	}
	public static int searchUnsorted(int[] arrayToSearch, int key){
		/**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
		for(int a = 0; a < arrayToSearch.length; a++){
			if(arrayToSearch[a] == key){
				return a;
			}
		}
     return -1;
    }
    
    public static int searchSorted(int[] sortedArrayToSearch, int key){
    /**
     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
     * always be sorted in DESCENDING order. Again return the index of the key or return -1
     * if the key is not in the array
     * 
     * Note: You should attempt to write a method that is more efficient that searchUnsorted
     * */
    	 int a = sortedArrayToSearch.length;

         if(key <= sortedArrayToSearch[a/2]){
             for(int i = sortedArrayToSearch[a/2]-1; i<a/2; i++){
                 if(key == sortedArrayToSearch[i]){
                     return i;
                 }
             }
         }else{
             if(key > sortedArrayToSearch[a/2]){
                 for(int j = 0; j < a/2; j++){
                     if(key == sortedArrayToSearch[j]){
                         return j;
                     }
                 }
             }
         }
         
         return -1;
    }
	public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
		for(int i = 0; i<array.length-1; i++)
		{
			if(array[i] < array[i+1]){
				return false;
			}
		}
        return true;
    }
    
    // **
    public static double[] getStats(double[] array){
        /** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
         * */
         double[] stats = new double[6];
         
         stats[0] = mean(array);
         stats[1] = max(array);
         stats[2] = min(array);
         stats[3] = median(array);
         stats[4] = top(array,stats[0]);
         stats[5] = bottom(array,stats[0]);
         
         return stats;
    }
    
	    private static double bottom(double[] array, double stats) {
	    	double ctr = 0;
			for(int i = 0; i<array.length; i++){
				if(array[i] < stats){
					ctr += 1;
				}
			}
			return ctr;
	    }
		private static double top(double[] array, double stats) {
			double ctr = 0;
			for(int i = 0; i<array.length; i++){
				if(array[i] >= stats){
					ctr += 1;
				}
			}
			return ctr;
		}
		private static double median(double[] array) {
			int middle = array.length/2;
		    if (array.length%2 == 1) {
		        return array[middle];
		    } else {
		        return (array[middle-1] + array[middle]) / 2;
		    }
	    }
		private static double[] sort(double[] array) {
			boolean inLoop = true;  
			double temp;
			while (inLoop){
				inLoop= false; 
				for(int i = 0; i < array.length -1; i++){
					if (array[i] < array[i+1]){
						swapDouble(array,i,(i+1));
						inLoop = true;    
					} 
				} 
			} 
			return array;
		}
		private static double min(double[] array) {
	    	double minVar = array[0];
	    	for(int i = 0; i < array.length-1; i++){
	    		if(minVar>array[i]){
	    			minVar= array[i];
	    		}
	    	}
		return minVar;
	    }
		private static double max(double[] array) {
	    	double maxVar = array[0];
	    	for(int i = 0; i < array.length; i++){
	    		if(maxVar<array[i]){
	    			maxVar = array[i];
	    		}
	    	}
	    	
		return maxVar;
	    }
		private static double mean(double[] array) {
			int total = 0;
	    	for(int i = 0; i<array.length; i++){
				total += array[i];
			}
	    	total = total/array.length;
			return total;
		}
	public static void reverseOrder(int[] array){
        /**
         * this method reverses the order of the array passed to it.
         * Not that this method does not have a return type. You do not need to copy the array first
         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
         * in a random order, though you still need to reverse whatever order it is in
         * 
         * Example:
         * array = {5, 1, 9, 10, 16, -6}
         * after calling this method
         * array = {-6, 16, 10, 9, 1, 5}
         * 
         * */
		int[] newArray = new int[array.length];
		int x = array.length-1;
        
        for(int i=0; i<array.length; i++){ 	
            	newArray[i] = array[x];
            	x--;
        }
        for(int i=0; i<array.length; i++){
            array[i] = newArray[i];
        }
    }
	
	
	private static void swap(int[] array, int i, int j) {
		int placeHolder = array[j];
		array[j] = array [i];
		array[i] = placeHolder;
		
	}
	private static void swapDouble(double[] array, int i, int j) {
		double placeHolder = array[j];
		array[j] = array [i];
		array[i] = placeHolder;
		
	}
	
    public static int countDifferences(int[] array1, int[] array2){
        if(array1.length != array2.length){
        	return -1;
        }
    	int ctr =0;
    	for(int i = 0; i < array1.length; i++){
    		if(array1[i] != array2[i]){
    			ctr ++;
    		}
    	}
        return ctr;
    }
    

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consequtive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
    	int currentLength = 0; 
    	int longestLength = 0;
        
    	for(int i = 0; i < array1.length; i++) {
            currentLength = 0;
            for(int j = i; j < array1.length - 1; j++){
                
            	if(array1[j] - array1[(j+1)] == -1){
                    currentLength++;
                }else{
                    if(longestLength <= currentLength){
                        longestLength = currentLength;
                    }
                    break;
                }
            }
        }
        return longestLength + 1;
        

    }
    // **
    public static int longestSharedSequence(int[] array1, int[] array2){
        /**This method counts the longest unbroken, shared sequence in TWO arrays.
         * The sequence does NOT have to be a consecutive sequence
         * It does NOT matter where the sequence begins, the arrays might not be the same length
         * 
         * Examples:
         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
         * */
    	int currentLength = 0; 
    	int longestLength = 0;
        
    	for(int i = 0; i < array1.length; i++){
    		for(int j = 0; j < array2.length; j++){
    		    currentLength = 0;
                for(int x = 0; array1[i+x] == array2[j+x] && (i + x) <= array1.length && (j + x) <= array2.length; x++){
                	currentLength ++;
                    if(longestLength < currentLength){
                		longestLength = currentLength;
                	}

        
                }
            }
    	}
        return longestLength;
    }

    public static int[] generateDistinctItemsList(int n){
        /**
         * This method needs to generate an int[] of length n that contains distinct, random integers
         * between 1 and 2n 
         * The method will be tested by verifying that the array you return is n items long,
         * contains only entries between 1 and 2n (inclusive) and has no duplicates
         * 
         * */
    	int[] list = new int[n];
    	for(int i = 0; i<n; i++){
    		list[i] = i+1;
    	}
    	shuffle(list);
        return list; 
    }
	    
    	private static void shuffle(int[] array) {
			for (int i = 0 ; i < array.length; i ++){
				int random = (int)(Math.random()*(array.length-1));
				swap(array,i,random);
			}
		}
    
    public static void cycleThrough(int[] array, int n){
        /** This problem represents people moving through a line.
         * Once they get to the front of the line, they get what they've been waiting for, then they 
         * immediately go to the end of the line and "cycle through" again.
         * 
         * This method reorders the array so that it represents what the array would look like
         * after it had been cycled through an n number of times.
         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
         * 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
         * 
         * Likewise,
         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
         * and the most interesting case, 
         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
         * was able to go through one more time than anyone else
         * 
         * 
         * CHALLENGE
         * For extra credit, make your method handle NEGATIVE n
         * */
    	//boolean inLoop = true;
    	while(n>0){
	    	cycle(array);
	    	n--;
	   // 	if(n < 0){
	   // 		inLoop = false;
	   // 	}
    	}
    }
	private static void cycle(int[] array) {
		for(int i=array.length-1; i>-1; i--){
			swap(array,0,i);
		}
		
	}
}
