package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

final class zzat extends zzv {
    private final C21668f<C21947c> zzda;

    zzat(C21668f<C21947c> fVar) {
        this.zzda = fVar;
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        this.zzda.mo73480a(new C21918f(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.zzu
    public final void onLocationResult(LocationResult locationResult) {
        this.zzda.mo73480a(new C21917e(this, locationResult));
    }

    public final synchronized void release() {
        this.zzda.mo73479a();
    }
}
