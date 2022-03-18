package com.google.firebase.iid;

import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.iid.t */
final /* synthetic */ class CallableC22842t implements Callable {

    /* renamed from: a */
    private final Intent f56472a;

    CallableC22842t(Intent intent) {
        this.f56472a = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(C22841s.m82963c(this.f56472a));
    }
}
