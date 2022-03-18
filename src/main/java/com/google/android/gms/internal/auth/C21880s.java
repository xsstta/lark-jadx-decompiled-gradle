package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.s */
final class C21880s implements AbstractC21641i {

    /* renamed from: a */
    private final Status f53279a;

    public C21880s(Status status) {
        this.f53279a = status;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        return this.f53279a;
    }
}
