package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzby implements Continuation {
    private final zzbv zza;

    zzby(zzbv zzbv) {
        this.zza = zzbv;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return zzbo.zza((zzbl) task.getResult());
    }
}
