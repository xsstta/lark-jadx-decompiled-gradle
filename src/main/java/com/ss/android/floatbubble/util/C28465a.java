package com.ss.android.floatbubble.util;

import android.content.Context;
import android.view.WindowManager;
import com.ss.android.floatbubble.util.p1319b.C28468a;

/* renamed from: com.ss.android.floatbubble.util.a */
public class C28465a {
    /* renamed from: a */
    public static int m104306a(Context context, WindowManager windowManager) {
        if (context == null || windowManager == null) {
            return 0;
        }
        if (C28468a.m104319a(context)) {
            return C28468a.m104321b(windowManager);
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m104307b(Context context, WindowManager windowManager) {
        if (context == null || windowManager == null) {
            return 0;
        }
        if (C28468a.m104319a(context)) {
            return (C28468a.m104316a(windowManager) - C28468a.m104320b(context)) - C28468a.m104322c(context);
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }
}
