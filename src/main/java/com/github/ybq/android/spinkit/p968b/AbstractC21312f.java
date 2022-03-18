package com.github.ybq.android.spinkit.p968b;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.github.ybq.android.spinkit.p966a.AbstractC21301b;
import com.github.ybq.android.spinkit.p966a.AbstractC21302c;
import com.github.ybq.android.spinkit.p966a.C21294a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.github.ybq.android.spinkit.b.f */
public abstract class AbstractC21312f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* renamed from: B */
    private static final Rect f51856B = new Rect();

    /* renamed from: b */
    public static final Property<AbstractC21312f, Integer> f51857b = new AbstractC21302c<AbstractC21312f>("rotateX") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213131 */

        /* renamed from: a */
        public Integer get(AbstractC21312f fVar) {
            return Integer.valueOf(fVar.mo72444k());
        }

        /* renamed from: a */
        public void mo72390a(AbstractC21312f fVar, int i) {
            fVar.mo72430e(i);
        }
    };

    /* renamed from: c */
    public static final Property<AbstractC21312f, Integer> f51858c = new AbstractC21302c<AbstractC21312f>("rotate") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213164 */

        /* renamed from: a */
        public Integer get(AbstractC21312f fVar) {
            return Integer.valueOf(fVar.mo72434g());
        }

        /* renamed from: a */
        public void mo72390a(AbstractC21312f fVar, int i) {
            fVar.mo72426d(i);
        }
    };

    /* renamed from: d */
    public static final Property<AbstractC21312f, Integer> f51859d = new AbstractC21302c<AbstractC21312f>("rotateY") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213175 */

        /* renamed from: a */
        public Integer get(AbstractC21312f fVar) {
            return Integer.valueOf(fVar.mo72445l());
        }

        /* renamed from: a */
        public void mo72390a(AbstractC21312f fVar, int i) {
            fVar.mo72433f(i);
        }
    };

    /* renamed from: e */
    public static final Property<AbstractC21312f, Integer> f51860e = new AbstractC21302c<AbstractC21312f>("translateX") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213186 */

        /* renamed from: a */
        public Integer get(AbstractC21312f fVar) {
            return Integer.valueOf(fVar.mo72428e());
        }

        /* renamed from: a */
        public void mo72390a(AbstractC21312f fVar, int i) {
            fVar.mo72420b(i);
        }
    };

    /* renamed from: f */
    public static final Property<AbstractC21312f, Integer> f51861f = new AbstractC21302c<AbstractC21312f>("translateY") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213197 */

        /* renamed from: a */
        public Integer get(AbstractC21312f fVar) {
            return Integer.valueOf(fVar.mo72431f());
        }

        /* renamed from: a */
        public void mo72390a(AbstractC21312f fVar, int i) {
            fVar.mo72423c(i);
        }
    };

    /* renamed from: g */
    public static final Property<AbstractC21312f, Float> f51862g = new AbstractC21301b<AbstractC21312f>("translateXPercentage") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213208 */

        /* renamed from: a */
        public Float get(AbstractC21312f fVar) {
            return Float.valueOf(fVar.mo72421c());
        }

        /* renamed from: a */
        public void mo72387a(AbstractC21312f fVar, float f) {
            fVar.mo72415a(f);
        }
    };

    /* renamed from: h */
    public static final Property<AbstractC21312f, Float> f51863h = new AbstractC21301b<AbstractC21312f>("translateYPercentage") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213219 */

        /* renamed from: a */
        public Float get(AbstractC21312f fVar) {
            return Float.valueOf(fVar.mo72424d());
        }

        /* renamed from: a */
        public void mo72387a(AbstractC21312f fVar, float f) {
            fVar.mo72419b(f);
        }
    };

    /* renamed from: i */
    public static final Property<AbstractC21312f, Float> f51864i = new AbstractC21301b<AbstractC21312f>("scaleX") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.AnonymousClass10 */

        /* renamed from: a */
        public Float get(AbstractC21312f fVar) {
            return Float.valueOf(fVar.mo72440i());
        }

        /* renamed from: a */
        public void mo72387a(AbstractC21312f fVar, float f) {
            fVar.mo72425d(f);
        }
    };

    /* renamed from: j */
    public static final Property<AbstractC21312f, Float> f51865j = new AbstractC21301b<AbstractC21312f>("scaleY") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.AnonymousClass11 */

        /* renamed from: a */
        public Float get(AbstractC21312f fVar) {
            return Float.valueOf(fVar.mo72443j());
        }

        /* renamed from: a */
        public void mo72387a(AbstractC21312f fVar, float f) {
            fVar.mo72429e(f);
        }
    };

    /* renamed from: k */
    public static final Property<AbstractC21312f, Float> f51866k = new AbstractC21301b<AbstractC21312f>("scale") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213142 */

        /* renamed from: a */
        public Float get(AbstractC21312f fVar) {
            return Float.valueOf(fVar.mo72439h());
        }

        /* renamed from: a */
        public void mo72387a(AbstractC21312f fVar, float f) {
            fVar.mo72422c(f);
        }
    };

    /* renamed from: l */
    public static final Property<AbstractC21312f, Integer> f51867l = new AbstractC21302c<AbstractC21312f>("alpha") {
        /* class com.github.ybq.android.spinkit.p968b.AbstractC21312f.C213153 */

        /* renamed from: a */
        public Integer get(AbstractC21312f fVar) {
            return Integer.valueOf(fVar.getAlpha());
        }

        /* renamed from: a */
        public void mo72390a(AbstractC21312f fVar, int i) {
            fVar.setAlpha(i);
        }
    };

    /* renamed from: A */
    private int f51868A = 255;

    /* renamed from: C */
    private Camera f51869C = new Camera();

    /* renamed from: D */
    private Matrix f51870D = new Matrix();

    /* renamed from: a */
    protected Rect f51871a = f51856B;

    /* renamed from: m */
    private float f51872m = 1.0f;

    /* renamed from: n */
    private float f51873n = 1.0f;

    /* renamed from: o */
    private float f51874o = 1.0f;

    /* renamed from: p */
    private float f51875p;

    /* renamed from: q */
    private float f51876q;

    /* renamed from: r */
    private int f51877r;

    /* renamed from: s */
    private int f51878s;

    /* renamed from: t */
    private int f51879t;

    /* renamed from: u */
    private int f51880u;

    /* renamed from: v */
    private int f51881v;

    /* renamed from: w */
    private int f51882w;

    /* renamed from: x */
    private float f51883x;

    /* renamed from: y */
    private float f51884y;

    /* renamed from: z */
    private ValueAnimator f51885z;

    /* renamed from: a */
    public abstract ValueAnimator mo72408a();

    /* renamed from: a */
    public abstract void mo72410a(int i);

    /* access modifiers changed from: protected */
    public abstract void a_(Canvas canvas);

    /* renamed from: b */
    public abstract int mo72412b();

    public int getOpacity() {
        return -3;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* renamed from: c */
    public float mo72421c() {
        return this.f51883x;
    }

    /* renamed from: d */
    public float mo72424d() {
        return this.f51884y;
    }

    /* renamed from: e */
    public int mo72428e() {
        return this.f51880u;
    }

    /* renamed from: f */
    public int mo72431f() {
        return this.f51881v;
    }

    /* renamed from: g */
    public int mo72434g() {
        return this.f51882w;
    }

    public int getAlpha() {
        return this.f51868A;
    }

    /* renamed from: h */
    public float mo72439h() {
        return this.f51872m;
    }

    /* renamed from: i */
    public float mo72440i() {
        return this.f51873n;
    }

    /* renamed from: j */
    public float mo72443j() {
        return this.f51874o;
    }

    /* renamed from: k */
    public int mo72444k() {
        return this.f51878s;
    }

    /* renamed from: l */
    public int mo72445l() {
        return this.f51879t;
    }

    /* renamed from: m */
    public float mo72446m() {
        return this.f51875p;
    }

    /* renamed from: n */
    public float mo72447n() {
        return this.f51876q;
    }

    /* renamed from: q */
    public Rect mo72451q() {
        return this.f51871a;
    }

    public boolean isRunning() {
        return C21294a.m77134a(this.f51885z);
    }

    /* renamed from: o */
    public ValueAnimator mo72448o() {
        if (this.f51885z == null) {
            this.f51885z = mo72408a();
        }
        ValueAnimator valueAnimator = this.f51885z;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.f51885z.setStartDelay((long) this.f51877r);
        }
        return this.f51885z;
    }

    /* renamed from: p */
    public void mo72450p() {
        this.f51872m = 1.0f;
        this.f51878s = 0;
        this.f51879t = 0;
        this.f51880u = 0;
        this.f51881v = 0;
        this.f51882w = 0;
        this.f51883x = BitmapDescriptorFactory.HUE_RED;
        this.f51884y = BitmapDescriptorFactory.HUE_RED;
    }

    public void start() {
        if (!C21294a.m77136b(this.f51885z)) {
            ValueAnimator o = mo72448o();
            this.f51885z = o;
            if (o != null) {
                C21294a.m77132a((Animator) o);
                invalidateSelf();
            }
        }
    }

    public void stop() {
        if (C21294a.m77136b(this.f51885z)) {
            this.f51885z.removeAllUpdateListeners();
            this.f51885z.end();
            mo72450p();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f51868A = i;
    }

    /* renamed from: a */
    public void mo72415a(float f) {
        this.f51883x = f;
    }

    /* renamed from: b */
    public void mo72419b(float f) {
        this.f51884y = f;
    }

    /* renamed from: c */
    public void mo72423c(int i) {
        this.f51881v = i;
    }

    /* renamed from: d */
    public void mo72425d(float f) {
        this.f51873n = f;
    }

    /* renamed from: e */
    public void mo72429e(float f) {
        this.f51874o = f;
    }

    /* renamed from: f */
    public void mo72432f(float f) {
        this.f51875p = f;
    }

    /* renamed from: g */
    public AbstractC21312f mo72435g(int i) {
        this.f51877r = i;
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo72417a(rect);
    }

    /* renamed from: b */
    public void mo72420b(int i) {
        this.f51880u = i;
    }

    /* renamed from: c */
    public void mo72422c(float f) {
        this.f51872m = f;
        mo72425d(f);
        mo72429e(f);
    }

    /* renamed from: d */
    public void mo72426d(int i) {
        this.f51882w = i;
    }

    /* renamed from: e */
    public void mo72430e(int i) {
        this.f51878s = i;
    }

    /* renamed from: f */
    public void mo72433f(int i) {
        this.f51879t = i;
    }

    /* renamed from: g */
    public void mo72436g(float f) {
        this.f51876q = f;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: a */
    public void mo72417a(Rect rect) {
        mo72416a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    public Rect mo72418b(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i = min / 2;
        return new Rect(centerX - i, centerY - i, centerX + i, centerY + i);
    }

    public void draw(Canvas canvas) {
        int e = mo72428e();
        if (e == 0) {
            e = (int) (((float) getBounds().width()) * mo72421c());
        }
        int f = mo72431f();
        if (f == 0) {
            f = (int) (((float) getBounds().height()) * mo72424d());
        }
        canvas.translate((float) e, (float) f);
        canvas.scale(mo72440i(), mo72443j(), mo72446m(), mo72447n());
        canvas.rotate((float) mo72434g(), mo72446m(), mo72447n());
        if (!(mo72444k() == 0 && mo72445l() == 0)) {
            this.f51869C.save();
            this.f51869C.rotateX((float) mo72444k());
            this.f51869C.rotateY((float) mo72445l());
            this.f51869C.getMatrix(this.f51870D);
            this.f51870D.preTranslate(-mo72446m(), -mo72447n());
            this.f51870D.postTranslate(mo72446m(), mo72447n());
            this.f51869C.restore();
            canvas.concat(this.f51870D);
        }
        a_(canvas);
    }

    /* renamed from: a */
    public void mo72416a(int i, int i2, int i3, int i4) {
        this.f51871a = new Rect(i, i2, i3, i4);
        mo72432f((float) mo72451q().centerX());
        mo72436g((float) mo72451q().centerY());
    }
}
