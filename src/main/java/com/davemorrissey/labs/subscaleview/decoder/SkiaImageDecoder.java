package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class SkiaImageDecoder implements ImageDecoder {
    private final Bitmap.Config bitmapConfig;

    public SkiaImageDecoder() {
        this(null);
    }

    public SkiaImageDecoder(Bitmap.Config config) {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = Bitmap.Config.RGB_565;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8 A[SYNTHETIC, Splitter:B:41:0x00c8] */
    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageDecoder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap decode(android.content.Context r9, android.net.Uri r10) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder.decode(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }
}
