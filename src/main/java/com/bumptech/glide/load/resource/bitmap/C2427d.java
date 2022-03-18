package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.engine.p087a.C2284f;
import com.bumptech.glide.load.resource.AbstractC2394a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public final class C2427d extends AbstractC2394a<Bitmap> {

    /* renamed from: b */
    private final AbstractC2283e f7978b = new C2284f();

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.resource.AbstractC2394a
    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10906a(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C2428e(decodeBitmap, this.f7978b);
    }
}
