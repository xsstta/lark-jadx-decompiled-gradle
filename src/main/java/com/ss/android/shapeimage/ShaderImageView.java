package com.ss.android.shapeimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ss.android.shapeimage.p3023b.AbstractC59984a;

public abstract class ShaderImageView extends ImageView {

    /* renamed from: a */
    private AbstractC59984a f149505a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC59984a mo126280a();

    public float getBorderAlpha() {
        return getPathHelper().mo204262f();
    }

    public int getBorderWidth() {
        return getPathHelper().mo204261e();
    }

    /* access modifiers changed from: protected */
    public AbstractC59984a getPathHelper() {
        if (this.f149505a == null) {
            this.f149505a = mo126280a();
        }
        return this.f149505a;
    }

    public ShaderImageView(Context context) {
        super(context);
        m232755a(context, null, 0);
    }

    public void onDraw(Canvas canvas) {
        if (!getPathHelper().mo204256a(canvas)) {
            super.onDraw(canvas);
        }
    }

    public void setBorderAlpha(float f) {
        getPathHelper().mo204248a(f);
        invalidate();
    }

    public void setBorderColor(int i) {
        getPathHelper().mo204249a(i);
        invalidate();
    }

    public void setBorderWidth(int i) {
        getPathHelper().mo204258b(i);
        invalidate();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        getPathHelper().mo204254a(getDrawable());
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getPathHelper().mo204254a(getDrawable());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        getPathHelper().mo204254a(getDrawable());
    }

    public void setSquare(boolean z) {
        getPathHelper().mo204255a(z);
        invalidate();
    }

    public ShaderImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m232755a(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getPathHelper().mo204263g()) {
            super.onMeasure(i, i);
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: a */
    private void m232755a(Context context, AttributeSet attributeSet, int i) {
        getPathHelper().mo204252a(context, attributeSet, i);
    }

    public ShaderImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m232755a(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        getPathHelper().mo204250a(i, i2);
    }
}
