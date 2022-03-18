package com.bumptech.glide.load.resource.p094e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.C2428e;
import com.bumptech.glide.load.resource.p093d.C2468c;

/* renamed from: com.bumptech.glide.load.resource.e.c */
public final class C2483c implements AbstractC2485e<Drawable, byte[]> {

    /* renamed from: a */
    private final AbstractC2283e f8098a;

    /* renamed from: b */
    private final AbstractC2485e<Bitmap, byte[]> f8099b;

    /* renamed from: c */
    private final AbstractC2485e<C2468c, byte[]> f8100c;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bumptech.glide.load.engine.u<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static AbstractC2383u<C2468c> m10470a(AbstractC2383u<Drawable> uVar) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.resource.p094e.AbstractC2485e
    /* renamed from: a */
    public AbstractC2383u<byte[]> mo11044a(AbstractC2383u<Drawable> uVar, C2390f fVar) {
        Drawable d = uVar.mo10878d();
        if (d instanceof BitmapDrawable) {
            return this.f8099b.mo11044a(C2428e.m10257a(((BitmapDrawable) d).getBitmap(), this.f8098a), fVar);
        }
        if (d instanceof C2468c) {
            return this.f8100c.mo11044a(m10470a(uVar), fVar);
        }
        return null;
    }

    public C2483c(AbstractC2283e eVar, AbstractC2485e<Bitmap, byte[]> eVar2, AbstractC2485e<C2468c, byte[]> eVar3) {
        this.f8098a = eVar;
        this.f8099b = eVar2;
        this.f8100c = eVar3;
    }
}
