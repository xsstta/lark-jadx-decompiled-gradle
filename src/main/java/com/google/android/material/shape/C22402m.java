package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.material.shape.m */
public class C22402m {

    /* renamed from: a */
    private final C22405n[] f54944a = new C22405n[4];

    /* renamed from: b */
    private final Matrix[] f54945b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f54946c = new Matrix[4];

    /* renamed from: d */
    private final PointF f54947d = new PointF();

    /* renamed from: e */
    private final Path f54948e = new Path();

    /* renamed from: f */
    private final Path f54949f = new Path();

    /* renamed from: g */
    private final C22405n f54950g = new C22405n();

    /* renamed from: h */
    private final float[] f54951h = new float[2];

    /* renamed from: i */
    private final float[] f54952i = new float[2];

    /* renamed from: j */
    private boolean f54953j = true;

    /* renamed from: com.google.android.material.shape.m$a */
    public interface AbstractC22403a {
        /* renamed from: a */
        void mo77986a(C22405n nVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo77987b(C22405n nVar, Matrix matrix, int i);
    }

    /* renamed from: b */
    private float m81209b(int i) {
        return (float) ((i + 1) * 90);
    }

    public C22402m() {
        for (int i = 0; i < 4; i++) {
            this.f54944a[i] = new C22405n();
            this.f54945b[i] = new Matrix();
            this.f54946c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private void m81205a(int i) {
        this.f54951h[0] = this.f54944a[i].mo78051d();
        this.f54951h[1] = this.f54944a[i].mo78052e();
        this.f54945b[i].mapPoints(this.f54951h);
        float b = m81209b(i);
        this.f54946c[i].reset();
        Matrix matrix = this.f54946c[i];
        float[] fArr = this.f54951h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f54946c[i].preRotate(b);
    }

    /* renamed from: a */
    private C22390d m81204a(int i, C22398l lVar) {
        if (i == 1) {
            return lVar.mo78007d();
        }
        if (i == 2) {
            return lVar.mo78008e();
        }
        if (i != 3) {
            return lVar.mo78006c();
        }
        return lVar.mo78005b();
    }

    /* renamed from: b */
    private AbstractC22389c m81210b(int i, C22398l lVar) {
        if (i == 1) {
            return lVar.mo78011h();
        }
        if (i == 2) {
            return lVar.mo78012i();
        }
        if (i != 3) {
            return lVar.mo78010g();
        }
        return lVar.mo78009f();
    }

    /* renamed from: c */
    private C22392f m81212c(int i, C22398l lVar) {
        if (i == 1) {
            return lVar.mo78016m();
        }
        if (i == 2) {
            return lVar.mo78013j();
        }
        if (i != 3) {
            return lVar.mo78015l();
        }
        return lVar.mo78014k();
    }

    /* renamed from: a */
    private float m81203a(RectF rectF, int i) {
        this.f54951h[0] = this.f54944a[i].f54961c;
        this.f54951h[1] = this.f54944a[i].f54962d;
        this.f54945b[i].mapPoints(this.f54951h);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f54951h[0]);
        }
        return Math.abs(rectF.centerY() - this.f54951h[1]);
    }

    /* renamed from: b */
    private void m81211b(C22404b bVar, int i) {
        this.f54951h[0] = this.f54944a[i].mo78048b();
        this.f54951h[1] = this.f54944a[i].mo78050c();
        this.f54945b[i].mapPoints(this.f54951h);
        if (i == 0) {
            Path path = bVar.f54955b;
            float[] fArr = this.f54951h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f54955b;
            float[] fArr2 = this.f54951h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f54944a[i].mo78046a(this.f54945b[i], bVar.f54955b);
        if (bVar.f54957d != null) {
            bVar.f54957d.mo77986a(this.f54944a[i], this.f54945b[i], i);
        }
    }

    /* renamed from: c */
    private void m81213c(C22404b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f54951h[0] = this.f54944a[i].mo78051d();
        this.f54951h[1] = this.f54944a[i].mo78052e();
        this.f54945b[i].mapPoints(this.f54951h);
        this.f54952i[0] = this.f54944a[i2].mo78048b();
        this.f54952i[1] = this.f54944a[i2].mo78050c();
        this.f54945b[i2].mapPoints(this.f54952i);
        float[] fArr = this.f54951h;
        float f = fArr[0];
        float[] fArr2 = this.f54952i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, (float) BitmapDescriptorFactory.HUE_RED);
        float a = m81203a(bVar.f54956c, i);
        this.f54950g.mo78043a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        C22392f c = m81212c(i, bVar.f54954a);
        c.mo76588a(max, a, bVar.f54958e, this.f54950g);
        Path path = new Path();
        this.f54950g.mo78046a(this.f54946c[i], path);
        if (!this.f54953j || Build.VERSION.SDK_INT < 19 || (!c.mo77999f() && !m81208a(path, i) && !m81208a(path, i2))) {
            this.f54950g.mo78046a(this.f54946c[i], bVar.f54955b);
        } else {
            path.op(path, this.f54949f, Path.Op.DIFFERENCE);
            this.f54951h[0] = this.f54950g.mo78048b();
            this.f54951h[1] = this.f54950g.mo78050c();
            this.f54946c[i].mapPoints(this.f54951h);
            Path path2 = this.f54948e;
            float[] fArr3 = this.f54951h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f54950g.mo78046a(this.f54946c[i], this.f54948e);
        }
        if (bVar.f54957d != null) {
            bVar.f54957d.mo77987b(this.f54950g, this.f54946c[i], i);
        }
    }

    /* renamed from: a */
    private void m81207a(C22404b bVar, int i) {
        m81204a(i, bVar.f54954a).mo77998a(this.f54944a[i], 90.0f, bVar.f54958e, bVar.f54956c, m81210b(i, bVar.f54954a));
        float b = m81209b(i);
        this.f54945b[i].reset();
        m81206a(i, bVar.f54956c, this.f54947d);
        this.f54945b[i].setTranslate(this.f54947d.x, this.f54947d.y);
        this.f54945b[i].preRotate(b);
    }

    /* renamed from: a */
    private boolean m81208a(Path path, int i) {
        Path path2 = new Path();
        this.f54944a[i].mo78046a(this.f54945b[i], path2);
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
    private void m81206a(int i, RectF rectF, PointF pointF) {
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
    public void mo78040a(C22398l lVar, float f, RectF rectF, Path path) {
        mo78041a(lVar, f, rectF, null, path);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.shape.m$b */
    public static final class C22404b {

        /* renamed from: a */
        public final C22398l f54954a;

        /* renamed from: b */
        public final Path f54955b;

        /* renamed from: c */
        public final RectF f54956c;

        /* renamed from: d */
        public final AbstractC22403a f54957d;

        /* renamed from: e */
        public final float f54958e;

        C22404b(C22398l lVar, float f, RectF rectF, AbstractC22403a aVar, Path path) {
            this.f54957d = aVar;
            this.f54954a = lVar;
            this.f54958e = f;
            this.f54956c = rectF;
            this.f54955b = path;
        }
    }

    /* renamed from: a */
    public void mo78041a(C22398l lVar, float f, RectF rectF, AbstractC22403a aVar, Path path) {
        path.rewind();
        this.f54948e.rewind();
        this.f54949f.rewind();
        this.f54949f.addRect(rectF, Path.Direction.CW);
        C22404b bVar = new C22404b(lVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m81207a(bVar, i);
            m81205a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m81211b(bVar, i2);
            m81213c(bVar, i2);
        }
        path.close();
        this.f54948e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f54948e.isEmpty()) {
            path.op(this.f54948e, Path.Op.UNION);
        }
    }
}
