package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.l */
public final class C21781l extends C21779j {

    /* renamed from: b */
    private final Callable<String> f53122b;

    private C21781l(Callable<String> callable) {
        super(false, null, null);
        this.f53122b = callable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.C21779j
    /* renamed from: b */
    public final String mo73762b() {
        try {
            return this.f53122b.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
