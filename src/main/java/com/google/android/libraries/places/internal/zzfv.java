package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class zzfv implements zzfw {
    final /* synthetic */ zzfd zza;

    zzfv(zzfd zzfd) {
        this.zza = zzfd;
    }

    @Override // com.google.android.libraries.places.internal.zzfw
    public final /* synthetic */ Iterator zza(zzfs zzfs, CharSequence charSequence) {
        return new zzfu(this, zzfs, charSequence);
    }
}
