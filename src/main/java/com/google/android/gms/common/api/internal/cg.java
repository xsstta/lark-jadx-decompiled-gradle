package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* access modifiers changed from: package-private */
public final class cg {

    /* renamed from: a */
    private final int f52797a;

    /* renamed from: b */
    private final ConnectionResult f52798b;

    cg(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.f52798b = connectionResult;
        this.f52797a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo73459a() {
        return this.f52797a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult mo73460b() {
        return this.f52798b;
    }
}
