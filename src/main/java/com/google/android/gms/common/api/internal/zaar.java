package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

final class zaar extends zac {
    private final WeakReference<C21690y> zagk;

    zaar(C21690y yVar) {
        this.zagk = new WeakReference<>(yVar);
    }

    @Override // com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zac
    public final void zab(zaj zaj) {
        C21690y yVar = this.zagk.get();
        if (yVar != null) {
            yVar.f52887a.mo73366a(new C21650af(this, yVar, yVar, zaj));
        }
    }
}
