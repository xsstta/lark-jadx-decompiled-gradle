package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.s */
public final class C22912s {

    /* renamed from: a */
    private static WeakReference<C22912s> f56627a;

    /* renamed from: b */
    private final SharedPreferences f56628b;

    /* renamed from: c */
    private C22909p f56629c;

    /* renamed from: d */
    private final Executor f56630d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C22911r mo79537a() {
        return C22911r.m83252a(this.f56629c.mo79529b());
    }

    /* renamed from: b */
    private final synchronized void m83258b() {
        this.f56629c = C22909p.m83243a(this.f56628b, "topic_operation_queue", ",", this.f56630d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo79538a(C22911r rVar) {
        return this.f56629c.mo79528a(rVar.mo79534c());
    }

    private C22912s(SharedPreferences sharedPreferences, Executor executor) {
        this.f56630d = executor;
        this.f56628b = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C22912s m83257a(Context context, Executor executor) {
        C22912s sVar;
        synchronized (C22912s.class) {
            sVar = null;
            WeakReference<C22912s> weakReference = f56627a;
            if (weakReference != null) {
                sVar = weakReference.get();
            }
            if (sVar == null) {
                sVar = new C22912s(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                sVar.m83258b();
                f56627a = new WeakReference<>(sVar);
            }
        }
        return sVar;
    }
}
