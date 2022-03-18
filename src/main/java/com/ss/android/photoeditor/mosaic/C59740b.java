package com.ss.android.photoeditor.mosaic;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.p3010b.C59613d;

/* renamed from: com.ss.android.photoeditor.mosaic.b */
public class C59740b {

    /* renamed from: a */
    private static final int[] f148370a = {0, 1, 1, 1, 0, -1, -1};

    /* renamed from: b */
    private static final int[] f148371b = {-1, -1, 0, 1, 1, 1, 0};

    /* renamed from: c */
    private PointF f148372c;

    /* renamed from: d */
    private PointF f148373d;

    /* renamed from: e */
    private PointF f148374e;

    /* renamed from: f */
    private PointF f148375f;

    /* renamed from: g */
    private final Bitmap f148376g;

    /* renamed from: h */
    private float f148377h = 1.0f;

    /* renamed from: i */
    private final float f148378i;

    /* renamed from: j */
    private int f148379j;

    /* renamed from: k */
    private PointF f148380k;

    /* renamed from: l */
    private final Paint f148381l;

    /* renamed from: m */
    private final Paint f148382m;

    /* renamed from: n */
    private final Paint f148383n;

    /* renamed from: o */
    private final int f148384o;

    /* renamed from: p */
    private final int f148385p;

    /* renamed from: q */
    private final float f148386q = 0.25f;

    /* renamed from: r */
    private int f148387r;

    /* renamed from: s */
    private int f148388s;

    /* renamed from: t */
    private boolean f148389t;

    /* renamed from: u */
    private final Matrix f148390u;

    /* renamed from: a */
    public PointF mo203391a() {
        return this.f148380k;
    }

    /* renamed from: b */
    public int mo203399b() {
        return this.f148379j;
    }

    /* renamed from: c */
    public float mo203401c() {
        return this.f148377h;
    }

    /* renamed from: d */
    private Matrix m231694d() {
        return m231690a(this.f148376g.getWidth(), 24.0f, this.f148380k.x - (((float) this.f148387r) * this.f148377h), this.f148380k.y - (((float) this.f148388s) * this.f148377h));
    }

    /* renamed from: e */
    private void m231696e() {
        RectF rectF = new RectF(this.f148380k.x - ((float) this.f148387r), this.f148380k.y - ((float) this.f148388s), this.f148380k.x + ((float) this.f148387r), this.f148380k.y + ((float) this.f148388s));
        C59610b.m231211a(rectF, this.f148380k.x, this.f148380k.y, this.f148377h);
        this.f148372c = new PointF(rectF.left, rectF.top);
        this.f148373d = new PointF(rectF.right, rectF.top);
        this.f148374e = new PointF(rectF.right, rectF.bottom);
        this.f148375f = new PointF(rectF.left, rectF.bottom);
        C59610b.m231210a(this.f148372c, this.f148380k.x, this.f148380k.y, this.f148379j);
        C59610b.m231210a(this.f148373d, this.f148380k.x, this.f148380k.y, this.f148379j);
        C59610b.m231210a(this.f148374e, this.f148380k.x, this.f148380k.y, this.f148379j);
        C59610b.m231210a(this.f148375f, this.f148380k.x, this.f148380k.y, this.f148379j);
    }

    /* renamed from: a */
    public void mo203397a(boolean z) {
        if (this.f148389t != z) {
            this.f148389t = z;
        }
    }

    /* renamed from: c */
    private void m231693c(Canvas canvas) {
        if (this.f148376g != null) {
            this.f148382m.setAntiAlias(true);
            this.f148382m.setFilterBitmap(true);
            canvas.drawBitmap(this.f148376g, m231694d(), this.f148382m);
        }
    }

    /* renamed from: b */
    private void m231692b(Canvas canvas) {
        int i = 0;
        while (true) {
            int[] iArr = f148370a;
            if (i < iArr.length) {
                m231691a(canvas, this.f148380k.x + (((float) (iArr[i] * this.f148387r)) * this.f148377h), this.f148380k.y + (((float) (f148371b[i] * this.f148388s)) * this.f148377h));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private void m231695d(Canvas canvas) {
        canvas.save();
        RectF rectF = new RectF(this.f148380k.x - (((float) this.f148387r) * this.f148377h), this.f148380k.y - (((float) this.f148388s) * this.f148377h), this.f148380k.x + (((float) this.f148387r) * this.f148377h), this.f148380k.y + (((float) this.f148388s) * this.f148377h));
        this.f148383n.setAntiAlias(true);
        this.f148383n.setColor(-1);
        this.f148383n.setStyle(Paint.Style.STROKE);
        float a = C59613d.m231215a(4.0f) * this.f148377h * this.f148378i;
        this.f148383n.setStrokeWidth(a);
        canvas.rotate((float) this.f148379j, this.f148380k.x, this.f148380k.y);
        canvas.drawRoundRect(rectF, (float) C59613d.m231216a(1), (float) C59613d.m231216a(1), this.f148383n);
        this.f148383n.setStrokeWidth(0.25f);
        this.f148383n.setColor(this.f148385p);
        float f = a / 2.0f;
        canvas.drawRoundRect(new RectF(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f), (float) C59613d.m231216a(1), (float) C59613d.m231216a(1), this.f148383n);
        canvas.drawRoundRect(new RectF(rectF.left + f, rectF.top + f, rectF.right - f, rectF.bottom - f), (float) C59613d.m231216a(1), (float) C59613d.m231216a(1), this.f148383n);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo203396a(Canvas canvas) {
        if (this.f148389t) {
            m231695d(canvas);
            m231692b(canvas);
            m231693c(canvas);
        }
    }

    /* renamed from: b */
    public boolean mo203400b(float f, float f2) {
        float f3 = this.f148377h * 10.0f;
        return new RectF(this.f148372c.x - C59613d.m231215a(f3), this.f148372c.y - C59613d.m231215a(f3), this.f148372c.x + C59613d.m231215a(f3), this.f148372c.y + C59613d.m231215a(f3)).contains(f, f2);
    }

    /* renamed from: a */
    public boolean mo203398a(float f, float f2) {
        RectF rectF = new RectF();
        Path path = new Path();
        path.moveTo(this.f148372c.x, this.f148372c.y);
        path.lineTo(this.f148373d.x, this.f148373d.y);
        path.lineTo(this.f148374e.x, this.f148374e.y);
        path.lineTo(this.f148375f.x, this.f148375f.y);
        path.close();
        path.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    public void mo203394a(float f, float f2, int i) {
        C59610b.m231210a(this.f148380k, f, f2, i);
        this.f148379j += i;
        m231696e();
    }

    /* renamed from: a */
    public void mo203392a(float f, float f2, float f3) {
        PointF pointF = this.f148380k;
        pointF.x = ((pointF.x - f) * f3) + f;
        PointF pointF2 = this.f148380k;
        pointF2.y = ((pointF2.y - f2) * f3) + f2;
        this.f148377h *= f3;
        m231696e();
    }

    /* renamed from: a */
    private void m231691a(Canvas canvas, float f, float f2) {
        canvas.save();
        this.f148381l.reset();
        this.f148381l.setAntiAlias(true);
        this.f148381l.setStyle(Paint.Style.FILL);
        this.f148381l.setColor(-1);
        canvas.rotate((float) this.f148379j, this.f148380k.x, this.f148380k.y);
        canvas.drawCircle(f, f2, ((float) C59613d.m231216a(7)) * this.f148377h * this.f148378i, this.f148381l);
        this.f148381l.setColor(this.f148384o);
        canvas.drawCircle(f, f2, ((float) C59613d.m231216a(4)) * this.f148377h * this.f148378i, this.f148381l);
        this.f148381l.setStyle(Paint.Style.STROKE);
        this.f148381l.setColor(this.f148385p);
        this.f148381l.setStrokeWidth(0.25f);
        canvas.drawCircle(f, f2, ((float) C59613d.m231216a(7)) * this.f148377h * this.f148378i, this.f148381l);
        canvas.restore();
    }

    /* renamed from: a */
    private Matrix m231690a(int i, float f, float f2, float f3) {
        float a = C59613d.m231215a((this.f148377h * f) * this.f148378i) / ((float) i);
        this.f148390u.reset();
        this.f148390u.postScale(a, a);
        this.f148390u.postTranslate(f2 - (C59613d.m231215a((this.f148377h * f) * this.f148378i) / 2.0f), f3 - (C59613d.m231215a((f * this.f148377h) * this.f148378i) / 2.0f));
        this.f148390u.postRotate((float) this.f148379j, this.f148380k.x, this.f148380k.y);
        return this.f148390u;
    }

    /* renamed from: a */
    public void mo203395a(float f, float f2, int i, float f3) {
        this.f148380k.x = f;
        this.f148380k.y = f2;
        this.f148379j = i;
        this.f148377h = f3;
        this.f148380k = new PointF(f, f2);
        m231696e();
    }

    /* renamed from: a */
    public void mo203393a(float f, float f2, float f3, float f4, float f5, int i) {
        float min = Math.min(f, f3);
        float min2 = Math.min(f2, f4);
        float max = Math.max(f, f3);
        float max2 = Math.max(f2, f4);
        this.f148377h = f5 / this.f148378i;
        this.f148379j = i;
        this.f148380k = new PointF((min + max) / 2.0f, (min2 + max2) / 2.0f);
        this.f148388s = ((int) (max2 - min2)) / 2;
        this.f148387r = ((int) (max - min)) / 2;
        m231696e();
    }

    public C59740b(View view, float f, float f2, float f3, float f4, float f5, int i) {
        this.f148384o = ContextCompat.getColor(view.getContext(), R.color.lkui_B500);
        this.f148385p = -3355444;
        this.f148390u = new Matrix();
        this.f148376g = ((BitmapDrawable) ContextCompat.getDrawable(view.getContext(), R.drawable.photo_editor_mosaic_delete)).getBitmap();
        this.f148381l = new Paint();
        this.f148382m = new Paint();
        this.f148383n = new Paint();
        this.f148378i = f5;
        mo203393a(f, f2, f3, f4, f5, i);
    }
}
