package com.google.android.gms.internal.p978authapi;

import com.google.android.gms.auth.api.credentials.AbstractC21560a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.c */
public final class C21855c implements AbstractC21560a {

    /* renamed from: a */
    private final Status f53261a;

    /* renamed from: b */
    private final Credential f53262b;

    public C21855c(Status status, Credential credential) {
        this.f53261a = status;
        this.f53262b = credential;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        return this.f53261a;
    }

    /* renamed from: a */
    public static C21855c m79171a(Status status) {
        return new C21855c(status, null);
    }
}
