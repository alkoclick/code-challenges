package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.BinaryGap;
import interviews.FirstNonRepeatedCharacter;

public class BinaryGapTest {

	@Test
	public void normalUseCase() {
		assertEquals(BinaryGap.of(9), 2);
		assertEquals(BinaryGap.of(19), 2);
		assertEquals(BinaryGap.of(Integer.MIN_VALUE), 31);
		assertEquals(BinaryGap.of(Integer.MAX_VALUE), 0);
	}

	@Test
	public void edgeCases() {
		assertEquals(FirstNonRepeatedCharacter.of("abcdabcd"), Character.MIN_VALUE);
		assertEquals(FirstNonRepeatedCharacter.of("Ama"), 'A');

		// expectedException.expect(NullPointerException.class);
		assertEquals(FirstNonRepeatedCharacter.of(null), Character.MIN_VALUE);

		assertEquals(FirstNonRepeatedCharacter.of("a a"), ' ');
		assertEquals(FirstNonRepeatedCharacter.of("aΣa"), 'Σ');
		assertEquals(FirstNonRepeatedCharacter.of(""), Character.MIN_VALUE);
	}

}
