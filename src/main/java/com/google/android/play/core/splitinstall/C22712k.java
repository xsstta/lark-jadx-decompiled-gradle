package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.ArrayList;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.k */
public final class C22712k extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ Collection f56208a;

    /* renamed from: b */
    final /* synthetic */ Collection f56209b;

    /* renamed from: c */
    final /* synthetic */ C22741m f56210c;

    /* renamed from: d */
    final /* synthetic */ C22721s f56211d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22712k(C22721s sVar, C22741m mVar, Collection collection, Collection collection2, C22741m mVar2) {
        super(mVar);
        this.f56211d = sVar;
        this.f56208a = collection;
        this.f56209b = collection2;
        this.f56210c = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        ArrayList a = C22721s.m82649a(this.f56208a);
        a.addAll(C22721s.m82651b(this.f56209b));
        try {
            this.f56211d.f56236a.mo78860b().mo78891a(this.f56211d.f56237d, a, C22721s.m82650b(), new ax(this.f56211d, this.f56210c));
        } catch (RemoteException e) {
            C22721s.f56234b.mo78872a(e, "startInstall(%s,%s)", this.f56208a, this.f56209b);
            this.f56210c.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
