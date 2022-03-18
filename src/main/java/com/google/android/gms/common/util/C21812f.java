package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.util.f */
public final class C21812f {
    /* renamed from: a */
    public static void m79090a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
