package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.e */
final class C21917e implements C21668f.AbstractC21670b<C21947c> {

    /* renamed from: a */
    private final /* synthetic */ LocationResult f53326a;

    C21917e(zzat zzat, LocationResult locationResult) {
        this.f53326a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.C21668f.AbstractC21670b
    /* renamed from: a */
    public final void mo73485a() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.common.api.internal.C21668f.AbstractC21670b
    /* renamed from: a */
    public final /* synthetic */ void mo73486a(C21947c cVar) {
        cVar.onLocationResult(this.f53326a);
    }
}
