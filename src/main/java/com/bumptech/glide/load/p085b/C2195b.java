package com.bumptech.glide.load.p085b;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.b */
public class C2195b<Data> implements AbstractC2233n<byte[], Data> {

    /* renamed from: a */
    private final AbstractC2198b<Data> f7511a;

    /* renamed from: com.bumptech.glide.load.b.b$b */
    public interface AbstractC2198b<Data> {
        /* renamed from: a */
        Class<Data> mo10554a();

        /* renamed from: b */
        Data mo10556b(byte[] bArr);
    }

    /* renamed from: a */
    public boolean mo10536a(byte[] bArr) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.b$c */
    public static class C2199c<Data> implements AbstractC2147d<Data> {

        /* renamed from: a */
        private final byte[] f7513a;

        /* renamed from: b */
        private final AbstractC2198b<Data> f7514b;

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
        }

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
            return this.f7514b.mo10554a();
        }

        C2199c(byte[] bArr, AbstractC2198b<Data> bVar) {
            this.f7513a = bArr;
            this.f7514b = bVar;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super Data> aVar) {
            aVar.mo10503a((Object) this.f7514b.mo10556b(this.f7513a));
        }
    }

    public C2195b(AbstractC2198b<Data> bVar) {
        this.f7511a = bVar;
    }

    /* renamed from: com.bumptech.glide.load.b.b$a */
    public static class C2196a implements AbstractC2235o<byte[], ByteBuffer> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<byte[], ByteBuffer> mo10538a(C2241r rVar) {
            return new C2195b(new AbstractC2198b<ByteBuffer>() {
                /* class com.bumptech.glide.load.p085b.C2195b.C2196a.C21971 */

                @Override // com.bumptech.glide.load.p085b.C2195b.AbstractC2198b
                /* renamed from: a */
                public Class<ByteBuffer> mo10554a() {
                    return ByteBuffer.class;
                }

                /* renamed from: a */
                public ByteBuffer mo10556b(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    /* renamed from: com.bumptech.glide.load.b.b$d */
    public static class C2200d implements AbstractC2235o<byte[], InputStream> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<byte[], InputStream> mo10538a(C2241r rVar) {
            return new C2195b(new AbstractC2198b<InputStream>() {
                /* class com.bumptech.glide.load.p085b.C2195b.C2200d.C22011 */

                @Override // com.bumptech.glide.load.p085b.C2195b.AbstractC2198b
                /* renamed from: a */
                public Class<InputStream> mo10554a() {
                    return InputStream.class;
                }

                /* renamed from: a */
                public InputStream mo10556b(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(byte[] bArr, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(bArr), new C2199c(bArr, this.f7511a));
    }
}
