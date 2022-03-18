package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.BaseGmsClient;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.s */
public final class C21762s implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractC21631d.AbstractC21634c f53105a;

    C21762s(AbstractC21631d.AbstractC21634c cVar) {
        this.f53105a = cVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f53105a.onConnectionFailed(connectionResult);
    }
}
