package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzbz implements Continuation {
    private final zzbv zza;
    private final long zzb;

    zzbz(zzbv zzbv, long j) {
        this.zza = zzbv;
        this.zzb = j;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zzc(this.zzb, task);
    }
}
