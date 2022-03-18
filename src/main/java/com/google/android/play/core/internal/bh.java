package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

public final class bh extends AbstractC22631bg {

    /* renamed from: a */
    private final AbstractC22631bg f56034a;

    /* renamed from: b */
    private final long f56035b;

    /* renamed from: c */
    private final long f56036c;

    public bh(AbstractC22631bg bgVar, long j, long j2) {
        this.f56034a = bgVar;
        long a = m82331a(j);
        this.f56035b = a;
        this.f56036c = m82331a(a + j2);
    }

    /* renamed from: a */
    private final long m82331a(long j) {
        if (j >= 0) {
            return j > this.f56034a.mo78697a() ? this.f56034a.mo78697a() : j;
        }
        return 0;
    }

    @Override // com.google.android.play.core.internal.AbstractC22631bg
    /* renamed from: a */
    public final long mo78697a() {
        return this.f56036c - this.f56035b;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractC22631bg
    /* renamed from: a */
    public final InputStream mo78698a(long j, long j2) throws IOException {
        long a = m82331a(this.f56035b + j);
        return this.f56034a.mo78698a(a, m82331a(j2 + a) - a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
