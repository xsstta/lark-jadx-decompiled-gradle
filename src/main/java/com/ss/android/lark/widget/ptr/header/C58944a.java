package com.ss.android.lark.widget.ptr.header;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.ptr.p2962b.C58937a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.widget.ptr.header.a */
public class C58944a extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f145988a = new C58950a();

    /* renamed from: b */
    public static final Interpolator f145989b = new C58953d();

    /* renamed from: f */
    private static final Interpolator f145990f = new LinearInterpolator();

    /* renamed from: g */
    private static final Interpolator f145991g = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public View f145992c;

    /* renamed from: d */
    public Animation f145993d;

    /* renamed from: e */
    public float f145994e;

    /* renamed from: h */
    private final int[] f145995h;

    /* renamed from: i */
    private final ArrayList<Animation> f145996i = new ArrayList<>();

    /* renamed from: j */
    private final C58952c f145997j;

    /* renamed from: k */
    private final Drawable.Callback f145998k;

    /* renamed from: l */
    private float f145999l;

    /* renamed from: m */
    private Resources f146000m;

    /* renamed from: n */
    private double f146001n;

    /* renamed from: o */
    private double f146002o;

    /* renamed from: p */
    private Animation f146003p;

    /* renamed from: q */
    private int f146004q;

    /* renamed from: r */
    private ShapeDrawable f146005r;

    public int getOpacity() {
        return -3;
    }

    /* renamed from: com.ss.android.lark.widget.ptr.header.a$a */
    private static class C58950a extends AccelerateDecelerateInterpolator {
        private C58950a() {
        }

        public float getInterpolation(float f) {
            return super.getInterpolation(Math.max((float) BitmapDescriptorFactory.HUE_RED, (f - 0.5f) * 2.0f));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.ptr.header.a$c */
    public static class C58952c {

        /* renamed from: a */
        private final RectF f146020a = new RectF();

        /* renamed from: b */
        private final Paint f146021b;

        /* renamed from: c */
        private final Paint f146022c;

        /* renamed from: d */
        private final Drawable.Callback f146023d;

        /* renamed from: e */
        private final Paint f146024e;

        /* renamed from: f */
        private float f146025f;

        /* renamed from: g */
        private float f146026g;

        /* renamed from: h */
        private float f146027h;

        /* renamed from: i */
        private float f146028i;

        /* renamed from: j */
        private float f146029j;

        /* renamed from: k */
        private int[] f146030k;

        /* renamed from: l */
        private int f146031l;

        /* renamed from: m */
        private float f146032m;

        /* renamed from: n */
        private float f146033n;

        /* renamed from: o */
        private float f146034o;

        /* renamed from: p */
        private boolean f146035p;

        /* renamed from: q */
        private Path f146036q;

        /* renamed from: r */
        private float f146037r;

        /* renamed from: s */
        private double f146038s;

        /* renamed from: t */
        private int f146039t;

        /* renamed from: u */
        private int f146040u;

        /* renamed from: v */
        private int f146041v;

        /* renamed from: w */
        private int f146042w;

        /* renamed from: b */
        public int mo200002b() {
            return this.f146041v;
        }

        /* renamed from: c */
        public float mo200005c() {
            return this.f146028i;
        }

        /* renamed from: d */
        public float mo200008d() {
            return this.f146025f;
        }

        /* renamed from: e */
        public float mo200010e() {
            return this.f146032m;
        }

        /* renamed from: f */
        public float mo200012f() {
            return this.f146033n;
        }

        /* renamed from: g */
        public float mo200013g() {
            return this.f146026g;
        }

        /* renamed from: h */
        public double mo200014h() {
            return this.f146038s;
        }

        /* renamed from: i */
        public float mo200015i() {
            return this.f146034o;
        }

        /* renamed from: l */
        private void m228813l() {
            this.f146023d.invalidateDrawable(null);
        }

        /* renamed from: a */
        public void mo199992a() {
            this.f146031l = (this.f146031l + 1) % this.f146030k.length;
        }

        /* renamed from: j */
        public void mo200016j() {
            this.f146032m = this.f146025f;
            this.f146033n = this.f146026g;
            this.f146034o = this.f146027h;
        }

        /* renamed from: k */
        public void mo200017k() {
            this.f146032m = BitmapDescriptorFactory.HUE_RED;
            this.f146033n = BitmapDescriptorFactory.HUE_RED;
            this.f146034o = BitmapDescriptorFactory.HUE_RED;
            mo200003b(BitmapDescriptorFactory.HUE_RED);
            mo200006c(BitmapDescriptorFactory.HUE_RED);
            mo200009d(BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: a */
        public void mo199993a(double d) {
            this.f146038s = d;
        }

        /* renamed from: b */
        public void mo200003b(float f) {
            this.f146025f = f;
            m228813l();
        }

        /* renamed from: c */
        public void mo200006c(float f) {
            this.f146026g = f;
            m228813l();
        }

        /* renamed from: d */
        public void mo200009d(float f) {
            this.f146027h = f;
            m228813l();
        }

        /* renamed from: b */
        public void mo200004b(int i) {
            this.f146031l = i;
        }

        /* renamed from: c */
        public void mo200007c(int i) {
            this.f146041v = i;
        }

        /* renamed from: e */
        public void mo200011e(float f) {
            if (f != this.f146037r) {
                this.f146037r = f;
                m228813l();
            }
        }

        /* renamed from: a */
        public void mo199994a(float f) {
            this.f146028i = f;
            this.f146021b.setStrokeWidth(f);
            m228813l();
        }

        /* renamed from: a */
        public void mo199996a(int i) {
            this.f146042w = i;
        }

        public C58952c(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f146021b = paint;
            Paint paint2 = new Paint();
            this.f146022c = paint2;
            Paint paint3 = new Paint();
            this.f146024e = paint3;
            this.f146025f = BitmapDescriptorFactory.HUE_RED;
            this.f146026g = BitmapDescriptorFactory.HUE_RED;
            this.f146027h = BitmapDescriptorFactory.HUE_RED;
            this.f146028i = 5.0f;
            this.f146029j = 2.5f;
            this.f146023d = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setAntiAlias(true);
        }

        /* renamed from: a */
        public void mo199999a(ColorFilter colorFilter) {
            this.f146021b.setColorFilter(colorFilter);
            m228813l();
        }

        /* renamed from: a */
        public void mo200000a(boolean z) {
            if (this.f146035p != z) {
                this.f146035p = z;
                m228813l();
            }
        }

        /* renamed from: a */
        public void mo200001a(int[] iArr) {
            this.f146030k = iArr;
            mo200004b(0);
        }

        /* renamed from: a */
        public void mo199995a(float f, float f2) {
            this.f146039t = (int) f;
            this.f146040u = (int) f2;
        }

        /* renamed from: a */
        public void mo199997a(int i, int i2) {
            double d;
            float min = (float) Math.min(i, i2);
            double d2 = this.f146038s;
            if (d2 <= 0.0d || min < BitmapDescriptorFactory.HUE_RED) {
                d = Math.ceil((double) (this.f146028i / 2.0f));
            } else {
                d = ((double) (min / 2.0f)) - d2;
            }
            this.f146029j = (float) d;
        }

        /* renamed from: a */
        public void mo199998a(Canvas canvas, Rect rect) {
            this.f146024e.setColor(this.f146042w);
            this.f146024e.setAlpha(this.f146041v);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.f146024e);
            RectF rectF = this.f146020a;
            rectF.set(rect);
            float f = this.f146029j;
            rectF.inset(f, f);
            float f2 = this.f146025f;
            float f3 = this.f146027h;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f146026g + f3) * 360.0f) - f4;
            this.f146021b.setColor(this.f146030k[this.f146031l]);
            this.f146021b.setAlpha(this.f146041v);
            canvas.drawArc(rectF, f4, f5, false, this.f146021b);
            m228812a(canvas, f4, f5, rect);
        }

        /* renamed from: a */
        private void m228812a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f146035p) {
                Path path = this.f146036q;
                if (path == null) {
                    Path path2 = new Path();
                    this.f146036q = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = ((float) (((int) this.f146029j) / 2)) * this.f146037r;
                float sin = (float) ((this.f146038s * Math.sin(0.0d)) + ((double) rect.exactCenterY()));
                this.f146036q.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f146036q.lineTo(((float) this.f146039t) * this.f146037r, BitmapDescriptorFactory.HUE_RED);
                Path path3 = this.f146036q;
                float f4 = this.f146037r;
                path3.lineTo((((float) this.f146039t) * f4) / 2.0f, ((float) this.f146040u) * f4);
                this.f146036q.offset(((float) ((this.f146038s * Math.cos(0.0d)) + ((double) rect.exactCenterX()))) - f3, sin);
                this.f146036q.close();
                this.f146022c.setColor(this.f146030k[this.f146031l]);
                this.f146022c.setAlpha(this.f146041v);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f146036q, this.f146022c);
            }
        }
    }

    /* renamed from: com.ss.android.lark.widget.ptr.header.a$d */
    private static class C58953d extends AccelerateDecelerateInterpolator {
        private C58953d() {
        }

        public float getInterpolation(float f) {
            return super.getInterpolation(Math.min(1.0f, f * 2.0f));
        }
    }

    public int getIntrinsicHeight() {
        return (int) this.f146002o;
    }

    public int getIntrinsicWidth() {
        return (int) this.f146001n;
    }

    public int getAlpha() {
        return this.f145997j.mo200002b();
    }

    public void stop() {
        this.f145992c.clearAnimation();
        mo199968c(BitmapDescriptorFactory.HUE_RED);
        this.f145997j.mo200000a(false);
        this.f145997j.mo200004b(0);
        this.f145997j.mo200017k();
    }

    /* renamed from: a */
    private void m228801a() {
        final C58952c cVar = this.f145997j;
        C589462 r1 = new Animation() {
            /* class com.ss.android.lark.widget.ptr.header.C58944a.C589462 */

            public void applyTransformation(float f, Transformation transformation) {
                float floor = (float) (Math.floor((double) (cVar.mo200015i() / 0.8f)) + 1.0d);
                cVar.mo200003b(cVar.mo200010e() + ((cVar.mo200012f() - cVar.mo200010e()) * f));
                cVar.mo200009d(cVar.mo200015i() + ((floor - cVar.mo200015i()) * f));
                cVar.mo200011e(1.0f - f);
            }
        };
        r1.setInterpolator(f145991g);
        r1.setDuration(666);
        r1.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.widget.ptr.header.C58944a.animationAnimation$AnimationListenerC589473 */

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                cVar.mo199992a();
                cVar.mo200016j();
                cVar.mo200000a(false);
                C58944a.this.f145992c.startAnimation(C58944a.this.f145993d);
            }
        });
        C589484 r2 = new Animation() {
            /* class com.ss.android.lark.widget.ptr.header.C58944a.C589484 */

            public void applyTransformation(float f, Transformation transformation) {
                float radians = (float) Math.toRadians(((double) cVar.mo200005c()) / (cVar.mo200014h() * 6.283185307179586d));
                float f2 = cVar.mo200012f();
                float e = cVar.mo200010e();
                float i = cVar.mo200015i();
                cVar.mo200006c(f2 + ((0.8f - radians) * C58944a.f145989b.getInterpolation(f)));
                cVar.mo200003b(e + (C58944a.f145988a.getInterpolation(f) * 0.8f));
                cVar.mo200009d(i + (0.25f * f));
                C58944a.this.mo199968c((f * 144.0f) + ((C58944a.this.f145994e / 5.0f) * 720.0f));
            }
        };
        r2.setRepeatCount(-1);
        r2.setRepeatMode(1);
        r2.setInterpolator(f145990f);
        r2.setDuration(1333);
        r2.setAnimationListener(new Animation.AnimationListener() {
            /* class com.ss.android.lark.widget.ptr.header.C58944a.animationAnimation$AnimationListenerC589495 */

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                C58944a.this.f145994e = BitmapDescriptorFactory.HUE_RED;
            }

            public void onAnimationRepeat(Animation animation) {
                cVar.mo200016j();
                cVar.mo199992a();
                C58952c cVar = cVar;
                cVar.mo200003b(cVar.mo200013g());
                C58944a aVar = C58944a.this;
                aVar.f145994e = (aVar.f145994e + 1.0f) % 5.0f;
            }
        });
        this.f146003p = r1;
        this.f145993d = r2;
    }

    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.f145996i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        this.f145993d.reset();
        this.f145997j.mo200016j();
        if (this.f145997j.mo200013g() != this.f145997j.mo200008d()) {
            this.f145992c.startAnimation(this.f146003p);
            return;
        }
        this.f145997j.mo200004b(0);
        this.f145997j.mo200017k();
        this.f145992c.startAnimation(this.f145993d);
    }

    /* renamed from: a */
    public void mo199961a(float f) {
        this.f145997j.mo200011e(f);
    }

    /* renamed from: b */
    public void mo199966b(float f) {
        this.f145997j.mo200009d(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo199968c(float f) {
        this.f145999l = f;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f145997j.mo200007c(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f145997j.mo199999a(colorFilter);
    }

    /* renamed from: b */
    public void mo199967b(int i) {
        this.f146004q = i;
        this.f145997j.mo199996a(i);
    }

    /* renamed from: a */
    public void mo199964a(boolean z) {
        this.f145997j.mo200000a(z);
    }

    public void draw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.f146005r;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(this.f146004q);
            this.f146005r.draw(canvas);
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f145999l, bounds.exactCenterX(), bounds.exactCenterY());
        this.f145997j.mo199998a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private void m228802a(double d) {
        C58937a.m228779a(this.f145992c.getContext());
        int a = C58937a.m228778a(1.75f);
        int a2 = C58937a.m228778a((float) BitmapDescriptorFactory.HUE_RED);
        int a3 = C58937a.m228778a(3.5f);
        this.f146005r = new ShapeDrawable(new C58951b(a3, (int) d));
        if (Build.VERSION.SDK_INT >= 11) {
            this.f145992c.setLayerType(1, this.f146005r.getPaint());
        }
        this.f146005r.getPaint().setShadowLayer((float) a3, (float) a2, (float) a, 503316480);
    }

    /* renamed from: a */
    public void mo199963a(int i) {
        if (i == 0) {
            m228803a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m228803a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public void mo199965a(int... iArr) {
        this.f145997j.mo200001a(iArr);
        this.f145997j.mo200004b(0);
    }

    /* renamed from: a */
    public void mo199962a(float f, float f2) {
        this.f145997j.mo200003b(f);
        this.f145997j.mo200006c(f2);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.ptr.header.a$b */
    public class C58951b extends OvalShape {

        /* renamed from: b */
        private RadialGradient f146016b;

        /* renamed from: c */
        private int f146017c;

        /* renamed from: d */
        private Paint f146018d = new Paint();

        /* renamed from: e */
        private int f146019e;

        public void draw(Canvas canvas, Paint paint) {
            float width = (float) (C58944a.this.getBounds().width() / 2);
            float height = (float) (C58944a.this.getBounds().height() / 2);
            canvas.drawCircle(width, height, (float) ((this.f146019e / 2) + this.f146017c), this.f146018d);
            canvas.drawCircle(width, height, (float) (this.f146019e / 2), paint);
        }

        public C58951b(int i, int i2) {
            this.f146017c = i;
            this.f146019e = i2;
            int i3 = this.f146019e;
            RadialGradient radialGradient = new RadialGradient((float) (i3 / 2), (float) (i3 / 2), (float) this.f146017c, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f146016b = radialGradient;
            this.f146018d.setShader(radialGradient);
        }
    }

    public C58944a(Context context, View view) {
        int[] iArr = {-3591113, -13149199, -536002, -13327536};
        this.f145995h = iArr;
        C589451 r1 = new Drawable.Callback() {
            /* class com.ss.android.lark.widget.ptr.header.C58944a.C589451 */

            public void invalidateDrawable(Drawable drawable) {
                C58944a.this.invalidateSelf();
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C58944a.this.unscheduleSelf(runnable);
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C58944a.this.scheduleSelf(runnable, j);
            }
        };
        this.f145998k = r1;
        this.f145992c = view;
        this.f146000m = context.getResources();
        C58952c cVar = new C58952c(r1);
        this.f145997j = cVar;
        cVar.mo200001a(iArr);
        mo199963a(1);
        m228801a();
    }

    /* renamed from: a */
    private void m228803a(double d, double d2, double d3, double d4, float f, float f2) {
        C58952c cVar = this.f145997j;
        float f3 = this.f146000m.getDisplayMetrics().density;
        double d5 = (double) f3;
        this.f146001n = d * d5;
        this.f146002o = d2 * d5;
        cVar.mo199994a(((float) d4) * f3);
        cVar.mo199993a(d3 * d5);
        cVar.mo200004b(0);
        cVar.mo199995a(f * f3, f2 * f3);
        cVar.mo199997a((int) this.f146001n, (int) this.f146002o);
        m228802a(this.f146001n);
    }
}
