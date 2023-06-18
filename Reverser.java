// Work by: Marcos Ondruska
// Class: COP 3337 RVE 1218
// Instructor: Joslyn A. Smith
//Assignment 2: Cypher 

package CypherHomework;

public class Reverser extends Transpose {
	public Reverser(String s) {
// Complete the constructor
		super(s);
	}

	public String reverseText(String word) {
// Complete this method so that it reverses the original string
		String [] words = word.split(" ");
		String reversedStr = "";
		
		for (int i = words.length-1; i >= 0; i--) {
		reversedStr +=	words[i] + " ";
		}
		return reversedStr;
	}

	public String decode(String word) {
// Complete this method so that it reverses the reversed string

		StringBuffer result = new StringBuffer(word);
		result.reverse();
		return result.toString();
	}
}
