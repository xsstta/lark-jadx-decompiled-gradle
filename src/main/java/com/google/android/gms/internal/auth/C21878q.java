package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.account.zzc;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.auth.q */
public final class C21878q extends C21655b.AbstractC21656a<AbstractC21641i, C21881t> {

    /* renamed from: a */
    private final /* synthetic */ Account f53276a;

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final AbstractC21641i mo73103a(Status status) {
        return new C21880s(status);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public final /* synthetic */ void mo73104a(C21881t tVar) throws RemoteException {
        ((zzc) tVar.getService()).zza(new zzm(this), this.f53276a);
    }
}
