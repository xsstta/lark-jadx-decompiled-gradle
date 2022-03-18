package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.AbstractC21571a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.auth.l */
public final class C21873l implements AbstractC21571a.AbstractC21573b {

    /* renamed from: a */
    private Status f53271a;

    /* renamed from: b */
    private String f53272b;

    public C21873l(@Nonnull String str) {
        this.f53272b = (String) Preconditions.checkNotNull(str);
        this.f53271a = Status.RESULT_SUCCESS;
    }

    public C21873l(@Nonnull Status status) {
        this.f53271a = (Status) Preconditions.checkNotNull(status);
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    @Nullable
    public final Status getStatus() {
        return this.f53271a;
    }
}
