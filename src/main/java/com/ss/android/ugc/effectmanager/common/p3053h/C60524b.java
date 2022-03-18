package com.ss.android.ugc.effectmanager.common.p3053h;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.b */
public class C60524b {
    /* renamed from: a */
    public static void m235232a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
