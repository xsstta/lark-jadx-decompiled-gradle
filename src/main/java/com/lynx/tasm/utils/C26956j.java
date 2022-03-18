package com.lynx.tasm.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.lynx.tasm.utils.j */
public class C26956j {
    /* renamed from: a */
    public static String m97955a(InputStream inputStream) {
        byte[] b = m97956b(inputStream);
        if (b == null) {
            return null;
        }
        return new String(b);
    }

    /* renamed from: b */
    public static byte[] m97956b(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException unused) {
                return null;
            }
        }
    }
}
