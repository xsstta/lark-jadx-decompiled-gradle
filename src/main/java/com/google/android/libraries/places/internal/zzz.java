package com.google.android.libraries.places.internal;

import com.android.volley.C1936j;
import com.android.volley.VolleyError;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzz implements C1936j.AbstractC1937a {
    private final TaskCompletionSource zza;

    zzz(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.android.volley.C1936j.AbstractC1937a
    public final void onErrorResponse(VolleyError volleyError) {
        try {
            this.zza.trySetException(zzv.zza(volleyError));
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
