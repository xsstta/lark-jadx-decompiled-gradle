package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.libraries.places.internal.zzdc;
import java.util.Map;

public abstract class zzaj<TypeT, RequestT extends zzdc> {
    private final RequestT zza;

    /* access modifiers changed from: protected */
    public abstract Map<String, String> zzc();

    /* access modifiers changed from: protected */
    public abstract String zzd();

    /* access modifiers changed from: protected */
    public final RequestT zza() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final AbstractC22083a zzb() {
        return this.zza.getCancellationToken();
    }

    protected zzaj(RequestT requestt) {
        this.zza = requestt;
    }
}
