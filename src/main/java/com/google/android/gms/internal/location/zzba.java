package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.location.C21952g;

final class zzba extends zzan {
    private C21655b.AbstractC21657b<Status> zzdf;

    public zzba(C21655b.AbstractC21657b<Status> bVar) {
        this.zzdf = bVar;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zza(int i, String[] strArr) {
        if (this.zzdf == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
            return;
        }
        this.zzdf.mo73385a(C21952g.m79319b(C21952g.m79318a(i)));
        this.zzdf = null;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzb(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
    }
}
