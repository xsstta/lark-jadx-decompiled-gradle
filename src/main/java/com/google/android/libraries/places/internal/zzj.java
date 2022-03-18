package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzj implements Continuation {
    private final zzk zza;
    private final AbstractC22083a zzb;

    zzj(zzk zzk, AbstractC22083a aVar) {
        this.zza = zzk;
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zza(this.zzb, task);
    }
}
