package com.ss.android.lark.eetroublebase.p1826a;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.eetroublebase.a.c */
public class C36966c {

    /* renamed from: a */
    private static Handler f95039a;

    /* renamed from: a */
    public static HandlerThread m145947a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static synchronized Handler m145946a() {
        Handler handler;
        synchronized (C36966c.class) {
            if (f95039a == null) {
                HandlerThread a = m145947a("EETroubleKiller");
                a.start();
                f95039a = new Handler(a.getLooper());
            }
            handler = f95039a;
        }
        return handler;
    }

    /* renamed from: a */
    public static void m145950a(Runnable runnable) {
        m145946a().post(runnable);
    }

    /* renamed from: a */
    public static String m145948a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return canonicalName;
        }
        String[] split = canonicalName.split("\\.");
        if (split.length <= 1) {
            return canonicalName;
        }
        StringBuilder sb = new StringBuilder(32);
        for (int i = 0; i < split.length - 1; i++) {
            sb.append(split[i].substring(0, 1));
            sb.append(".");
        }
        sb.append(split[split.length - 1]);
        return sb.toString();
    }

    /* renamed from: a */
    public static List<View> m145949a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m145951a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16 && ContextCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }
}
