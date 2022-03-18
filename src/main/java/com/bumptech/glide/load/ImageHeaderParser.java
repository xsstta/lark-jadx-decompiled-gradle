package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {
    /* renamed from: a */
    int mo10475a(InputStream inputStream, AbstractC2278b bVar) throws IOException;

    /* renamed from: a */
    ImageType mo10476a(InputStream inputStream) throws IOException;

    /* renamed from: a */
    ImageType mo10477a(ByteBuffer byteBuffer) throws IOException;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }
    }
}
