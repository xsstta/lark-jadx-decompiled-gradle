package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.g */
final class C22596g extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ Map f55926a;

    /* renamed from: b */
    final /* synthetic */ C22741m f55927b;

    /* renamed from: c */
    final /* synthetic */ C22604n f55928c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22596g(C22604n nVar, C22741m mVar, Map map, C22741m mVar2) {
        super(mVar);
        this.f55928c = nVar;
        this.f55926a = map;
        this.f55927b = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55928c.f55959e.mo78860b()).mo78951a(this.f55928c.f55957c, C22604n.m82158b(this.f55926a), new an(this.f55928c, this.f55927b));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78872a(e, "syncPacks", new Object[0]);
            this.f55927b.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
