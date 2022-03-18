package com.ss.android.lark.guide.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class RoundRectLayout extends FrameLayout {

    /* renamed from: a */
    private float f99558a;

    /* renamed from: b */
    private int f99559b;

    /* renamed from: c */
    private Path f99560c = new Path();

    /* renamed from: d */
    private RectF f99561d;

    /* renamed from: e */
    private Paint f99562e = new Paint();

    public float getCornerRadius() {
        return this.f99558a;
    }

    /* renamed from: a */
    private void m152829a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f99558a);
        gradientDrawable.setColor(this.f99559b);
        setBackground(gradientDrawable);
    }

    /* renamed from: b */
    private void m152831b() {
        this.f99560c.reset();
        Path path = this.f99560c;
        RectF rectF = this.f99561d;
        float f = this.f99558a;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.f99560c.close();
    }

    public void setCornerRadius(float f) {
        this.f99558a = f;
    }

    public void setFillColor(int i) {
        this.f99559b = i;
    }

    public RoundRectLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m152830a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.cornerRadius, R.attr.fillColor}, 0, 0);
            this.f99558a = obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
            this.f99559b = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            setFillColor(this.f99559b);
            setPadding(10, 10, 10, 10);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        setLayerType(1, null);
        canvas.clipPath(this.f99560c);
        this.f99562e.setStyle(Paint.Style.STROKE);
        this.f99562e.setStrokeWidth(2.0f);
        this.f99562e.setColor(-65536);
        this.f99562e.setShadowLayer(5.0f, 10.0f, 10.0f, Color.parseColor("#4E83FD"));
        RectF rectF = this.f99561d;
        float f = this.f99558a;
        canvas.drawRoundRect(rectF, f, f, this.f99562e);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public RoundRectLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m152830a(attributeSet);
    }

    public RoundRectLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m152830a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f99561d = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((float) i) * 1.0f, ((float) i2) * 1.0f);
        m152831b();
        m152829a();
    }
}
