package com.ss.android.lark.mail.impl.p2168g.p2170b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.g.b.c */
public final class C42163c {

    /* renamed from: a */
    static final Charset f107224a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f107225b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m168256a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static void m168257a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m168257a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
