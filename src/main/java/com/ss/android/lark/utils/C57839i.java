package com.ss.android.lark.utils;

import com.ss.android.lark.log.Log;
import java.io.Closeable;

/* renamed from: com.ss.android.lark.utils.i */
public class C57839i {
    /* renamed from: a */
    public static final void m224502a(Closeable... closeableArr) {
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
