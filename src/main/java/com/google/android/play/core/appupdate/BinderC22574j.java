package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.appupdate.j */
final class BinderC22574j extends BinderC22572h<AbstractC22567a> {

    /* renamed from: d */
    final /* synthetic */ C22569c f55639d;

    /* renamed from: e */
    private final String f55640e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BinderC22574j(C22569c cVar, C22741m<AbstractC22567a> mVar, String str) {
        super(cVar, new C22630b("OnRequestInstallCallback"), mVar);
        this.f55639d = cVar;
        this.f55640e = str;
    }

    @Override // com.google.android.play.core.internal.AbstractC22647p, com.google.android.play.core.appupdate.BinderC22572h
    /* renamed from: a */
    public final void mo78680a(Bundle bundle) throws RemoteException {
        super.mo78680a(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f55637b.mo79091b((Exception) new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f55637b.mo79092b(C22569c.m81900a(this.f55639d, bundle, this.f55640e));
        }
    }
}
