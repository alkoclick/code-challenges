package unit;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import challenges.SHA256;

public class SHA256Test {

	@Test
	public void normalUseCase() throws UnsupportedEncodingException {
		assertEquals(SHA256.of("HelloWorld"), "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4");
		assertEquals(SHA256.of("Javarmi123"), "f1d5f8d75bb55c777207c251d07d9091dc10fe7d6682db869106aacb4b7df678");
		assertEquals(SHA256.of("K1t4fo0V"), "0a979e43f4874eb24b740c0157994e34636eed0425688161cc58e8b26b1dcf4e");
		assertEquals(SHA256.of("yxPX0fbIKHvjHo180"),
				"074690988f8d3e8e45840f7502efd2edde63a88c299a88e0923e7ed4abec1835");
	}
}
