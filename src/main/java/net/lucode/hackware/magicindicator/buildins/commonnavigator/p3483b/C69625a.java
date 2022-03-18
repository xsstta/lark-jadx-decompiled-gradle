package net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;
import net.lucode.hackware.magicindicator.C69611a;
import net.lucode.hackware.magicindicator.buildins.C69617a;
import net.lucode.hackware.magicindicator.buildins.C69618b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3484c.C69626a;

/* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.b.a */
public class C69625a extends View implements AbstractC69623c {

    /* renamed from: a */
    private int f174050a;

    /* renamed from: b */
    private Interpolator f174051b = new LinearInterpolator();

    /* renamed from: c */
    private Interpolator f174052c = new LinearInterpolator();

    /* renamed from: d */
    private float f174053d;

    /* renamed from: e */
    private float f174054e;

    /* renamed from: f */
    private float f174055f;

    /* renamed from: g */
    private float f174056g;

    /* renamed from: h */
    private float f174057h;

    /* renamed from: i */
    private Paint f174058i;

    /* renamed from: j */
    private List<C69626a> f174059j;

    /* renamed from: k */
    private List<Integer> f174060k;

    /* renamed from: l */
    private RectF f174061l = new RectF();

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: a */
    public void mo45269a(int i) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: b */
    public void mo45271b(int i) {
    }

    public List<Integer> getColors() {
        return this.f174060k;
    }

    public Interpolator getEndInterpolator() {
        return this.f174052c;
    }

    public float getLineHeight() {
        return this.f174054e;
    }

    public float getLineWidth() {
        return this.f174056g;
    }

    public int getMode() {
        return this.f174050a;
    }

    public Paint getPaint() {
        return this.f174058i;
    }

    public float getRoundRadius() {
        return this.f174057h;
    }

    public Interpolator getStartInterpolator() {
        return this.f174051b;
    }

    public float getXOffset() {
        return this.f174055f;
    }

    public float getYOffset() {
        return this.f174053d;
    }

    public void setLineHeight(float f) {
        this.f174054e = f;
    }

    public void setLineWidth(float f) {
        this.f174056g = f;
    }

    public void setRoundRadius(float f) {
        this.f174057h = f;
    }

    public void setXOffset(float f) {
        this.f174055f = f;
    }

    public void setYOffset(float f) {
        this.f174053d = f;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c
    /* renamed from: a */
    public void mo45270a(List<C69626a> list) {
        this.f174059j = list;
    }

    public void setColors(Integer... numArr) {
        this.f174060k = Arrays.asList(numArr);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f174061l;
        float f = this.f174057h;
        canvas.drawRoundRect(rectF, f, f, this.f174058i);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f174052c = interpolator;
        if (interpolator == null) {
            this.f174052c = new LinearInterpolator();
        }
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f174051b = interpolator;
        if (interpolator == null) {
            this.f174051b = new LinearInterpolator();
        }
    }

    public C69625a(Context context) {
        super(context);
        m267448a(context);
    }

    /* renamed from: a */
    private void m267448a(Context context) {
        Paint paint = new Paint(1);
        this.f174058i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f174054e = (float) C69618b.m267418a(context, 3.0d);
        this.f174056g = (float) C69618b.m267418a(context, 10.0d);
    }

    public void setMode(int i) {
        if (i == 2 || i == 0 || i == 1) {
            this.f174050a = i;
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
        List<C69626a> list = this.f174059j;
        if (list != null && !list.isEmpty()) {
            List<Integer> list2 = this.f174060k;
            if (list2 != null && list2.size() > 0) {
                this.f174058i.setColor(C69617a.m267416a(f, this.f174060k.get(Math.abs(i) % this.f174060k.size()).intValue(), this.f174060k.get(Math.abs(i + 1) % this.f174060k.size()).intValue()));
            }
            C69626a a = C69611a.m267388a(this.f174059j, i);
            C69626a a2 = C69611a.m267388a(this.f174059j, i + 1);
            int i3 = this.f174050a;
            if (i3 == 0) {
                f5 = ((float) a.f174062a) + this.f174055f;
                f4 = ((float) a2.f174062a) + this.f174055f;
                f2 = ((float) a.f174064c) - this.f174055f;
                f6 = (float) a2.f174064c;
                f7 = this.f174055f;
            } else if (i3 == 1) {
                f5 = ((float) a.f174066e) + this.f174055f;
                f4 = ((float) a2.f174066e) + this.f174055f;
                f2 = ((float) a.f174068g) - this.f174055f;
                f6 = (float) a2.f174068g;
                f7 = this.f174055f;
            } else {
                f5 = ((float) a.f174062a) + ((((float) a.mo243243a()) - this.f174056g) / 2.0f);
                f4 = ((float) a2.f174062a) + ((((float) a2.mo243243a()) - this.f174056g) / 2.0f);
                f2 = ((((float) a.mo243243a()) + this.f174056g) / 2.0f) + ((float) a.f174062a);
                f3 = ((((float) a2.mo243243a()) + this.f174056g) / 2.0f) + ((float) a2.f174062a);
                this.f174061l.left = f5 + ((f4 - f5) * this.f174051b.getInterpolation(f));
                this.f174061l.right = f2 + ((f3 - f2) * this.f174052c.getInterpolation(f));
                this.f174061l.top = (((float) getHeight()) - this.f174054e) - this.f174053d;
                this.f174061l.bottom = ((float) getHeight()) - this.f174053d;
                invalidate();
            }
            f3 = f6 - f7;
            this.f174061l.left = f5 + ((f4 - f5) * this.f174051b.getInterpolation(f));
            this.f174061l.right = f2 + ((f3 - f2) * this.f174052c.getInterpolation(f));
            this.f174061l.top = (((float) getHeight()) - this.f174054e) - this.f174053d;
            this.f174061l.bottom = ((float) getHeight()) - this.f174053d;
            invalidate();
        }
    }
}
