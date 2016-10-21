package arrayLessons;

	public class ArrayMethods {

	    public static void main(String[] args) {
	    
	    	int[] fiftyNumbers = new int[50];
	    	int[] dicerRoll1 = new int[50];
	    	int[] dicerRoll2 = new int[50];
	    	int[] totalCalled = new int[12];
	    	populate(fiftyNumbers);
	    	populateDice(dicerRoll1, dicerRoll2);
	    	print(fiftyNumbers);
	    	printDice(dicerRoll1,dicerRoll2 , totalCalled);
	    }

		private static void print(int[] fiftyNumbers) {
			for (int a:fiftyNumbers){
				System.out.println(a + "");
			}
			
		}

		private static void printDice(int[] dicerRoll1, int[] dicerRoll2, int[] totalCalled) {
			for(int i = 0; i < dicerRoll1.length; i++){
				int total = dicerRoll1[i] + dicerRoll2[i];
				
				System.out.println(dicerRoll1[i] + " and " + dicerRoll2[i] + " equals to " + total);
				totalCalled[total - 1] +=1; 
			}
			for(int b = 0; b < totalCalled.length; b++){
				int x = b+1;
				System.out.println(x + " was called " +totalCalled[b]);
			}
		}

		private static void populate(int[] fiftyNumbers) {
			for(int i = 0; i < fiftyNumbers.length; i++){
				double rand = Math.random();
				fiftyNumbers[i] = i+1;
			}
			
			}
		private static void populateDice(int[] dicerRoll1, int[] dicerRoll2) {
				for(int i = 0; i < dicerRoll1.length; i++){
					double rand1 = Math.random();
					double rand2 = Math.random();
					dicerRoll1[i] = (int) ((rand1 * 6) + 1);
					dicerRoll2[i] = (int) ((rand2 * 6) + 1);
				}
			
			
		}
	    
	}


