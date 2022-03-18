package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.heartbeatinfo.c */
public class C22795c {

    /* renamed from: a */
    private static C22795c f56344a;

    /* renamed from: b */
    private final SharedPreferences f56345b;

    private C22795c(Context context) {
        this.f56345b = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo79225a(long j) {
        return mo79226a("fire-global", j);
    }

    /* renamed from: a */
    static synchronized C22795c m82812a(Context context) {
        C22795c cVar;
        synchronized (C22795c.class) {
            if (f56344a == null) {
                f56344a = new C22795c(context);
            }
            cVar = f56344a;
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo79226a(String str, long j) {
        if (!this.f56345b.contains(str)) {
            this.f56345b.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f56345b.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f56345b.edit().putLong(str, j).apply();
            return true;
        }
    }
}
