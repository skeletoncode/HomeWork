package Task6.Ferum.too.Gate.Task18;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DecoratorFilterInputStream extends FilterInputStream {


    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    private String key;
    protected DecoratorFilterInputStream(InputStream in, String key) {
        super(in);
        this.key = key;
    }

    @Override
    public int read(byte[] b) throws IOException {
        byte[] k = key.getBytes();
        int count =  super.read(b);
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (b[i] ^ k[i % k.length]);
        }

        return count;
    }

    // Дешифрование строки --- int

    public static String decode(byte[] pText, String pKey) {
        byte[] res = new byte[pText.length];
        byte[] key = pKey.getBytes();

        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }

        return new String(res);
    }





}
