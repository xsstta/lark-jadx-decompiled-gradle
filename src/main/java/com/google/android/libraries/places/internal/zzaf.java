package com.google.android.libraries.places.internal;

import com.android.volley.C1936j;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

final /* synthetic */ class zzaf implements C1936j.AbstractC1937a {
    private final TaskCompletionSource zza;

    zzaf(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.android.volley.C1936j.AbstractC1937a
    public final void onErrorResponse(VolleyError volleyError) {
        ApiException apiException;
        TaskCompletionSource taskCompletionSource = this.zza;
        try {
            if (volleyError.networkResponse != null) {
                int i = volleyError.networkResponse.f6597a;
                if (i == 400) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i == 403) {
                    apiException = new ApiException(new Status(PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                }
                taskCompletionSource.trySetException(apiException);
            }
            apiException = zzv.zza(volleyError);
            taskCompletionSource.trySetException(apiException);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
