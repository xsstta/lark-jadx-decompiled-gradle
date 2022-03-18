package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC2392h;
import com.bumptech.glide.load.C2267e;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public class C2426c implements AbstractC2392h<Bitmap> {

    /* renamed from: a */
    public static final C2267e<Integer> f7975a = C2267e.m9710a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", (Object) 90);

    /* renamed from: b */
    public static final C2267e<Bitmap.CompressFormat> f7976b = C2267e.m9709a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: c */
    private final AbstractC2278b f7977c;

    public C2426c() {
    }

    @Override // com.bumptech.glide.load.AbstractC2392h
    /* renamed from: a */
    public EncodeStrategy mo10905a(C2390f fVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    public C2426c(AbstractC2278b bVar) {
        this.f7977c = bVar;
    }

    /* renamed from: a */
    private Bitmap.CompressFormat m10252a(Bitmap bitmap, C2390f fVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) fVar.mo10900a(f7976b);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r6 == null) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc A[SYNTHETIC, Splitter:B:34:0x00bc] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10479a(com.bumptech.glide.load.engine.AbstractC2383u<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.C2390f r11) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2426c.mo10479a(com.bumptech.glide.load.engine.u, java.io.File, com.bumptech.glide.load.f):boolean");
    }
}
