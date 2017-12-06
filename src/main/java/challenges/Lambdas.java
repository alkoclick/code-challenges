package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@FunctionalInterface
interface PerformOperation {
	boolean check(int a);
}

/**
 * https://www.hackerrank.com/challenges/java-lambda-expressions/problem
 *
 */
class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return a -> a % 2 == 1;
	}

	/**
	 * From
	 * https://codereview.stackexchange.com/questions/24704/efficiently-determining-if-a-number-is-prime
	 * 
	 * @return
	 */
	public PerformOperation isPrime() {
		return a -> {
			if (a > 2 && a % 2 == 0) {
				return false;
			}
			int top = (int) Math.sqrt(a) + 1;
			for (int i = 3; i < top; i += 2) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
		return a -> {
			String stringValue = a + "";
			while (stringValue.length() > 1 && stringValue.charAt(0) == stringValue.charAt(stringValue.length() - 1)) {
				stringValue = stringValue.substring(1, stringValue.length() - 2);
			}
			return stringValue.length() <= 1;
		};
	}
}

class Lambdas {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
