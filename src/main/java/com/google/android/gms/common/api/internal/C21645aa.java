package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.aa */
final class C21645aa implements BaseGmsClient.AbstractC21720a {

    /* renamed from: a */
    private final WeakReference<C21690y> f52620a;

    /* renamed from: b */
    private final C21611a<?> f52621b;

    /* renamed from: c */
    private final boolean f52622c;

    public C21645aa(C21690y yVar, C21611a<?> aVar, boolean z) {
        this.f52620a = new WeakReference<>(yVar);
        this.f52621b = aVar;
        this.f52622c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.AbstractC21720a
    /* renamed from: a */
    public final void mo73335a(ConnectionResult connectionResult) {
        C21690y yVar = this.f52620a.get();
        if (yVar != null) {
            Preconditions.checkState(Looper.myLooper() == C21690y.m78813d(yVar).f52675d.mo73271c(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            C21690y.m78812c(yVar).lock();
            try {
                if (C21690y.m78805a(yVar, 0)) {
                    if (!connectionResult.isSuccess()) {
                        C21690y.m78800a(yVar, connectionResult, this.f52621b, this.f52622c);
                    }
                    if (C21690y.m78827l(yVar)) {
                        C21690y.m78826k(yVar);
                    }
                    C21690y.m78812c(yVar).unlock();
                }
            } finally {
                C21690y.m78812c(yVar).unlock();
            }
        }
    }
}
