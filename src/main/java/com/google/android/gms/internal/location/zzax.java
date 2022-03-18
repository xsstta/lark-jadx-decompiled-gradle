package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.location.AbstractC21948d;
import com.google.android.gms.location.zzy;

final class zzax extends zzy {
    private final C21668f<AbstractC21948d> zzda;

    zzax(C21668f<AbstractC21948d> fVar) {
        this.zzda = fVar;
    }

    @Override // com.google.android.gms.location.zzx
    public final synchronized void onLocationChanged(Location location) {
        this.zzda.mo73480a(new C21919g(this, location));
    }

    public final synchronized void release() {
        this.zzda.mo73479a();
    }
}
