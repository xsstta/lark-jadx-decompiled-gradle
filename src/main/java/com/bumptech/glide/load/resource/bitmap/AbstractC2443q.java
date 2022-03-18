package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2168b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.load.p083a.C2160k;
import com.bumptech.glide.load.p083a.C2163m;
import com.bumptech.glide.util.C2567j;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
public interface AbstractC2443q {
    /* renamed from: a */
    Bitmap mo10958a(BitmapFactory.Options options) throws IOException;

    /* renamed from: a */
    ImageHeaderParser.ImageType mo10959a() throws IOException;

    /* renamed from: b */
    int mo10960b() throws IOException;

    /* renamed from: c */
    void mo10961c();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.q$a */
    public static final class C2444a implements AbstractC2443q {

        /* renamed from: a */
        private final C2160k f8010a;

        /* renamed from: b */
        private final AbstractC2278b f8011b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f8012c;

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: c */
        public void mo10961c() {
            this.f8010a.mo10522d();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: b */
        public int mo10960b() throws IOException {
            return C2168b.m9431b(this.f8012c, this.f8010a.mo10504a(), this.f8011b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo10959a() throws IOException {
            return C2168b.m9428a(this.f8012c, this.f8010a.mo10504a(), this.f8011b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: a */
        public Bitmap mo10958a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f8010a.mo10504a(), null, options);
        }

        C2444a(InputStream inputStream, List<ImageHeaderParser> list, AbstractC2278b bVar) {
            this.f8011b = (AbstractC2278b) C2567j.m10894a(bVar);
            this.f8012c = (List) C2567j.m10894a((Object) list);
            this.f8010a = new C2160k(inputStream, bVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.q$b */
    public static final class C2445b implements AbstractC2443q {

        /* renamed from: a */
        private final AbstractC2278b f8013a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f8014b;

        /* renamed from: c */
        private final C2163m f8015c;

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: c */
        public void mo10961c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: b */
        public int mo10960b() throws IOException {
            return C2168b.m9430b(this.f8014b, this.f8015c, this.f8013a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo10959a() throws IOException {
            return C2168b.m9426a(this.f8014b, this.f8015c, this.f8013a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.AbstractC2443q
        /* renamed from: a */
        public Bitmap mo10958a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f8015c.mo10504a().getFileDescriptor(), null, options);
        }

        C2445b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, AbstractC2278b bVar) {
            this.f8013a = (AbstractC2278b) C2567j.m10894a(bVar);
            this.f8014b = (List) C2567j.m10894a((Object) list);
            this.f8015c = new C2163m(parcelFileDescriptor);
        }
    }
}
