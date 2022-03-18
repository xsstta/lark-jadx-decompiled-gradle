package com.tt.miniapp.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;

/* renamed from: com.tt.miniapp.util.ac */
public class C67024ac {
    /* renamed from: a */
    public static int m261230a(int i, int i2) {
        if (i2 > 0) {
            return (int) (((((float) i) * 100.0f) / ((float) i2)) + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public static Activity m261231a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m261231a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: a */
    public static Activity m261232a(View view) {
        if (view == null) {
            return null;
        }
        Activity a = m261231a(view.getContext());
        if (a != null) {
            return a;
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        if (findViewById != null) {
            a = m261231a(findViewById.getContext());
        }
        if (a != null) {
            return a;
        }
        return m261231a(rootView.getContext());
    }

    /* renamed from: a */
    public static String m261233a(int i) {
        StringBuilder sb = new StringBuilder();
        long j = (long) (i / CalendarSearchResultRv.f82652c);
        long j2 = (long) (((i % 3600000) % CalendarSearchResultRv.f82652c) / 1000);
        if (j >= 10) {
            sb.append(j);
        } else if (j > 0) {
            sb.append(0);
            sb.append(j);
        } else {
            sb.append(0);
            sb.append(0);
        }
        sb.append(":");
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append(0);
            sb.append(0);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m261235b(int i, int i2) {
        return m261233a((i * i2) / 100);
    }

    /* renamed from: a */
    public static void m261234a(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setSystemUiVisibility(0);
            } else if (Build.VERSION.SDK_INT >= 19) {
                view.setSystemUiVisibility(3846);
            } else if (Build.VERSION.SDK_INT >= 16) {
                view.setSystemUiVisibility(5);
            } else {
                view.setSystemUiVisibility(1);
            }
        }
    }
}
