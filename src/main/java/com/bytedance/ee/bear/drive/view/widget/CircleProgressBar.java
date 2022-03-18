package com.bytedance.ee.bear.drive.view.widget;

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
    private Paint f20477a;

    /* renamed from: b */
    private Paint f20478b;

    /* renamed from: c */
    private Paint f20479c;

    /* renamed from: d */
    private float f20480d;

    /* renamed from: e */
    private RectF f20481e;

    /* renamed from: f */
    private float f20482f;

    /* renamed from: g */
    private int f20483g;

    /* renamed from: h */
    private int f20484h;

    /* renamed from: i */
    private float f20485i;

    /* renamed from: j */
    private float f20486j;

    /* renamed from: k */
    private boolean f20487k;

    /* renamed from: l */
    private float f20488l;

    /* renamed from: m */
    private int f20489m;

    /* renamed from: n */
    private float f20490n;

    /* renamed from: o */
    private String f20491o;

    /* renamed from: p */
    private String f20492p;

    /* renamed from: q */
    private String f20493q;

    /* renamed from: r */
    private int f20494r;

    public float getBackgroundWidth() {
        return this.f20486j;
    }

    public float getMaxValue() {
        return this.f20488l;
    }

    public String getPrefix() {
        return this.f20493q;
    }

    public float getProgress() {
        return this.f20482f;
    }

    public float getStrokeWidth() {
        return this.f20485i;
    }

    public String getSuffix() {
        return this.f20492p;
    }

    public String getText() {
        return this.f20491o;
    }

    public int getTextColor() {
        return this.f20489m;
    }

    public float getProgressPercentage() {
        return (this.f20482f / getMaxValue()) * 100.0f;
    }

    public void setBackgroundWidth(float f) {
        this.f20486j = f;
        invalidate();
    }

    public void setMaxValue(float f) {
        this.f20488l = f;
        invalidate();
    }

    public void setPrefix(String str) {
        this.f20493q = str;
        invalidate();
    }

    public void setProgress(float f) {
        this.f20482f = f;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f20485i = f;
        invalidate();
    }

    public void setSuffix(String str) {
        this.f20492p = str;
        invalidate();
    }

    public void setText(String str) {
        this.f20491o = str;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        this.f20484h = i;
        this.f20478b.setColor(i);
        invalidate();
    }

    public void setProgressColor(int i) {
        this.f20483g = i;
        this.f20477a.setColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f20489m = i;
        this.f20479c.setColor(i);
        invalidate();
    }

    public void setBackgroundColor(String str) {
        this.f20478b.setColor(Color.parseColor(str));
        invalidate();
    }

    public void setProgressColor(String str) {
        this.f20477a.setColor(Color.parseColor(str));
        invalidate();
    }

    public void setTextColor(String str) {
        this.f20479c.setColor(Color.parseColor(str));
        invalidate();
    }

    public CircleProgressBar(Context context) {
        super(context);
        this.f20481e = new RectF();
        this.f20482f = BitmapDescriptorFactory.HUE_RED;
        this.f20489m = -16777216;
        this.f20490n = (float) C13749l.m55753c(14);
        this.f20491o = "";
        this.f20492p = "";
        this.f20493q = "";
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f20480d;
        float f2 = f / 3.0f;
        this.f20481e.set(f2, f2, (f * 2.0f) - f2, (f * 2.0f) - f2);
        canvas.drawArc(this.f20481e, BitmapDescriptorFactory.HUE_RED, 360.0f, false, this.f20478b);
        canvas.drawArc(this.f20481e, 270.0f, (this.f20482f / getMaxValue()) * 360.0f, false, this.f20477a);
        if (TextUtils.isEmpty(this.f20492p)) {
            this.f20492p = "";
        }
        if (TextUtils.isEmpty(this.f20493q)) {
            this.f20493q = "";
        }
        String str = this.f20493q + this.f20491o + this.f20492p;
        if (!TextUtils.isEmpty(this.f20491o)) {
            canvas.drawText(str, (((float) getWidth()) - this.f20479c.measureText(str)) / 2.0f, (((float) getWidth()) - (this.f20479c.descent() + this.f20479c.ascent())) / 2.0f, this.f20479c);
        }
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        m30312a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        setMeasuredDimension(min, min);
    }

    /* renamed from: a */
    private void m30312a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.background_color, R.attr.background_width, R.attr.max_value, R.attr.prefix, R.attr.progress_color, R.attr.progress_text, R.attr.progress_text_color, R.attr.rounded_corners, R.attr.stroke_width, R.attr.suffix, R.attr.text_size}, this.f20494r, 0);
            this.f20483g = obtainStyledAttributes.getColor(4, -1);
            this.f20484h = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.space_kit_n200));
            this.f20485i = (float) obtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.f20486j = (float) obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f20487k = obtainStyledAttributes.getBoolean(7, false);
            this.f20488l = obtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED);
            this.f20489m = obtainStyledAttributes.getColor(6, -1);
            this.f20490n = obtainStyledAttributes.getDimension(10, BitmapDescriptorFactory.HUE_RED);
            this.f20492p = obtainStyledAttributes.getString(9);
            this.f20493q = obtainStyledAttributes.getString(3);
            this.f20491o = obtainStyledAttributes.getString(5);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f20477a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f20477a.setStyle(Paint.Style.STROKE);
        this.f20477a.setStrokeWidth(this.f20485i);
        if (this.f20487k) {
            this.f20477a.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.f20477a.setStrokeCap(Paint.Cap.BUTT);
        }
        this.f20477a.setColor(this.f20483g);
        Paint paint2 = new Paint(1);
        this.f20478b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f20478b.setColor(this.f20484h);
        this.f20478b.setStyle(Paint.Style.STROKE);
        this.f20478b.setStrokeWidth(this.f20486j);
        this.f20478b.setStrokeCap(Paint.Cap.SQUARE);
        TextPaint textPaint = new TextPaint();
        this.f20479c = textPaint;
        textPaint.setColor(this.f20489m);
        this.f20479c.setTextSize(this.f20490n);
        this.f20479c.setAntiAlias(true);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20481e = new RectF();
        this.f20482f = BitmapDescriptorFactory.HUE_RED;
        this.f20489m = -16777216;
        this.f20490n = (float) C13749l.m55753c(14);
        this.f20491o = "";
        this.f20492p = "";
        this.f20493q = "";
        this.f20494r = i;
        m30312a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20480d = ((float) Math.min(i, i2)) / 2.0f;
    }
}
