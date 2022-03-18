package com.ss.android.lark.mediapicker.utils;

import com.ss.android.lark.log.Log;
import java.io.Closeable;

/* renamed from: com.ss.android.lark.mediapicker.utils.c */
public class C44744c {
    /* renamed from: a */
    public static final void m177485a(Closeable... closeableArr) {
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
