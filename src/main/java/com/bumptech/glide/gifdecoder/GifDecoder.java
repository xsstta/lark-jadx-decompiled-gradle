package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface GifDecoder {

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    /* renamed from: com.bumptech.glide.gifdecoder.GifDecoder$a */
    public interface AbstractC2130a {
        /* renamed from: a */
        Bitmap mo10456a(int i, int i2, Bitmap.Config config);

        /* renamed from: a */
        void mo10457a(Bitmap bitmap);

        /* renamed from: a */
        void mo10458a(byte[] bArr);

        /* renamed from: a */
        void mo10459a(int[] iArr);

        /* renamed from: a */
        byte[] mo10460a(int i);

        /* renamed from: b */
        int[] mo10461b(int i);
    }

    /* renamed from: a */
    ByteBuffer mo10446a();

    /* renamed from: a */
    void mo10447a(Bitmap.Config config);

    /* renamed from: b */
    void mo10448b();

    /* renamed from: c */
    int mo10449c();

    /* renamed from: d */
    int mo10450d();

    /* renamed from: e */
    int mo10451e();

    /* renamed from: f */
    void mo10452f();

    /* renamed from: g */
    int mo10453g();

    /* renamed from: h */
    Bitmap mo10454h();

    /* renamed from: i */
    void mo10455i();
}
