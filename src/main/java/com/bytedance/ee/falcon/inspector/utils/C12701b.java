package com.bytedance.ee.falcon.inspector.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: com.bytedance.ee.falcon.inspector.utils.b */
public class C12701b {
    /* renamed from: a */
    public static <T> T m52567a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static void m52568a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m52569a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
