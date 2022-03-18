package com.bumptech.glide.load.p085b.p086a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.p084a.C2139b;
import com.bumptech.glide.load.p083a.p084a.C2140c;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bumptech.glide.p082c.C2120d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.c */
public class C2184c implements AbstractC2233n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f7489a;

    /* renamed from: com.bumptech.glide.load.b.a.c$a */
    public static class C2185a implements AbstractC2235o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f7490a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2185a(Context context) {
            this.f7490a = context;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, InputStream> mo10538a(C2241r rVar) {
            return new C2184c(this.f7490a);
        }
    }

    public C2184c(Context context) {
        this.f7489a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        return C2139b.m9327c(uri);
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        if (C2139b.m9324a(i, i2)) {
            return new AbstractC2233n.C2234a<>(new C2120d(uri), C2140c.m9329a(this.f7489a, uri));
        }
        return null;
    }
}
