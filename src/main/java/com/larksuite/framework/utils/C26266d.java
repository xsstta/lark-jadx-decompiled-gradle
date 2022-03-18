package com.larksuite.framework.utils;

import android.database.Cursor;
import com.ss.android.lark.log.Log;
import java.io.Closeable;

/* renamed from: com.larksuite.framework.utils.d */
public class C26266d {
    /* renamed from: a */
    public static final void m95081a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                Log.m165379d("ClosableUtils", th.toString());
            }
        }
    }

    /* renamed from: a */
    public static final void m95082a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        Log.m165379d("ClosableUtils", th.toString());
                    }
                }
            }
        }
    }
}
