package com.bytedance.push.p881c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.push.c.e */
class C20394e {
    /* renamed from: b */
    static byte[] m74302b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    static boolean m74301a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12 || !"RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) || !"WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
            return false;
        }
        return true;
    }
}
