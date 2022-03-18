package com.tt.miniapp.streamloader;

import java.io.IOException;
import okio.AbstractC69701g;
import okio.AbstractC69723u;
import okio.C69694c;

/* renamed from: com.tt.miniapp.streamloader.e */
public final class C66879e extends AbstractC69701g {

    /* renamed from: a */
    private final C69694c f168703a = new C69694c();

    /* renamed from: b */
    private final C69694c f168704b = new C69694c();

    /* renamed from: c */
    private boolean f168705c;

    /* renamed from: b */
    public C69694c mo232855b() {
        return this.f168704b;
    }

    @Override // okio.AbstractC69701g, okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo232854a();
        super.close();
    }

    /* renamed from: a */
    public void mo232854a() {
        synchronized (this.f168704b) {
            this.f168705c = true;
            this.f168704b.close();
        }
    }

    public C66879e(AbstractC69723u uVar) {
        super(uVar);
    }

    @Override // okio.AbstractC69701g, okio.AbstractC69723u
    public long read(C69694c cVar, long j) throws IOException {
        long read = super.read(this.f168703a, j);
        if (read == -1) {
            mo232854a();
            return read;
        }
        synchronized (this.f168704b) {
            if (!this.f168705c) {
                this.f168703a.mo244522a(this.f168704b, 0, read);
            }
        }
        cVar.write(this.f168703a, read);
        return read;
    }
}
