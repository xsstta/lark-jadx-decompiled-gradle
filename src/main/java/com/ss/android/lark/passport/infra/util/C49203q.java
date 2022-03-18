package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.passport.infra.util.q */
public class C49203q {
    /* renamed from: a */
    public static void m193973a(Context context) {
        Activity a = ViewUtils.m224141a(context);
        if (a != null) {
            m193972a(a);
        }
    }

    /* renamed from: b */
    public static void m193976b(Context context) {
        Activity a = ViewUtils.m224141a(context);
        if (a != null) {
            ((InputMethodManager) a.getSystemService("input_method")).toggleSoftInput(2, 0);
        }
    }

    /* renamed from: c */
    public static boolean m193977c(Context context) {
        Activity a = ViewUtils.m224141a(context);
        if (a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC49204a.C49205a.f123502a.mo171707a(a);
        }
        return AbstractC49204a.C49206b.f123503b.mo171707a(a);
    }

    /* renamed from: com.ss.android.lark.passport.infra.util.q$a */
    private interface AbstractC49204a {

        /* renamed from: com.ss.android.lark.passport.infra.util.q$a$a */
        public static class C49205a extends C49206b {

            /* renamed from: a */
            public static final C49205a f123502a = new C49205a();

            @Override // com.ss.android.lark.passport.infra.util.C49203q.AbstractC49204a.C49206b
            /* renamed from: a */
            public boolean mo171707a(Activity activity) {
                if (!activity.getWindow().getDecorView().isAttachedToWindow()) {
                    return super.mo171707a(activity);
                }
                C0883ab y = ViewCompat.m4110y(activity.getWindow().getDecorView());
                if (y == null) {
                    return super.mo171707a(activity);
                }
                if (y.mo4647d() > y.mo4652h()) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.ss.android.lark.passport.infra.util.q$a$b */
        public static class C49206b implements AbstractC49204a {

            /* renamed from: b */
            public static final C49206b f123503b = new C49206b();

            /* renamed from: a */
            public boolean mo171707a(Activity activity) {
                int height = activity.getWindow().getDecorView().getHeight();
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                if (height - rect.bottom >= 400) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m193972a(Activity activity) {
        View findViewById;
        if (activity != null && (findViewById = activity.findViewById(16908290)) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: a */
    public static void m193975a(View view) {
        InputMethodManager inputMethodManager;
        if (view != null && (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* renamed from: a */
    public static void m193974a(Context context, View view) {
        Activity a = ViewUtils.m224141a(context);
        if (a != null && view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) a.getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
