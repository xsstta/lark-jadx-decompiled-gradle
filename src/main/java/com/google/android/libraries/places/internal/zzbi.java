package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzbi extends zzbt<Object, FetchPlaceRequest> {
    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzbt
    public final String zzf() {
        return "details/json";
    }

    @Override // com.google.android.libraries.places.internal.zzbt
    public final Map<String, String> zze() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zza();
        HashMap hashMap = new HashMap();
        zza(hashMap, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zza(hashMap, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zza(hashMap, "fields", zzcm.zzb(fetchPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }

    zzbi(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, boolean z, zzdr zzdr) {
        super(fetchPlaceRequest, locale, str, z, zzdr);
    }
}
