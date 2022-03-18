package com.bumptech.glide.load.p085b;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p083a.C2155h;
import com.bumptech.glide.load.p083a.C2166n;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a */
public class C2176a<Data> implements AbstractC2233n<Uri, Data> {

    /* renamed from: a */
    private static final int f7479a = 22;

    /* renamed from: b */
    private final AssetManager f7480b;

    /* renamed from: c */
    private final AbstractC2177a<Data> f7481c;

    /* renamed from: com.bumptech.glide.load.b.a$a */
    public interface AbstractC2177a<Data> {
        /* renamed from: a */
        AbstractC2147d<Data> mo10537a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.b.a$b */
    public static class C2178b implements AbstractC2177a<ParcelFileDescriptor>, AbstractC2235o<Uri, ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f7482a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2178b(AssetManager assetManager) {
            this.f7482a = assetManager;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, ParcelFileDescriptor> mo10538a(C2241r rVar) {
            return new C2176a(this.f7482a, this);
        }

        @Override // com.bumptech.glide.load.p085b.C2176a.AbstractC2177a
        /* renamed from: a */
        public AbstractC2147d<ParcelFileDescriptor> mo10537a(AssetManager assetManager, String str) {
            return new C2155h(assetManager, str);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.a$c */
    public static class C2179c implements AbstractC2177a<InputStream>, AbstractC2235o<Uri, InputStream> {

        /* renamed from: a */
        private final AssetManager f7483a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2179c(AssetManager assetManager) {
            this.f7483a = assetManager;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, InputStream> mo10538a(C2241r rVar) {
            return new C2176a(this.f7483a, this);
        }

        @Override // com.bumptech.glide.load.p085b.C2176a.AbstractC2177a
        /* renamed from: a */
        public AbstractC2147d<InputStream> mo10537a(AssetManager assetManager, String str) {
            return new C2166n(assetManager, str);
        }
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public C2176a(AssetManager assetManager, AbstractC2177a<Data> aVar) {
        this.f7480b = assetManager;
        this.f7481c = aVar;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(uri), this.f7481c.mo10537a(this.f7480b, uri.toString().substring(f7479a)));
    }
}
