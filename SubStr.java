/*
 * Strings cannot be changed: The contents of a String object cannot be changed. 
 *
 * That is, once created, the sequence of characters that make up the string cannot be changed.
 * 
 * This restriction allows Java to implement strings more efficiently. Although it may seem like a serious problem, it is not. If you need a string that is a variation of an existing one, you only need to create a new string containing the necessary changes.
 * 
 * Since unused String objects are automatically garbage collected, you do not even need to worry about what will happen to discarded strings.
 * However, it should be made clear that String reference variables can change the object they reference. Only the contents of a specific String object cannot be changed after it is created.
 * 
 */

package herbertschildt;

public class SubStr {

	public static void main(String[] args) {

		String orgstr = "Java makes the web move";
		// Java faz a web se mover"
		// Constructs a substring. 
		// this line creates a new string containing the desired
		// substring
		String substr = orgstr.substring(5, 18);
		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);

	}
}
