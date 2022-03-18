package com.google.android.libraries.places.internal;

import com.android.volley.toolbox.C1971m;
import com.google.android.gms.tasks.AbstractC22094f;

final /* synthetic */ class zzac implements AbstractC22094f {
    private final C1971m zza;

    private zzac(C1971m mVar) {
        this.zza = mVar;
    }

    static AbstractC22094f zza(C1971m mVar) {
        return new zzac(mVar);
    }

    @Override // com.google.android.gms.tasks.AbstractC22094f
    public final void onCanceled() {
        this.zza.cancel();
    }
}
