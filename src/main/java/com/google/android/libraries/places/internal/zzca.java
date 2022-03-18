package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;

final /* synthetic */ class zzca implements Continuation {
    private final zzbv zza;

    zzca(zzbv zzbv) {
        this.zza = zzbv;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return FetchPhotoResponse.newInstance(((zzbb) task.getResult()).zza);
    }
}
