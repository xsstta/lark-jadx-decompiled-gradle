package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.f */
final class C22595f extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ List f55923a;

    /* renamed from: b */
    final /* synthetic */ C22741m f55924b;

    /* renamed from: c */
    final /* synthetic */ C22604n f55925c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22595f(C22604n nVar, C22741m mVar, List list, C22741m mVar2) {
        super(mVar);
        this.f55925c = nVar;
        this.f55923a = list;
        this.f55924b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55925c.f55959e.mo78860b()).mo78955b(this.f55925c.f55957c, C22604n.m82152a((Collection) this.f55923a), C22604n.m82168e(), new al(this.f55925c, this.f55924b, (byte[]) null));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78872a(e, "cancelDownloads(%s)", this.f55923a);
        }
    }
}
