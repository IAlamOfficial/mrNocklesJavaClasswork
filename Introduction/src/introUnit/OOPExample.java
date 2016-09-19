/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This class is designed to contrast the procedural example. 
 * It embodies and Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Construct a student
		Student jillian = new Senior("Jillian","programmer");
		Student joseph = new Freshman("Joseph","gamer");
		Student jordan = new Student("jordan");
		
		jillian.talk();
//		making public fields allow data to be changed		
//		jillian.name = "Jason Lau";
//		jillian.talk();
		
		joseph.talk();
		jordan.talk();

	}

}
