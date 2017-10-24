package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://codereview.stackexchange.com/questions/159650/find-the-binary-gap-of-a-number-n
 */
public class BinaryGap {

	public static int of(int input) {
		Matcher m = Pattern.compile("10+1").matcher(Integer.toBinaryString(input));
		return m.results().mapToInt(mRes -> mRes.group().length()-2).max().orElse(0);
	}
}
