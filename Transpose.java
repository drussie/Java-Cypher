// Work by: Marcos Ondruska
// Class: COP 3337 RVE 1218
// Instructor: Joslyn A. Smith
//Assignment 2: Cypher 

package CypherHomework;

public class Transpose extends Cipher {
	Transpose(String s) {
		super(s);
	}

	public String encode(String word) {
		StringBuffer result = new StringBuffer(word);
		result.reverse();
		return result.toString();
	}

	public String decode(String word) {
		// Complete this method so that it reverses the encoded string;
		return encode(word);
	}
}
