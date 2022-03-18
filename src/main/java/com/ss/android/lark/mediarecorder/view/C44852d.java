package com.ss.android.lark.mediarecorder.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.ss.android.lark.mediarecorder.view.d */
public class C44852d extends View {

    /* renamed from: a */
    Path f113605a;

    /* renamed from: b */
    private int f113606b;

    /* renamed from: c */
    private int f113607c;

    /* renamed from: d */
    private int f113608d;

    /* renamed from: e */
    private float f113609e;

    /* renamed from: f */
    private Paint f113610f;

    public C44852d(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f113605a;
        float f = this.f113609e;
        path.moveTo(f, f / 2.0f);
        this.f113605a.lineTo((float) this.f113607c, ((float) this.f113608d) - (this.f113609e / 2.0f));
        Path path2 = this.f113605a;
        float f2 = this.f113609e;
        path2.lineTo(((float) this.f113606b) - f2, f2 / 2.0f);
        canvas.drawPath(this.f113605a, this.f113610f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f113606b;
        setMeasuredDimension(i3, i3 / 2);
    }

    public C44852d(Context context, int i) {
        this(context);
        this.f113606b = i;
        int i2 = i / 2;
        this.f113607c = i2;
        this.f113608d = i2;
        this.f113609e = ((float) i) / 15.0f;
        Paint paint = new Paint();
        this.f113610f = paint;
        paint.setAntiAlias(true);
        this.f113610f.setColor(-1);
        this.f113610f.setStyle(Paint.Style.STROKE);
        this.f113610f.setStrokeWidth(this.f113609e);
        this.f113605a = new Path();
    }
}
