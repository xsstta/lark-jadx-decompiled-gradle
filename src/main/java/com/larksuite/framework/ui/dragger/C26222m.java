package com.larksuite.framework.ui.dragger;

import android.os.Build;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.ui.dragger.m */
public class C26222m {
    /* renamed from: a */
    public static boolean m94836a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m94837b() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }
}
