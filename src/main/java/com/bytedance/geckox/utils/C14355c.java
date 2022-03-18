package com.bytedance.geckox.utils;

import android.database.Cursor;
import com.bytedance.geckox.p771g.C14276b;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.utils.c */
public class C14355c {
    /* renamed from: a */
    public static boolean m57818a(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e) {
            C14276b.m57605b("gecko-debug-tag", "close:", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m57819a(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException e) {
            C14276b.m57605b("gecko-debug-tag", "close:", e);
            return false;
        }
    }
}
