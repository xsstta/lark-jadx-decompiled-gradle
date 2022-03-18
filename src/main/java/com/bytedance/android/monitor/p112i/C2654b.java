package com.bytedance.android.monitor.p112i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.bytedance.android.monitor.i.b */
public class C2654b {
    /* renamed from: a */
    public static Activity m11158a(View view) {
        return m11157a(view.getContext());
    }

    /* renamed from: a */
    public static Activity m11157a(Context context) {
        while (context instanceof ContextWrapper) {
            try {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } catch (Exception e) {
                C2655c.m11159a(e);
                return null;
            }
        }
        return null;
    }
}
