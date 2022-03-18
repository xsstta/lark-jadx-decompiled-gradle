package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.w */
final class C21935w extends AbstractC21913a {

    /* renamed from: a */
    private final /* synthetic */ boolean f53336a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C21935w(C21934v vVar, AbstractC21631d dVar, boolean z) {
        super(dVar);
        this.f53336a = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.C21655b.AbstractC21656a
    /* renamed from: a */
    public final /* synthetic */ void mo73104a(C21920h hVar) throws RemoteException {
        hVar.mo74039a(this.f53336a);
        mo73314b((AbstractC21641i) Status.RESULT_SUCCESS);
    }
}
