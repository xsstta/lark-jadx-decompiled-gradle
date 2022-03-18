package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.AbstractC21542a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.r */
final class C21879r implements AbstractC21542a {

    /* renamed from: a */
    private final Status f53277a;

    /* renamed from: b */
    private final Account f53278b;

    public C21879r(Status status, Account account) {
        this.f53277a = status;
        this.f53278b = account;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        return this.f53277a;
    }
}
