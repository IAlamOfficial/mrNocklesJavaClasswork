/**
 * 
 */
package dataType;

/**
 * @author Student 6
 *
 */
public class StringPratice {

	public static void main(String[] args) {
		//String text = new String ("Hello World");
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
			System.out.println("Word one is befire word two");
		}
		
	}

}
