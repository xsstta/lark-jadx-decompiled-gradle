package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C22597h extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ int f55929a;

    /* renamed from: b */
    final /* synthetic */ String f55930b;

    /* renamed from: c */
    final /* synthetic */ String f55931c;

    /* renamed from: d */
    final /* synthetic */ int f55932d;

    /* renamed from: e */
    final /* synthetic */ C22741m f55933e;

    /* renamed from: f */
    final /* synthetic */ C22604n f55934f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22597h(C22604n nVar, C22741m mVar, int i, String str, String str2, int i2, C22741m mVar2) {
        super(mVar);
        this.f55934f = nVar;
        this.f55929a = i;
        this.f55930b = str;
        this.f55931c = str2;
        this.f55932d = i2;
        this.f55933e = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55934f.f55959e.mo78860b()).mo78950a(this.f55934f.f55957c, C22604n.m82164c(this.f55929a, this.f55930b, this.f55931c, this.f55932d), C22604n.m82168e(), new al(this.f55934f, this.f55933e, (char[]) null));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78872a(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
