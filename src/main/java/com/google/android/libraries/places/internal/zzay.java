package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

final /* synthetic */ class zzay implements Continuation {
    private final zzaq zza;
    private final FindCurrentPlaceRequest zzb;
    private final long zzc;
    private final zzg zzd;

    zzay(zzaq zzaq, FindCurrentPlaceRequest findCurrentPlaceRequest, long j, zzg zzg) {
        this.zza = zzaq;
        this.zzb = findCurrentPlaceRequest;
        this.zzc = j;
        this.zzd = zzg;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zza(this.zzb, this.zzc, this.zzd, task);
    }
}
