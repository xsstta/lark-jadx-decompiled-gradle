package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.android.datatransport.AbstractC21350c;
import com.google.android.datatransport.AbstractC21393e;
import com.google.android.datatransport.runtime.C21445q;
import com.google.android.libraries.places.internal.zzhh;

public final class zzdl implements zzdn {
    private final AbstractC21393e<zzhh.zza> zza = C21445q.m77585a().mo72695a("cct").mo72602a("LE", zzhh.zza.class, zzdo.zza);

    @Override // com.google.android.libraries.places.internal.zzdn
    public final void zza(zzhh.zza zza2) {
        this.zza.mo72600a(AbstractC21350c.m77290a(zza2));
    }

    public zzdl(Context context) {
        C21445q.m77586a(context.getApplicationContext());
    }
}
