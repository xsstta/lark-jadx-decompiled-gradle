package com.ss.android.appcenter.common.shadow;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.core.graphics.C0768a;

/* renamed from: com.ss.android.appcenter.common.shadow.i */
public class C28155i {
    /* renamed from: a */
    public static int m103114a(int i, int i2) {
        return C0768a.m3706a(i2, i);
    }

    /* renamed from: a */
    public static int m103116a(Context context, int i, int i2) {
        TypedValue a = C28154h.m103112a(context, i);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m103115a(int i, int i2, float f) {
        return m103114a(i, C0768a.m3716c(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }
}
