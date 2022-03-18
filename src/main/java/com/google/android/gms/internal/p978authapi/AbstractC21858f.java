package com.google.android.gms.internal.p978authapi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.internal.C21655b;

/* renamed from: com.google.android.gms.internal.auth-api.f */
abstract class AbstractC21858f<R extends AbstractC21641i> extends C21655b.AbstractC21656a<R, C21859g> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73936a(Context context, zzw zzw) throws DeadObjectException, RemoteException;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public /* synthetic */ void mo73104a(C21859g gVar) throws RemoteException {
        C21859g gVar2 = gVar;
        mo73936a(gVar2.getContext(), (zzw) gVar2.getService());
    }
}
