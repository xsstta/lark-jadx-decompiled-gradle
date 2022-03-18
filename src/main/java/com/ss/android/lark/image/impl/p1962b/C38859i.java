package com.ss.android.lark.image.impl.p1962b;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.ss.android.lark.image.impl.b.i */
class C38859i {
    /* renamed from: a */
    static void m153386a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
