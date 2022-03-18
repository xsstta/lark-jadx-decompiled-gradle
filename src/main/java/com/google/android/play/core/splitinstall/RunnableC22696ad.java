package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.ad */
public final /* synthetic */ class RunnableC22696ad implements Runnable {

    /* renamed from: a */
    private final ap f56157a;

    /* renamed from: b */
    private final C22741m f56158b;

    RunnableC22696ad(ap apVar, C22741m mVar) {
        this.f56157a = apVar;
        this.f56158b = mVar;
    }

    public final void run() {
        ap apVar = this.f56157a;
        C22741m mVar = this.f56158b;
        try {
            mVar.mo79090a(apVar.mo79046a());
        } catch (Exception e) {
            mVar.mo79089a(e);
        }
    }
}
