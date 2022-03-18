package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;

final /* synthetic */ class zzeu implements OnCompleteListener {
    private final zzes zza;
    private final AutocompletePrediction zzb;

    zzeu(zzes zzes, AutocompletePrediction autocompletePrediction) {
        this.zza = zzes;
        this.zzb = autocompletePrediction;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.zza(this.zzb, task);
    }
}
