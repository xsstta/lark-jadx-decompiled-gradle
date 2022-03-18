package com.facebook.react.modules.network;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.AbstractC69698d;
import okio.AbstractC69722t;
import okio.C69705k;

/* renamed from: com.facebook.react.modules.network.k */
public class C21230k extends RequestBody {

    /* renamed from: a */
    public final AbstractC21229j f51725a;

    /* renamed from: b */
    private final RequestBody f51726b;

    /* renamed from: c */
    private long f51727c;

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f51726b.contentType();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        if (this.f51727c == 0) {
            this.f51727c = this.f51726b.contentLength();
        }
        return this.f51727c;
    }

    /* renamed from: a */
    private AbstractC69722t m77003a(AbstractC69698d dVar) {
        return C69705k.m267592a(new C21216d(dVar.mo244527b()) {
            /* class com.facebook.react.modules.network.C21230k.C212311 */

            /* renamed from: b */
            private void m77004b() throws IOException {
                boolean z;
                long a = mo72049a();
                long contentLength = C21230k.this.contentLength();
                AbstractC21229j jVar = C21230k.this.f51725a;
                if (a == contentLength) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.mo72044a(a, contentLength, z);
            }

            @Override // java.io.OutputStream, com.facebook.react.modules.network.C21216d, java.io.FilterOutputStream
            public void write(int i) throws IOException {
                super.write(i);
                m77004b();
            }

            @Override // java.io.OutputStream, com.facebook.react.modules.network.C21216d, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                super.write(bArr, i, i2);
                m77004b();
            }
        });
    }

    @Override // okhttp3.RequestBody
    public void writeTo(AbstractC69698d dVar) throws IOException {
        AbstractC69698d a = C69705k.m267589a(m77003a(dVar));
        contentLength();
        this.f51726b.writeTo(a);
        a.flush();
    }

    public C21230k(RequestBody requestBody, AbstractC21229j jVar) {
        this.f51726b = requestBody;
        this.f51725a = jVar;
    }
}
