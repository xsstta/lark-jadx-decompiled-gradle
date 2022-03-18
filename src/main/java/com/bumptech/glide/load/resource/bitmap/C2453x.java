package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.C2434k;
import com.bumptech.glide.util.C2559d;
import com.bumptech.glide.util.C2565h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
public class C2453x implements AbstractC2391g<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2434k f8030a;

    /* renamed from: b */
    private final AbstractC2278b f8031b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.x$a */
    public static class C2454a implements C2434k.AbstractC2436a {

        /* renamed from: a */
        private final C2449u f8032a;

        /* renamed from: b */
        private final C2559d f8033b;

        @Override // com.bumptech.glide.load.resource.bitmap.C2434k.AbstractC2436a
        /* renamed from: a */
        public void mo10953a() {
            this.f8032a.mo10967a();
        }

        C2454a(C2449u uVar, C2559d dVar) {
            this.f8032a = uVar;
            this.f8033b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2434k.AbstractC2436a
        /* renamed from: a */
        public void mo10954a(AbstractC2283e eVar, Bitmap bitmap) throws IOException {
            IOException a = this.f8033b.mo11233a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo10693a(bitmap);
                }
                throw a;
            }
        }
    }

    public C2453x(C2434k kVar, AbstractC2278b bVar) {
        this.f8030a = kVar;
        this.f8031b = bVar;
    }

    /* renamed from: a */
    public boolean mo10904a(InputStream inputStream, C2390f fVar) {
        return this.f8030a.mo10951a(inputStream);
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(InputStream inputStream, int i, int i2, C2390f fVar) throws IOException {
        C2449u uVar;
        boolean z;
        if (inputStream instanceof C2449u) {
            uVar = (C2449u) inputStream;
            z = false;
        } else {
            uVar = new C2449u(inputStream, this.f8031b);
            z = true;
        }
        C2559d a = C2559d.m10873a(uVar);
        try {
            return this.f8030a.mo10949a(new C2565h(a), i, i2, fVar, new C2454a(uVar, a));
        } finally {
            a.mo11235b();
            if (z) {
                uVar.mo10969b();
            }
        }
    }
}
