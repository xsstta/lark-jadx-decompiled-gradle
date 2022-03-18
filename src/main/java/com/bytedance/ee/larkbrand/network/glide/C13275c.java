package com.bytedance.ee.larkbrand.network.glide;

import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: com.bytedance.ee.larkbrand.network.glide.c */
public class C13275c implements AbstractC2233n<GlideRequest, InputStream> {

    /* renamed from: a */
    private final Call.Factory f35163a;

    /* renamed from: com.bytedance.ee.larkbrand.network.glide.c$a */
    public static class C13276a implements AbstractC2235o<GlideRequest, InputStream> {

        /* renamed from: a */
        private static volatile Call.Factory f35164a;

        /* renamed from: b */
        private final Call.Factory f35165b;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C13276a() {
            this(m54069b());
        }

        /* renamed from: b */
        private static Call.Factory m54069b() {
            if (f35164a == null) {
                synchronized (C13276a.class) {
                    if (f35164a == null) {
                        f35164a = new OkHttpClient();
                    }
                }
            }
            return f35164a;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<GlideRequest, InputStream> mo10538a(C2241r rVar) {
            return new C13275c(this.f35165b);
        }

        public C13276a(Call.Factory factory) {
            this.f35165b = factory;
        }
    }

    public C13275c(Call.Factory factory) {
        this.f35163a = factory;
    }

    /* renamed from: a */
    public boolean mo10536a(GlideRequest glideRequest) {
        if (glideRequest.mo49492a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(GlideRequest glideRequest, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(glideRequest, new C13274b(this.f35163a, glideRequest));
    }
}
