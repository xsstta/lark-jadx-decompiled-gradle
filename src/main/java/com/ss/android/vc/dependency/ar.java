package com.ss.android.vc.dependency;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.lang.ref.WeakReference;

public class ar {

    /* renamed from: a */
    private static Context f152401a;

    /* renamed from: b */
    private static volatile WeakReference<Activity> f152402b;

    /* renamed from: b */
    public static Application m236697b() {
        return LarkContext.getApplication();
    }

    /* renamed from: a */
    public static Context m236694a() {
        Context context = f152401a;
        if (context != null) {
            return context;
        }
        return LarkContext.getApplication();
    }

    /* renamed from: c */
    public static Context m236698c() {
        Activity activity;
        if (f152402b != null) {
            activity = f152402b.get();
            if (activity == null) {
                Log.m165383e("VcContextDeps", "activity context is null");
            }
        } else {
            activity = null;
        }
        if (activity != null) {
            return activity;
        }
        Context context = f152401a;
        if (context != null) {
            return context;
        }
        return LarkContext.getApplication();
    }

    /* renamed from: a */
    public static void m236696a(Context context) {
        f152401a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m236695a(Activity activity) {
        if (f152402b == null || f152402b.get() != activity) {
            f152402b = new WeakReference<>(activity);
        }
    }
}
