package dataType;

import java.util.Random;

public class MathRandom { 
		public static void main(String[] args){
			int[] results = new int[6];
			// same as 
			// int[] results = {0,0,0,0,0,0}
			
			int totalRoles = 10000;
			
			for (int index = 0; index < totalRoles; index++){
			int roll = rollUnfairDie();
			System.out.println("die is " + roll);
			results[roll - 1]++;
			}
			for (int i = 0; i < 6; i ++){
			int percentage = results[i]/totalRoles*10000/100;
			// percentage = (double) percentage/100;
			System.out.println((i+1) + " was rolled " + percentage + "% times");
			
			}
		}
		public static int rollFairDie(){
			//Random gen = new Random();
			//return gen.nextInt(6);
			double rand = Math.random(); // candom double (0,1)
			int roll = (int) (6 * rand); //[0,5] this is what above code does
			return roll + 1; //0 becomes 1, 5 becomes 6
		}
		public static int rollUnfairDie(){
			// returns 1-6 with uneven distribution
			
			double rand = Math.random();
			int roll = (int) (6 * rand); 
			roll = roll + 1; 
			if (roll == 1 || roll == 3 || roll == 5) 
			rand = Math.random();
			roll = (int) (6 * rand); 
			
			return roll + 1; 
		}
		
}
			
//			for (int index = 0; index < 13; index++){
//				System.out.println("Card #" + (index + 1)+"  is "+ rollCard() + "and unfair die is " + rollUnfairDie());
//				}
//			
//			public static int rollCard(){
//				//Random gen = new Random();
//				//return gen.nextInt(6);
//				double rand = Math.random(); // candom double (0,1)
//				int roll = (int) (13 * rand); //[0,5] this is what above code does
//				return roll + 1; //0 becomes 1, 5 becomes 6
			
	


