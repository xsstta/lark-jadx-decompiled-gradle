package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;

final class zzac extends zzak {
    private final C21655b.AbstractC21657b<Status> zzcq;

    public zzac(C21655b.AbstractC21657b<Status> bVar) {
        this.zzcq = bVar;
    }

    @Override // com.google.android.gms.internal.location.zzaj
    public final void zza(zzad zzad) {
        this.zzcq.mo73385a(zzad.getStatus());
    }
}
