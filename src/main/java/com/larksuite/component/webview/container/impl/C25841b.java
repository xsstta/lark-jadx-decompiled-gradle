package com.larksuite.component.webview.container.impl;

import android.text.TextUtils;

/* renamed from: com.larksuite.component.webview.container.impl.b */
public class C25841b {
    /* renamed from: a */
    public static boolean m93494a(String str) {
        if (TextUtils.isEmpty(str) || !str.endsWith(".apk")) {
            return false;
        }
        return true;
    }
}
