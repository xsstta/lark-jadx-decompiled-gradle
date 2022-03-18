package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.q */
public final class C21682q implements AbstractC21635e.AbstractC21636a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f52874a;

    /* renamed from: b */
    private final /* synthetic */ C21681p f52875b;

    C21682q(C21681p pVar, BasePendingResult basePendingResult) {
        this.f52875b = pVar;
        this.f52874a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC21635e.AbstractC21636a
    /* renamed from: a */
    public final void mo73295a(Status status) {
        this.f52875b.f52872a.remove(this.f52874a);
    }
}
