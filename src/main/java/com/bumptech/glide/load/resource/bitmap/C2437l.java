package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.load.engine.p087a.C2284f;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.resource.bitmap.l */
public final class C2437l {

    /* renamed from: a */
    private static final AbstractC2283e f7999a = new C2284f() {
        /* class com.bumptech.glide.load.resource.bitmap.C2437l.C24381 */

        @Override // com.bumptech.glide.load.engine.p087a.AbstractC2283e, com.bumptech.glide.load.engine.p087a.C2284f
        /* renamed from: a */
        public void mo10693a(Bitmap bitmap) {
        }
    };

    /* renamed from: a */
    static AbstractC2383u<Bitmap> m10306a(AbstractC2283e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m10307b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f7999a;
        }
        return C2428e.m10257a(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m10307b(AbstractC2283e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C2455y.m10369a();
            a.lock();
            Bitmap a2 = eVar.mo10690a(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return a2;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
