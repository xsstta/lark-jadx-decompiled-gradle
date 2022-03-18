package com.larksuite.framework.utils;

import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.utils.ah */
public class C26256ah {
    /* renamed from: a */
    public static long m95011a(String str) {
        return m95012a(str, 0);
    }

    /* renamed from: a */
    public static long m95012a(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            Log.m165383e("SafeParseUtils", th.getMessage());
            return j;
        }
    }
}
