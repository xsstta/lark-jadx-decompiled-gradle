package com.ss.android.shapeimage.p3023b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.shapeimage.p3021a.C59972a;
import com.ss.android.shapeimage.p3021a.p3022a.C59980g;

/* renamed from: com.ss.android.shapeimage.b.b */
public class C59985b extends AbstractC59984a {

    /* renamed from: l */
    private final Path f149556l = new Path();

    /* renamed from: m */
    private final Path f149557m = new Path();

    /* renamed from: n */
    private final Matrix f149558n = new Matrix();

    /* renamed from: o */
    private final float[] f149559o = new float[2];

    /* renamed from: p */
    private C59980g f149560p;

    /* renamed from: q */
    private int f149561q = -1;

    /* renamed from: r */
    private int f149562r = 0;

    /* renamed from: s */
    private int f149563s = -1;

    /* renamed from: t */
    private int f149564t = -1;

    /* renamed from: u */
    private int f149565u = 0;

    @Override // com.ss.android.shapeimage.p3023b.AbstractC59984a
    /* renamed from: b */
    public void mo204257b() {
        this.f149556l.reset();
        this.f149557m.reset();
    }

    public C59985b(int i) {
        this.f149561q = i;
    }

    /* renamed from: a */
    public void mo204264a(Context context, int i) {
        if (i != -1) {
            this.f149560p = C59972a.m232757a(context, i);
            return;
        }
        throw new RuntimeException("No resource is defined as shape");
    }

    @Override // com.ss.android.shapeimage.p3023b.AbstractC59984a
    /* renamed from: a */
    public void mo204252a(Context context, AttributeSet attributeSet, int i) {
        super.mo204252a(context, attributeSet, i);
        mo204264a(context, this.f149561q);
    }

    @Override // com.ss.android.shapeimage.p3023b.AbstractC59984a
    /* renamed from: a */
    public void mo204253a(Canvas canvas, Paint paint, Paint paint2) {
        canvas.save();
        canvas.drawPath(this.f149557m, paint2);
        canvas.concat(this.f149555k);
        canvas.drawPath(this.f149556l, paint);
        canvas.restore();
    }

    @Override // com.ss.android.shapeimage.p3023b.AbstractC59984a
    /* renamed from: a */
    public void mo204251a(int i, int i2, float f, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        this.f149556l.reset();
        this.f149557m.reset();
        this.f149559o[0] = this.f149560p.mo204239a();
        this.f149559o[1] = this.f149560p.mo204241b();
        this.f149558n.reset();
        float[] fArr = this.f149559o;
        float min = Math.min(f / fArr[0], f2 / fArr[1]);
        this.f149558n.setScale(min, min);
        this.f149558n.postTranslate((float) Math.round((f - (this.f149559o[0] * min)) * 0.5f), (float) Math.round((f2 - (this.f149559o[1] * min)) * 0.5f));
        this.f149560p.mo204240a(this.f149558n, this.f149556l);
        this.f149556l.offset((float) this.f149548d, (float) this.f149548d);
        if (this.f149548d > 0) {
            this.f149558n.reset();
            if (this.f149562r == 0) {
                f8 = (float) (this.f149545a - this.f149548d);
                f7 = (float) (this.f149546b - this.f149548d);
                f6 = ((float) this.f149548d) / 2.0f;
            } else {
                f8 = (float) this.f149545a;
                f7 = (float) this.f149546b;
                f6 = BitmapDescriptorFactory.HUE_RED;
            }
            float[] fArr2 = this.f149559o;
            float min2 = Math.min(f8 / fArr2[0], f7 / fArr2[1]);
            this.f149558n.setScale(min2, min2);
            this.f149558n.postTranslate((float) Math.round(((f8 - (this.f149559o[0] * min2)) * 0.5f) + f6), (float) Math.round(((f7 - (this.f149559o[1] * min2)) * 0.5f) + f6));
            this.f149560p.mo204240a(this.f149558n, this.f149557m);
        }
        this.f149558n.reset();
        this.f149555k.invert(this.f149558n);
        this.f149556l.transform(this.f149558n);
    }
}
