package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

final /* synthetic */ class zzav implements SuccessContinuation {
    private final zzaq zza;
    private final FindCurrentPlaceRequest zzb;

    zzav(zzaq zzaq, FindCurrentPlaceRequest findCurrentPlaceRequest) {
        this.zza = zzaq;
        this.zzb = findCurrentPlaceRequest;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return this.zza.zza(this.zzb, (Location) obj);
    }
}
