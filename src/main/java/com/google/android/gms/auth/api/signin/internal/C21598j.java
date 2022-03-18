package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
public final class C21598j extends AbstractC21600l<Status> {
    C21598j(AbstractC21631d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public final /* synthetic */ AbstractC21641i mo73103a(Status status) {
        return status;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public final /* synthetic */ void mo73104a(C21595g gVar) throws RemoteException {
        C21595g gVar2 = gVar;
        ((zzu) gVar2.getService()).zzd(new zzl(this), gVar2.mo73096a());
    }
}
