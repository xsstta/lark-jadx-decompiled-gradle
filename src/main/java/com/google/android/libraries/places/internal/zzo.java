package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final class zzo extends C21947c {
    private final /* synthetic */ TaskCompletionSource zza;

    @Override // com.google.android.gms.location.C21947c
    public final void onLocationResult(LocationResult locationResult) {
        try {
            super.onLocationResult(locationResult);
            this.zza.trySetResult(locationResult.mo74328a());
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // com.google.android.gms.location.C21947c
    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        try {
            super.onLocationAvailability(locationAvailability);
            if (!locationAvailability.mo74313a()) {
                this.zza.trySetException(new ApiException(new Status(8, "Location unavailable.")));
            }
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    zzo(zzk zzk, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
