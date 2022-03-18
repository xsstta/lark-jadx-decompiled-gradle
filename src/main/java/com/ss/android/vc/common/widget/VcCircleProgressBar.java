package com.ss.android.vc.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.util.C13655e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class VcCircleProgressBar extends View {

    /* renamed from: a */
    private Paint f152148a;

    /* renamed from: b */
    private Paint f152149b;

    /* renamed from: c */
    private Paint f152150c;

    /* renamed from: d */
    private float f152151d;

    /* renamed from: e */
    private RectF f152152e;

    /* renamed from: f */
    private float f152153f;

    /* renamed from: g */
    private int f152154g;

    /* renamed from: h */
    private int f152155h;

    /* renamed from: i */
    private float f152156i;

    /* renamed from: j */
    private float f152157j;

    /* renamed from: k */
    private boolean f152158k;

    /* renamed from: l */
    private float f152159l;

    /* renamed from: m */
    private int f152160m;

    /* renamed from: n */
    private float f152161n;

    /* renamed from: o */
    private String f152162o;

    /* renamed from: p */
    private String f152163p;

    /* renamed from: q */
    private String f152164q;

    /* renamed from: r */
    private int f152165r;

    public float getBackgroundWidth() {
        return this.f152157j;
    }

    public float getMaxValue() {
        return this.f152159l;
    }

    public String getPrefix() {
        return this.f152164q;
    }

    public float getProgress() {
        return this.f152153f;
    }

    public float getStrokeWidth() {
        return this.f152156i;
    }

    public String getSuffix() {
        return this.f152163p;
    }

    public String getText() {
        return this.f152162o;
    }

    public int getTextColor() {
        return this.f152160m;
    }

    public float getProgressPercentage() {
        return (this.f152153f / getMaxValue()) * 100.0f;
    }

    public void setBackgroundWidth(float f) {
        this.f152157j = f;
        invalidate();
    }

    public void setMaxValue(float f) {
        this.f152159l = f;
        invalidate();
    }

    public void setPrefix(String str) {
        this.f152164q = str;
        invalidate();
    }

    public void setProgress(float f) {
        this.f152153f = f;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f152156i = f;
        invalidate();
    }

    public void setSuffix(String str) {
        this.f152163p = str;
        invalidate();
    }

    public void setText(String str) {
        this.f152162o = str;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        this.f152155h = i;
        this.f152149b.setColor(i);
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f152154g = i;
        this.f152148a.setColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f152160m = i;
        this.f152150c.setColor(i);
        invalidate();
    }

    public void setBackgroundColor(String str) {
        this.f152149b.setColor(Color.parseColor(str));
        invalidate();
    }

    public void setProgressColor(String str) {
        this.f152148a.setColor(Color.parseColor(str));
        invalidate();
    }

    public void setTextColor(String str) {
        this.f152150c.setColor(Color.parseColor(str));
        invalidate();
    }

    public VcCircleProgressBar(Context context) {
        super(context);
        this.f152152e = new RectF();
        this.f152153f = BitmapDescriptorFactory.HUE_RED;
        this.f152160m = -16777216;
        this.f152161n = (float) C13655e.m55414b(14);
        this.f152162o = "";
        this.f152163p = "";
        this.f152164q = "";
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f152151d;
        float f2 = f / 5.0f;
        this.f152152e.set(f2, f2, (f * 2.0f) - f2, (f * 2.0f) - f2);
        canvas.drawArc(this.f152152e, BitmapDescriptorFactory.HUE_RED, 360.0f, false, this.f152149b);
        canvas.drawArc(this.f152152e, 270.0f, (this.f152153f / getMaxValue()) * 360.0f, false, this.f152148a);
        if (TextUtils.isEmpty(this.f152163p)) {
            this.f152163p = "";
        }
        if (TextUtils.isEmpty(this.f152164q)) {
            this.f152164q = "";
        }
        String str = this.f152164q + this.f152162o + this.f152163p;
        if (!TextUtils.isEmpty(this.f152162o)) {
            canvas.drawText(str, (((float) getWidth()) - this.f152150c.measureText(str)) / 2.0f, (((float) getWidth()) - (this.f152150c.descent() + this.f152150c.ascent())) / 2.0f, this.f152150c);
        }
    }

    public VcCircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m236413a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        setMeasuredDimension(min, min);
    }

    /* renamed from: a */
    private void m236413a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.background_color, R.attr.background_width, R.attr.max_value, R.attr.prefix, R.attr.progress_color, R.attr.progress_text, R.attr.progress_text_color, R.attr.rounded_corners, R.attr.stroke_width, R.attr.suffix, R.attr.text_size}, this.f152165r, 0);
            this.f152154g = obtainStyledAttributes.getColor(4, -1);
            this.f152155h = obtainStyledAttributes.getColor(0, C60773o.m236126d(R.color.space_kit_n200));
            this.f152156i = (float) obtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.f152157j = (float) obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f152158k = obtainStyledAttributes.getBoolean(7, false);
            this.f152159l = obtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED);
            this.f152160m = obtainStyledAttributes.getColor(6, -1);
            this.f152161n = obtainStyledAttributes.getDimension(10, BitmapDescriptorFactory.HUE_RED);
            this.f152163p = obtainStyledAttributes.getString(9);
            this.f152164q = obtainStyledAttributes.getString(3);
            this.f152162o = obtainStyledAttributes.getString(5);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f152148a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f152148a.setStyle(Paint.Style.STROKE);
        this.f152148a.setStrokeWidth(this.f152156i);
        if (this.f152158k) {
            this.f152148a.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.f152148a.setStrokeCap(Paint.Cap.BUTT);
        }
        this.f152148a.setColor(this.f152154g);
        Paint paint2 = new Paint(1);
        this.f152149b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f152149b.setColor(this.f152155h);
        this.f152149b.setStyle(Paint.Style.STROKE);
        this.f152149b.setStrokeWidth(this.f152157j);
        this.f152149b.setStrokeCap(Paint.Cap.SQUARE);
        TextPaint textPaint = new TextPaint();
        this.f152150c = textPaint;
        textPaint.setColor(this.f152160m);
        this.f152150c.setTextSize(this.f152161n);
        this.f152150c.setAntiAlias(true);
    }

    public VcCircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152152e = new RectF();
        this.f152153f = BitmapDescriptorFactory.HUE_RED;
        this.f152160m = -16777216;
        this.f152161n = (float) C13655e.m55414b(14);
        this.f152162o = "";
        this.f152163p = "";
        this.f152164q = "";
        this.f152165r = i;
        m236413a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f152151d = ((float) Math.min(i, i2)) / 2.0f;
    }
}
