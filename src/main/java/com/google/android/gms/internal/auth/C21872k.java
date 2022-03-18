package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.AbstractC21571a;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.k */
final class C21872k implements AbstractC21571a.AbstractC21572a {

    /* renamed from: a */
    private Status f53269a;

    /* renamed from: b */
    private ProxyResponse f53270b;

    public C21872k(ProxyResponse proxyResponse) {
        this.f53270b = proxyResponse;
        this.f53269a = Status.RESULT_SUCCESS;
    }

    public C21872k(Status status) {
        this.f53269a = status;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        return this.f53269a;
    }
}
