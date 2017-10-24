package unit;

import challenges.BinaryGap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

	@Test
	public void normalUseCase() {
		assertEquals(BinaryGap.of(9), 2);
		assertEquals(BinaryGap.of(19), 2);
		assertEquals(BinaryGap.of(529), 4);
		assertEquals(BinaryGap.of(20), 1);
		assertEquals(BinaryGap.of(15), 0);
	}

	@Test
	public void edgeCases() {
		assertEquals(BinaryGap.of(Integer.MIN_VALUE), 0);
		assertEquals(BinaryGap.of(Integer.MAX_VALUE), 0);
		assertEquals(BinaryGap.of(0), 0);
	}

}
