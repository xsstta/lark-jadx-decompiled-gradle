package com.bytedance.ee.bear.facade.glide;

import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import com.bytedance.ee.util.p703f.C13664a;
import java.io.InputStream;
import okhttp3.Call;

/* renamed from: com.bytedance.ee.bear.facade.glide.c */
public class C7769c implements AbstractC2233n<C13664a, InputStream> {

    /* renamed from: a */
    private final Call.Factory f21052a;

    /* renamed from: a */
    public boolean mo10536a(C13664a aVar) {
        return true;
    }

    /* renamed from: com.bytedance.ee.bear.facade.glide.c$a */
    public static class C7770a implements AbstractC2235o<C13664a, InputStream> {

        /* renamed from: a */
        private static volatile Call.Factory f21053a;

        /* renamed from: b */
        private final Call.Factory f21054b;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C7770a() {
            this(m31121b());
        }

        /* renamed from: b */
        private static Call.Factory m31121b() {
            if (f21053a == null) {
                synchronized (C7770a.class) {
                    if (f21053a == null) {
                        f21053a = C12617b.m52365c().newBuilder().cookieJar(C4969a.m20606a()).build();
                    }
                }
            }
            return f21053a;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<C13664a, InputStream> mo10538a(C2241r rVar) {
            return new C7769c(this.f21054b);
        }

        public C7770a(Call.Factory factory) {
            this.f21054b = factory;
        }
    }

    public C7769c(Call.Factory factory) {
        this.f21052a = factory;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(C13664a aVar, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(aVar, new C7768b(this.f21052a, aVar));
    }
}
