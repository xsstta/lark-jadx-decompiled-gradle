package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.m */
public final class C22602m extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ C22741m f55951a;

    /* renamed from: b */
    final /* synthetic */ C22604n f55952b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22602m(C22604n nVar, C22741m mVar, C22741m mVar2) {
        super(mVar);
        this.f55952b = nVar;
        this.f55951a = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55952b.f55960f.mo78860b()).mo78954b(this.f55952b.f55957c, C22604n.m82168e(), new ao(this.f55952b, this.f55951a));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78872a(e, "keepAlive", new Object[0]);
        }
    }
}
