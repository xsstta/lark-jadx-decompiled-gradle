package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.assetpacks.l */
final class C22601l extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ int f55945a;

    /* renamed from: b */
    final /* synthetic */ String f55946b;

    /* renamed from: c */
    final /* synthetic */ String f55947c;

    /* renamed from: d */
    final /* synthetic */ int f55948d;

    /* renamed from: e */
    final /* synthetic */ C22741m f55949e;

    /* renamed from: f */
    final /* synthetic */ C22604n f55950f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22601l(C22604n nVar, C22741m mVar, int i, String str, String str2, int i2, C22741m mVar2) {
        super(mVar);
        this.f55950f = nVar;
        this.f55945a = i;
        this.f55946b = str;
        this.f55947c = str2;
        this.f55948d = i2;
        this.f55949e = mVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55950f.f55959e.mo78860b()).mo78958d(this.f55950f.f55957c, C22604n.m82164c(this.f55945a, this.f55946b, this.f55947c, this.f55948d), C22604n.m82168e(), new am(this.f55950f, this.f55949e));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78873b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f55946b, this.f55947c, Integer.valueOf(this.f55948d), Integer.valueOf(this.f55945a));
            this.f55949e.mo79091b((Exception) new RuntimeException(e));
        }
    }
}
