package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.tasks.C22741m;

/* renamed from: com.google.android.play.core.appupdate.i */
final class BinderC22573i extends BinderC22572h<Void> {
    BinderC22573i(C22569c cVar, C22741m<Void> mVar) {
        super(cVar, new C22630b("OnCompleteUpdateCallback"), mVar);
    }

    @Override // com.google.android.play.core.internal.AbstractC22647p, com.google.android.play.core.appupdate.BinderC22572h
    /* renamed from: b */
    public final void mo78681b(Bundle bundle) throws RemoteException {
        super.mo78681b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f55637b.mo79091b((Exception) new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f55637b.mo79092b((Object) null);
        }
    }
}
