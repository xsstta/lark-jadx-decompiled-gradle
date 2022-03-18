package com.ss.android.lark.mediarecorder.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.ss.android.lark.mediarecorder.view.e */
public class C44853e extends View {

    /* renamed from: a */
    private int f113611a;

    /* renamed from: b */
    private int f113612b;

    /* renamed from: c */
    private float f113613c;

    /* renamed from: d */
    private float f113614d;

    /* renamed from: e */
    private float f113615e;

    /* renamed from: f */
    private Paint f113616f;

    /* renamed from: g */
    private Path f113617g;

    /* renamed from: h */
    private float f113618h;

    /* renamed from: i */
    private float f113619i;

    /* renamed from: j */
    private RectF f113620j;

    public C44853e(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f113611a == 1) {
            this.f113616f.setAntiAlias(true);
            this.f113616f.setColor(-287515428);
            this.f113616f.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.f113613c, this.f113614d, this.f113615e, this.f113616f);
            this.f113616f.setColor(-15260619);
            this.f113616f.setStyle(Paint.Style.STROKE);
            this.f113616f.setStrokeWidth(this.f113618h);
            Path path = this.f113617g;
            float f = this.f113613c;
            float f2 = this.f113619i;
            path.moveTo(f - (f2 / 2.0f), this.f113614d + f2);
            Path path2 = this.f113617g;
            float f3 = this.f113613c;
            float f4 = this.f113619i;
            path2.lineTo(f3 + f4, this.f113614d + f4);
            this.f113617g.arcTo(this.f113620j, 90.0f, -180.0f);
            Path path3 = this.f113617g;
            float f5 = this.f113613c;
            float f6 = this.f113619i;
            path3.lineTo(f5 - f6, this.f113614d - f6);
            canvas.drawPath(this.f113617g, this.f113616f);
            this.f113616f.setStyle(Paint.Style.FILL);
            this.f113617g.reset();
            Path path4 = this.f113617g;
            float f7 = this.f113613c;
            float f8 = this.f113619i;
            path4.moveTo(f7 - f8, (float) (((double) this.f113614d) - (((double) f8) * 1.5d)));
            Path path5 = this.f113617g;
            float f9 = this.f113613c;
            float f10 = this.f113619i;
            path5.lineTo(f9 - f10, (float) (((double) this.f113614d) - (((double) f10) / 2.3d)));
            Path path6 = this.f113617g;
            float f11 = this.f113619i;
            path6.lineTo((float) (((double) this.f113613c) - (((double) f11) * 1.6d)), this.f113614d - f11);
            this.f113617g.close();
            canvas.drawPath(this.f113617g, this.f113616f);
        }
        if (this.f113611a == 2) {
            this.f113616f.setAntiAlias(true);
            this.f113616f.setColor(-1);
            this.f113616f.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.f113613c, this.f113614d, this.f113615e, this.f113616f);
            this.f113616f.setAntiAlias(true);
            this.f113616f.setStyle(Paint.Style.STROKE);
            this.f113616f.setColor(-12024330);
            this.f113616f.setStrokeWidth(this.f113618h);
            this.f113617g.moveTo(this.f113613c - (((float) this.f113612b) / 6.0f), this.f113614d);
            Path path7 = this.f113617g;
            float f12 = this.f113613c;
            int i = this.f113612b;
            path7.lineTo(f12 - (((float) i) / 21.2f), this.f113614d + (((float) i) / 7.7f));
            Path path8 = this.f113617g;
            float f13 = this.f113613c;
            int i2 = this.f113612b;
            path8.lineTo(f13 + (((float) i2) / 4.0f), this.f113614d - (((float) i2) / 8.5f));
            Path path9 = this.f113617g;
            float f14 = this.f113613c;
            int i3 = this.f113612b;
            path9.lineTo(f14 - (((float) i3) / 21.2f), this.f113614d + (((float) i3) / 9.4f));
            this.f113617g.close();
            canvas.drawPath(this.f113617g, this.f113616f);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f113612b;
        setMeasuredDimension(i3, i3);
    }

    public C44853e(Context context, int i, int i2) {
        super(context);
        this.f113611a = i;
        this.f113612b = i2;
        float f = (float) i2;
        float f2 = f / 2.0f;
        this.f113615e = f2;
        this.f113613c = f2;
        this.f113614d = f2;
        this.f113616f = new Paint();
        this.f113617g = new Path();
        this.f113618h = f / 50.0f;
        this.f113619i = ((float) this.f113612b) / 12.0f;
        float f3 = this.f113613c;
        float f4 = this.f113614d;
        float f5 = this.f113619i;
        this.f113620j = new RectF(f3, f4 - f5, (2.0f * f5) + f3, f4 + f5);
    }
}
