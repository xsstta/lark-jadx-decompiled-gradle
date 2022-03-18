package com.huawei.secure.android.common.ssl.p1028b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.huawei.secure.android.common.ssl.b.e */
public abstract class AbstractC23820e {
    /* renamed from: a */
    public static void m87071a(InputStream inputStream) {
        m87070a((Closeable) inputStream);
    }

    /* renamed from: a */
    public static void m87072a(OutputStream outputStream) {
        m87070a((Closeable) outputStream);
    }

    /* renamed from: a */
    public static void m87070a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C23821f.m87078d("IOUtil", "closeSecure IOException");
            }
        }
    }
}
