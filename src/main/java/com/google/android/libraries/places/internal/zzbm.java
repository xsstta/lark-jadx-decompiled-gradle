package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzbm extends zzbt<Object, FindAutocompletePredictionsRequest> {
    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzbt
    public final String zzf() {
        return "autocomplete/json";
    }

    @Override // com.google.android.libraries.places.internal.zzbt
    public final Map<String, String> zze() {
        String str;
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zza();
        HashMap hashMap = new HashMap();
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null) {
            str = null;
        } else {
            str = query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " ");
        }
        zza(hashMap, "input", str, null);
        zza(hashMap, "types", zzcp.zza(findAutocompletePredictionsRequest.getTypeFilter()), null);
        zza(hashMap, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zza(hashMap, "origin", zzcn.zza(findAutocompletePredictionsRequest.getOrigin()), null);
        zza(hashMap, "locationbias", zzcn.zza(findAutocompletePredictionsRequest.getLocationBias()), null);
        zza(hashMap, "locationrestriction", zzcn.zza(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        zza(hashMap, "components", zzcn.zza(findAutocompletePredictionsRequest.getCountries()), null);
        return hashMap;
    }

    zzbm(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z, zzdr zzdr) {
        super(findAutocompletePredictionsRequest, locale, str, z, zzdr);
    }
}
