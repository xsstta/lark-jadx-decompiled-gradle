package com.bumptech.glide.load.p085b;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.e */
public final class C2206e<Model, Data> implements AbstractC2233n<Model, Data> {

    /* renamed from: a */
    private final AbstractC2207a<Data> f7517a;

    /* renamed from: com.bumptech.glide.load.b.e$a */
    public interface AbstractC2207a<Data> {
        /* renamed from: a */
        Class<Data> mo10561a();

        /* renamed from: a */
        Data mo10562a(String str) throws IllegalArgumentException;

        /* renamed from: a */
        void mo10563a(Data data) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.b.e$b */
    private static final class C2208b<Data> implements AbstractC2147d<Data> {

        /* renamed from: a */
        private final String f7518a;

        /* renamed from: b */
        private final AbstractC2207a<Data> f7519b;

        /* renamed from: c */
        private Data f7520c;

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: c */
        public void mo10490c() {
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: d */
        public DataSource mo10491d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public Class<Data> mo10481a() {
            return this.f7519b.mo10561a();
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
            try {
                this.f7519b.mo10563a((Object) this.f7520c);
            } catch (IOException unused) {
            }
        }

        C2208b(String str, AbstractC2207a<Data> aVar) {
            this.f7518a = str;
            this.f7519b = aVar;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super Data> aVar) {
            try {
                Data a = this.f7519b.mo10562a(this.f7518a);
                this.f7520c = a;
                aVar.mo10503a((Object) a);
            } catch (IllegalArgumentException e) {
                aVar.mo10502a((Exception) e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.b.e$c */
    public static final class C2209c<Model> implements AbstractC2235o<Model, InputStream> {

        /* renamed from: a */
        private final AbstractC2207a<InputStream> f7521a = new AbstractC2207a<InputStream>() {
            /* class com.bumptech.glide.load.p085b.C2206e.C2209c.C22101 */

            @Override // com.bumptech.glide.load.p085b.C2206e.AbstractC2207a
            /* renamed from: a */
            public Class<InputStream> mo10561a() {
                return InputStream.class;
            }

            /* renamed from: a */
            public void mo10563a(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: b */
            public InputStream mo10562a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        };

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Model, InputStream> mo10538a(C2241r rVar) {
            return new C2206e(this.f7521a);
        }
    }

    public C2206e(AbstractC2207a<Data> aVar) {
        this.f7517a = aVar;
    }

    @Override // com.bumptech.glide.load.p085b.AbstractC2233n
    /* renamed from: a */
    public boolean mo10536a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.p085b.AbstractC2233n
    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(Model model, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(model), new C2208b(model.toString(), this.f7517a));
    }
}
