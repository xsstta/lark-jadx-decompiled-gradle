package com.bumptech.glide.load.resource.p091b;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.AbstractC2378q;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.bumptech.glide.util.C2567j;

/* renamed from: com.bumptech.glide.load.resource.b.b */
public abstract class AbstractC2402b<T extends Drawable> implements AbstractC2378q, AbstractC2383u<T> {

    /* renamed from: a */
    protected final T f7945a;

    /* renamed from: b */
    public final T mo10878d() {
        Drawable.ConstantState constantState = this.f7945a.getConstantState();
        return constantState == null ? this.f7945a : (T) constantState.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.AbstractC2378q
    /* renamed from: a */
    public void mo10884a() {
        T t = this.f7945a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C2468c) {
            ((C2468c) t).mo11000b().prepareToDraw();
        }
    }

    public AbstractC2402b(T t) {
        this.f7945a = (T) ((Drawable) C2567j.m10894a(t));
    }
}
