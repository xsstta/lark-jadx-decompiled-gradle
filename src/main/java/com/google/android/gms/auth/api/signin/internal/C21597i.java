package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C21582d;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C21597i extends AbstractC21600l<C21582d> {

    /* renamed from: a */
    final /* synthetic */ Context f52532a;

    /* renamed from: b */
    final /* synthetic */ GoogleSignInOptions f52533b;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public final /* synthetic */ void mo73104a(C21595g gVar) throws RemoteException {
        ((zzu) gVar.getService()).zzc(new zzj(this), this.f52533b);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC21641i mo73103a(Status status) {
        return new C21582d(null, status);
    }
}
