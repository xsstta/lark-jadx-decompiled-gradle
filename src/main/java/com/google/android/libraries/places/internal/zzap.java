package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;

final /* synthetic */ class zzap implements Continuation {
    private final zzaq zza;
    private final FindAutocompletePredictionsRequest zzb;
    private final zzg zzc;

    zzap(zzaq zzaq, FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzg zzg) {
        this.zza = zzaq;
        this.zzb = findAutocompletePredictionsRequest;
        this.zzc = zzg;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zza(this.zzb, this.zzc, task);
    }
}
