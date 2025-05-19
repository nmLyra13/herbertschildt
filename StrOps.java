/*
 * Operating with Strings.
The string class contains several methods that operate on strings.
Here are the general forms of some of them:

- boolean equals(str): Returns true if the calling string has the same sequence of characters as str.
- int lenght(): Gets the length of a string.
- char charAt(index): Gets the character at the index specified by index.
- int compareTo(str): Returns less than zero if the calling string is greater than str, and zero if the strings are equal.
- int indexOf(str): Searches the calling string for the substring specified by str. Returns the index of the first occurrence, or -1 on failure.
- int lastIndexOf(str): Searches the calling string for the substring specified by str. Returns the index of the last occurrence, or -1 on failure.
 * 
 */

package herbertschildt;

public class StrOps {

	public static void main(String[] args) {

		String str1 = "When it comes to web programinmg, java is #1";
		// String str2 = new String(str1);
		String str3 = "Java strings are powerful";
		int result; //, idx;
		//char ch;
		System.out.println("Leght of str1: " + str1.length());
		// displays one character at a time from str1.
		// exibe um caractere de cada vez de str1.

		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
			System.out.println();

			if (str1.equals(str3)) {
				System.out.println("str1 equals str2");
			} else {
				System.out.println("str1 does not equal str2");
			}

			result = str1.compareTo(str3);
			if (result == 0) {
				System.out.println("str1 and str3 are equal");
			} else if (result < 0) {
				System.out.println("str1 is less than str3");
			} else {
				System.out.println("str1 is greater than str3");
			}
		}
	}
}
