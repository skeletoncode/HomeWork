package Task6.Ferum.too.Gate.Task18;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DecoratorFilterInputStream extends FilterOutputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public DecoratorFilterInputStream(OutputStream out) {
        super(out);
    }
 /*
    public static byte[] encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }

        return res;
    }

  */

    public int read(byte[] b ) throws IOException {
        int result = super.read(b);
        byte[] myKey = "Testing some Encrypting".getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (b[i] ^
             myKey[i % myKey.length];
        }

        return result;


    }






}
