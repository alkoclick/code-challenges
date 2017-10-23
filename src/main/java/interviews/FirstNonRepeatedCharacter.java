package interviews;

public class FirstNonRepeatedCharacter {

	public static char of(String input) {
		return (char) input.chars().
		// Keep only elements apearing exactly once
				filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).
				// Get first since we haven't reordered the stream
				findFirst().orElse(Character.MIN_VALUE);
	}
}
