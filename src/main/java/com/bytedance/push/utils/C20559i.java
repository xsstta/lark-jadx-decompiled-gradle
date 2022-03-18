package com.bytedance.push.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: com.bytedance.push.utils.i */
public class C20559i {
    /* renamed from: a */
    public static String m74876a(byte[] bArr) {
        return m74877a(bArr, "UTF-8");
    }

    /* renamed from: a */
    public static String m74877a(byte[] bArr, String str) {
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            byteArrayOutputStream.close();
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            throw th;
        }
        inflater.end();
        return new String(bArr);
    }
}
