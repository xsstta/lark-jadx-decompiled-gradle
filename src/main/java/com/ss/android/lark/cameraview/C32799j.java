package com.ss.android.lark.cameraview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.ss.android.lark.cameraview.j */
public class C32799j extends View {

    /* renamed from: a */
    Path f84154a;

    /* renamed from: b */
    private int f84155b;

    /* renamed from: c */
    private int f84156c;

    /* renamed from: d */
    private int f84157d;

    /* renamed from: e */
    private float f84158e;

    /* renamed from: f */
    private Paint f84159f;

    public C32799j(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f84154a;
        float f = this.f84158e;
        path.moveTo(f, f / 2.0f);
        this.f84154a.lineTo((float) this.f84156c, ((float) this.f84157d) - (this.f84158e / 2.0f));
        Path path2 = this.f84154a;
        float f2 = this.f84158e;
        path2.lineTo(((float) this.f84155b) - f2, f2 / 2.0f);
        canvas.drawPath(this.f84154a, this.f84159f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f84155b;
        setMeasuredDimension(i3, i3 / 2);
    }

    public C32799j(Context context, int i) {
        this(context);
        this.f84155b = i;
        int i2 = i / 2;
        this.f84156c = i2;
        this.f84157d = i2;
        this.f84158e = ((float) i) / 15.0f;
        Paint paint = new Paint();
        this.f84159f = paint;
        paint.setAntiAlias(true);
        this.f84159f.setColor(-1);
        this.f84159f.setStyle(Paint.Style.STROKE);
        this.f84159f.setStrokeWidth(this.f84158e);
        this.f84154a = new Path();
    }
}
