package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzbq extends zzbt<Object, FindCurrentPlaceRequest> {
    private final Location zza;
    private final zzgi<zzq> zzb;

    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzbt
    public final String zzf() {
        return "findplacefromuserlocation/json";
    }

    @Override // com.google.android.libraries.places.internal.zzbt
    public final Map<String, String> zze() {
        HashMap hashMap = new HashMap();
        zza(hashMap, "location", zzcn.zzb(this.zza), null);
        zza(hashMap, "wifiaccesspoints", zzcn.zza(this.zzb, 4000), null);
        zza(hashMap, "precision", zzcn.zza(this.zza), null);
        zza(hashMap, "timestamp", Long.valueOf(this.zza.getTime()), null);
        zza(hashMap, "fields", zzcm.zzb(((FindCurrentPlaceRequest) zza()).getPlaceFields()), null);
        return hashMap;
    }

    zzbq(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzgi<zzq> zzgi, Locale locale, String str, boolean z, zzdr zzdr) {
        super(findCurrentPlaceRequest, locale, str, z, zzdr);
        this.zza = location;
        this.zzb = zzgi;
    }
}
