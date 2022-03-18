package com.ss.android.lark.cameraview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.ss.android.lark.cameraview.l */
public class C32800l extends View {

    /* renamed from: a */
    private int f84160a;

    /* renamed from: b */
    private int f84161b;

    /* renamed from: c */
    private float f84162c;

    /* renamed from: d */
    private float f84163d;

    /* renamed from: e */
    private float f84164e;

    /* renamed from: f */
    private Paint f84165f;

    /* renamed from: g */
    private Path f84166g;

    /* renamed from: h */
    private float f84167h;

    /* renamed from: i */
    private float f84168i;

    /* renamed from: j */
    private RectF f84169j;

    public C32800l(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f84160a == 1) {
            this.f84165f.setAntiAlias(true);
            this.f84165f.setColor(-287515428);
            this.f84165f.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.f84162c, this.f84163d, this.f84164e, this.f84165f);
            this.f84165f.setColor(-15260619);
            this.f84165f.setStyle(Paint.Style.STROKE);
            this.f84165f.setStrokeWidth(this.f84167h);
            Path path = this.f84166g;
            float f = this.f84162c;
            float f2 = this.f84168i;
            path.moveTo(f - (f2 / 2.0f), this.f84163d + f2);
            Path path2 = this.f84166g;
            float f3 = this.f84162c;
            float f4 = this.f84168i;
            path2.lineTo(f3 + f4, this.f84163d + f4);
            this.f84166g.arcTo(this.f84169j, 90.0f, -180.0f);
            Path path3 = this.f84166g;
            float f5 = this.f84162c;
            float f6 = this.f84168i;
            path3.lineTo(f5 - f6, this.f84163d - f6);
            canvas.drawPath(this.f84166g, this.f84165f);
            this.f84165f.setStyle(Paint.Style.FILL);
            this.f84166g.reset();
            Path path4 = this.f84166g;
            float f7 = this.f84162c;
            float f8 = this.f84168i;
            path4.moveTo(f7 - f8, (float) (((double) this.f84163d) - (((double) f8) * 1.5d)));
            Path path5 = this.f84166g;
            float f9 = this.f84162c;
            float f10 = this.f84168i;
            path5.lineTo(f9 - f10, (float) (((double) this.f84163d) - (((double) f10) / 2.3d)));
            Path path6 = this.f84166g;
            float f11 = this.f84168i;
            path6.lineTo((float) (((double) this.f84162c) - (((double) f11) * 1.6d)), this.f84163d - f11);
            this.f84166g.close();
            canvas.drawPath(this.f84166g, this.f84165f);
        }
        if (this.f84160a == 2) {
            this.f84165f.setAntiAlias(true);
            this.f84165f.setColor(-1);
            this.f84165f.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.f84162c, this.f84163d, this.f84164e, this.f84165f);
            this.f84165f.setAntiAlias(true);
            this.f84165f.setStyle(Paint.Style.STROKE);
            this.f84165f.setColor(-12024330);
            this.f84165f.setStrokeWidth(this.f84167h);
            this.f84166g.moveTo(this.f84162c - (((float) this.f84161b) / 6.0f), this.f84163d);
            Path path7 = this.f84166g;
            float f12 = this.f84162c;
            int i = this.f84161b;
            path7.lineTo(f12 - (((float) i) / 21.2f), this.f84163d + (((float) i) / 7.7f));
            Path path8 = this.f84166g;
            float f13 = this.f84162c;
            int i2 = this.f84161b;
            path8.lineTo(f13 + (((float) i2) / 4.0f), this.f84163d - (((float) i2) / 8.5f));
            Path path9 = this.f84166g;
            float f14 = this.f84162c;
            int i3 = this.f84161b;
            path9.lineTo(f14 - (((float) i3) / 21.2f), this.f84163d + (((float) i3) / 9.4f));
            this.f84166g.close();
            canvas.drawPath(this.f84166g, this.f84165f);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f84161b;
        setMeasuredDimension(i3, i3);
    }

    public C32800l(Context context, int i, int i2) {
        super(context);
        this.f84160a = i;
        this.f84161b = i2;
        float f = (float) i2;
        float f2 = f / 2.0f;
        this.f84164e = f2;
        this.f84162c = f2;
        this.f84163d = f2;
        this.f84165f = new Paint();
        this.f84166g = new Path();
        this.f84167h = f / 50.0f;
        this.f84168i = ((float) this.f84161b) / 12.0f;
        float f3 = this.f84162c;
        float f4 = this.f84163d;
        float f5 = this.f84168i;
        this.f84169j = new RectF(f3, f4 - f5, (2.0f * f5) + f3, f4 + f5);
    }
}
