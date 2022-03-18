package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;

final /* synthetic */ class zzat implements Continuation {
    private final zzaq zza;
    private final FetchPlaceRequest zzb;
    private final zzg zzc;

    zzat(zzaq zzaq, FetchPlaceRequest fetchPlaceRequest, zzg zzg) {
        this.zza = zzaq;
        this.zzb = fetchPlaceRequest;
        this.zzc = zzg;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zza(this.zzb, this.zzc, task);
    }
}
