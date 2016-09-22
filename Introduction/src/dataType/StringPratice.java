package dataType;

import java.util.Scanner;

/**
 * @author Student 6
 *
 */
public class StringPratice {

	static Scanner input;
	static String user;
	static int lineCount;
	
	public static void main(String[] args) {
		createAScanner();
		lineCount = 0;
		demonstrateStringMethods();
		promptName();
		// promptInput(); 
		talkForever();
	}
	public static void print(String s){
		lineCount ++;
		System.out.println("line #" + lineCount + ": " + s);
	}
	public static void promptName() {
		// TODO Auto-generated method stub
		print("Hello my name is Harambe \nback from the dead. \nI would like to exterminate all \nhumans starting with you, \nwhat's your name petty human");
		user = input.nextLine();
		print("K " + user);
		
	}
	public static void talkForever() {
		while (true){
			promptInput();
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
	public static void demonstrateStringMethods(){
		String text1 = "Hello World"; //shortcut
		String text2 = "Hello ";
		String text3 = "World";
		String text4 = text2 + text3;
		
		if (text1.equals(text4)) System.out.println("They are equal");
		System.out.println(text1);
		System.out.print(text2 +text3);
	
		String word1 = "Aardvark";
		String word2 = "Zyzzva";
		
		if(word1.compareTo(word2)<0){
			System.out.println("Word one is before word two");
		}
	}
}
