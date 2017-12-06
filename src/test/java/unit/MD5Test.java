package unit;

import challenges.MD5;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class MD5Test {

    @Test
    public void normalUseCase() throws UnsupportedEncodingException {
        assertEquals(MD5.of("HelloWorld"), "68e109f0f40ca72a15e05cc22786f8e6");
        assertEquals(MD5.of("Javarmi123"), "2da2d1e0ce7b4951a858ed2d547ef485");
    }
}
