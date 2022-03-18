package com.ss.android.lark.keyboard.plugin.input.postinput;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class DragButton extends View {

    /* renamed from: a */
    Path f103508a;

    /* renamed from: b */
    Paint f103509b;

    /* renamed from: c */
    RectF f103510c;

    /* renamed from: d */
    private int f103511d;

    /* renamed from: e */
    private int f103512e;

    /* renamed from: f */
    private volatile float f103513f;

    /* renamed from: g */
    private float f103514g;

    /* renamed from: h */
    private int f103515h;

    /* renamed from: a */
    private void m161240a() {
        this.f103508a = new Path();
        this.f103509b = new Paint();
        this.f103510c = new RectF();
        this.f103509b.setColor(getResources().getColor(R.color.line_border_card));
        this.f103509b.setAntiAlias(true);
        this.f103509b.setStyle(Paint.Style.FILL);
    }

    public DragButton(Context context) {
        this(context, null);
    }

    public void setDragOffset(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f103513f = (1.0f - f) * this.f103514g;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        this.f103508a.reset();
        double sqrt = Math.sqrt(Math.pow(((double) this.f103512e) / 2.0d, 2.0d) + Math.pow((double) this.f103513f, 0.0d));
        double d = ((double) (((float) this.f103511d) * this.f103513f)) / sqrt;
        float f = (float) (((((double) this.f103512e) / 2.0d) * d) / sqrt);
        float f2 = (float) ((((double) this.f103513f) * d) / sqrt);
        this.f103508a.moveTo(f, f2);
        this.f103508a.lineTo((float) (this.f103512e / 2), this.f103513f);
        this.f103508a.lineTo(((float) this.f103512e) - f, f2 + BitmapDescriptorFactory.HUE_RED);
        this.f103508a.lineTo((float) this.f103512e, (float) this.f103511d);
        this.f103508a.lineTo((float) (this.f103512e / 2), this.f103513f + ((float) this.f103511d));
        this.f103508a.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.f103511d);
        this.f103508a.close();
        canvas.drawPath(this.f103508a, this.f103509b);
        this.f103508a.reset();
        this.f103508a.moveTo(f, f2);
        Path path = this.f103508a;
        int i = this.f103511d;
        path.quadTo(((float) (-i)) / 2.0f, ((float) i) / 2.0f, BitmapDescriptorFactory.HUE_RED, (float) i);
        this.f103508a.close();
        canvas.drawPath(this.f103508a, this.f103509b);
        this.f103508a.reset();
        this.f103508a.moveTo(((float) this.f103512e) - f, f2);
        Path path2 = this.f103508a;
        int i2 = this.f103512e;
        int i3 = this.f103511d;
        path2.quadTo(((float) i2) + (((float) i3) / 2.0f), ((float) i3) / 2.0f, (float) i2, (float) i3);
        this.f103508a.close();
        canvas.drawPath(this.f103508a, this.f103509b);
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
        m161241a(context, attributeSet, i);
        m161240a();
    }

    /* renamed from: a */
    private void m161241a(Context context, AttributeSet attributeSet, int i) {
        this.f103511d = UIUtils.dp2px(getContext(), 6.0f);
        float dp2px = (float) UIUtils.dp2px(getContext(), 3.5f);
        this.f103514g = dp2px;
        this.f103513f = dp2px;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f103512e = (i - getPaddingLeft()) - getPaddingRight();
        this.f103515h = (i2 - getPaddingBottom()) - getPaddingTop();
    }
}
