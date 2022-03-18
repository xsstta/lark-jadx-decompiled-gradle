package com.bytedance.ee.util.io;

import java.io.File;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.AbstractC69698d;
import okio.AbstractC69723u;
import okio.C69705k;

/* renamed from: com.bytedance.ee.util.io.a */
public class C13669a extends RequestBody {

    /* renamed from: a */
    private final File f35857a;

    /* renamed from: b */
    private final AbstractC13670a f35858b;

    /* renamed from: c */
    private final MediaType f35859c;

    /* renamed from: com.bytedance.ee.util.io.a$a */
    public interface AbstractC13670a {
        /* renamed from: a */
        void mo50642a(long j, long j2, long j3);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f35859c;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.f35857a.length();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(AbstractC69698d dVar) throws IOException {
        AbstractC69723u uVar = null;
        try {
            uVar = C69705k.m267595a(this.f35857a);
            long j = 0;
            long contentLength = contentLength();
            while (true) {
                long read = uVar.read(dVar.buffer(), 2048);
                if (read != -1) {
                    j += read;
                    dVar.flush();
                    AbstractC13670a aVar = this.f35858b;
                    if (aVar != null) {
                        aVar.mo50642a(j, read, contentLength);
                    }
                } else {
                    return;
                }
            }
        } finally {
            Util.closeQuietly(uVar);
        }
    }
}
