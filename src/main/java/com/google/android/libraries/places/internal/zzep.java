package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzep implements Continuation {
    private final zzeq zza;

    zzep(zzeq zzeq) {
        this.zza = zzeq;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return zzen.zza(this.zza, task);
    }
}
