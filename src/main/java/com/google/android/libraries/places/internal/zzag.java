package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import com.android.volley.C1936j;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zzag implements C1936j.AbstractC1938b {
    private final zzan zza;
    private final TaskCompletionSource zzb;

    zzag(zzan zzan, TaskCompletionSource taskCompletionSource) {
        this.zza = zzan;
        this.zzb = taskCompletionSource;
    }

    @Override // com.android.volley.C1936j.AbstractC1938b
    public final void onResponse(Object obj) {
        zzan zzan = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        try {
            zzan.zza((Bitmap) obj);
            taskCompletionSource.trySetResult(zzan.zza());
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
