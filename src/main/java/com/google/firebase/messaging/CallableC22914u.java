package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.C22809ab;
import com.google.firebase.iid.C22839q;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.u */
public final /* synthetic */ class CallableC22914u implements Callable {

    /* renamed from: a */
    private final Context f56640a;

    /* renamed from: b */
    private final ScheduledExecutorService f56641b;

    /* renamed from: c */
    private final FirebaseInstanceId f56642c;

    /* renamed from: d */
    private final C22809ab f56643d;

    /* renamed from: e */
    private final C22839q f56644e;

    CallableC22914u(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C22809ab abVar, C22839q qVar) {
        this.f56640a = context;
        this.f56641b = scheduledExecutorService;
        this.f56642c = firebaseInstanceId;
        this.f56643d = abVar;
        this.f56644e = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C22913t.m83263a(this.f56640a, this.f56641b, this.f56642c, this.f56643d, this.f56644e);
    }
}
