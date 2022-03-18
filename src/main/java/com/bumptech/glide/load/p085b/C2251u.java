package com.bumptech.glide.load.p085b;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.u */
public class C2251u<Data> implements AbstractC2233n<String, Data> {

    /* renamed from: a */
    private final AbstractC2233n<Uri, Data> f7588a;

    /* renamed from: a */
    public boolean mo10536a(String str) {
        return true;
    }

    public C2251u(AbstractC2233n<Uri, Data> nVar) {
        this.f7588a = nVar;
    }

    /* renamed from: com.bumptech.glide.load.b.u$a */
    public static final class C2252a implements AbstractC2235o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<String, AssetFileDescriptor> mo10538a(C2241r rVar) {
            return new C2251u(rVar.mo10614b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.u$b */
    public static class C2253b implements AbstractC2235o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<String, ParcelFileDescriptor> mo10538a(C2241r rVar) {
            return new C2251u(rVar.mo10614b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.u$c */
    public static class C2254c implements AbstractC2235o<String, InputStream> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<String, InputStream> mo10538a(C2241r rVar) {
            return new C2251u(rVar.mo10614b(Uri.class, InputStream.class));
        }
    }

    /* renamed from: c */
    private static Uri m9666c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: b */
    private static Uri m9665b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m9666c(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m9666c(str);
        }
        return parse;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(String str, int i, int i2, C2390f fVar) {
        Uri b = m9665b(str);
        if (b == null || !this.f7588a.mo10536a(b)) {
            return null;
        }
        return this.f7588a.mo10534a(b, i, i2, fVar);
    }
}
