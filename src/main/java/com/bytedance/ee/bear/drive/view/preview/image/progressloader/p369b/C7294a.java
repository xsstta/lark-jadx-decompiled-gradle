package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p369b;

import android.graphics.Bitmap;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.p370a.AbstractC7301c;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.b.a */
public class C7294a implements AbstractC7296c<Bitmap> {

    /* renamed from: a */
    private final Bitmap f19554a;

    /* renamed from: b */
    private final AbstractC7301c f19555b;

    /* renamed from: a */
    public Bitmap mo28486c() {
        return this.f19554a;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p369b.AbstractC7296c
    /* renamed from: b */
    public void mo28485b() {
        if (!this.f19555b.mo28506a(this.f19554a)) {
            this.f19554a.recycle();
        }
    }

    /* renamed from: a */
    public static C7294a m29141a(Bitmap bitmap, AbstractC7301c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new C7294a(bitmap, cVar);
    }

    public C7294a(Bitmap bitmap, AbstractC7301c cVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        Objects.requireNonNull(cVar, "BitmapPool must not be null");
        this.f19554a = bitmap;
        this.f19555b = cVar;
    }
}
