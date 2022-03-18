package com.ss.android.vc.meeting.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.receiver.VcScreenMonitor;
import com.ss.android.vc.statistics.event.bu;

/* renamed from: com.ss.android.vc.meeting.utils.r */
public class C63532r {

    /* renamed from: a */
    public static volatile Intent f160526a;

    /* renamed from: b */
    public static volatile C61303k f160527b;

    /* renamed from: c */
    private static Handler f160528c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static Runnable f160529d = new Runnable() {
        /* class com.ss.android.vc.meeting.utils.C63532r.RunnableC635331 */

        public void run() {
            if (C63532r.f160526a != null && C63532r.f160527b != null) {
                C60700b.m235851b("WakeUpUtils", "[pushVCRingNotification]", C63532r.f160527b.mo212055d());
                VideoChatModuleDependency.getNotificationDependency().pushRingNotification(C63532r.f160527b);
                bu.m250216a(C63532r.f160527b.mo212056e());
            }
        }
    };

    /* renamed from: b */
    public static Intent m248974b() {
        return f160526a;
    }

    /* renamed from: c */
    public static C61303k m248976c() {
        return f160527b;
    }

    /* renamed from: a */
    public static void m248971a() {
        C60735ab.m236001a($$Lambda$r$AK9FkL2_9B0_sEp6XfC2tM0lRao.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m248977d() {
        String str;
        if (f160527b != null) {
            str = f160527b.mo212055d();
        } else {
            str = null;
        }
        C60700b.m235851b("WakeUpUtils", "[clearIntent]", str);
        f160528c.removeCallbacks(f160529d);
        VideoChatModuleDependency.getNotificationDependency().cancelRingNotification(f160527b);
        f160526a = null;
        f160527b = null;
    }

    /* renamed from: b */
    public static boolean m248975b(Context context) {
        return VcScreenMonitor.m246180b(context);
    }

    /* renamed from: a */
    public static void m248972a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            powerManager.newWakeLock(268435466, "lark://vc").acquire(30000);
        }
    }

    /* renamed from: a */
    public static void m248973a(Intent intent, boolean z, C61303k kVar) {
        if (f160526a == null) {
            f160526a = intent;
            f160527b = kVar;
            if (!z && kVar != null && kVar.mo212063l()) {
                C60700b.m235851b("WakeUpUtils", "[setIntent]", kVar.mo212055d());
                f160528c.removeCallbacks(f160529d);
                f160528c.postDelayed(f160529d, 1000);
            }
        }
    }
}
