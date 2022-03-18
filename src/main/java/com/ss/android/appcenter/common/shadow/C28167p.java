package com.ss.android.appcenter.common.shadow;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.common.shadow.p */
public class C28167p {

    /* renamed from: a */
    public float f70646a;

    /* renamed from: b */
    public float f70647b;

    /* renamed from: c */
    public float f70648c;

    /* renamed from: d */
    public float f70649d;

    /* renamed from: e */
    public float f70650e;

    /* renamed from: f */
    public float f70651f;

    /* renamed from: g */
    private final List<AbstractC28173e> f70652g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC28174f> f70653h = new ArrayList();

    /* renamed from: i */
    private boolean f70654i;

    /* renamed from: com.ss.android.appcenter.common.shadow.p$e */
    public static abstract class AbstractC28173e {

        /* renamed from: g */
        protected final Matrix f70671g = new Matrix();

        /* renamed from: a */
        public abstract void mo100381a(Matrix matrix, Path path);
    }

    /* renamed from: com.ss.android.appcenter.common.shadow.p$c */
    public static class C28171c extends AbstractC28173e {

        /* renamed from: h */
        private static final RectF f70662h = new RectF();

        /* renamed from: a */
        public float f70663a;

        /* renamed from: b */
        public float f70664b;

        /* renamed from: c */
        public float f70665c;

        /* renamed from: d */
        public float f70666d;

        /* renamed from: e */
        public float f70667e;

        /* renamed from: f */
        public float f70668f;

        /* renamed from: a */
        public float mo100379a() {
            return this.f70663a;
        }

        /* renamed from: b */
        public float mo100382b() {
            return this.f70664b;
        }

        /* renamed from: c */
        public float mo100384c() {
            return this.f70665c;
        }

        /* renamed from: d */
        public float mo100385d() {
            return this.f70666d;
        }

        /* renamed from: e */
        public float mo100386e() {
            return this.f70667e;
        }

        /* renamed from: f */
        public float mo100387f() {
            return this.f70668f;
        }

        /* renamed from: c */
        private void m103198c(float f) {
            this.f70663a = f;
        }

        /* renamed from: d */
        private void m103199d(float f) {
            this.f70664b = f;
        }

        /* renamed from: e */
        private void m103200e(float f) {
            this.f70665c = f;
        }

        /* renamed from: f */
        private void m103201f(float f) {
            this.f70666d = f;
        }

        /* renamed from: a */
        public void mo100380a(float f) {
            this.f70667e = f;
        }

        /* renamed from: b */
        public void mo100383b(float f) {
            this.f70668f = f;
        }

        @Override // com.ss.android.appcenter.common.shadow.C28167p.AbstractC28173e
        /* renamed from: a */
        public void mo100381a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f70671g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f70662h;
            rectF.set(mo100379a(), mo100382b(), mo100384c(), mo100385d());
            path.arcTo(rectF, mo100386e(), mo100387f(), false);
            path.transform(matrix);
        }

        public C28171c(float f, float f2, float f3, float f4) {
            m103198c(f);
            m103199d(f2);
            m103200e(f3);
            m103201f(f4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.common.shadow.p$f */
    public static abstract class AbstractC28174f {

        /* renamed from: d */
        static final Matrix f70672d = new Matrix();

        /* renamed from: a */
        public abstract void mo100377a(Matrix matrix, C28159m mVar, int i, Canvas canvas);

        AbstractC28174f() {
        }

        /* renamed from: a */
        public final void mo100388a(C28159m mVar, int i, Canvas canvas) {
            mo100377a(f70672d, mVar, i, canvas);
        }
    }

    /* renamed from: f */
    private float m103179f() {
        return this.f70650e;
    }

    /* renamed from: g */
    private float m103181g() {
        return this.f70651f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo100371a() {
        return this.f70654i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo100372b() {
        return this.f70646a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo100374c() {
        return this.f70647b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo100375d() {
        return this.f70648c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo100376e() {
        return this.f70649d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.common.shadow.p$b */
    public static class C28170b extends AbstractC28174f {

        /* renamed from: a */
        private final C28172d f70659a;

        /* renamed from: b */
        private final float f70660b;

        /* renamed from: c */
        private final float f70661c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public float mo100378a() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f70659a.f70670b - this.f70661c) / (this.f70659a.f70669a - this.f70660b))));
        }

        public C28170b(C28172d dVar, float f, float f2) {
            this.f70659a = dVar;
            this.f70660b = f;
            this.f70661c = f2;
        }

        @Override // com.ss.android.appcenter.common.shadow.C28167p.AbstractC28174f
        /* renamed from: a */
        public void mo100377a(Matrix matrix, C28159m mVar, int i, Canvas canvas) {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot((double) (this.f70659a.f70670b - this.f70661c), (double) (this.f70659a.f70669a - this.f70660b)), BitmapDescriptorFactory.HUE_RED);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f70660b, this.f70661c);
            matrix2.preRotate(mo100378a());
            mVar.mo100331a(canvas, matrix2, rectF, i);
        }
    }

    public C28167p() {
        mo100367a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: b */
    private void m103175b(float f) {
        this.f70646a = f;
    }

    /* renamed from: c */
    private void m103176c(float f) {
        this.f70647b = f;
    }

    /* renamed from: d */
    private void m103177d(float f) {
        this.f70648c = f;
    }

    /* renamed from: e */
    private void m103178e(float f) {
        this.f70649d = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.common.shadow.p$a */
    public static class C28169a extends AbstractC28174f {

        /* renamed from: a */
        private final C28171c f70658a;

        public C28169a(C28171c cVar) {
            this.f70658a = cVar;
        }

        @Override // com.ss.android.appcenter.common.shadow.C28167p.AbstractC28174f
        /* renamed from: a */
        public void mo100377a(Matrix matrix, C28159m mVar, int i, Canvas canvas) {
            mVar.mo100332a(canvas, matrix, new RectF(this.f70658a.mo100379a(), this.f70658a.mo100382b(), this.f70658a.mo100384c(), this.f70658a.mo100385d()), i, this.f70658a.mo100386e(), this.f70658a.mo100387f());
        }
    }

    /* renamed from: f */
    private void m103180f(float f) {
        this.f70650e = f;
    }

    /* renamed from: g */
    private void m103182g(float f) {
        this.f70651f = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC28174f mo100366a(final Matrix matrix) {
        m103173a(m103181g());
        final ArrayList arrayList = new ArrayList(this.f70653h);
        return new AbstractC28174f() {
            /* class com.ss.android.appcenter.common.shadow.C28167p.C281681 */

            @Override // com.ss.android.appcenter.common.shadow.C28167p.AbstractC28174f
            /* renamed from: a */
            public void mo100377a(Matrix matrix, C28159m mVar, int i, Canvas canvas) {
                for (AbstractC28174f fVar : arrayList) {
                    fVar.mo100377a(matrix, mVar, i, canvas);
                }
            }
        };
    }

    /* renamed from: a */
    private void m103173a(float f) {
        if (m103179f() != f) {
            float f2 = ((f - m103179f()) + 360.0f) % 360.0f;
            if (f2 <= 180.0f) {
                C28171c cVar = new C28171c(mo100375d(), mo100376e(), mo100375d(), mo100376e());
                cVar.mo100380a(m103179f());
                cVar.mo100383b(f2);
                this.f70653h.add(new C28169a(cVar));
                m103180f(f);
            }
        }
    }

    /* renamed from: a */
    public void mo100367a(float f, float f2) {
        mo100368a(f, f2, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: com.ss.android.appcenter.common.shadow.p$d */
    public static class C28172d extends AbstractC28173e {

        /* renamed from: a */
        public float f70669a;

        /* renamed from: b */
        public float f70670b;

        @Override // com.ss.android.appcenter.common.shadow.C28167p.AbstractC28173e
        /* renamed from: a */
        public void mo100381a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f70671g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f70669a, this.f70670b);
            path.transform(matrix);
        }
    }

    /* renamed from: b */
    public void mo100373b(float f, float f2) {
        C28172d dVar = new C28172d();
        dVar.f70669a = f;
        dVar.f70670b = f2;
        this.f70652g.add(dVar);
        C28170b bVar = new C28170b(dVar, mo100375d(), mo100376e());
        m103174a(bVar, bVar.mo100378a() + 270.0f, bVar.mo100378a() + 270.0f);
        m103177d(f);
        m103178e(f2);
    }

    /* renamed from: a */
    public void mo100370a(Matrix matrix, Path path) {
        int size = this.f70652g.size();
        for (int i = 0; i < size; i++) {
            this.f70652g.get(i).mo100381a(matrix, path);
        }
    }

    /* renamed from: a */
    private void m103174a(AbstractC28174f fVar, float f, float f2) {
        m103173a(f);
        this.f70653h.add(fVar);
        m103180f(f2);
    }

    /* renamed from: a */
    public void mo100368a(float f, float f2, float f3, float f4) {
        m103175b(f);
        m103176c(f2);
        m103177d(f);
        m103178e(f2);
        m103180f(f3);
        m103182g((f3 + f4) % 360.0f);
        this.f70652g.clear();
        this.f70653h.clear();
        this.f70654i = false;
    }

    /* renamed from: a */
    public void mo100369a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C28171c cVar = new C28171c(f, f2, f3, f4);
        cVar.mo100380a(f5);
        cVar.mo100383b(f6);
        this.f70652g.add(cVar);
        C28169a aVar = new C28169a(cVar);
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
        m103174a(aVar, f5, f7);
        double d = (double) f8;
        m103177d(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m103178e(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }
}
