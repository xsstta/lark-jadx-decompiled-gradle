package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C21590b;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21692j;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
public final class ao implements AbstractC21692j<Status> {

    /* renamed from: a */
    private final /* synthetic */ C21676k f52666a;

    /* renamed from: b */
    private final /* synthetic */ boolean f52667b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC21631d f52668c;

    /* renamed from: d */
    private final /* synthetic */ aj f52669d;

    ao(aj ajVar, C21676k kVar, boolean z, AbstractC21631d dVar) {
        this.f52669d = ajVar;
        this.f52666a = kVar;
        this.f52667b = z;
        this.f52668c = dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.i] */
    @Override // com.google.android.gms.common.api.AbstractC21692j
    /* renamed from: a */
    public final /* synthetic */ void mo73359a(Status status) {
        Status status2 = status;
        C21590b.m78184a(this.f52669d.f52645k).mo73090d();
        if (status2.isSuccess() && this.f52669d.mo73278j()) {
            this.f52669d.mo73276h();
        }
        this.f52666a.mo73314b(status2);
        if (this.f52667b) {
            this.f52668c.mo73275g();
        }
    }
}
