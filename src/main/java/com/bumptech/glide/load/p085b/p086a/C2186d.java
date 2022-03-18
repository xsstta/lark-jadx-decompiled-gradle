package com.bumptech.glide.load.p085b.p086a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.p084a.C2139b;
import com.bumptech.glide.load.p083a.p084a.C2140c;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bumptech.glide.load.resource.bitmap.C2416aa;
import com.bumptech.glide.p082c.C2120d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.d */
public class C2186d implements AbstractC2233n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f7491a;

    /* renamed from: com.bumptech.glide.load.b.a.d$a */
    public static class C2187a implements AbstractC2235o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f7492a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2187a(Context context) {
            this.f7492a = context;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, InputStream> mo10538a(C2241r rVar) {
            return new C2186d(this.f7492a);
        }
    }

    public C2186d(Context context) {
        this.f7491a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        return C2139b.m9326b(uri);
    }

    /* renamed from: a */
    private boolean m9468a(C2390f fVar) {
        Long l = (Long) fVar.mo10900a(C2416aa.f7963a);
        if (l == null || l.longValue() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        if (!C2139b.m9324a(i, i2) || !m9468a(fVar)) {
            return null;
        }
        return new AbstractC2233n.C2234a<>(new C2120d(uri), C2140c.m9331b(this.f7491a, uri));
    }
}
