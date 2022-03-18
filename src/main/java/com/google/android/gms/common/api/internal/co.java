package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
public final class co implements AbstractC21658bg {

    /* renamed from: a */
    private final /* synthetic */ cm f52821a;

    private co(cm cmVar) {
        this.f52821a = cmVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73348a(Bundle bundle) {
        this.f52821a.f52818m.lock();
        try {
            this.f52821a.m78645a((cm) bundle);
            this.f52821a.f52815j = ConnectionResult.RESULT_SUCCESS;
            this.f52821a.m78657e();
        } finally {
            this.f52821a.f52818m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73349a(ConnectionResult connectionResult) {
        this.f52821a.f52818m.lock();
        try {
            this.f52821a.f52815j = connectionResult;
            this.f52821a.m78657e();
        } finally {
            this.f52821a.f52818m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21658bg
    /* renamed from: a */
    public final void mo73347a(int i, boolean z) {
        this.f52821a.f52818m.lock();
        try {
            if (!(this.f52821a.f52817l) && this.f52821a.f52816k != null) {
                if (this.f52821a.f52816k.isSuccess()) {
                    this.f52821a.f52817l = true;
                    this.f52821a.f52810e.onConnectionSuspended(i);
                    this.f52821a.f52818m.unlock();
                    return;
                }
            }
            this.f52821a.f52817l = false;
            this.f52821a.m78644a((cm) i, (int) z);
        } finally {
            this.f52821a.f52818m.unlock();
        }
    }

    /* synthetic */ co(cm cmVar, cn cnVar) {
        this(cmVar);
    }
}
