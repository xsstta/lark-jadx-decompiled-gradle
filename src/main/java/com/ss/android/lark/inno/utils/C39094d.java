package com.ss.android.lark.inno.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.videoshop.p3203i.C64174c;

/* renamed from: com.ss.android.lark.inno.utils.d */
public class C39094d {
    /* renamed from: a */
    public static void m154348a(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static Activity m154346a(Context context) {
        if (context == null) {
            return null;
        }
        if (Activity.class.isInstance(context)) {
            return (Activity) context;
        }
        if (ContextWrapper.class.isInstance(context)) {
            return m154346a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: a */
    public static void m154347a(Context context, int i) {
        try {
            C64174c.m252210a(context).setRequestedOrientation(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m154349a(ViewGroup viewGroup, View view) {
        viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }
}
