package interviews;

/**
 * Problem description:
 * http://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
 */
public class FirstNonRepeatedCharacter {

	/**
	 * Given a string, returns the first character x that does not appear more
	 * than once. For example, for input 'test' it should return 'e'
	 * 
	 * @param input
	 *            A string which to check for repeating characters
	 * @return The first non repeating character found, or Character.MIN_VALUE
	 */
	public static char of(String input) {
		return (char) input.chars().
		// Keep only elements apearing exactly once
				filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).
				// Get first since we haven't reordered the stream
				findFirst().orElse(Character.MIN_VALUE);
	}
}
