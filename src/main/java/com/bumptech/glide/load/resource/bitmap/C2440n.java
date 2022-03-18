package com.bumptech.glide.load.resource.bitmap;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
public final class C2440n implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10476a(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10477a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo10475a(InputStream inputStream, AbstractC2278b bVar) throws IOException {
        int a = new ExifInterface(inputStream).mo4995a("Orientation", 1);
        if (a == 0) {
            return -1;
        }
        return a;
    }
}
