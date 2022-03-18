package com.google.android.gms.internal.p979b;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.b.i */
public final class C21892i {

    /* renamed from: a */
    private static final Logger f53301a = Logger.getLogger(C21892i.class.getName());

    private C21892i() {
    }

    /* renamed from: a */
    public static void m79202a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f53301a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
