package dataType;

import java.util.Scanner;

/**
 * @author Student 6
 *
 */
public class StringPratice {

	static Scanner input;
	static String user;
	//static int lineCount;
	static boolean inLoop;
	static String response; 
	
	public static void main(String[] args) {
		createAScanner();
		//lineCount = 0;
		//demonstrateStringMethods();
		promptName();
		// promptInput(); 
		talkForever();
	}
	public static String getInput(){
		return input.nextLine(); 
	}
	
	
	public static void print(String s){
		//lineCount ++;
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add.
		//(LOW, is the the length of s > 0
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the current line and next word are less than the cutoff,
			// and there are still words to add,do the following loop
			while (currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//add next word to the line
				currentLine += nextWord;
				s = s.substring(nextWord.length());
				
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if it's the last word
				if (endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
			
		}
		
		
		
		System.out.println(printString);
	}
	public static void promptName() {
		// TODO Auto-generated method stub
		print("Hello my name is Harambe back from the dead. I would like to exterminate all humans starting with you, what's your name petty human");
		user = input.nextLine();
		print("K " + user);
		
	}
	public static void talkForever() {
		inLoop = true;
		
		while (inLoop){
			print("Greetings, " + user + " how are you?");
			response = getInput();
			
			if(response.indexOf("good") >=0){
				print("I'm so happy you're good.");
			}
			else{
				print("I'm sorry, I'm dont understand you.");
			}
		}
		
	}
	
	public static void promptInput() {
		print(user + " ,try inputting a string!");
		
		String userInput = input.nextLine();
		
		print("You typed: " + userInput);
	}

	public static void createAScanner() {
		input = new Scanner (System.in);
		
	}
//	public static void demonstrateStringMethods(){
//		String text1 = "Hello World"; //shortcut
//		String text2 = "Hello ";
//		String text3 = "World";
//		String text4 = text2 + text3;
//		
//		if (text1.equals(text4)) System.out.println("They are equal");
//		System.out.println(text1);
//		System.out.print(text2 +text3);
//	
//		String word1 = "Aardvark";
//		String word2 = "Zyzzva";
//		
//		if(word1.compareTo(word2)<0){
//			System.out.println("Word one is before word two");
//		}
	}

