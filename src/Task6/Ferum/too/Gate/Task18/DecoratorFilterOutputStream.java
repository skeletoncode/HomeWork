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
    private String key;
    public DecoratorFilterOutputStream(OutputStream out, String key) {
        super(out);
        this.key = key;
    }


    // Шифрование на основе операций XOR использует свойство:
    //(a XOR k) XOR k = a
    //где k – выступает в роли ключа
    // Простая реализация шифрования строки:


    @Override
    public void write(byte[] b) throws IOException {
        byte[] k = key.getBytes();
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (b[i] ^ k[i % k.length]);
        }
        super.write(b);
    }

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
