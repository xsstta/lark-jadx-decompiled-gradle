package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C21949e;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.n */
final class C21926n extends C21949e.AbstractC21950a<LocationSettingsResult> {

    /* renamed from: a */
    private final /* synthetic */ LocationSettingsRequest f53330a;

    /* renamed from: b */
    private final /* synthetic */ String f53331b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C21926n(C21925m mVar, AbstractC21631d dVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(dVar);
        this.f53330a = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC21641i mo73103a(Status status) {
        return new LocationSettingsResult(status);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public final /* synthetic */ void mo73104a(C21920h hVar) throws RemoteException {
        hVar.mo74038a(this.f53330a, this, this.f53331b);
    }
}
