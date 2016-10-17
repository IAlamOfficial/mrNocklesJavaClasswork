package chatBox;

import java.util.Scanner;

/**
 * @author Student 6
 *
 */
public class AlamMain {

	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response; 
	static Topic school;
	static Topic like;
	/* 
		"helper methods" a method that contribute functionality to another method. He;per methods are very 
		common when you need to do the same thing repeated they also help make methods more readable. This 
		method is private because it is only used by the method it's helping
	
	*/
	private static boolean noNegations(String phrase, int index){
		// check for word "NO " (3 chars)
		//check to see if there is a space for the word 
		//"NO " to be in front of the index
		if(index -3 >= 0 && phrase.substring(index-3,index).equals("no ")){
			return false;
		}
		if(index -4 >= 0 && (phrase.substring(index-4,index).equals("not ") || phrase.substring(index-4,index).equals("n't "))){
			return false;
		}
		if (index -6 >= 0 && phrase.substring(index-3,index).equals("never ")){
			return false;
		}
		//check for "not"
		return true;
	}
	public static void main(String[] args) {
		createTopics();
		String s1 = "a";
		String s2 = ".";
		System.out.print(s1.compareTo(s2));
		
		promptName();
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
		
		print("Greetings, " + user + " how are you?");
		while (inLoop){
			response = getInput();
			
			if(findKeyword(response, "good", 0) >= 0){
				print("I'm so happy you're good.");
			}
			else if(findKeyword(response, "like", 0) >= 0){
				
			}
			else if(response.indexOf("school")>= 0){
				inLoop = false; // exit the loop
				school.talk();
			}
			else{
				print("I'm sorry, I'm dont understand you.");
				inLoop = false;
				like.talk();
			}
		}
		
	}
	
	public static int findKeyword(String searchString, String key, int startIndex) {
		//delete white space
		String phrase = searchString.trim();
		//set all letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		// find position of key
		
//		System.out.println("The phrase is " + phrase);
//		System.out.println("the key is "+key);
		
		
		int psn = phrase.indexOf(key);
		
//		System.out.println("The position found" + psn);
		// keep look for the word till you find the right context
		while(psn >= 0){
			String before = " ";
			String after = " ";
			//if the phrase does not end with this word
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
//				System.out.println("the character after " + key + " is " + after);
			}
			
			if (psn > 0){
				before = phrase.substring(psn-1,psn).toLowerCase();
//				System.out.println("the character before " + key + " is " + before);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
//				System.out.println(key + " was not found. checking " + psn);
				if(noNegations(phrase, psn)){
					return psn;
				}
			}
			//in case the key word was not found yet, check the rest of the phrase
			psn = phrase.indexOf(key,psn+1);
		}
		return -1;
	}
	public static void promptInput() {
		print(user + " ,try inputting a string!");
		
		String userInput = input.nextLine();
		
		print("You typed: " + userInput);
	}

	public static void createTopics() {
		input = new Scanner (System.in);
		school = new School();
		like = new AlamLike();
	}
}