package com.google.android.gms.internal.p977authapiphone;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC21677l;
import com.google.android.gms.common.api.internal.C21678m;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.e */
abstract class AbstractC21852e extends AbstractC21677l<C21850c, Void> {

    /* renamed from: a */
    private TaskCompletionSource<Void> f53259a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73927a(Status status) {
        C21678m.m78753a(status, this.f53259a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b, com.google.android.gms.tasks.TaskCompletionSource] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC21677l
    /* renamed from: a */
    public /* synthetic */ void mo72946a(C21850c cVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.f53259a = taskCompletionSource;
        mo73926a((zze) cVar.getService());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73926a(zze zze) throws RemoteException;
}
