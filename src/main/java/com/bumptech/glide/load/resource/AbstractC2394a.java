package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.bitmap.C2434k;
import com.bumptech.glide.load.resource.bitmap.C2442p;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.a */
public abstract class AbstractC2394a<T> implements AbstractC2391g<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C2442p f7932a = C2442p.m10316a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC2383u<T> mo10906a(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: a */
    public final boolean mo10904a(ImageDecoder.Source source, C2390f fVar) {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bumptech.glide.load.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC2383u<T> mo10903a(ImageDecoder.Source source, final int i, final int i2, C2390f fVar) throws IOException {
        final boolean z;
        final DecodeFormat decodeFormat = (DecodeFormat) fVar.mo10900a(C2434k.f7985a);
        final DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.mo10900a(DownsampleStrategy.f7959h);
        if (fVar.mo10900a(C2434k.f7989e) == null || !((Boolean) fVar.mo10900a(C2434k.f7989e)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        final PreferredColorSpace preferredColorSpace = (PreferredColorSpace) fVar.mo10900a(C2434k.f7986b);
        return mo10906a(source, i, i2, new ImageDecoder.OnHeaderDecodedListener() {
            /* class com.bumptech.glide.load.resource.AbstractC2394a.C23951 */

            public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                ColorSpace.Named named;
                boolean z = false;
                if (AbstractC2394a.this.f7932a.mo10957a(i, i2, z, false)) {
                    imageDecoder.setAllocator(3);
                } else {
                    imageDecoder.setAllocator(1);
                }
                if (decodeFormat == DecodeFormat.PREFER_RGB_565) {
                    imageDecoder.setMemorySizePolicy(0);
                }
                imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() {
                    /* class com.bumptech.glide.load.resource.AbstractC2394a.C23951.C23961 */

                    public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                        return false;
                    }
                });
                Size size = imageInfo.getSize();
                int i = i;
                if (i == Integer.MIN_VALUE) {
                    i = size.getWidth();
                }
                int i2 = i2;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = size.getHeight();
                }
                float a = downsampleStrategy.mo10927a(size.getWidth(), size.getHeight(), i, i2);
                int round = Math.round(((float) size.getWidth()) * a);
                int round2 = Math.round(((float) size.getHeight()) * a);
                if (Log.isLoggable("ImageDecoder", 2)) {
                    Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + a);
                }
                imageDecoder.setTargetSize(round, round2);
                if (Build.VERSION.SDK_INT >= 28) {
                    if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                        z = true;
                    }
                    if (z) {
                        named = ColorSpace.Named.DISPLAY_P3;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                } else if (Build.VERSION.SDK_INT >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            }
        });
    }
}
