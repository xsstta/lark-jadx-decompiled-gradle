package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C21661c;

final class az implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f52693a;

    /* renamed from: b */
    private final /* synthetic */ C21661c.C21662a f52694b;

    az(C21661c.C21662a aVar, ConnectionResult connectionResult) {
        this.f52694b = aVar;
        this.f52693a = connectionResult;
    }

    public final void run() {
        this.f52694b.onConnectionFailed(this.f52693a);
    }
}
