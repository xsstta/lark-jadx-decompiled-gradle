package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
public final class cp implements AbstractC21658bg {

    /* renamed from: a */
    private final /* synthetic */ cm f52822a;

    private cp(cm cmVar) {
        this.f52822a = cmVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73348a(Bundle bundle) {
        this.f52822a.f52818m.lock();
        try {
            this.f52822a.f52816k = ConnectionResult.RESULT_SUCCESS;
            this.f52822a.m78657e();
        } finally {
            this.f52822a.f52818m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73349a(ConnectionResult connectionResult) {
        this.f52822a.f52818m.lock();
        try {
            this.f52822a.f52816k = connectionResult;
            this.f52822a.m78657e();
        } finally {
            this.f52822a.f52818m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73347a(int i, boolean z) {
        this.f52822a.f52818m.lock();
        try {
            if (this.f52822a.f52817l) {
                this.f52822a.f52817l = false;
                this.f52822a.m78644a((cm) i, (int) z);
                return;
            }
            this.f52822a.f52817l = true;
            this.f52822a.f52809d.onConnectionSuspended(i);
            this.f52822a.f52818m.unlock();
        } finally {
            this.f52822a.f52818m.unlock();
        }
    }

    /* synthetic */ cp(cm cmVar, cn cnVar) {
        this(cmVar);
    }
}
