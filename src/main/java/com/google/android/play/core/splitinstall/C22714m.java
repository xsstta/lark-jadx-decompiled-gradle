package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.m */
public final class C22714m extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ List f56215a;

    /* renamed from: b */
    final /* synthetic */ C22741m f56216b;

    /* renamed from: c */
    final /* synthetic */ C22721s f56217c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22714m(C22721s sVar, C22741m mVar, List list, C22741m mVar2) {
        super(mVar);
        this.f56217c = sVar;
        this.f56215a = list;
        this.f56216b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56217c.f56236a.mo78860b().mo78893c(this.f56217c.f56237d, C22721s.m82649a((Collection) this.f56215a), C22721s.m82650b(), new ar(this.f56217c, this.f56216b));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "deferredInstall(%s)", this.f56215a);
            this.f56216b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
