package com.google.android.libraries.places.internal;

import com.android.volley.C1936j;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzaa implements C1936j.AbstractC1938b {
    private final zzx zza;
    private final Class zzb;
    private final TaskCompletionSource zzc;

    zzaa(zzx zzx, Class cls, TaskCompletionSource taskCompletionSource) {
        this.zza = zzx;
        this.zzb = cls;
        this.zzc = taskCompletionSource;
    }

    @Override // com.android.volley.C1936j.AbstractC1938b
    public final void onResponse(Object obj) {
        this.zza.zza(this.zzb, this.zzc, (JSONObject) obj);
    }
}
