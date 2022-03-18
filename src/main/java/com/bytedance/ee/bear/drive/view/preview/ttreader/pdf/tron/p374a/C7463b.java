package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.p374a;

import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.bitmap.C2428e;
import com.bytedance.ee.plugin.common.ttpdfreader.PagePart;
import com.bytedance.ee.util.p701d.C13615c;
import java.io.IOException;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.a.b */
public class C7463b implements AbstractC2391g<PagePart, Bitmap> {
    /* renamed from: a */
    public boolean mo10904a(PagePart pagePart, C2390f fVar) throws IOException {
        return true;
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(PagePart pagePart, int i, int i2, C2390f fVar) throws IOException {
        return C2428e.m10257a(pagePart.getRenderedBitmap(), ComponentCallbacks2C2115c.m9149b(C13615c.f35773a).mo10350a());
    }
}
