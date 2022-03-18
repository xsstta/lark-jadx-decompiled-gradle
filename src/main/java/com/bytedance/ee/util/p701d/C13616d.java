package com.bytedance.ee.util.p701d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;

/* renamed from: com.bytedance.ee.util.d.d */
public class C13616d {
    /* renamed from: a */
    public static boolean m55261a() {
        try {
            if ((C13615c.f35773a.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m55263b() {
        boolean z;
        try {
            ApplicationInfo applicationInfo = C13615c.f35773a.getApplicationInfo();
            if ((applicationInfo.flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean equals = TextUtils.equals("com.bytedance.ee.docs.sdk.demo", applicationInfo.packageName);
            if (!z || !equals) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m55262a(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
