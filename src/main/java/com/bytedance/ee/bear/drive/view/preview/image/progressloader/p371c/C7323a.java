package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7331e;
import com.bytedance.ee.log.C13479a;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.c.a */
public class C7323a implements AbstractC7325c<ImageView, Bitmap> {

    /* renamed from: a */
    private final ImageView f19607a;

    /* renamed from: b */
    private final C7331e f19608b;

    /* renamed from: a */
    public ImageView mo28554c() {
        return this.f19607a;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.AbstractC7325c
    /* renamed from: b */
    public void mo28553b() {
        C13479a.m54764b("ProgressiveImageLoader", "target clear resource...");
        this.f19607a.setImageBitmap(null);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.AbstractC7325c
    /* renamed from: a */
    public void mo28551a(AbstractC7324b bVar) {
        this.f19608b.mo28583a(bVar);
    }

    public C7323a(ImageView imageView) {
        Objects.requireNonNull(imageView, "View must not be null!");
        this.f19607a = imageView;
        this.f19608b = new C7331e(imageView);
    }

    /* renamed from: a */
    public void mo28552a(Bitmap bitmap) {
        C13479a.m54764b("ProgressiveImageLoader", "target set resource, resource = " + bitmap.toString());
        this.f19607a.setImageBitmap(bitmap);
    }
}
