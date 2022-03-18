package com.google.android.play.core.splitcompat;

import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.p */
public final class RunnableC22677p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C22662a f56104a;

    RunnableC22677p(C22662a aVar) {
        this.f56104a = aVar;
    }

    public final void run() {
        try {
            this.f56104a.f56077b.mo78984a();
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
