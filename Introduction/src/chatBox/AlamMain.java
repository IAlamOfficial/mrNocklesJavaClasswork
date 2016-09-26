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
			
			if(findKeword(response, "good", 0)){
				print("I'm so happy you're good.");
			}
			else if(response.indexOf("school")>= 0){
				inLoop = false; // exit the loop
				school.talk();
			}
			else{
				print("I'm sorry, I'm dont understand you.");
			}
		}
		
	}
	
	public static boolean findKeword(String searchString, String key, int startIndex) {
		//delete white space
		String phrase = searchString.trim();
		//set all letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		// find position of key
		int psn = phrase.indexOf(key);
		// keep look for the word till you find the right context
		while(psn >= 0){
			String before = " ";
			String after = " ";
			//if the phrase does not end with this word
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
			}
			
			if (psn > 0){
				before = phrase.substring(psn-1,psn).toLowerCase();
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				return true;
			}
			//in case the key word was not found yet, check the rest of the phrase
			psn = phrase.indexOf(key,psn+1);
		}
		return false;
	}
	public static void promptInput() {
		print(user + " ,try inputting a string!");
		
		String userInput = input.nextLine();
		
		print("You typed: " + userInput);
	}

	public static void createTopics() {
		input = new Scanner (System.in);
		school = new School();
		
	}
}