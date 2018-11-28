package edu.bellarmine.jhz.Joust;
/**
 * Shared random number generator.
 * @author rkelly
 */
import java.util.Random;

public class SharedRandom {
	/**
	 * Generate random number
	 */

	public static final Random r = new Random(100);
	
	public static int getRandom(int experience) {
		return (r.nextInt(experience)+1);
	}
	
}//end class
