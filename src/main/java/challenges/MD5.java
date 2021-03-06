package challenges;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    private static MessageDigest md5;

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String of(String input) throws UnsupportedEncodingException {
        md5.update(StandardCharsets.UTF_8.encode(input));
        return String.format("%032x", new BigInteger(1, md5.digest()));
    }
}
