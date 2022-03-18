package com.google.android.gms.internal.p978authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.AbstractC21560a;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.e */
final class C21857e extends AbstractC21858f<AbstractC21560a> {

    /* renamed from: a */
    private final /* synthetic */ CredentialRequest f53263a;

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p978authapi.AbstractC21858f
    /* renamed from: a */
    public final void mo73936a(Context context, zzw zzw) throws RemoteException {
        zzw.zzc(new zzk(this), this.f53263a);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC21641i mo73103a(Status status) {
        return C21855c.m79171a(status);
    }
}
