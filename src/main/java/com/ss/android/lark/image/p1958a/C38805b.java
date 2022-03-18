package com.ss.android.lark.image.p1958a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.p094e.AbstractC2485e;

/* renamed from: com.ss.android.lark.image.a.b */
public class C38805b implements AbstractC2485e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f99756a;

    public C38805b(Context context) {
        this.f99756a = context.getResources();
    }

    @Override // com.bumptech.glide.load.resource.p094e.AbstractC2485e
    /* renamed from: a */
    public AbstractC2383u<BitmapDrawable> mo11044a(AbstractC2383u<Bitmap> uVar, C2390f fVar) {
        return C38806c.m153148a(this.f99756a, uVar);
    }
}
