package challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://codereview.stackexchange.com/questions/159650/find-the-binary-gap-of-a-number-n
 */
public class BinaryGap {

	public static int of(int input) {
		System.out.println(Integer.toBinaryString(input));
		Pattern p = Pattern.compile("10+1");
		Matcher m = p.matcher(Integer.toBinaryString(input));
		int max = 0;
		while (m.find()) {
			int l = m.group().length();
			if (l > max)
				max = l;
		}
		return max;
	}
}
