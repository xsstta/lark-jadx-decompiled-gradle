package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzcb implements Continuation {
    private final zzbv zza;
    private final long zzb;

    zzcb(zzbv zzbv, long j) {
        this.zza = zzbv;
        this.zzb = j;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zzb(this.zzb, task);
    }
}
