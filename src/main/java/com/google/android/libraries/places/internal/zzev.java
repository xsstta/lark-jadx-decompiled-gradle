package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final /* synthetic */ class zzev implements OnCompleteListener {
    private final zzes zza;
    private final String zzb;

    zzev(zzes zzes, String str) {
        this.zza = zzes;
        this.zzb = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.zza(this.zzb, task);
    }
}
