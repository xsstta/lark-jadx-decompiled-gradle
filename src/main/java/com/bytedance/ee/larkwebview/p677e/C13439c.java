package com.bytedance.ee.larkwebview.p677e;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.bytedance.ee.larkwebview.e.c */
public class C13439c {

    /* renamed from: a */
    private Handler f35425a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkwebview.e.c$a */
    public static class C13441a {

        /* renamed from: a */
        static final C13439c f35426a = new C13439c();
    }

    /* renamed from: a */
    public static C13439c m54612a() {
        return C13441a.f35426a;
    }

    private C13439c() {
        this.f35425a = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    public static boolean m54613b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo49846a(Runnable runnable) {
        this.f35425a.post(runnable);
    }
}
