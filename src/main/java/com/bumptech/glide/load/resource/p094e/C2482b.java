package com.bumptech.glide.load.resource.p094e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.bitmap.C2447s;
import com.bumptech.glide.util.C2567j;

/* renamed from: com.bumptech.glide.load.resource.e.b */
public class C2482b implements AbstractC2485e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f8097a;

    public C2482b(Resources resources) {
        this.f8097a = (Resources) C2567j.m10894a(resources);
    }

    @Override // com.bumptech.glide.load.resource.p094e.AbstractC2485e
    /* renamed from: a */
    public AbstractC2383u<BitmapDrawable> mo11044a(AbstractC2383u<Bitmap> uVar, C2390f fVar) {
        return C2447s.m10337a(this.f8097a, uVar);
    }
}
