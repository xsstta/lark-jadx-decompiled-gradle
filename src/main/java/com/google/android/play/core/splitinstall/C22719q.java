package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.q */
public final class C22719q extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ C22741m f56229a;

    /* renamed from: b */
    final /* synthetic */ C22721s f56230b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22719q(C22721s sVar, C22741m mVar, C22741m mVar2) {
        super(mVar);
        this.f56230b = sVar;
        this.f56229a = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56230b.f56236a.mo78860b().mo78890a(this.f56230b.f56237d, new aw(this.f56230b, this.f56229a));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "getSessionStates", new Object[0]);
            this.f56229a.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
