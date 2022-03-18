package com.bytedance.ttnet;

import android.text.TextUtils;

/* renamed from: com.bytedance.ttnet.b */
public class C20741b {
    /* renamed from: a */
    public static String m75547a() {
        String e = TTNetInit.getTTNetDepend().mo69994e();
        if (e != null && !TextUtils.isEmpty(e)) {
            return e;
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }

    /* renamed from: b */
    public static String m75548b() {
        String f = TTNetInit.getTTNetDepend().mo69995f();
        if (f != null && !TextUtils.isEmpty(f)) {
            return f;
        }
        throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
    }
}
