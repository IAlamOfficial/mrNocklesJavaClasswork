package testingstuff;

	public class ArrayMethods {

	    public static void main(String[] args) {
	    
	    	int[] fiftyNumbers = new int[50];
	    	int[] fiftyNumbers1 = new int[50];
	    	int[] totalCalled = new int[24];
	    	populate(fiftyNumbers, fiftyNumbers1);
	    	print(fiftyNumbers, fiftyNumbers1, totalCalled);
	    }

		private static void print(int[] fiftyNumbers,int[] fiftyNumbers1, int[] totalCalled) {
			for(int i = 0; i < fiftyNumbers.length; i++){
				int total = fiftyNumbers[i] + fiftyNumbers1[i];
				
				System.out.println(fiftyNumbers[i] + " and " + fiftyNumbers1[i] + " equals to " + total);
				totalCalled[total - 1] +=1; 
			}
			for(int b = 0; b < totalCalled.length; b++){
				int x = b+1;
				System.out.println(x + " was called " +totalCalled[b]);
			}
		}

		private static void populate(int[] fiftyNumbers, int[] fiftyNumbers1) {
			for(int i = 0; i < fiftyNumbers.length; i++){
				double rand = Math.random();
				fiftyNumbers[i] = (int) ((rand * 12) + 1);
				fiftyNumbers1[i] = (int) ((rand * 12) + 1);
			}
			
			
		}
	    
	    

	}


