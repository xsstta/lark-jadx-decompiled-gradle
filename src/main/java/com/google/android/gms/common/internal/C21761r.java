package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.BaseGmsClient;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.r */
public final class C21761r implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    private final /* synthetic */ AbstractC21631d.AbstractC21633b f53104a;

    C21761r(AbstractC21631d.AbstractC21633b bVar) {
        this.f53104a = bVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f53104a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f53104a.onConnectionSuspended(i);
    }
}
