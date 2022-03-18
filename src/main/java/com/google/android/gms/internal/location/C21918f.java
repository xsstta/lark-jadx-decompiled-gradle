package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: com.google.android.gms.internal.location.f */
final class C21918f implements C21668f.AbstractC21670b<C21947c> {

    /* renamed from: a */
    private final /* synthetic */ LocationAvailability f53327a;

    C21918f(zzat zzat, LocationAvailability locationAvailability) {
        this.f53327a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C21668f.AbstractC21670b
    /* renamed from: a */
    public final void mo73485a() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.common.api.internal.C21668f.AbstractC21670b
    /* renamed from: a */
    public final /* synthetic */ void mo73486a(C21947c cVar) {
        cVar.onLocationAvailability(this.f53327a);
    }
}
