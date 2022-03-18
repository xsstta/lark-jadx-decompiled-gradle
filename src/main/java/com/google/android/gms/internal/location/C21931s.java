package com.google.android.gms.internal.location;

import android.os.DeadObjectException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.location.s */
public final class C21931s implements AbstractC21924l<zzao> {

    /* renamed from: a */
    private final /* synthetic */ C21930r f53335a;

    C21931s(C21930r rVar) {
        this.f53335a = rVar;
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    @Override // com.google.android.gms.internal.location.AbstractC21924l
    /* renamed from: a */
    public final /* synthetic */ zzao mo74046a() throws DeadObjectException {
        return (zzao) this.f53335a.getService();
    }

    @Override // com.google.android.gms.internal.location.AbstractC21924l
    /* renamed from: b */
    public final void mo74047b() {
        this.f53335a.checkConnected();
    }
}
