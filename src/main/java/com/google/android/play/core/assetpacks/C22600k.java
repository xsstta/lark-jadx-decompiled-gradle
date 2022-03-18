package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.assetpacks.k */
final class C22600k extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ int f55942a;

    /* renamed from: b */
    final /* synthetic */ C22741m f55943b;

    /* renamed from: c */
    final /* synthetic */ C22604n f55944c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22600k(C22604n nVar, C22741m mVar, int i, C22741m mVar2) {
        super(mVar);
        this.f55944c = nVar;
        this.f55942a = i;
        this.f55943b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55944c.f55959e.mo78860b()).mo78956c(this.f55944c.f55957c, C22604n.m82162c(this.f55942a), C22604n.m82168e(), new al(this.f55944c, this.f55943b, (int[]) null));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78872a(e, "notifySessionFailed", new Object[0]);
        }
    }
}
