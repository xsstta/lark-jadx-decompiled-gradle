package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.tasks.C22741m;
import java.util.List;

class ay<T> extends bq {

    /* renamed from: a */
    final C22741m<T> f56173a;

    /* renamed from: b */
    final /* synthetic */ C22721s f56174b;

    ay(C22721s sVar, C22741m<T> mVar) {
        this.f56174b = sVar;
        this.f56173a = mVar;
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: a */
    public final void mo78897a() throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: a */
    public final void mo78898a(int i) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: a */
    public void mo78899a(int i, Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onCancelInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: a */
    public void mo78900a(Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onDeferredInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: a */
    public void mo78901a(List<Bundle> list) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: b */
    public final void mo78902b() throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: b */
    public void mo78903b(int i, Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: b */
    public void mo78904b(Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: c */
    public void mo78905c(int i, Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: c */
    public void mo78906c(Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: d */
    public void mo78907d(Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        C22721s.f56234b.mo78874c("onDeferredUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.br
    /* renamed from: e */
    public final void mo78908e(Bundle bundle) throws RemoteException {
        this.f56174b.f56236a.mo78858a();
        int i = bundle.getInt("error_code");
        C22721s.f56234b.mo78873b("onError(%d)", Integer.valueOf(i));
        this.f56173a.mo79091b(new SplitInstallException(i));
    }
}
