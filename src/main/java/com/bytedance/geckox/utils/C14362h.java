package com.bytedance.geckox.utils;

import android.content.Context;
import com.C1711a;
import com.bytedance.p203b.C3481a;

/* renamed from: com.bytedance.geckox.utils.h */
public class C14362h {

    /* renamed from: a */
    private static Context f37728a;

    /* renamed from: a */
    public static void m57834a(Context context) {
        if (context != null) {
            f37728a = context;
        }
    }

    /* renamed from: a */
    public static void m57835a(String str) {
        Context context = f37728a;
        if (context == null) {
            C1711a.m7628a(str);
        } else {
            C3481a.m14718a(str, context);
        }
    }
}
