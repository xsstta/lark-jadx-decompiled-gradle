package com.ss.android.vc.irtc.utils;

import android.graphics.RectF;
import android.view.View;

/* renamed from: com.ss.android.vc.irtc.utils.b */
public class C61074b {
    /* renamed from: a */
    public static void m237509a(View view) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("initExternal", (Class<?>[]) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m237513b(View view) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("release", (Class<?>[]) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static void m237515c(View view) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("reset", (Class<?>[]) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static RectF m237516d(View view) {
        if (view != null) {
            try {
                return (RectF) Reflect.m237492a(view).mo211285a("getOrgRect", (Class<?>[]) null, new Object[0]).mo211286a();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m237510a(View view, float f) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("setCornerRadius", new Class[]{Float.TYPE}, Float.valueOf(f));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m237514b(View view, float f) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("setMaxScale", new Class[]{Float.TYPE}, Float.valueOf(f));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m237511a(View view, int i) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("setBgColor", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m237512a(View view, long j) {
        if (view != null) {
            try {
                Reflect.m237492a(view).mo211285a("setDelayLayout", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static RectF m237508a(View view, float f, float f2, boolean z) {
        if (view == null) {
            return null;
        }
        try {
            return (RectF) Reflect.m237492a(view).mo211285a("setTranslate", new Class[]{Float.TYPE, Float.TYPE, Boolean.TYPE}, Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z)).mo211286a();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static RectF m237507a(View view, float f, float f2, float f3, boolean z) {
        if (view == null) {
            return null;
        }
        try {
            return (RectF) Reflect.m237492a(view).mo211285a("setScale", new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Boolean.valueOf(z)).mo211286a();
        } catch (Exception unused) {
            return null;
        }
    }
}
