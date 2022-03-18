package com.ss.android.appcenter.common.shadow;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.appcenter.common.shadow.o */
public class C28164o {

    /* renamed from: a */
    private final C28167p[] f70631a = new C28167p[4];

    /* renamed from: b */
    private final Matrix[] f70632b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f70633c = new Matrix[4];

    /* renamed from: d */
    private final PointF f70634d = new PointF();

    /* renamed from: e */
    private final Path f70635e = new Path();

    /* renamed from: f */
    private final Path f70636f = new Path();

    /* renamed from: g */
    private final C28167p f70637g = new C28167p();

    /* renamed from: h */
    private final float[] f70638h = new float[2];

    /* renamed from: i */
    private final float[] f70639i = new float[2];

    /* renamed from: j */
    private boolean f70640j = true;

    /* renamed from: com.ss.android.appcenter.common.shadow.o$a */
    public interface AbstractC28165a {
        /* renamed from: a */
        void mo100309a(C28167p pVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo100310b(C28167p pVar, Matrix matrix, int i);
    }

    /* renamed from: b */
    private float m103164b(int i) {
        return (float) ((i + 1) * 90);
    }

    public C28164o() {
        for (int i = 0; i < 4; i++) {
            this.f70631a[i] = new C28167p();
            this.f70632b[i] = new Matrix();
            this.f70633c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private void m103160a(int i) {
        this.f70638h[0] = this.f70631a[i].mo100375d();
        this.f70638h[1] = this.f70631a[i].mo100376e();
        this.f70632b[i].mapPoints(this.f70638h);
        float b = m103164b(i);
        this.f70633c[i].reset();
        Matrix matrix = this.f70633c[i];
        float[] fArr = this.f70638h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f70633c[i].preRotate(b);
    }

    /* renamed from: a */
    private C28150d m103159a(int i, C28160n nVar) {
        if (i == 1) {
            return nVar.mo100337c();
        }
        if (i == 2) {
            return nVar.mo100338d();
        }
        if (i != 3) {
            return nVar.mo100336b();
        }
        return nVar.mo100333a();
    }

    /* renamed from: b */
    private AbstractC28149c m103165b(int i, C28160n nVar) {
        if (i == 1) {
            return nVar.mo100341g();
        }
        if (i == 2) {
            return nVar.mo100342h();
        }
        if (i != 3) {
            return nVar.mo100340f();
        }
        return nVar.mo100339e();
    }

    /* renamed from: c */
    private C28152f m103167c(int i, C28160n nVar) {
        if (i == 1) {
            return nVar.mo100346l();
        }
        if (i == 2) {
            return nVar.mo100343i();
        }
        if (i != 3) {
            return nVar.mo100345k();
        }
        return nVar.mo100344j();
    }

    /* renamed from: a */
    private float m103158a(RectF rectF, int i) {
        this.f70638h[0] = this.f70631a[i].f70648c;
        this.f70638h[1] = this.f70631a[i].f70649d;
        this.f70632b[i].mapPoints(this.f70638h);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f70638h[0]);
        }
        return Math.abs(rectF.centerY() - this.f70638h[1]);
    }

    /* renamed from: b */
    private void m103166b(C28166b bVar, int i) {
        this.f70638h[0] = this.f70631a[i].mo100372b();
        this.f70638h[1] = this.f70631a[i].mo100374c();
        this.f70632b[i].mapPoints(this.f70638h);
        if (i == 0) {
            Path path = bVar.f70642b;
            float[] fArr = this.f70638h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f70642b;
            float[] fArr2 = this.f70638h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f70631a[i].mo100370a(this.f70632b[i], bVar.f70642b);
        if (bVar.f70644d != null) {
            bVar.f70644d.mo100309a(this.f70631a[i], this.f70632b[i], i);
        }
    }

    /* renamed from: c */
    private void m103168c(C28166b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f70638h[0] = this.f70631a[i].mo100375d();
        this.f70638h[1] = this.f70631a[i].mo100376e();
        this.f70632b[i].mapPoints(this.f70638h);
        this.f70639i[0] = this.f70631a[i2].mo100372b();
        this.f70639i[1] = this.f70631a[i2].mo100374c();
        this.f70632b[i2].mapPoints(this.f70639i);
        float[] fArr = this.f70638h;
        float f = fArr[0];
        float[] fArr2 = this.f70639i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, (float) BitmapDescriptorFactory.HUE_RED);
        float a = m103158a(bVar.f70643c, i);
        this.f70637g.mo100367a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        C28152f c = m103167c(i, bVar.f70641a);
        c.mo100322a(max, a, bVar.f70645e, this.f70637g);
        Path path = new Path();
        this.f70637g.mo100370a(this.f70633c[i], path);
        if (!this.f70640j || Build.VERSION.SDK_INT < 19 || (!c.mo100323a() && !m103163a(path, i) && !m103163a(path, i2))) {
            this.f70637g.mo100370a(this.f70633c[i], bVar.f70642b);
        } else {
            path.op(path, this.f70636f, Path.Op.DIFFERENCE);
            this.f70638h[0] = this.f70637g.mo100372b();
            this.f70638h[1] = this.f70637g.mo100374c();
            this.f70633c[i].mapPoints(this.f70638h);
            Path path2 = this.f70635e;
            float[] fArr3 = this.f70638h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f70637g.mo100370a(this.f70633c[i], this.f70635e);
        }
        if (bVar.f70644d != null) {
            bVar.f70644d.mo100310b(this.f70637g, this.f70633c[i], i);
        }
    }

    /* renamed from: a */
    private void m103162a(C28166b bVar, int i) {
        m103159a(i, bVar.f70641a).mo100321a(this.f70631a[i], 90.0f, bVar.f70645e, bVar.f70643c, m103165b(i, bVar.f70641a));
        float b = m103164b(i);
        this.f70632b[i].reset();
        m103161a(i, bVar.f70643c, this.f70634d);
        this.f70632b[i].setTranslate(this.f70634d.x, this.f70634d.y);
        this.f70632b[i].preRotate(b);
    }

    /* renamed from: a */
    private boolean m103163a(Path path, int i) {
        Path path2 = new Path();
        this.f70631a[i].mo100370a(this.f70632b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m103161a(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: a */
    public void mo100364a(C28160n nVar, float f, RectF rectF, Path path) {
        mo100365a(nVar, f, rectF, null, path);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.common.shadow.o$b */
    public static final class C28166b {

        /* renamed from: a */
        public final C28160n f70641a;

        /* renamed from: b */
        public final Path f70642b;

        /* renamed from: c */
        public final RectF f70643c;

        /* renamed from: d */
        public final AbstractC28165a f70644d;

        /* renamed from: e */
        public final float f70645e;

        C28166b(C28160n nVar, float f, RectF rectF, AbstractC28165a aVar, Path path) {
            this.f70644d = aVar;
            this.f70641a = nVar;
            this.f70645e = f;
            this.f70643c = rectF;
            this.f70642b = path;
        }
    }

    /* renamed from: a */
    public void mo100365a(C28160n nVar, float f, RectF rectF, AbstractC28165a aVar, Path path) {
        path.rewind();
        this.f70635e.rewind();
        this.f70636f.rewind();
        this.f70636f.addRect(rectF, Path.Direction.CW);
        C28166b bVar = new C28166b(nVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m103162a(bVar, i);
            m103160a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m103166b(bVar, i2);
            m103168c(bVar, i2);
        }
        path.close();
        this.f70635e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f70635e.isEmpty()) {
            path.op(this.f70635e, Path.Op.UNION);
        }
    }
}
