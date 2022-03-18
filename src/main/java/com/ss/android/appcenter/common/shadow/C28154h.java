package com.ss.android.appcenter.common.shadow;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.ss.android.appcenter.common.shadow.h */
public class C28154h {
    /* renamed from: a */
    public static TypedValue m103112a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m103113a(Context context, int i, boolean z) {
        TypedValue a = m103112a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        if (a.data != 0) {
            return true;
        }
        return false;
    }
}
