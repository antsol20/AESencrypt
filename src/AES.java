import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES {
    private static final byte[] keyValue =
            new byte[]{'m', 'y', 'Z', 'k', 'e', 'i', '7', '1', 'e', 'c', 'j', 'k', 'F', 'X', 'z', 'q'};


    public static String encrypt(String data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encVal);
    }


    public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = Base64.getDecoder().decode(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        return new String(decValue);
    }


    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, "AES");
    }

}