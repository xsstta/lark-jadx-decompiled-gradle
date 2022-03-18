package com.bytedance.ee.bear.widgets.p568b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.C69611a;
import net.lucode.hackware.magicindicator.buildins.C69617a;
import net.lucode.hackware.magicindicator.buildins.C69618b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3484c.C69626a;

/* renamed from: com.bytedance.ee.bear.widgets.b.a */
public class C11823a extends View implements AbstractC69623c {

    /* renamed from: a */
    private int f31845a;

    /* renamed from: b */
    private Interpolator f31846b = new LinearInterpolator();

    /* renamed from: c */
    private Interpolator f31847c = new LinearInterpolator();

    /* renamed from: d */
    private float f31848d;

    /* renamed from: e */
    private float f31849e;

    /* renamed from: f */
    private float f31850f;

    /* renamed from: g */
    private float f31851g;

    /* renamed from: h */
    private float f31852h;

    /* renamed from: i */
    private Paint f31853i;

    /* renamed from: j */
    private List<C69626a> f31854j;

    /* renamed from: k */
    private List<Integer> f31855k;

    /* renamed from: l */
    private final RectF f31856l = new RectF();

    /* renamed from: m */
    private final RectF f31857m = new RectF();

    /* renamed from: n */
    private final RectF f31858n = new RectF();

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: a */
    public void mo45269a(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: b */
    public void mo45271b(int i) {
    }

    public List<Integer> getColors() {
        return this.f31855k;
    }

    public Interpolator getEndInterpolator() {
        return this.f31847c;
    }

    public float getLineHeight() {
        return this.f31849e;
    }

    public float getLineWidth() {
        return this.f31851g;
    }

    public int getMode() {
        return this.f31845a;
    }

    public Paint getPaint() {
        return this.f31853i;
    }

    public float getRoundRadius() {
        return this.f31852h;
    }

    public Interpolator getStartInterpolator() {
        return this.f31846b;
    }

    public float getXOffset() {
        return this.f31850f;
    }

    public float getYOffset() {
        return this.f31848d;
    }

    public void setLineHeight(float f) {
        this.f31849e = f;
    }

    public void setLineWidth(float f) {
        this.f31851g = f;
    }

    public void setRoundRadius(float f) {
        this.f31852h = f;
    }

    public void setXOffset(float f) {
        this.f31850f = f;
    }

    public void setYOffset(float f) {
        this.f31848d = f;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: a */
    public void mo45270a(List<C69626a> list) {
        this.f31854j = list;
    }

    public void setColors(Integer... numArr) {
        this.f31855k = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f31847c = interpolator;
        if (interpolator == null) {
            this.f31847c = new LinearInterpolator();
        }
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f31846b = interpolator;
        if (interpolator == null) {
            this.f31846b = new LinearInterpolator();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.drawRoundRect(this.f31856l, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f31853i);
        canvas.drawArc(this.f31857m, 180.0f, 90.0f, true, this.f31853i);
        canvas.drawArc(this.f31858n, 270.0f, 90.0f, true, this.f31853i);
    }

    public C11823a(Context context) {
        super(context);
        m49037a(context);
    }

    /* renamed from: a */
    private void m49037a(Context context) {
        Paint paint = new Paint(1);
        this.f31853i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31849e = (float) C69618b.m267418a(context, 2.0d);
        this.f31852h = (float) C69618b.m267418a(context, 2.0d);
        this.f31851g = (float) C69618b.m267418a(context, 10.0d);
    }

    public void setMode(int i) {
        if (i == 2 || i == 0 || i == 1) {
            this.f31845a = i;
            return;
        }
        throw new IllegalArgumentException("mode " + i + " not supported.");
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: a */
    public void mo31045a(int i, float f, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        List<C69626a> list = this.f31854j;
        if (list != null && !list.isEmpty()) {
            List<Integer> list2 = this.f31855k;
            if (list2 != null && list2.size() > 0) {
                this.f31853i.setColor(C69617a.m267416a(f, this.f31855k.get(Math.abs(i) % this.f31855k.size()).intValue(), this.f31855k.get(Math.abs(i + 1) % this.f31855k.size()).intValue()));
            }
            C69626a a = C69611a.m267388a(this.f31854j, i);
            C69626a a2 = C69611a.m267388a(this.f31854j, i + 1);
            int i3 = this.f31845a;
            if (i3 == 0) {
                f5 = ((float) a.f174062a) + this.f31850f;
                f4 = ((float) a2.f174062a) + this.f31850f;
                f2 = ((float) a.f174064c) - this.f31850f;
                f6 = (float) a2.f174064c;
                f7 = this.f31850f;
            } else if (i3 == 1) {
                f5 = ((float) a.f174066e) + this.f31850f;
                f4 = ((float) a2.f174066e) + this.f31850f;
                f2 = ((float) a.f174068g) - this.f31850f;
                f6 = (float) a2.f174068g;
                f7 = this.f31850f;
            } else {
                f5 = ((float) a.f174062a) + ((((float) a.mo243243a()) - this.f31851g) / 2.0f);
                f4 = ((float) a2.f174062a) + ((((float) a2.mo243243a()) - this.f31851g) / 2.0f);
                f2 = ((((float) a.mo243243a()) + this.f31851g) / 2.0f) + ((float) a.f174062a);
                f3 = ((((float) a2.mo243243a()) + this.f31851g) / 2.0f) + ((float) a2.f174062a);
                this.f31856l.left = f5 + ((f4 - f5) * this.f31846b.getInterpolation(f)) + this.f31852h;
                this.f31856l.right = (f2 + ((f3 - f2) * this.f31847c.getInterpolation(f))) - this.f31852h;
                this.f31856l.top = (((float) getHeight()) - this.f31849e) - this.f31848d;
                this.f31856l.bottom = ((float) getHeight()) - this.f31848d;
                this.f31857m.left = this.f31856l.left - this.f31852h;
                this.f31857m.right = this.f31856l.left + this.f31852h;
                this.f31857m.top = this.f31856l.top;
                this.f31857m.bottom = this.f31856l.bottom + this.f31852h;
                this.f31858n.left = this.f31856l.right - this.f31852h;
                this.f31858n.right = this.f31856l.right + this.f31852h;
                this.f31858n.top = this.f31856l.top;
                this.f31858n.bottom = this.f31856l.bottom + this.f31852h;
                invalidate();
            }
            f3 = f6 - f7;
            this.f31856l.left = f5 + ((f4 - f5) * this.f31846b.getInterpolation(f)) + this.f31852h;
            this.f31856l.right = (f2 + ((f3 - f2) * this.f31847c.getInterpolation(f))) - this.f31852h;
            this.f31856l.top = (((float) getHeight()) - this.f31849e) - this.f31848d;
            this.f31856l.bottom = ((float) getHeight()) - this.f31848d;
            this.f31857m.left = this.f31856l.left - this.f31852h;
            this.f31857m.right = this.f31856l.left + this.f31852h;
            this.f31857m.top = this.f31856l.top;
            this.f31857m.bottom = this.f31856l.bottom + this.f31852h;
            this.f31858n.left = this.f31856l.right - this.f31852h;
            this.f31858n.right = this.f31856l.right + this.f31852h;
            this.f31858n.top = this.f31856l.top;
            this.f31858n.bottom = this.f31856l.bottom + this.f31852h;
            invalidate();
        }
    }
}
