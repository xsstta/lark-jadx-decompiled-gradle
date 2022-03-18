package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.o */
public final class C22717o extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ List f56223a;

    /* renamed from: b */
    final /* synthetic */ C22741m f56224b;

    /* renamed from: c */
    final /* synthetic */ C22721s f56225c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22717o(C22721s sVar, C22741m mVar, List list, C22741m mVar2) {
        super(mVar);
        this.f56225c = sVar;
        this.f56223a = list;
        this.f56224b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            this.f56225c.f56236a.mo78860b().mo78895e(this.f56225c.f56237d, C22721s.m82651b((Collection) this.f56223a), C22721s.m82650b(), new BinderC22702at(this.f56225c, this.f56224b));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "deferredLanguageUninstall(%s)", this.f56223a);
            this.f56224b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
