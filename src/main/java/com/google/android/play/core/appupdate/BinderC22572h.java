package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC22646o;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.appupdate.h */
class BinderC22572h<T> extends AbstractBinderC22646o {

    /* renamed from: a */
    final C22630b f55636a;

    /* renamed from: b */
    final C22741m<T> f55637b;

    /* renamed from: c */
    final /* synthetic */ C22569c f55638c;

    BinderC22572h(C22569c cVar, C22630b bVar, C22741m<T> mVar) {
        this.f55638c = cVar;
        this.f55636a = bVar;
        this.f55637b = mVar;
    }

    @Override // com.google.android.play.core.internal.AbstractC22647p
    /* renamed from: a */
    public void mo78680a(Bundle bundle) throws RemoteException {
        this.f55638c.f55619a.mo78858a();
        this.f55636a.mo78874c("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.AbstractC22647p
    /* renamed from: b */
    public void mo78681b(Bundle bundle) throws RemoteException {
        this.f55638c.f55619a.mo78858a();
        this.f55636a.mo78874c("onCompleteUpdate", new Object[0]);
    }
}
