package com.bumptech.glide.request.p095a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.request.a.g */
public class C2519g {
    /* renamed from: a */
    public <Z> AbstractC2523k<ImageView, Z> mo11186a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C2512b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2517e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
