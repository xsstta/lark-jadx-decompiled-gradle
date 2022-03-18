package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.C22076a;
import java.util.concurrent.TimeUnit;

public final class ap {

    /* renamed from: a */
    private static final long f56420a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f56421b = new Object();

    /* renamed from: c */
    private static C22076a f56422c;

    /* renamed from: a */
    static boolean m82925a(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: a */
    private static void m82923a(Context context) {
        if (f56422c == null) {
            C22076a aVar = new C22076a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f56422c = aVar;
            aVar.mo74992a(true);
        }
    }

    /* renamed from: b */
    public static void m82926b(Intent intent) {
        synchronized (f56421b) {
            if (f56422c != null && m82925a(intent)) {
                m82924a(intent, false);
                f56422c.mo74990a();
            }
        }
    }

    /* renamed from: a */
    private static void m82924a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* renamed from: a */
    public static ComponentName m82922a(Context context, Intent intent) {
        synchronized (f56421b) {
            m82923a(context);
            boolean a = m82925a(intent);
            m82924a(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!a) {
                f56422c.mo74991a(f56420a);
            }
            return startService;
        }
    }
}
