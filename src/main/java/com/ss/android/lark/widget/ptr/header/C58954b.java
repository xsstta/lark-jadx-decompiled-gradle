package com.ss.android.lark.widget.ptr.header;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.Random;

/* renamed from: com.ss.android.lark.widget.ptr.header.b */
public class C58954b extends Animation {

    /* renamed from: a */
    public PointF f146043a;

    /* renamed from: b */
    public float f146044b;

    /* renamed from: c */
    private final Paint f146045c;

    /* renamed from: d */
    private float f146046d;

    /* renamed from: e */
    private float f146047e;

    /* renamed from: f */
    private PointF f146048f;

    /* renamed from: g */
    private PointF f146049g;

    /* renamed from: a */
    public void mo200019a(float f) {
        this.f146045c.setAlpha((int) (f * 255.0f));
    }

    /* renamed from: a */
    public void mo200021a(int i) {
        this.f146044b = (float) ((-new Random().nextInt(i)) + i);
    }

    /* renamed from: a */
    public void mo200022a(Canvas canvas) {
        canvas.drawLine(this.f146048f.x, this.f146048f.y, this.f146049g.x, this.f146049g.y, this.f146045c);
    }

    /* renamed from: a */
    public void mo200020a(float f, float f2) {
        this.f146046d = f;
        this.f146047e = f2;
        super.start();
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f146046d;
        mo200019a(f2 + ((this.f146047e - f2) * f));
    }
}
