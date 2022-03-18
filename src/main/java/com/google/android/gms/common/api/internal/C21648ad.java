package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.api.internal.ad */
final class C21648ad extends AbstractC21654at {

    /* renamed from: a */
    private final /* synthetic */ BaseGmsClient.AbstractC21720a f52627a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C21648ad(C21646ab abVar, ar arVar, BaseGmsClient.AbstractC21720a aVar) {
        super(arVar);
        this.f52627a = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC21654at
    /* renamed from: a */
    public final void mo73337a() {
        this.f52627a.mo73335a(new ConnectionResult(16, null));
    }
}
