package com.larksuite.framework.ui.p1197a;

import android.content.Context;
import android.os.Build;

/* renamed from: com.larksuite.framework.ui.a.c */
public class C26179c {
    /* renamed from: a */
    public static AbstractC26178b m94706a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new C26181e(context);
        }
        return new C26180d(context);
    }
}
