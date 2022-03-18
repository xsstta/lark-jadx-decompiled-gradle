package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;

/* renamed from: com.google.android.gms.common.api.internal.ag */
final class C21651ag implements AbstractC21631d.AbstractC21633b, AbstractC21631d.AbstractC21634c {

    /* renamed from: a */
    private final /* synthetic */ C21690y f52632a;

    private C21651ag(C21690y yVar) {
        this.f52632a = yVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnected(Bundle bundle) {
        if (this.f52632a.f52904r.mo73697k()) {
            this.f52632a.f52888b.lock();
            try {
                if (this.f52632a.f52897k != null) {
                    this.f52632a.f52897k.mo74970a(new zaar(this.f52632a));
                    this.f52632a.f52888b.unlock();
                }
            } finally {
                this.f52632a.f52888b.unlock();
            }
        } else {
            this.f52632a.f52897k.mo74970a(new zaar(this.f52632a));
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21634c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f52632a.f52888b.lock();
        try {
            if (this.f52632a.m78804a(connectionResult)) {
                this.f52632a.m78820g();
                this.f52632a.m78815e();
            } else {
                C21690y.m78799a(this.f52632a, connectionResult);
            }
        } finally {
            this.f52632a.f52888b.unlock();
        }
    }

    /* synthetic */ C21651ag(C21690y yVar, RunnableC21691z zVar) {
        this(yVar);
    }
}
