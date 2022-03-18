package com.bytedance.applog.collector;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.AbstractC3422h;
import com.bytedance.applog.p197a.C3373e;
import com.bytedance.applog.p201e.C3416j;
import com.bytedance.applog.util.C3469r;
import java.util.HashSet;

/* renamed from: com.bytedance.applog.collector.a */
public class C3394a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static int f10748a = 0;

    /* renamed from: b */
    private static C3416j f10749b = null;

    /* renamed from: c */
    private static C3416j f10750c = null;

    /* renamed from: d */
    private static long f10751d = 0;

    /* renamed from: e */
    private static String f10752e = null;

    /* renamed from: f */
    private static long f10753f = 0;

    /* renamed from: g */
    private static String f10754g = null;

    /* renamed from: h */
    private static int f10755h = -1;

    /* renamed from: i */
    private static Object f10756i;

    /* renamed from: j */
    private static Object f10757j;

    /* renamed from: l */
    private static boolean f10758l;

    /* renamed from: m */
    private static final HashSet<Integer> f10759m = new HashSet<>(8);

    /* renamed from: k */
    private final AbstractC3422h f10760k;

    /* renamed from: a */
    public static void m14171a(Object obj) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* renamed from: a */
    public static C3416j m14168a() {
        C3416j jVar = f10749b;
        C3416j jVar2 = f10750c;
        if (jVar2 != null) {
            return jVar2;
        }
        if (jVar != null) {
            return jVar;
        }
        return null;
    }

    public C3394a(AbstractC3422h hVar) {
        this.f10760k = hVar;
    }

    public void onActivityStarted(Activity activity) {
        f10748a++;
    }

    public void onActivityDestroyed(Activity activity) {
        f10759m.remove(Integer.valueOf(activity.hashCode()));
    }

    public void onActivityStopped(Activity activity) {
        if (f10752e != null) {
            int i = f10748a - 1;
            f10748a = i;
            if (i <= 0) {
                f10752e = null;
                f10754g = null;
                f10753f = 0;
                f10751d = 0;
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        if (f10750c != null) {
            m14171a(f10757j);
        }
        C3416j jVar = f10749b;
        if (jVar != null) {
            f10752e = jVar.f10833l;
            long currentTimeMillis = System.currentTimeMillis();
            f10751d = currentTimeMillis;
            m14169a(f10749b, currentTimeMillis);
            f10749b = null;
            if (activity != null && !activity.isChild()) {
                f10755h = -1;
                f10756i = null;
            }
        }
        AbstractC3422h hVar = this.f10760k;
        if (hVar != null) {
            hVar.mo13718a(false);
        }
    }

    public void onActivityResumed(Activity activity) {
        C3416j a = m14170a(activity.getClass().getName(), "", System.currentTimeMillis(), f10752e);
        f10749b = a;
        a.f10834m = !f10759m.remove(Integer.valueOf(activity.hashCode())) ? 1 : 0;
        if (!activity.isChild()) {
            f10755h = activity.getWindow().getDecorView().hashCode();
            f10756i = activity;
        }
        AbstractC3422h hVar = this.f10760k;
        if (hVar != null && f10758l) {
            hVar.mo13718a(true);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        f10759m.add(Integer.valueOf(activity.hashCode()));
    }

    /* renamed from: a */
    public static C3416j m14169a(C3416j jVar, long j) {
        C3416j jVar2 = (C3416j) jVar.clone();
        jVar2.mo13660a(j);
        long j2 = j - jVar.f10780b;
        if (j2 >= 0) {
            jVar2.f10831j = j2;
        } else {
            C3469r.m14667a((Throwable) null);
        }
        C3373e.m14085a(jVar2);
        return jVar2;
    }

    /* renamed from: a */
    public void mo13643a(String str, int i) {
        C3416j a = m14170a(str, "", System.currentTimeMillis(), f10752e);
        f10749b = a;
        a.f10834m = !f10759m.remove(Integer.valueOf(i)) ? 1 : 0;
        AbstractC3422h hVar = this.f10760k;
        if (hVar != null && f10758l) {
            hVar.mo13718a(true);
        }
    }

    /* renamed from: a */
    public static C3416j m14170a(String str, String str2, long j, String str3) {
        C3416j jVar = new C3416j();
        if (!TextUtils.isEmpty(str2)) {
            jVar.f10833l = str + ":" + str2;
        } else {
            jVar.f10833l = str;
        }
        jVar.mo13660a(j);
        jVar.f10831j = -1;
        if (str3 == null) {
            str3 = "";
        }
        jVar.f10832k = str3;
        C3373e.m14085a(jVar);
        return jVar;
    }
}
