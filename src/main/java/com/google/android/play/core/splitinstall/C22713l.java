package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.l */
public final class C22713l extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ List f56212a;

    /* renamed from: b */
    final /* synthetic */ C22741m f56213b;

    /* renamed from: c */
    final /* synthetic */ C22721s f56214c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22713l(C22721s sVar, C22741m mVar, List list, C22741m mVar2) {
        super(mVar);
        this.f56214c = sVar;
        this.f56212a = list;
        this.f56213b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56214c.f56236a.mo78860b().mo78892b(this.f56214c.f56237d, C22721s.m82649a((Collection) this.f56212a), C22721s.m82650b(), new au(this.f56214c, this.f56213b));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "deferredUninstall(%s)", this.f56212a);
            this.f56213b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
