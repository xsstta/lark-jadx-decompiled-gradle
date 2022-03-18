package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzem implements Continuation {
    private final zzer zza;

    zzem(zzer zzer) {
        this.zza = zzer;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return zzen.zza(this.zza, task);
    }
}
