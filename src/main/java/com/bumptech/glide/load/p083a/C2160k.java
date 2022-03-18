package com.bumptech.glide.load.p083a;

import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.p083a.AbstractC2149e;
import com.bumptech.glide.load.resource.bitmap.C2449u;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.k */
public final class C2160k implements AbstractC2149e<InputStream> {

    /* renamed from: a */
    private final C2449u f7463a;

    /* renamed from: com.bumptech.glide.load.a.k$a */
    public static final class C2161a implements AbstractC2149e.AbstractC2150a<InputStream> {

        /* renamed from: a */
        private final AbstractC2278b f7464a;

        @Override // com.bumptech.glide.load.p083a.AbstractC2149e.AbstractC2150a
        /* renamed from: a */
        public Class<InputStream> mo10507a() {
            return InputStream.class;
        }

        public C2161a(AbstractC2278b bVar) {
            this.f7464a = bVar;
        }

        /* renamed from: a */
        public AbstractC2149e<InputStream> mo10506a(InputStream inputStream) {
            return new C2160k(inputStream, this.f7464a);
        }
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2149e
    /* renamed from: b */
    public void mo10505b() {
        this.f7463a.mo10969b();
    }

    /* renamed from: c */
    public InputStream mo10504a() throws IOException {
        this.f7463a.reset();
        return this.f7463a;
    }

    /* renamed from: d */
    public void mo10522d() {
        this.f7463a.mo10967a();
    }

    public C2160k(InputStream inputStream, AbstractC2278b bVar) {
        C2449u uVar = new C2449u(inputStream, bVar);
        this.f7463a = uVar;
        uVar.mark(5242880);
    }
}
