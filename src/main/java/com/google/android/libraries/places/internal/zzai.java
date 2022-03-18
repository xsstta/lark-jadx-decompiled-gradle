package com.google.android.libraries.places.internal;

import com.android.volley.toolbox.C1970l;
import com.google.android.gms.tasks.AbstractC22094f;

final /* synthetic */ class zzai implements AbstractC22094f {
    private final C1970l zza;

    private zzai(C1970l lVar) {
        this.zza = lVar;
    }

    static AbstractC22094f zza(C1970l lVar) {
        return new zzai(lVar);
    }

    @Override // com.google.android.gms.tasks.AbstractC22094f
    public final void onCanceled() {
        this.zza.cancel();
    }
}
