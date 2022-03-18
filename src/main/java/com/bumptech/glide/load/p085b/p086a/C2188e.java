package com.bumptech.glide.load.p085b.p086a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p083a.p084a.C2139b;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2241r;
import com.bumptech.glide.p082c.C2120d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.e */
public final class C2188e<DataT> implements AbstractC2233n<Uri, DataT> {

    /* renamed from: a */
    private final Context f7493a;

    /* renamed from: b */
    private final AbstractC2233n<File, DataT> f7494b;

    /* renamed from: c */
    private final AbstractC2233n<Uri, DataT> f7495c;

    /* renamed from: d */
    private final Class<DataT> f7496d;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.a.e$d */
    public static final class C2192d<DataT> implements AbstractC2147d<DataT> {

        /* renamed from: a */
        private static final String[] f7499a = {"_data"};

        /* renamed from: b */
        private final Context f7500b;

        /* renamed from: c */
        private final AbstractC2233n<File, DataT> f7501c;

        /* renamed from: d */
        private final AbstractC2233n<Uri, DataT> f7502d;

        /* renamed from: e */
        private final Uri f7503e;

        /* renamed from: f */
        private final int f7504f;

        /* renamed from: g */
        private final int f7505g;

        /* renamed from: h */
        private final C2390f f7506h;

        /* renamed from: i */
        private final Class<DataT> f7507i;

        /* renamed from: j */
        private volatile boolean f7508j;

        /* renamed from: k */
        private volatile AbstractC2147d<DataT> f7509k;

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public Class<DataT> mo10481a() {
            return this.f7507i;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: d */
        public DataSource mo10491d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
            AbstractC2147d<DataT> dVar = this.f7509k;
            if (dVar != null) {
                dVar.mo10489b();
            }
        }

        /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: com.bumptech.glide.load.a.d<Data>, com.bumptech.glide.load.a.d<DataT> */
        /* renamed from: e */
        private AbstractC2147d<DataT> m9482e() throws FileNotFoundException {
            AbstractC2233n.C2234a<DataT> f = m9483f();
            if (f != null) {
                return (AbstractC2147d<Data>) f.f7558c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m9484g() {
            if (this.f7500b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: c */
        public void mo10490c() {
            this.f7508j = true;
            AbstractC2147d<DataT> dVar = this.f7509k;
            if (dVar != null) {
                dVar.mo10490c();
            }
        }

        /* renamed from: f */
        private AbstractC2233n.C2234a<DataT> m9483f() throws FileNotFoundException {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f7501c.mo10534a(m9481a(this.f7503e), this.f7504f, this.f7505g, this.f7506h);
            }
            if (m9484g()) {
                uri = MediaStore.setRequireOriginal(this.f7503e);
            } else {
                uri = this.f7503e;
            }
            return this.f7502d.mo10534a(uri, this.f7504f, this.f7505g, this.f7506h);
        }

        /* renamed from: a */
        private File m9481a(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f7500b.getContentResolver().query(uri, f7499a, null, null, null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super DataT> aVar) {
            try {
                AbstractC2147d<DataT> e = m9482e();
                if (e == null) {
                    aVar.mo10502a((Exception) new IllegalArgumentException("Failed to build fetcher for: " + this.f7503e));
                    return;
                }
                this.f7509k = e;
                if (this.f7508j) {
                    mo10490c();
                } else {
                    e.mo10488a(priority, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.mo10502a((Exception) e2);
            }
        }

        C2192d(Context context, AbstractC2233n<File, DataT> nVar, AbstractC2233n<Uri, DataT> nVar2, Uri uri, int i, int i2, C2390f fVar, Class<DataT> cls) {
            this.f7500b = context.getApplicationContext();
            this.f7501c = nVar;
            this.f7502d = nVar2;
            this.f7503e = uri;
            this.f7504f = i;
            this.f7505g = i2;
            this.f7506h = fVar;
            this.f7507i = cls;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.a.e$b */
    public static final class C2190b extends AbstractC2189a<ParcelFileDescriptor> {
        public C2190b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.a.e$c */
    public static final class C2191c extends AbstractC2189a<InputStream> {
        public C2191c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        if (Build.VERSION.SDK_INT < 29 || !C2139b.m9325a(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bumptech.glide.load.b.a.e$a */
    private static abstract class AbstractC2189a<DataT> implements AbstractC2235o<Uri, DataT> {

        /* renamed from: a */
        private final Context f7497a;

        /* renamed from: b */
        private final Class<DataT> f7498b;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public final void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public final AbstractC2233n<Uri, DataT> mo10538a(C2241r rVar) {
            return new C2188e(this.f7497a, rVar.mo10614b(File.class, this.f7498b), rVar.mo10614b(Uri.class, this.f7498b), this.f7498b);
        }

        AbstractC2189a(Context context, Class<DataT> cls) {
            this.f7497a = context;
            this.f7498b = cls;
        }
    }

    C2188e(Context context, AbstractC2233n<File, DataT> nVar, AbstractC2233n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f7493a = context.getApplicationContext();
        this.f7494b = nVar;
        this.f7495c = nVar2;
        this.f7496d = cls;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<DataT> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(uri), new C2192d(this.f7493a, this.f7494b, this.f7495c, uri, i, i2, fVar, this.f7496d));
    }
}
