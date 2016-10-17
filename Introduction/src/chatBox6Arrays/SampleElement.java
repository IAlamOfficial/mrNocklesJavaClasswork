/**
 * 
 */
package chatBox6Arrays;


public class SampleElement {
	private int number;
	
	public SampleElement(int value){
		number = value;
	}
	public int getNumber(){
		return number;
	}
	public void increase(){
		int x = number;
		// won't do anything 
		x++;
		
		//do something
		number++;
	}
}
