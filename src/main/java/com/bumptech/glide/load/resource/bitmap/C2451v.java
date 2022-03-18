package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.AbstractC2391g;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.p091b.C2404d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
public class C2451v implements AbstractC2391g<Uri, Bitmap> {

    /* renamed from: a */
    private final C2404d f8026a;

    /* renamed from: b */
    private final AbstractC2283e f8027b;

    public C2451v(C2404d dVar, AbstractC2283e eVar) {
        this.f8026a = dVar;
        this.f8027b = eVar;
    }

    /* renamed from: a */
    public boolean mo10904a(Uri uri, C2390f fVar) {
        return "android.resource".equals(uri.getScheme());
    }

    /* renamed from: a */
    public AbstractC2383u<Bitmap> mo10903a(Uri uri, int i, int i2, C2390f fVar) {
        AbstractC2383u<Drawable> a = this.f8026a.mo10903a(uri, i, i2, fVar);
        if (a == null) {
            return null;
        }
        return C2437l.m10306a(this.f8027b, a.mo10878d(), i, i2);
    }
}
