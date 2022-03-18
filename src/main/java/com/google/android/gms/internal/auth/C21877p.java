package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.AbstractC21542a;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth.p */
public final class C21877p extends C21655b.AbstractC21656a<AbstractC21542a, C21881t> {

    /* renamed from: a */
    private final /* synthetic */ String f53275a;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public final /* synthetic */ void mo73104a(C21881t tVar) throws RemoteException {
        ((zzc) tVar.getService()).zza(new zzk(this), this.f53275a);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC21641i mo73103a(Status status) {
        return new C21879r(status, null);
    }
}
