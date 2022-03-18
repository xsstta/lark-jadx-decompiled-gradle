package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;

final /* synthetic */ class zzar implements Continuation {
    private final zzaq zza;
    private final FetchPhotoRequest zzb;
    private final zzg zzc;

    zzar(zzaq zzaq, FetchPhotoRequest fetchPhotoRequest, zzg zzg) {
        this.zza = zzaq;
        this.zzb = fetchPhotoRequest;
        this.zzc = zzg;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zza(this.zzb, this.zzc, task);
    }
}
