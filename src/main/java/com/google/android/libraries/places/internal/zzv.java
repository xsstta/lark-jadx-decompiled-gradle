package com.google.android.libraries.places.internal;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

final class zzv {
    static ApiException zza(VolleyError volleyError) {
        int i;
        String str;
        if (volleyError instanceof NetworkError) {
            i = 7;
        } else if (volleyError instanceof TimeoutError) {
            i = 15;
        } else if ((volleyError instanceof ServerError) || (volleyError instanceof ParseError)) {
            i = 8;
        } else if (volleyError instanceof AuthFailureError) {
            i = PlacesStatusCodes.REQUEST_DENIED;
        } else {
            i = 13;
        }
        if (volleyError.networkResponse == null) {
            str = "N/A";
        } else {
            str = String.valueOf(volleyError.networkResponse.f6597a);
        }
        return new ApiException(new Status(i, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", str, volleyError)));
    }
}
