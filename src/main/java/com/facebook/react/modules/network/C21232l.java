package com.facebook.react.modules.network;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.AbstractC69699e;
import okio.AbstractC69701g;
import okio.AbstractC69723u;
import okio.C69694c;
import okio.C69705k;

/* renamed from: com.facebook.react.modules.network.l */
public class C21232l extends ResponseBody {

    /* renamed from: a */
    public final ResponseBody f51729a;

    /* renamed from: b */
    public final AbstractC21229j f51730b;

    /* renamed from: c */
    public long f51731c;

    /* renamed from: d */
    private AbstractC69699e f51732d;

    /* renamed from: a */
    public long mo72071a() {
        return this.f51731c;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f51729a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f51729a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public AbstractC69699e source() {
        if (this.f51732d == null) {
            this.f51732d = C69705k.m267590a(m77005a(this.f51729a.source()));
        }
        return this.f51732d;
    }

    /* renamed from: a */
    private AbstractC69723u m77005a(AbstractC69723u uVar) {
        return new AbstractC69701g(uVar) {
            /* class com.facebook.react.modules.network.C21232l.C212331 */

            @Override // okio.AbstractC69701g, okio.AbstractC69723u
            public long read(C69694c cVar, long j) throws IOException {
                long j2;
                boolean z;
                long read = super.read(cVar, j);
                C21232l lVar = C21232l.this;
                long j3 = lVar.f51731c;
                int i = (read > -1 ? 1 : (read == -1 ? 0 : -1));
                if (i != 0) {
                    j2 = read;
                } else {
                    j2 = 0;
                }
                lVar.f51731c = j3 + j2;
                AbstractC21229j jVar = C21232l.this.f51730b;
                long j4 = C21232l.this.f51731c;
                long contentLength = C21232l.this.f51729a.contentLength();
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                jVar.mo72044a(j4, contentLength, z);
                return read;
            }
        };
    }

    public C21232l(ResponseBody responseBody, AbstractC21229j jVar) {
        this.f51729a = responseBody;
        this.f51730b = jVar;
    }
}
