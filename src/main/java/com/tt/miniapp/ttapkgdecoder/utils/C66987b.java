package com.tt.miniapp.ttapkgdecoder.utils;

import java.io.IOException;
import okio.AbstractC69701g;
import okio.AbstractC69723u;
import okio.C69694c;

/* renamed from: com.tt.miniapp.ttapkgdecoder.utils.b */
public final class C66987b {

    /* renamed from: com.tt.miniapp.ttapkgdecoder.utils.b$a */
    public interface AbstractC66989a {
        /* renamed from: a */
        void mo233022a(long j);
    }

    /* renamed from: a */
    public static AbstractC69723u m261097a(AbstractC69723u uVar, final AbstractC66989a aVar) {
        if (aVar == null) {
            return uVar;
        }
        return new AbstractC69701g(uVar) {
            /* class com.tt.miniapp.ttapkgdecoder.utils.C66987b.C669881 */

            /* renamed from: a */
            long f168922a;

            @Override // okio.AbstractC69701g, okio.AbstractC69723u
            public long read(C69694c cVar, long j) throws IOException {
                long read = super.read(cVar, j);
                if (read > 0) {
                    long j2 = this.f168922a + read;
                    this.f168922a = j2;
                    aVar.mo233022a(j2);
                }
                return read;
            }
        };
    }
}
