package com.ss.android.lark.cameraview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.framework.utils.DeviceUtils;

public class FoucsView extends View {

    /* renamed from: a */
    private int f83953a;

    /* renamed from: b */
    private int f83954b;

    /* renamed from: c */
    private int f83955c;

    /* renamed from: d */
    private int f83956d;

    /* renamed from: e */
    private Paint f83957e;

    public FoucsView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f83954b;
        int i2 = this.f83956d;
        int i3 = this.f83955c;
        canvas.drawRect((float) (i - i2), (float) (i3 - i2), (float) (i + i2), (float) (i3 + i2), this.f83957e);
        canvas.drawLine(2.0f, (float) (getHeight() / 2), (float) (this.f83953a / 10), (float) (getHeight() / 2), this.f83957e);
        canvas.drawLine((float) (getWidth() - 2), (float) (getHeight() / 2), (float) (getWidth() - (this.f83953a / 10)), (float) (getHeight() / 2), this.f83957e);
        canvas.drawLine((float) (getWidth() / 2), 2.0f, (float) (getWidth() / 2), (float) (this.f83953a / 10), this.f83957e);
        canvas.drawLine((float) (getWidth() / 2), (float) (getHeight() - 2), (float) (getWidth() / 2), (float) (getHeight() - (this.f83953a / 10)), this.f83957e);
    }

    public FoucsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f83953a;
        this.f83954b = (int) (((double) i3) / 2.0d);
        this.f83955c = (int) (((double) i3) / 2.0d);
        this.f83956d = ((int) (((double) i3) / 2.0d)) - 2;
        setMeasuredDimension(i3, i3);
    }

    public FoucsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83953a = DeviceUtils.getScreenWidth(context) / 3;
        Paint paint = new Paint();
        this.f83957e = paint;
        paint.setAntiAlias(true);
        this.f83957e.setDither(true);
        this.f83957e.setColor(-300503530);
        this.f83957e.setStrokeWidth(4.0f);
        this.f83957e.setStyle(Paint.Style.STROKE);
    }
}
