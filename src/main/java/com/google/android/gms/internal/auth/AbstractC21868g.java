package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.AbstractC21571a;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21655b;

/* renamed from: com.google.android.gms.internal.auth.g */
abstract class AbstractC21868g extends C21655b.AbstractC21656a<AbstractC21571a.AbstractC21573b, C21866e> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73964a(Context context, zzan zzan) throws RemoteException;

    /* renamed from: d */
    protected static AbstractC21571a.AbstractC21573b m79179d(Status status) {
        return new C21873l(status);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public /* synthetic */ void mo73104a(C21866e eVar) throws RemoteException {
        C21866e eVar2 = eVar;
        mo73964a(eVar2.getContext(), (zzan) eVar2.getService());
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: a */
    public /* synthetic */ AbstractC21641i mo73103a(Status status) {
        return m79179d(status);
    }
}
