package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.airbnb.lottie.model.layer.c */
public class C1857c extends AbstractC1852a {

    /* renamed from: f */
    private final Paint f6437f = new C1734a(3);

    /* renamed from: g */
    private final Rect f6438g = new Rect();

    /* renamed from: h */
    private final Rect f6439h = new Rect();

    /* renamed from: i */
    private AbstractC1758a<ColorFilter, ColorFilter> f6440i;

    /* renamed from: f */
    private Bitmap m8360f() {
        return this.f6404b.mo8888e(this.f6405c.mo9276g());
    }

    C1857c(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
    }

    @Override // com.airbnb.lottie.model.AbstractC1848e, com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        super.mo8935a(t, cVar);
        if (t != AbstractC1810j.f6196C) {
            return;
        }
        if (cVar == null) {
            this.f6440i = null;
        } else {
            this.f6440i = new C1779p(cVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        super.mo8933a(rectF, matrix, z);
        Bitmap f = m8360f();
        if (f != null) {
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((float) f.getWidth()) * C1791h.m8011a(), ((float) f.getHeight()) * C1791h.m8011a());
            this.f6403a.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9297b(Canvas canvas, Matrix matrix, int i) {
        Bitmap f = m8360f();
        if (f != null && !f.isRecycled()) {
            float a = C1791h.m8011a();
            this.f6437f.setAlpha(i);
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f6440i;
            if (aVar != null) {
                this.f6437f.setColorFilter(aVar.mo8960g());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f6438g.set(0, 0, f.getWidth(), f.getHeight());
            this.f6439h.set(0, 0, (int) (((float) f.getWidth()) * a), (int) (((float) f.getHeight()) * a));
            canvas.drawBitmap(f, this.f6438g, this.f6439h, this.f6437f);
            canvas.restore();
        }
    }
}
