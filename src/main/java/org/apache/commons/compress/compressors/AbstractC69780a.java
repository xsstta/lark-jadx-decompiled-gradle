package org.apache.commons.compress.compressors;

import java.io.InputStream;

/* renamed from: org.apache.commons.compress.compressors.a */
public abstract class AbstractC69780a extends InputStream {

    /* renamed from: a */
    private long f174320a;

    /* renamed from: a */
    public long mo244817a() {
        return this.f174320a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo244818a(int i) {
        mo244819a((long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo244820b(long j) {
        this.f174320a -= j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo244819a(long j) {
        if (j != -1) {
            this.f174320a += j;
        }
    }
}
