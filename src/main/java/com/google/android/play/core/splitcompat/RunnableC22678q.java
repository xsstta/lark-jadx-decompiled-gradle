package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.q */
public final class RunnableC22678q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Set f56105a;

    /* renamed from: b */
    final /* synthetic */ C22662a f56106b;

    RunnableC22678q(C22662a aVar, Set set) {
        this.f56106b = aVar;
        this.f56105a = set;
    }

    public final void run() {
        try {
            for (String str : this.f56105a) {
                this.f56106b.f56077b.mo78994f(str);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
