package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.AbstractC22722t;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.ad */
final class RunnableC22623ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f56017a;

    /* renamed from: b */
    final /* synthetic */ AbstractC22722t f56018b;

    /* renamed from: c */
    final /* synthetic */ C22624ae f56019c;

    RunnableC22623ad(C22624ae aeVar, List list, AbstractC22722t tVar) {
        this.f56019c = aeVar;
        this.f56017a = list;
        this.f56018b = tVar;
    }

    public final void run() {
        try {
            if (!this.f56019c.f56022c.mo78865a(this.f56017a)) {
                C22624ae.m82249a(this.f56019c, this.f56017a, this.f56018b);
            } else {
                C22624ae.m82248a(this.f56019c, this.f56018b);
            }
        } catch (Exception e) {
            Log.e("SplitCompat", "Error checking verified files.", e);
            this.f56018b.mo79040a(-11);
        }
    }
}
