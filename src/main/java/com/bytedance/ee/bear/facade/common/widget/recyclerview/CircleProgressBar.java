package com.bytedance.ee.bear.facade.common.widget.recyclerview;

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
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class CircleProgressBar extends View {

    /* renamed from: a */
    private Paint f20909a;

    /* renamed from: b */
    private Paint f20910b;

    /* renamed from: c */
    private Paint f20911c;

    /* renamed from: d */
    private float f20912d;

    /* renamed from: e */
    private RectF f20913e;

    /* renamed from: f */
    private float f20914f;

    /* renamed from: g */
    private int f20915g;

    /* renamed from: h */
    private int f20916h;

    /* renamed from: i */
    private float f20917i;

    /* renamed from: j */
    private float f20918j;

    /* renamed from: k */
    private boolean f20919k;

    /* renamed from: l */
    private float f20920l;

    /* renamed from: m */
    private int f20921m;

    /* renamed from: n */
    private float f20922n;

    /* renamed from: o */
    private String f20923o;

    /* renamed from: p */
    private String f20924p;

    /* renamed from: q */
    private String f20925q;

    /* renamed from: r */
    private int f20926r;

    public float getBackgroundWidth() {
        return this.f20918j;
    }

    public float getMaxValue() {
        return this.f20920l;
    }

    public String getPrefix() {
        return this.f20925q;
    }

    public float getProgress() {
        return this.f20914f;
    }

    public float getStrokeWidth() {
        return this.f20917i;
    }

    public String getSuffix() {
        return this.f20924p;
    }

    public String getText() {
        return this.f20923o;
    }

    public int getTextColor() {
        return this.f20921m;
    }

    public float getProgressPercentage() {
        return (this.f20914f / getMaxValue()) * 100.0f;
    }

    public void setBackgroundWidth(float f) {
        this.f20918j = f;
        invalidate();
    }

    public void setMaxValue(float f) {
        this.f20920l = f;
        invalidate();
    }

    public void setPrefix(String str) {
        this.f20925q = str;
        invalidate();
    }

    public void setProgress(float f) {
        this.f20914f = f;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f20917i = f;
        invalidate();
    }

    public void setSuffix(String str) {
        this.f20924p = str;
        invalidate();
    }

    public void setText(String str) {
        this.f20923o = str;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        this.f20916h = i;
        this.f20910b.setColor(i);
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f20915g = i;
        this.f20909a.setColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f20921m = i;
        this.f20911c.setColor(i);
        invalidate();
    }

    public void setBackgroundColor(String str) {
        this.f20910b.setColor(Color.parseColor(str));
        invalidate();
    }

    public void setProgressColor(String str) {
        this.f20909a.setColor(Color.parseColor(str));
        invalidate();
    }

    public void setTextColor(String str) {
        this.f20911c.setColor(Color.parseColor(str));
        invalidate();
    }

    public CircleProgressBar(Context context) {
        super(context);
        this.f20913e = new RectF();
        this.f20914f = BitmapDescriptorFactory.HUE_RED;
        this.f20921m = -16777216;
        this.f20922n = (float) C13749l.m55753c(14);
        this.f20923o = "";
        this.f20924p = "";
        this.f20925q = "";
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f20912d;
        float f2 = f / 5.0f;
        this.f20913e.set(f2, f2, (f * 2.0f) - f2, (f * 2.0f) - f2);
        canvas.drawArc(this.f20913e, BitmapDescriptorFactory.HUE_RED, 360.0f, false, this.f20910b);
        canvas.drawArc(this.f20913e, 270.0f, (this.f20914f / getMaxValue()) * 360.0f, false, this.f20909a);
        if (TextUtils.isEmpty(this.f20924p)) {
            this.f20924p = "";
        }
        if (TextUtils.isEmpty(this.f20925q)) {
            this.f20925q = "";
        }
        String str = this.f20925q + this.f20923o + this.f20924p;
        if (!TextUtils.isEmpty(this.f20923o)) {
            canvas.drawText(str, (((float) getWidth()) - this.f20911c.measureText(str)) / 2.0f, (((float) getWidth()) - (this.f20911c.descent() + this.f20911c.ascent())) / 2.0f, this.f20911c);
        }
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m30928a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        setMeasuredDimension(min, min);
    }

    /* renamed from: a */
    private void m30928a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.background_color, R.attr.background_width, R.attr.max_value, R.attr.prefix, R.attr.progress_color, R.attr.progress_text, R.attr.progress_text_color, R.attr.rounded_corners, R.attr.stroke_width, R.attr.suffix, R.attr.text_size}, this.f20926r, 0);
            this.f20915g = obtainStyledAttributes.getColor(4, -1);
            this.f20916h = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.bg_filler));
            this.f20917i = (float) obtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.f20918j = (float) obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f20919k = obtainStyledAttributes.getBoolean(7, false);
            this.f20920l = obtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED);
            this.f20921m = obtainStyledAttributes.getColor(6, -1);
            this.f20922n = obtainStyledAttributes.getDimension(10, BitmapDescriptorFactory.HUE_RED);
            this.f20924p = obtainStyledAttributes.getString(9);
            this.f20925q = obtainStyledAttributes.getString(3);
            this.f20923o = obtainStyledAttributes.getString(5);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f20909a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f20909a.setStyle(Paint.Style.STROKE);
        this.f20909a.setStrokeWidth(this.f20917i);
        if (this.f20919k) {
            this.f20909a.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.f20909a.setStrokeCap(Paint.Cap.BUTT);
        }
        this.f20909a.setColor(this.f20915g);
        Paint paint2 = new Paint(1);
        this.f20910b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f20910b.setColor(this.f20916h);
        this.f20910b.setStyle(Paint.Style.STROKE);
        this.f20910b.setStrokeWidth(this.f20918j);
        this.f20910b.setStrokeCap(Paint.Cap.SQUARE);
        TextPaint textPaint = new TextPaint();
        this.f20911c = textPaint;
        textPaint.setColor(this.f20921m);
        this.f20911c.setTextSize(this.f20922n);
        this.f20911c.setAntiAlias(true);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20913e = new RectF();
        this.f20914f = BitmapDescriptorFactory.HUE_RED;
        this.f20921m = -16777216;
        this.f20922n = (float) C13749l.m55753c(14);
        this.f20923o = "";
        this.f20924p = "";
        this.f20925q = "";
        this.f20926r = i;
        m30928a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20912d = ((float) Math.min(i, i2)) / 2.0f;
    }
}
