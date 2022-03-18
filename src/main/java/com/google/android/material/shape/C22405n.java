package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.p990k.C22376a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.shape.n */
public class C22405n {

    /* renamed from: a */
    public float f54959a;

    /* renamed from: b */
    public float f54960b;

    /* renamed from: c */
    public float f54961c;

    /* renamed from: d */
    public float f54962d;

    /* renamed from: e */
    public float f54963e;

    /* renamed from: f */
    public float f54964f;

    /* renamed from: g */
    private final List<AbstractC22411e> f54965g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC22412f> f54966h = new ArrayList();

    /* renamed from: i */
    private boolean f54967i;

    /* renamed from: com.google.android.material.shape.n$e */
    public static abstract class AbstractC22411e {

        /* renamed from: g */
        protected final Matrix f54984g = new Matrix();

        /* renamed from: a */
        public abstract void mo78057a(Matrix matrix, Path path);
    }

    /* renamed from: com.google.android.material.shape.n$c */
    public static class C22409c extends AbstractC22411e {

        /* renamed from: h */
        private static final RectF f54975h = new RectF();

        /* renamed from: a */
        public float f54976a;

        /* renamed from: b */
        public float f54977b;

        /* renamed from: c */
        public float f54978c;

        /* renamed from: d */
        public float f54979d;

        /* renamed from: e */
        public float f54980e;

        /* renamed from: f */
        public float f54981f;

        /* renamed from: a */
        public float mo78055a() {
            return this.f54976a;
        }

        /* renamed from: b */
        public float mo78058b() {
            return this.f54977b;
        }

        /* renamed from: c */
        public float mo78060c() {
            return this.f54978c;
        }

        /* renamed from: d */
        public float mo78061d() {
            return this.f54979d;
        }

        /* renamed from: e */
        public float mo78062e() {
            return this.f54980e;
        }

        /* renamed from: f */
        public float mo78063f() {
            return this.f54981f;
        }

        /* renamed from: c */
        private void m81243c(float f) {
            this.f54976a = f;
        }

        /* renamed from: d */
        private void m81244d(float f) {
            this.f54977b = f;
        }

        /* renamed from: e */
        private void m81245e(float f) {
            this.f54978c = f;
        }

        /* renamed from: f */
        private void m81246f(float f) {
            this.f54979d = f;
        }

        /* renamed from: a */
        public void mo78056a(float f) {
            this.f54980e = f;
        }

        /* renamed from: b */
        public void mo78059b(float f) {
            this.f54981f = f;
        }

        @Override // com.google.android.material.shape.C22405n.AbstractC22411e
        /* renamed from: a */
        public void mo78057a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f54984g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f54975h;
            rectF.set(mo78055a(), mo78058b(), mo78060c(), mo78061d());
            path.arcTo(rectF, mo78062e(), mo78063f(), false);
            path.transform(matrix);
        }

        public C22409c(float f, float f2, float f3, float f4) {
            m81243c(f);
            m81244d(f2);
            m81245e(f3);
            m81246f(f4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.shape.n$f */
    public static abstract class AbstractC22412f {

        /* renamed from: d */
        static final Matrix f54985d = new Matrix();

        /* renamed from: a */
        public abstract void mo78053a(Matrix matrix, C22376a aVar, int i, Canvas canvas);

        AbstractC22412f() {
        }

        /* renamed from: a */
        public final void mo78064a(C22376a aVar, int i, Canvas canvas) {
            mo78053a(f54985d, aVar, i, canvas);
        }
    }

    /* renamed from: f */
    private float m81224f() {
        return this.f54963e;
    }

    /* renamed from: g */
    private float m81226g() {
        return this.f54964f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo78047a() {
        return this.f54967i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo78048b() {
        return this.f54959a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo78050c() {
        return this.f54960b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo78051d() {
        return this.f54961c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo78052e() {
        return this.f54962d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.shape.n$b */
    public static class C22408b extends AbstractC22412f {

        /* renamed from: a */
        private final C22410d f54972a;

        /* renamed from: b */
        private final float f54973b;

        /* renamed from: c */
        private final float f54974c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo78054a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f54972a.f54983b - this.f54974c) / (this.f54972a.f54982a - this.f54973b))));
        }

        public C22408b(C22410d dVar, float f, float f2) {
            this.f54972a = dVar;
            this.f54973b = f;
            this.f54974c = f2;
        }

        @Override // com.google.android.material.shape.C22405n.AbstractC22412f
        /* renamed from: a */
        public void mo78053a(Matrix matrix, C22376a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot((double) (this.f54972a.f54983b - this.f54974c), (double) (this.f54972a.f54982a - this.f54973b)), BitmapDescriptorFactory.HUE_RED);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f54973b, this.f54974c);
            matrix2.preRotate(mo78054a());
            aVar.mo77893a(canvas, matrix2, rectF, i);
        }
    }

    public C22405n() {
        mo78043a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: b */
    private void m81220b(float f) {
        this.f54959a = f;
    }

    /* renamed from: c */
    private void m81221c(float f) {
        this.f54960b = f;
    }

    /* renamed from: d */
    private void m81222d(float f) {
        this.f54961c = f;
    }

    /* renamed from: e */
    private void m81223e(float f) {
        this.f54962d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.shape.n$a */
    public static class C22407a extends AbstractC22412f {

        /* renamed from: a */
        private final C22409c f54971a;

        public C22407a(C22409c cVar) {
            this.f54971a = cVar;
        }

        @Override // com.google.android.material.shape.C22405n.AbstractC22412f
        /* renamed from: a */
        public void mo78053a(Matrix matrix, C22376a aVar, int i, Canvas canvas) {
            aVar.mo77894a(canvas, matrix, new RectF(this.f54971a.mo78055a(), this.f54971a.mo78058b(), this.f54971a.mo78060c(), this.f54971a.mo78061d()), i, this.f54971a.mo78062e(), this.f54971a.mo78063f());
        }
    }

    /* renamed from: f */
    private void m81225f(float f) {
        this.f54963e = f;
    }

    /* renamed from: g */
    private void m81227g(float f) {
        this.f54964f = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC22412f mo78042a(final Matrix matrix) {
        m81218a(m81226g());
        final ArrayList arrayList = new ArrayList(this.f54966h);
        return new AbstractC22412f() {
            /* class com.google.android.material.shape.C22405n.C224061 */

            @Override // com.google.android.material.shape.C22405n.AbstractC22412f
            /* renamed from: a */
            public void mo78053a(Matrix matrix, C22376a aVar, int i, Canvas canvas) {
                for (AbstractC22412f fVar : arrayList) {
                    fVar.mo78053a(matrix, aVar, i, canvas);
                }
            }
        };
    }

    /* renamed from: a */
    private void m81218a(float f) {
        if (m81224f() != f) {
            float f2 = ((f - m81224f()) + 360.0f) % 360.0f;
            if (f2 <= 180.0f) {
                C22409c cVar = new C22409c(mo78051d(), mo78052e(), mo78051d(), mo78052e());
                cVar.mo78056a(m81224f());
                cVar.mo78059b(f2);
                this.f54966h.add(new C22407a(cVar));
                m81225f(f);
            }
        }
    }

    /* renamed from: a */
    public void mo78043a(float f, float f2) {
        mo78044a(f, f2, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: com.google.android.material.shape.n$d */
    public static class C22410d extends AbstractC22411e {

        /* renamed from: a */
        public float f54982a;

        /* renamed from: b */
        public float f54983b;

        @Override // com.google.android.material.shape.C22405n.AbstractC22411e
        /* renamed from: a */
        public void mo78057a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f54984g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f54982a, this.f54983b);
            path.transform(matrix);
        }
    }

    /* renamed from: b */
    public void mo78049b(float f, float f2) {
        C22410d dVar = new C22410d();
        dVar.f54982a = f;
        dVar.f54983b = f2;
        this.f54965g.add(dVar);
        C22408b bVar = new C22408b(dVar, mo78051d(), mo78052e());
        m81219a(bVar, bVar.mo78054a() + 270.0f, bVar.mo78054a() + 270.0f);
        m81222d(f);
        m81223e(f2);
    }

    /* renamed from: a */
    public void mo78046a(Matrix matrix, Path path) {
        int size = this.f54965g.size();
        for (int i = 0; i < size; i++) {
            this.f54965g.get(i).mo78057a(matrix, path);
        }
    }

    /* renamed from: a */
    private void m81219a(AbstractC22412f fVar, float f, float f2) {
        m81218a(f);
        this.f54966h.add(fVar);
        m81225f(f2);
    }

    /* renamed from: a */
    public void mo78044a(float f, float f2, float f3, float f4) {
        m81220b(f);
        m81221c(f2);
        m81222d(f);
        m81223e(f2);
        m81225f(f3);
        m81227g((f3 + f4) % 360.0f);
        this.f54965g.clear();
        this.f54966h.clear();
        this.f54967i = false;
    }

    /* renamed from: a */
    public void mo78045a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C22409c cVar = new C22409c(f, f2, f3, f4);
        cVar.mo78056a(f5);
        cVar.mo78059b(f6);
        this.f54965g.add(cVar);
        C22407a aVar = new C22407a(cVar);
        float f8 = f5 + f6;
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m81219a(aVar, f5, f7);
        double d = (double) f8;
        m81222d(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m81223e(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }
}
