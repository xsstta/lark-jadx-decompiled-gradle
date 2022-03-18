package com.bumptech.glide.load.p085b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p083a.p084a.C2139b;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.b.k */
public final class C2226k implements AbstractC2233n<Uri, File> {

    /* renamed from: a */
    private final Context f7545a;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.k$b */
    public static class C2228b implements AbstractC2147d<File> {

        /* renamed from: a */
        private static final String[] f7547a = {"_data"};

        /* renamed from: b */
        private final Context f7548b;

        /* renamed from: c */
        private final Uri f7549c;

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: c */
        public void mo10490c() {
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public Class<File> mo10481a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: d */
        public DataSource mo10491d() {
            return DataSource.LOCAL;
        }

        C2228b(Context context, Uri uri) {
            this.f7548b = context;
            this.f7549c = uri;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super File> aVar) {
            Cursor query = this.f7548b.getContentResolver().query(this.f7549c, f7547a, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo10502a((Exception) new FileNotFoundException("Failed to find file path for: " + this.f7549c));
                return;
            }
            aVar.mo10503a(new File(str));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.k$a */
    public static final class C2227a implements AbstractC2235o<Uri, File> {

        /* renamed from: a */
        private final Context f7546a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        public C2227a(Context context) {
            this.f7546a = context;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, File> mo10538a(C2241r rVar) {
            return new C2226k(this.f7546a);
        }
    }

    public C2226k(Context context) {
        this.f7545a = context;
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        return C2139b.m9325a(uri);
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<File> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(uri), new C2228b(this.f7545a, uri));
    }
}
