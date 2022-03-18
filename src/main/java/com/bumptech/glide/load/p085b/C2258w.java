package com.bumptech.glide.load.p085b;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p083a.C2137a;
import com.bumptech.glide.load.p083a.C2156i;
import com.bumptech.glide.load.p083a.C2167o;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.w */
public class C2258w<Data> implements AbstractC2233n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f7592a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: b */
    private final AbstractC2261c<Data> f7593b;

    /* renamed from: com.bumptech.glide.load.b.w$c */
    public interface AbstractC2261c<Data> {
        /* renamed from: a */
        AbstractC2147d<Data> mo10628a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.b.w$a */
    public static final class C2259a implements AbstractC2235o<Uri, AssetFileDescriptor>, AbstractC2261c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f7594a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2259a(ContentResolver contentResolver) {
            this.f7594a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p085b.C2258w.AbstractC2261c
        /* renamed from: a */
        public AbstractC2147d<AssetFileDescriptor> mo10628a(Uri uri) {
            return new C2137a(this.f7594a, uri);
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, AssetFileDescriptor> mo10538a(C2241r rVar) {
            return new C2258w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.w$b */
    public static class C2260b implements AbstractC2235o<Uri, ParcelFileDescriptor>, AbstractC2261c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f7595a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2260b(ContentResolver contentResolver) {
            this.f7595a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p085b.C2258w.AbstractC2261c
        /* renamed from: a */
        public AbstractC2147d<ParcelFileDescriptor> mo10628a(Uri uri) {
            return new C2156i(this.f7595a, uri);
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, ParcelFileDescriptor> mo10538a(C2241r rVar) {
            return new C2258w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.w$d */
    public static class C2262d implements AbstractC2235o<Uri, InputStream>, AbstractC2261c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f7596a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2262d(ContentResolver contentResolver) {
            this.f7596a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p085b.C2258w.AbstractC2261c
        /* renamed from: a */
        public AbstractC2147d<InputStream> mo10628a(Uri uri) {
            return new C2167o(this.f7596a, uri);
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, InputStream> mo10538a(C2241r rVar) {
            return new C2258w(this);
        }
    }

    public C2258w(AbstractC2261c<Data> cVar) {
        this.f7593b = cVar;
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        return f7592a.contains(uri.getScheme());
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(uri), this.f7593b.mo10628a(uri));
    }
}
