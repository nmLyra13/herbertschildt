/*
 * Como qualquer outro tipo de dado, os strinfs podem ser reunidos em arrays. Por exemplo:
 */

package herbertschildt;

public class StringsArrays {

	public static void main(String[] args) {
		String strs[] = {"This", "is", "a", "test."};
		System.out.println("Original array: ");
		for (String s : strs) {
			System.out.println(s + " ");
		}
	}

}
