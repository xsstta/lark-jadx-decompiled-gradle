package com.larksuite.framework.utils;

import com.ss.android.lark.log.Log;
import java.io.Closeable;

/* renamed from: com.larksuite.framework.utils.q */
public class C26314q {
    /* renamed from: a */
    public static final void m95296a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        Log.m165379d("IoStreamUtils", th.toString());
                    }
                }
            }
        }
    }
}
