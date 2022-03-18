package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.c */
public final /* synthetic */ class CallableC22825c implements Callable {

    /* renamed from: a */
    private final Context f56439a;

    /* renamed from: b */
    private final Intent f56440b;

    CallableC22825c(Context context, Intent intent) {
        this.f56439a = context;
        this.f56440b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(am.m82890a().mo79324b(this.f56439a, this.f56440b));
    }
}
