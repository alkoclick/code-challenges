package unit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import interviews.FirstNonRepeatedCharacter;

public class FirstNonRepeatedCharacterTest {
	private static String longString;

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@BeforeClass
	public static void setUp() {
		int length = 10000000; // 1 mill
		StringBuffer outputBuffer = new StringBuffer(length);
		for (int i = 0; i < length / 2; i++) {
			outputBuffer.append('a');
		}
		outputBuffer.append('b');
		for (int i = length / 2 + 1; i < length; i++) {
			outputBuffer.append('a');
		}
		longString = outputBuffer.toString();
	}

	@Test
	public void normalUseCase() {
		assertEquals(FirstNonRepeatedCharacter.of("ama"), 'm');
		assertEquals(FirstNonRepeatedCharacter.of("stress"), 't');
		assertEquals(FirstNonRepeatedCharacter.of("VforEndetta"), 'V');
		assertEquals(FirstNonRepeatedCharacter.of("abcdabcde"), 'e');
		assertEquals(FirstNonRepeatedCharacter.of("attilla"), 'i');
	}

	@Test
	public void edgeCases() {
		assertEquals(FirstNonRepeatedCharacter.of("abcdabcd"), Character.MIN_VALUE);
		assertEquals(FirstNonRepeatedCharacter.of("Ama"), 'A');

		expectedException.expect(NullPointerException.class);
		assertEquals(FirstNonRepeatedCharacter.of(null), Character.MIN_VALUE);

		assertEquals(FirstNonRepeatedCharacter.of("a a"), ' ');
		assertEquals(FirstNonRepeatedCharacter.of(""), Character.MIN_VALUE);
	}

	@Test
	public void sizeMatters() {
		assertEquals(FirstNonRepeatedCharacter.of(longString.toString()), 'b');
	}

}
