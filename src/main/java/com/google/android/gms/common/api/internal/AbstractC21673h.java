package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21613b;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.h */
public abstract class AbstractC21673h<A extends C21611a.AbstractC21613b, L> {

    /* renamed from: a */
    private final C21668f<L> f52864a;

    /* renamed from: b */
    private final Feature[] f52865b;

    /* renamed from: c */
    private final boolean f52866c;

    protected AbstractC21673h(C21668f<L> fVar) {
        this.f52864a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73490a(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    /* renamed from: a */
    public C21668f.C21669a<L> mo73489a() {
        return this.f52864a.mo73481b();
    }

    /* renamed from: b */
    public void mo73491b() {
        this.f52864a.mo73479a();
    }

    /* renamed from: c */
    public Feature[] mo73492c() {
        return this.f52865b;
    }

    /* renamed from: d */
    public final boolean mo73493d() {
        return this.f52866c;
    }
}
