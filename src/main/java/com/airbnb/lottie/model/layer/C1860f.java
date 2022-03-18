package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.p067a.C1734a;
import com.airbnb.lottie.p067a.p069b.AbstractC1758a;
import com.airbnb.lottie.p067a.p069b.C1779p;
import com.airbnb.lottie.p072d.C1795c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.airbnb.lottie.model.layer.f */
public class C1860f extends AbstractC1852a {

    /* renamed from: f */
    private final RectF f6442f = new RectF();

    /* renamed from: g */
    private final Paint f6443g;

    /* renamed from: h */
    private final float[] f6444h;

    /* renamed from: i */
    private final Path f6445i;

    /* renamed from: j */
    private final Layer f6446j;

    /* renamed from: k */
    private AbstractC1758a<ColorFilter, ColorFilter> f6447k;

    @Override // com.airbnb.lottie.model.AbstractC1848e, com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: a */
    public <T> void mo8935a(T t, C1795c<T> cVar) {
        super.mo8935a(t, cVar);
        if (t != AbstractC1810j.f6196C) {
            return;
        }
        if (cVar == null) {
            this.f6447k = null;
        } else {
            this.f6447k = new C1779p(cVar);
        }
    }

    C1860f(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        C1734a aVar = new C1734a();
        this.f6443g = aVar;
        this.f6444h = new float[8];
        this.f6445i = new Path();
        this.f6446j = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.mo9285p());
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a, com.airbnb.lottie.p067a.p068a.AbstractC1741e
    /* renamed from: a */
    public void mo8933a(RectF rectF, Matrix matrix, boolean z) {
        super.mo8933a(rectF, matrix, z);
        this.f6442f.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f6446j.mo9287r(), (float) this.f6446j.mo9286q());
        this.f6403a.mapRect(this.f6442f);
        rectF.set(this.f6442f);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC1852a
    /* renamed from: b */
    public void mo9297b(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f6446j.mo9285p());
        if (alpha != 0) {
            if (this.f6407e.mo8987a() == null) {
                i2 = 100;
            } else {
                i2 = this.f6407e.mo8987a().mo8960g().intValue();
            }
            int i3 = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
            this.f6443g.setAlpha(i3);
            AbstractC1758a<ColorFilter, ColorFilter> aVar = this.f6447k;
            if (aVar != null) {
                this.f6443g.setColorFilter(aVar.mo8960g());
            }
            if (i3 > 0) {
                float[] fArr = this.f6444h;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f6446j.mo9287r();
                float[] fArr2 = this.f6444h;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f6446j.mo9287r();
                this.f6444h[5] = (float) this.f6446j.mo9286q();
                float[] fArr3 = this.f6444h;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f6446j.mo9286q();
                matrix.mapPoints(this.f6444h);
                this.f6445i.reset();
                Path path = this.f6445i;
                float[] fArr4 = this.f6444h;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f6445i;
                float[] fArr5 = this.f6444h;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f6445i;
                float[] fArr6 = this.f6444h;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f6445i;
                float[] fArr7 = this.f6444h;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f6445i;
                float[] fArr8 = this.f6444h;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f6445i.close();
                canvas.drawPath(this.f6445i, this.f6443g);
            }
        }
    }
}
