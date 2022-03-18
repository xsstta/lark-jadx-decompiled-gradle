package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.d */
public class C21582d implements AbstractC21641i {

    /* renamed from: a */
    private Status f52503a;

    /* renamed from: b */
    private GoogleSignInAccount f52504b;

    public C21582d(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f52504b = googleSignInAccount;
        this.f52503a = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount mo73067a() {
        return this.f52504b;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public Status getStatus() {
        return this.f52503a;
    }
}
