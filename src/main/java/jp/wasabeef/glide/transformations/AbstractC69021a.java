package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.resource.bitmap.C2428e;
import com.bumptech.glide.util.C2568k;

/* renamed from: jp.wasabeef.glide.transformations.a */
public abstract class AbstractC69021a implements AbstractC2393i<Bitmap> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo238822a(Context context, AbstractC2283e eVar, Bitmap bitmap, int i, int i2);

    @Override // com.bumptech.glide.load.AbstractC2393i
    /* renamed from: a */
    public final AbstractC2383u<Bitmap> mo10631a(Context context, AbstractC2383u<Bitmap> uVar, int i, int i2) {
        if (C2568k.m10911a(i, i2)) {
            AbstractC2283e a = ComponentCallbacks2C2115c.m9149b(context).mo10350a();
            Bitmap d = uVar.mo10878d();
            if (i == Integer.MIN_VALUE) {
                i = d.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = d.getHeight();
            }
            Bitmap a2 = mo238822a(context.getApplicationContext(), a, d, i, i2);
            if (d.equals(a2)) {
                return uVar;
            }
            return C2428e.m10257a(a2, a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
