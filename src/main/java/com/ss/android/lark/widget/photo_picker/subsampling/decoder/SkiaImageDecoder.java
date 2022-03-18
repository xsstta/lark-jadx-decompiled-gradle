package com.ss.android.lark.widget.photo_picker.subsampling.decoder;

import android.graphics.Bitmap;
import com.ss.android.lark.widget.photo_picker.subsampling.SubsamplingScaleImageView;

public class SkiaImageDecoder implements AbstractC58850c {

    /* renamed from: a */
    private final Bitmap.Config f145561a;

    public SkiaImageDecoder() {
        this(null);
    }

    public SkiaImageDecoder(Bitmap.Config config) {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.f145561a = config;
        } else if (preferredBitmapConfig != null) {
            this.f145561a = preferredBitmapConfig;
        } else {
            this.f145561a = Bitmap.Config.RGB_565;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8 A[SYNTHETIC, Splitter:B:41:0x00c8] */
    @Override // com.ss.android.lark.widget.photo_picker.subsampling.decoder.AbstractC58850c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo199033a(android.content.Context r9, android.net.Uri r10) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.subsampling.decoder.SkiaImageDecoder.mo199033a(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }
}
