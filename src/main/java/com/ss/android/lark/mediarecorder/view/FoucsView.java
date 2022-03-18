package com.ss.android.lark.mediarecorder.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.mediarecorder.p2245c.C44791d;

public class FoucsView extends View {

    /* renamed from: a */
    private int f113470a;

    /* renamed from: b */
    private int f113471b;

    /* renamed from: c */
    private int f113472c;

    /* renamed from: d */
    private int f113473d;

    /* renamed from: e */
    private Paint f113474e;

    public FoucsView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f113471b;
        int i2 = this.f113473d;
        int i3 = this.f113472c;
        canvas.drawRect((float) (i - i2), (float) (i3 - i2), (float) (i + i2), (float) (i3 + i2), this.f113474e);
        canvas.drawLine(2.0f, (float) (getHeight() / 2), (float) (this.f113470a / 10), (float) (getHeight() / 2), this.f113474e);
        canvas.drawLine((float) (getWidth() - 2), (float) (getHeight() / 2), (float) (getWidth() - (this.f113470a / 10)), (float) (getHeight() / 2), this.f113474e);
        canvas.drawLine((float) (getWidth() / 2), 2.0f, (float) (getWidth() / 2), (float) (this.f113470a / 10), this.f113474e);
        canvas.drawLine((float) (getWidth() / 2), (float) (getHeight() - 2), (float) (getWidth() / 2), (float) (getHeight() - (this.f113470a / 10)), this.f113474e);
    }

    public FoucsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f113470a;
        this.f113471b = (int) (((double) i3) / 2.0d);
        this.f113472c = (int) (((double) i3) / 2.0d);
        this.f113473d = ((int) (((double) i3) / 2.0d)) - 2;
        setMeasuredDimension(i3, i3);
    }

    public FoucsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113470a = C44791d.m177626a(context) / 3;
        Paint paint = new Paint();
        this.f113474e = paint;
        paint.setAntiAlias(true);
        this.f113474e.setDither(true);
        this.f113474e.setColor(-300503530);
        this.f113474e.setStrokeWidth(4.0f);
        this.f113474e.setStyle(Paint.Style.STROKE);
    }
}
