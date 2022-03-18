package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.a */
public class C21729a {
    /* renamed from: a */
    public static ApiException m78917a(Status status) {
        if (status.hasResolution()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
