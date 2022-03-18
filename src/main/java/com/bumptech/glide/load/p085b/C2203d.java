package com.bumptech.glide.load.p085b;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import com.bumptech.glide.util.C2542a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.d */
public class C2203d implements AbstractC2233n<File, ByteBuffer> {
    /* renamed from: a */
    public boolean mo10536a(File file) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.d$a */
    public static final class C2204a implements AbstractC2147d<ByteBuffer> {

        /* renamed from: a */
        private final File f7516a;

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
        public Class<ByteBuffer> mo10481a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: d */
        public DataSource mo10491d() {
            return DataSource.LOCAL;
        }

        C2204a(File file) {
            this.f7516a = file;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super ByteBuffer> aVar) {
            try {
                aVar.mo10503a(C2542a.m10843a(this.f7516a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo10502a((Exception) e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.b.d$b */
    public static class C2205b implements AbstractC2235o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<File, ByteBuffer> mo10538a(C2241r rVar) {
            return new C2203d();
        }
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<ByteBuffer> mo10534a(File file, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(file), new C2204a(file));
    }
}
