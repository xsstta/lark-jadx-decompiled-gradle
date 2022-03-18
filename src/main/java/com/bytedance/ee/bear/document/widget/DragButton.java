package com.bytedance.ee.bear.document.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

public class DragButton extends View {

    /* renamed from: a */
    Path f17429a;

    /* renamed from: b */
    Paint f17430b;

    /* renamed from: c */
    RectF f17431c;

    /* renamed from: d */
    private int f17432d;

    /* renamed from: e */
    private int f17433e;

    /* renamed from: f */
    private volatile float f17434f;

    /* renamed from: g */
    private float f17435g;

    /* renamed from: h */
    private int f17436h;

    /* renamed from: a */
    private void m25238a() {
        this.f17429a = new Path();
        this.f17430b = new Paint();
        this.f17431c = new RectF();
        this.f17430b.setColor(getResources().getColor(R.color.space_kit_n300));
        this.f17430b.setAntiAlias(true);
        this.f17430b.setStyle(Paint.Style.FILL);
    }

    public DragButton(Context context) {
        this(context, null);
    }

    public void setDragOffset(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f17434f = (1.0f - f) * this.f17435g;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        this.f17429a.reset();
        double sqrt = Math.sqrt(Math.pow(((double) this.f17433e) / 2.0d, 2.0d) + Math.pow((double) this.f17434f, 0.0d));
        double d = ((double) (((float) this.f17432d) * this.f17434f)) / sqrt;
        float f = (float) (((((double) this.f17433e) / 2.0d) * d) / sqrt);
        float f2 = (float) ((((double) this.f17434f) * d) / sqrt);
        this.f17429a.moveTo(f, f2);
        this.f17429a.lineTo((float) (this.f17433e / 2), this.f17434f);
        this.f17429a.lineTo(((float) this.f17433e) - f, f2 + BitmapDescriptorFactory.HUE_RED);
        this.f17429a.lineTo((float) this.f17433e, (float) this.f17432d);
        this.f17429a.lineTo((float) (this.f17433e / 2), this.f17434f + ((float) this.f17432d));
        this.f17429a.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.f17432d);
        this.f17429a.close();
        canvas.drawPath(this.f17429a, this.f17430b);
        this.f17429a.reset();
        this.f17429a.moveTo(f, f2);
        Path path = this.f17429a;
        int i = this.f17432d;
        path.quadTo(((float) (-i)) / 2.0f, ((float) i) / 2.0f, BitmapDescriptorFactory.HUE_RED, (float) i);
        this.f17429a.close();
        canvas.drawPath(this.f17429a, this.f17430b);
        this.f17429a.reset();
        this.f17429a.moveTo(((float) this.f17433e) - f, f2);
        Path path2 = this.f17429a;
        int i2 = this.f17433e;
        int i3 = this.f17432d;
        path2.quadTo(((float) i2) + (((float) i3) / 2.0f), ((float) i3) / 2.0f, (float) i2, (float) i3);
        this.f17429a.close();
        canvas.drawPath(this.f17429a, this.f17430b);
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public DragButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25239a(context, attributeSet, i);
        m25238a();
    }

    /* renamed from: a */
    private void m25239a(Context context, AttributeSet attributeSet, int i) {
        this.f17432d = C27144b.m98678a(6.0f);
        float a = (float) C27144b.m98678a(3.5f);
        this.f17435g = a;
        this.f17434f = a;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17433e = (i - getPaddingLeft()) - getPaddingRight();
        this.f17436h = (i2 - getPaddingBottom()) - getPaddingTop();
    }
}
