package com.bytedance.ee.bear.middleground.comment.p447e;

import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import java.io.InputStream;
import okhttp3.Call;

/* renamed from: com.bytedance.ee.bear.middleground.comment.e.d */
public class C9215d implements AbstractC2233n<C9213b, InputStream> {

    /* renamed from: a */
    private final Call.Factory f24784a;

    /* renamed from: a */
    public boolean mo10536a(C9213b bVar) {
        return true;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.comment.e.d$a */
    public static class C9216a implements AbstractC2235o<C9213b, InputStream> {

        /* renamed from: a */
        private static volatile Call.Factory f24785a;

        /* renamed from: b */
        private final Call.Factory f24786b;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C9216a() {
            this(m38083b());
        }

        /* renamed from: b */
        private static Call.Factory m38083b() {
            if (f24785a == null) {
                synchronized (C9216a.class) {
                    if (f24785a == null) {
                        f24785a = C12617b.m52365c().newBuilder().cookieJar(C4969a.m20606a()).build();
                    }
                }
            }
            return f24785a;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<C9213b, InputStream> mo10538a(C2241r rVar) {
            return new C9215d(this.f24786b);
        }

        public C9216a(Call.Factory factory) {
            this.f24786b = factory;
        }
    }

    public C9215d(Call.Factory factory) {
        this.f24784a = factory;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(C9213b bVar, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(bVar, new C9214c(this.f24784a, bVar));
    }
}
