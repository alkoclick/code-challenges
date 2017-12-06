package challenges;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    private static MessageDigest sha256;

    static {
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String of(String input) throws UnsupportedEncodingException {
        sha256.update(StandardCharsets.UTF_8.encode(input));
        return String.format("%064x", new BigInteger(1, sha256.digest()));
    }
}
