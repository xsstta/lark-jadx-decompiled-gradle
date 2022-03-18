package com.bumptech.glide.load.p085b;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.f */
public class C2211f<Data> implements AbstractC2233n<File, Data> {

    /* renamed from: a */
    private final AbstractC2216d<Data> f7523a;

    /* renamed from: com.bumptech.glide.load.b.f$d */
    public interface AbstractC2216d<Data> {
        /* renamed from: a */
        Class<Data> mo10569a();

        /* renamed from: a */
        void mo10571a(Data data) throws IOException;

        /* renamed from: b */
        Data mo10572b(File file) throws FileNotFoundException;
    }

    /* renamed from: a */
    public boolean mo10536a(File file) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.b.f$c */
    public static final class C2215c<Data> implements AbstractC2147d<Data> {

        /* renamed from: a */
        private final File f7525a;

        /* renamed from: b */
        private final AbstractC2216d<Data> f7526b;

        /* renamed from: c */
        private Data f7527c;

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
            return this.f7526b.mo10569a();
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
            Data data = this.f7527c;
            if (data != null) {
                try {
                    this.f7526b.mo10571a(data);
                } catch (IOException unused) {
                }
            }
        }

        C2215c(File file, AbstractC2216d<Data> dVar) {
            this.f7525a = file;
            this.f7526b = dVar;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super Data> aVar) {
            try {
                Data b = this.f7526b.mo10572b(this.f7525a);
                this.f7527c = b;
                aVar.mo10503a((Object) b);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo10502a((Exception) e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$b */
    public static class C2213b extends C2212a<ParcelFileDescriptor> {
        public C2213b() {
            super(new AbstractC2216d<ParcelFileDescriptor>() {
                /* class com.bumptech.glide.load.p085b.C2211f.C2213b.C22141 */

                @Override // com.bumptech.glide.load.p085b.C2211f.AbstractC2216d
                /* renamed from: a */
                public Class<ParcelFileDescriptor> mo10569a() {
                    return ParcelFileDescriptor.class;
                }

                /* renamed from: a */
                public ParcelFileDescriptor mo10572b(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }

                /* renamed from: a */
                public void mo10571a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }
            });
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$e */
    public static class C2217e extends C2212a<InputStream> {
        public C2217e() {
            super(new AbstractC2216d<InputStream>() {
                /* class com.bumptech.glide.load.p085b.C2211f.C2217e.C22181 */

                @Override // com.bumptech.glide.load.p085b.C2211f.AbstractC2216d
                /* renamed from: a */
                public Class<InputStream> mo10569a() {
                    return InputStream.class;
                }

                /* renamed from: a */
                public InputStream mo10572b(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }

                /* renamed from: a */
                public void mo10571a(InputStream inputStream) throws IOException {
                    inputStream.close();
                }
            });
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$a */
    public static class C2212a<Data> implements AbstractC2235o<File, Data> {

        /* renamed from: a */
        private final AbstractC2216d<Data> f7524a;

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public final void mo10539a() {
        }

        public C2212a(AbstractC2216d<Data> dVar) {
            this.f7524a = dVar;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public final AbstractC2233n<File, Data> mo10538a(C2241r rVar) {
            return new C2211f(this.f7524a);
        }
    }

    public C2211f(AbstractC2216d<Data> dVar) {
        this.f7523a = dVar;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(File file, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(file), new C2215c(file, this.f7523a));
    }
}
