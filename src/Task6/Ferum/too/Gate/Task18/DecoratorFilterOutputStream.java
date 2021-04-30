package Task6.Ferum.too.Gate.Task18;

import java.io.*;

public class DecoratorFilterOutputStream extends FilterOutputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public DecoratorFilterOutputStream(OutputStream out) {
        super(out);
    }


    // Шифрование на основе операций XOR использует свойство:
    //(a XOR k) XOR k = a
    //где k – выступает в роли ключа

    public static byte[] encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }

        return res;
    }








}
