package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.location.C21952g;

final class zzbb extends zzan {
    private C21655b.AbstractC21657b<Status> zzdf;

    public zzbb(C21655b.AbstractC21657b<Status> bVar) {
        this.zzdf = bVar;
    }

    private final void zze(int i) {
        if (this.zzdf == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.zzdf.mo73385a(C21952g.m79319b(C21952g.m79318a(i)));
        this.zzdf = null;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, PendingIntent pendingIntent) {
        zze(i);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzb(int i, String[] strArr) {
        zze(i);
    }
}
