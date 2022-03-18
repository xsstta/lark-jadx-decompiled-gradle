package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C21661c;
import java.util.Collections;

final class bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f52699a;

    /* renamed from: b */
    private final /* synthetic */ C21661c.C21664c f52700b;

    bc(C21661c.C21664c cVar, ConnectionResult connectionResult) {
        this.f52700b = cVar;
        this.f52699a = connectionResult;
    }

    public final void run() {
        if (this.f52699a.isSuccess()) {
            this.f52700b.f52774f = true;
            if (this.f52700b.f52770b.requiresSignIn()) {
                this.f52700b.m78591a();
                return;
            }
            try {
                this.f52700b.f52770b.getRemoteService(null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((C21661c.C21662a) C21661c.this.f52749m.get(this.f52700b.f52771c)).onConnectionFailed(new ConnectionResult(10));
            }
        } else {
            ((C21661c.C21662a) C21661c.this.f52749m.get(this.f52700b.f52771c)).onConnectionFailed(this.f52699a);
        }
    }
}
