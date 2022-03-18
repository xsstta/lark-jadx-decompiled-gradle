package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.n */
public final class C22716n extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ List f56220a;

    /* renamed from: b */
    final /* synthetic */ C22741m f56221b;

    /* renamed from: c */
    final /* synthetic */ C22721s f56222c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22716n(C22721s sVar, C22741m mVar, List list, C22741m mVar2) {
        super(mVar);
        this.f56222c = sVar;
        this.f56220a = list;
        this.f56221b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56222c.f56236a.mo78860b().mo78894d(this.f56222c.f56237d, C22721s.m82651b((Collection) this.f56220a), C22721s.m82650b(), new as(this.f56222c, this.f56221b));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "deferredLanguageInstall(%s)", this.f56220a);
            this.f56221b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
