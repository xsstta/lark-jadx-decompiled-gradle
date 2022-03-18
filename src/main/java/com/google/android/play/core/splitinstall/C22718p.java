package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.p */
public final class C22718p extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ int f56226a;

    /* renamed from: b */
    final /* synthetic */ C22741m f56227b;

    /* renamed from: c */
    final /* synthetic */ C22721s f56228c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22718p(C22721s sVar, C22741m mVar, int i, C22741m mVar2) {
        super(mVar);
        this.f56228c = sVar;
        this.f56226a = i;
        this.f56227b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56228c.f56236a.mo78860b().mo78889a(this.f56228c.f56237d, this.f56226a, new av(this.f56228c, this.f56227b));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "getSessionState(%d)", Integer.valueOf(this.f56226a));
            this.f56227b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
