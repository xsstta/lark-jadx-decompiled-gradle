package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractC22650s;
import com.google.android.play.core.internal.AbstractRunnableC22634c;
import com.google.android.play.core.tasks.C22741m;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.j */
public final class C22599j extends AbstractRunnableC22634c {

    /* renamed from: a */
    final /* synthetic */ int f55937a;

    /* renamed from: b */
    final /* synthetic */ String f55938b;

    /* renamed from: c */
    final /* synthetic */ C22741m f55939c;

    /* renamed from: d */
    final /* synthetic */ int f55940d;

    /* renamed from: e */
    final /* synthetic */ C22604n f55941e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C22599j(C22604n nVar, C22741m mVar, int i, String str, C22741m mVar2, int i2) {
        super(mVar);
        this.f55941e = nVar;
        this.f55937a = i;
        this.f55938b = str;
        this.f55939c = mVar2;
        this.f55940d = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractRunnableC22634c
    /* renamed from: a */
    public final void mo78814a() {
        try {
            ((AbstractC22650s) this.f55941e.f55959e.mo78860b()).mo78953b(this.f55941e.f55957c, C22604n.m82163c(this.f55937a, this.f55938b), C22604n.m82168e(), new ap(this.f55941e, this.f55939c, this.f55937a, this.f55938b, this.f55940d));
        } catch (RemoteException e) {
            C22604n.f55955a.mo78872a(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
