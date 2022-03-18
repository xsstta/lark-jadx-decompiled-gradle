package com.google.android.play.core.internal;

import android.os.IBinder;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.internal.d */
public final /* synthetic */ class C22635d implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final C22622ac f56058a;

    C22635d(C22622ac acVar) {
        this.f56058a = acVar;
    }

    public final void binderDied() {
        this.f56058a.mo78861c();
    }
}
