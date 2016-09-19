/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 *
 */
public class Freshman extends Student {
	
private String internship;
	
	public Freshman(String name, String internship){
		super (name);
		// need to make a student before adding properties to it
		this.internship = internship; 
	}
	
	public void talk(){
		super.talk(); // call the super method
		System.out.println ("... and I am a Freshie!");
		System.out.println ("I intern as a " + internship);
	}
}
