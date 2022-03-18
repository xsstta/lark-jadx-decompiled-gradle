package com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode;

import android.graphics.Bitmap;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.AbstractC7317a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode.DecodeFormat;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.C7337c;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p369b.C7294a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p369b.C7295b;
import com.bytedance.ee.log.C13479a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.d */
public class C7339d implements AbstractC7336b<Bitmap, byte[]> {

    /* renamed from: a */
    public final AbstractC7317a f19636a = AbstractC7317a.f19602a;

    /* renamed from: b */
    public AbstractC7301c f19637b;

    /* renamed from: c */
    public DecodeFormat f19638c;

    /* renamed from: d */
    private C7337c f19639d = new C7337c();

    public C7339d(AbstractC7301c cVar, DecodeFormat decodeFormat) {
        this.f19638c = decodeFormat;
        this.f19637b = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7336b
    /* renamed from: a */
    public void mo28591a(InputStream inputStream, final int i, final int i2, final AbstractC7335a<Bitmap, byte[]> aVar) {
        this.f19639d.mo28593a(inputStream, new C7337c.AbstractC7338a() {
            /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.C7339d.C73401 */

            @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.C7337c.AbstractC7338a
            /* renamed from: a */
            public void mo28594a(Exception exc) {
                C13479a.m54764b("ProgressiveImageLoader", "progressive decode error, e = " + exc.getMessage());
                aVar.mo28590a(exc);
            }

            @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.C7337c.AbstractC7338a
            /* renamed from: a */
            public void mo28595a(byte[] bArr, boolean z) {
                aVar.mo28589a(ImageWrapper.m29301b(new C7295b(bArr), z));
                Bitmap a = C7339d.this.f19636a.mo28547a(new ByteArrayInputStream(bArr), C7339d.this.f19637b, i, i2, C7339d.this.f19638c);
                C13479a.m54764b("ProgressiveImageLoader", String.format("progressive decode success, bitmap = %s, isLast = %s", a.toString(), String.valueOf(z)));
                aVar.mo28589a(ImageWrapper.m29300a(C7294a.m29141a(a, C7339d.this.f19637b), z));
            }
        });
    }
}
