package org.tukaani.xz.p3526d;

import org.tukaani.xz.XZIOException;
import org.tukaani.xz.p3524b.C70055c;

/* access modifiers changed from: package-private */
/* renamed from: org.tukaani.xz.d.a */
public abstract class AbstractC70060a {

    /* renamed from: a */
    long f175099a;

    /* renamed from: b */
    long f175100b;

    /* renamed from: c */
    long f175101c;

    /* renamed from: d */
    long f175102d;

    /* renamed from: e */
    private final XZIOException f175103e;

    AbstractC70060a(XZIOException xZIOException) {
        this.f175103e = xZIOException;
    }

    /* renamed from: d */
    private long m268774d() {
        return ((long) (C70055c.m268767a(this.f175102d) + 1)) + this.f175101c + 4;
    }

    /* renamed from: a */
    public long mo246740a() {
        return (m268774d() + 3) & -4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo246741a(long j, long j2) throws XZIOException {
        this.f175099a += (3 + j) & -4;
        this.f175100b += j2;
        this.f175101c += (long) (C70055c.m268767a(j) + C70055c.m268767a(j2));
        this.f175102d++;
        if (this.f175099a < 0 || this.f175100b < 0 || mo246740a() > 17179869184L || mo246742b() < 0) {
            throw this.f175103e;
        }
    }

    /* renamed from: b */
    public long mo246742b() {
        return this.f175099a + 12 + mo246740a() + 12;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo246743c() {
        return (int) (3 & (4 - m268774d()));
    }
}
