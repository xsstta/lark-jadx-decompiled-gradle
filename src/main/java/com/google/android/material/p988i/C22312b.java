package com.google.android.material.p988i;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: com.google.android.material.i.b */
public class C22312b {
    /* renamed from: a */
    public static int m80790a(View view, int i) {
        return m80789a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static TypedValue m80791a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a */
    public static int m80789a(Context context, int i, String str) {
        TypedValue a = m80791a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static boolean m80792a(Context context, int i, boolean z) {
        TypedValue a = m80791a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        if (a.data != 0) {
            return true;
        }
        return false;
    }
}
