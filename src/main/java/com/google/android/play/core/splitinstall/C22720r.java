package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.r */
public final class C22720r extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ int f56231a;

    /* renamed from: b */
    final /* synthetic */ C22741m f56232b;

    /* renamed from: c */
    final /* synthetic */ C22721s f56233c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22720r(C22721s sVar, C22741m mVar, int i, C22741m mVar2) {
        super(mVar);
        this.f56233c = sVar;
        this.f56231a = i;
        this.f56232b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56233c.f56236a.mo78860b().mo78888a(this.f56233c.f56237d, this.f56231a, C22721s.m82650b(), new aq(this.f56233c, this.f56232b));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "cancelInstall(%d)", Integer.valueOf(this.f56231a));
            this.f56232b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
