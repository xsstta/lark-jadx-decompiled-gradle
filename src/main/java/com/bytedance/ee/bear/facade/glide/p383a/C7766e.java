package com.bytedance.ee.bear.facade.glide.p383a;

import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bytedance.ee.bear.p276c.C4969a;
import com.bytedance.ee.eenet.httpclient.C12617b;
import java.io.InputStream;
import okhttp3.Call;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.e */
public class C7766e implements AbstractC2233n<C7754c, InputStream> {

    /* renamed from: a */
    private final Call.Factory f21043a;

    /* renamed from: a */
    public boolean mo10536a(C7754c cVar) {
        return true;
    }

    /* renamed from: com.bytedance.ee.bear.facade.glide.a.e$a */
    public static class C7767a implements AbstractC2235o<C7754c, InputStream> {

        /* renamed from: a */
        private static volatile Call.Factory f21044a;

        /* renamed from: b */
        private final Call.Factory f21045b;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C7767a() {
            this(m31108b());
        }

        /* renamed from: b */
        private static Call.Factory m31108b() {
            if (f21044a == null) {
                synchronized (C7767a.class) {
                    if (f21044a == null) {
                        f21044a = C12617b.m52365c().newBuilder().cookieJar(C4969a.m20606a()).build();
                    }
                }
            }
            return f21044a;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<C7754c, InputStream> mo10538a(C2241r rVar) {
            return new C7766e(this.f21045b);
        }

        public C7767a(Call.Factory factory) {
            this.f21045b = factory;
        }
    }

    public C7766e(Call.Factory factory) {
        this.f21043a = factory;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(C7754c cVar, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(cVar, new C7764d(this.f21043a, cVar));
    }
}
