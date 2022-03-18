package com.google.android.material.p982c;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0768a;
import com.google.android.material.p988i.C22312b;

/* renamed from: com.google.android.material.c.a */
public class C22197a {
    /* renamed from: a */
    public static int m80098a(int i, int i2) {
        return C0768a.m3706a(i2, i);
    }

    /* renamed from: a */
    public static int m80102a(View view, int i) {
        return C22312b.m80790a(view, i);
    }

    /* renamed from: a */
    public static int m80100a(Context context, int i, int i2) {
        TypedValue a = C22312b.m80791a(context, i);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m80099a(int i, int i2, float f) {
        return m80098a(i, C0768a.m3716c(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: a */
    public static int m80101a(Context context, int i, String str) {
        return C22312b.m80789a(context, i, str);
    }

    /* renamed from: a */
    public static int m80103a(View view, int i, int i2) {
        return m80100a(view.getContext(), i, i2);
    }

    /* renamed from: a */
    public static int m80104a(View view, int i, int i2, float f) {
        return m80099a(m80102a(view, i), m80102a(view, i2), f);
    }
}
