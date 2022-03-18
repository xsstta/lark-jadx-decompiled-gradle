package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

final class zzbc extends zzbt<Object, FetchPhotoRequest> {
    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzbt
    public final String zzf() {
        return "photo";
    }

    @Override // com.google.android.libraries.places.internal.zzbt
    public final Map<String, String> zze() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zza();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap hashMap = new HashMap();
        zza(hashMap, "maxheight", fetchPhotoRequest.getMaxHeight(), null);
        zza(hashMap, "maxwidth", fetchPhotoRequest.getMaxWidth(), null);
        hashMap.put("photoreference", photoMetadata.zza());
        return hashMap;
    }

    zzbc(FetchPhotoRequest fetchPhotoRequest, String str, boolean z, zzdr zzdr) {
        super(fetchPhotoRequest, null, str, z, zzdr);
    }
}
