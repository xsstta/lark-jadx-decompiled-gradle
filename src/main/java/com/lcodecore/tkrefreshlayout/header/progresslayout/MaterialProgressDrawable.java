package com.lcodecore.tkrefreshlayout.header.progresslayout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.p031d.p032a.p033a.C0966b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class MaterialProgressDrawable extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f65203a = new C0966b();

    /* renamed from: d */
    private static final Interpolator f65204d = new LinearInterpolator();

    /* renamed from: b */
    public float f65205b;

    /* renamed from: c */
    boolean f65206c;

    /* renamed from: e */
    private final int[] f65207e;

    /* renamed from: f */
    private final ArrayList<Animation> f65208f = new ArrayList<>();

    /* renamed from: g */
    private final C26417a f65209g;

    /* renamed from: h */
    private float f65210h;

    /* renamed from: i */
    private Resources f65211i;

    /* renamed from: j */
    private View f65212j;

    /* renamed from: k */
    private Animation f65213k;

    /* renamed from: l */
    private double f65214l;

    /* renamed from: m */
    private double f65215m;

    /* renamed from: n */
    private final Drawable.Callback f65216n;

    @Retention(RetentionPolicy.CLASS)
    public @interface ProgressDrawableSize {
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lcodecore.tkrefreshlayout.header.progresslayout.MaterialProgressDrawable$a */
    public static class C26417a {

        /* renamed from: a */
        private final RectF f65222a = new RectF();

        /* renamed from: b */
        private final Paint f65223b;

        /* renamed from: c */
        private final Paint f65224c;

        /* renamed from: d */
        private final Drawable.Callback f65225d;

        /* renamed from: e */
        private float f65226e;

        /* renamed from: f */
        private float f65227f;

        /* renamed from: g */
        private float f65228g;

        /* renamed from: h */
        private float f65229h;

        /* renamed from: i */
        private float f65230i;

        /* renamed from: j */
        private int[] f65231j;

        /* renamed from: k */
        private int f65232k;

        /* renamed from: l */
        private float f65233l;

        /* renamed from: m */
        private float f65234m;

        /* renamed from: n */
        private float f65235n;

        /* renamed from: o */
        private boolean f65236o;

        /* renamed from: p */
        private Path f65237p;

        /* renamed from: q */
        private float f65238q;

        /* renamed from: r */
        private double f65239r;

        /* renamed from: s */
        private int f65240s;

        /* renamed from: t */
        private int f65241t;

        /* renamed from: u */
        private int f65242u;

        /* renamed from: v */
        private final Paint f65243v;

        /* renamed from: w */
        private int f65244w;

        /* renamed from: x */
        private int f65245x;

        /* renamed from: c */
        public int mo93765c() {
            return this.f65242u;
        }

        /* renamed from: d */
        public float mo93768d() {
            return this.f65229h;
        }

        /* renamed from: e */
        public float mo93771e() {
            return this.f65226e;
        }

        /* renamed from: f */
        public float mo93773f() {
            return this.f65233l;
        }

        /* renamed from: g */
        public float mo93774g() {
            return this.f65234m;
        }

        /* renamed from: i */
        public float mo93776i() {
            return this.f65227f;
        }

        /* renamed from: j */
        public double mo93777j() {
            return this.f65239r;
        }

        /* renamed from: k */
        public float mo93778k() {
            return this.f65235n;
        }

        /* renamed from: a */
        public void mo93761a(int[] iArr) {
            this.f65231j = iArr;
            mo93767c(0);
        }

        /* renamed from: o */
        private void m95688o() {
            this.f65225d.invalidateDrawable(null);
        }

        /* renamed from: b */
        public void mo93762b() {
            mo93767c(m95687n());
        }

        /* renamed from: h */
        public int mo93775h() {
            return this.f65231j[this.f65232k];
        }

        /* renamed from: n */
        private int m95687n() {
            return (this.f65232k + 1) % this.f65231j.length;
        }

        /* renamed from: a */
        public int mo93752a() {
            return this.f65231j[m95687n()];
        }

        /* renamed from: l */
        public void mo93779l() {
            this.f65233l = this.f65226e;
            this.f65234m = this.f65227f;
            this.f65235n = this.f65228g;
        }

        /* renamed from: m */
        public void mo93780m() {
            this.f65233l = BitmapDescriptorFactory.HUE_RED;
            this.f65234m = BitmapDescriptorFactory.HUE_RED;
            this.f65235n = BitmapDescriptorFactory.HUE_RED;
            mo93763b(BitmapDescriptorFactory.HUE_RED);
            mo93766c(BitmapDescriptorFactory.HUE_RED);
            mo93769d(BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: a */
        public void mo93753a(double d) {
            this.f65239r = d;
        }

        /* renamed from: b */
        public void mo93764b(int i) {
            this.f65245x = i;
        }

        /* renamed from: c */
        public void mo93766c(float f) {
            this.f65227f = f;
            m95688o();
        }

        /* renamed from: d */
        public void mo93769d(float f) {
            this.f65228g = f;
            m95688o();
        }

        /* renamed from: b */
        public void mo93763b(float f) {
            this.f65226e = f;
            m95688o();
        }

        /* renamed from: c */
        public void mo93767c(int i) {
            this.f65232k = i;
            this.f65245x = this.f65231j[i];
        }

        /* renamed from: d */
        public void mo93770d(int i) {
            this.f65242u = i;
        }

        /* renamed from: e */
        public void mo93772e(float f) {
            if (f != this.f65238q) {
                this.f65238q = f;
                m95688o();
            }
        }

        /* renamed from: a */
        public void mo93754a(float f) {
            this.f65229h = f;
            this.f65223b.setStrokeWidth(f);
            m95688o();
        }

        /* renamed from: a */
        public void mo93756a(int i) {
            this.f65244w = i;
        }

        public C26417a(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f65223b = paint;
            Paint paint2 = new Paint();
            this.f65224c = paint2;
            this.f65226e = BitmapDescriptorFactory.HUE_RED;
            this.f65227f = BitmapDescriptorFactory.HUE_RED;
            this.f65228g = BitmapDescriptorFactory.HUE_RED;
            this.f65229h = 5.0f;
            this.f65230i = 2.5f;
            this.f65243v = new Paint(1);
            this.f65225d = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        /* renamed from: a */
        public void mo93759a(ColorFilter colorFilter) {
            this.f65223b.setColorFilter(colorFilter);
            m95688o();
        }

        /* renamed from: a */
        public void mo93760a(boolean z) {
            if (this.f65236o != z) {
                this.f65236o = z;
                m95688o();
            }
        }

        /* renamed from: a */
        public void mo93755a(float f, float f2) {
            this.f65240s = (int) f;
            this.f65241t = (int) f2;
        }

        /* renamed from: a */
        public void mo93757a(int i, int i2) {
            double d;
            float min = (float) Math.min(i, i2);
            double d2 = this.f65239r;
            if (d2 <= 0.0d || min < BitmapDescriptorFactory.HUE_RED) {
                d = Math.ceil((double) (this.f65229h / 2.0f));
            } else {
                d = ((double) (min / 2.0f)) - d2;
            }
            this.f65230i = (float) d;
        }

        /* renamed from: a */
        public void mo93758a(Canvas canvas, Rect rect) {
            RectF rectF = this.f65222a;
            rectF.set(rect);
            float f = this.f65230i;
            rectF.inset(f, f);
            float f2 = this.f65226e;
            float f3 = this.f65228g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f65227f + f3) * 360.0f) - f4;
            this.f65223b.setColor(this.f65245x);
            canvas.drawArc(rectF, f4, f5, false, this.f65223b);
            m95686a(canvas, f4, f5, rect);
            if (this.f65242u < 255) {
                this.f65243v.setColor(this.f65244w);
                this.f65243v.setAlpha(255 - this.f65242u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.f65243v);
            }
        }

        /* renamed from: a */
        private void m95686a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f65236o) {
                Path path = this.f65237p;
                if (path == null) {
                    Path path2 = new Path();
                    this.f65237p = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = ((float) (((int) this.f65230i) / 2)) * this.f65238q;
                float sin = (float) ((this.f65239r * Math.sin(0.0d)) + ((double) rect.exactCenterY()));
                this.f65237p.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f65237p.lineTo(((float) this.f65240s) * this.f65238q, BitmapDescriptorFactory.HUE_RED);
                Path path3 = this.f65237p;
                float f4 = this.f65238q;
                path3.lineTo((((float) this.f65240s) * f4) / 2.0f, ((float) this.f65241t) * f4);
                this.f65237p.offset(((float) ((this.f65239r * Math.cos(0.0d)) + ((double) rect.exactCenterX()))) - f3, sin);
                this.f65237p.close();
                this.f65224c.setColor(this.f65245x);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f65237p, this.f65224c);
            }
        }
    }

    public int getIntrinsicHeight() {
        return (int) this.f65215m;
    }

    public int getIntrinsicWidth() {
        return (int) this.f65214l;
    }

    public int getAlpha() {
        return this.f65209g.mo93765c();
    }

    /* renamed from: a */
    private void m95674a() {
        final C26417a aVar = this.f65209g;
        C264141 r1 = new Animation() {
            /* class com.lcodecore.tkrefreshlayout.header.progresslayout.MaterialProgressDrawable.C264141 */

            public void applyTransformation(float f, Transformation transformation) {
                if (MaterialProgressDrawable.this.f65206c) {
                    MaterialProgressDrawable.this.mo93732b(f, aVar);
                    return;
                }
                float a = MaterialProgressDrawable.this.mo93725a(aVar);
                float g = aVar.mo93774g();
                float f2 = aVar.mo93773f();
                float k = aVar.mo93778k();
                MaterialProgressDrawable.this.mo93728a(f, aVar);
                if (f <= 0.5f) {
                    Interpolator interpolator = MaterialProgressDrawable.f65203a;
                    aVar.mo93763b(f2 + ((0.8f - a) * interpolator.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    Interpolator interpolator2 = MaterialProgressDrawable.f65203a;
                    aVar.mo93766c(g + ((0.8f - a) * interpolator2.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.mo93769d(k + (0.25f * f));
                MaterialProgressDrawable.this.mo93734c((f * 216.0f) + ((MaterialProgressDrawable.this.f65205b / 5.0f) * 1080.0f));
            }
        };
        r1.setRepeatCount(-1);
        r1.setRepeatMode(1);
        r1.setInterpolator(f65204d);
        r1.setAnimationListener(new Animation.AnimationListener() {
            /* class com.lcodecore.tkrefreshlayout.header.progresslayout.MaterialProgressDrawable.animationAnimation$AnimationListenerC264152 */

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                MaterialProgressDrawable.this.f65205b = BitmapDescriptorFactory.HUE_RED;
            }

            public void onAnimationRepeat(Animation animation) {
                aVar.mo93779l();
                aVar.mo93762b();
                C26417a aVar = aVar;
                aVar.mo93763b(aVar.mo93776i());
                if (MaterialProgressDrawable.this.f65206c) {
                    MaterialProgressDrawable.this.f65206c = false;
                    animation.setDuration(1332);
                    aVar.mo93760a(false);
                    return;
                }
                MaterialProgressDrawable materialProgressDrawable = MaterialProgressDrawable.this;
                materialProgressDrawable.f65205b = (materialProgressDrawable.f65205b + 1.0f) % 5.0f;
            }
        });
        this.f65213k = r1;
    }

    public void stop() {
        this.f65212j.clearAnimation();
        mo93734c(BitmapDescriptorFactory.HUE_RED);
        this.f65209g.mo93760a(false);
        this.f65209g.mo93767c(0);
        this.f65209g.mo93780m();
    }

    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.f65208f;
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
        this.f65213k.reset();
        this.f65209g.mo93779l();
        if (this.f65209g.mo93776i() != this.f65209g.mo93771e()) {
            this.f65206c = true;
            this.f65213k.setDuration(666);
            this.f65212j.startAnimation(this.f65213k);
            return;
        }
        this.f65209g.mo93767c(0);
        this.f65209g.mo93780m();
        this.f65213k.setDuration(1332);
        this.f65212j.startAnimation(this.f65213k);
    }

    /* renamed from: a */
    public void mo93726a(float f) {
        this.f65209g.mo93772e(f);
    }

    /* renamed from: b */
    public void mo93731b(float f) {
        this.f65209g.mo93769d(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo93734c(float f) {
        this.f65210h = f;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f65209g.mo93770d(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f65209g.mo93759a(colorFilter);
    }

    /* renamed from: b */
    public void mo93733b(int i) {
        this.f65209g.mo93756a(i);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f65210h, bounds.exactCenterX(), bounds.exactCenterY());
        this.f65209g.mo93758a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public float mo93725a(C26417a aVar) {
        return (float) Math.toRadians(((double) aVar.mo93768d()) / (aVar.mo93777j() * 6.283185307179586d));
    }

    /* renamed from: a */
    public void mo93729a(int i) {
        if (i == 0) {
            m95675a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m95675a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public void mo93730a(int... iArr) {
        this.f65209g.mo93761a(iArr);
        this.f65209g.mo93767c(0);
    }

    /* renamed from: a */
    public void mo93727a(float f, float f2) {
        this.f65209g.mo93763b(f);
        this.f65209g.mo93766c(f2);
    }

    public MaterialProgressDrawable(Context context, View view) {
        int[] iArr = {-16777216};
        this.f65207e = iArr;
        C264163 r2 = new Drawable.Callback() {
            /* class com.lcodecore.tkrefreshlayout.header.progresslayout.MaterialProgressDrawable.C264163 */

            public void invalidateDrawable(Drawable drawable) {
                MaterialProgressDrawable.this.invalidateSelf();
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                MaterialProgressDrawable.this.unscheduleSelf(runnable);
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                MaterialProgressDrawable.this.scheduleSelf(runnable, j);
            }
        };
        this.f65216n = r2;
        this.f65212j = view;
        this.f65211i = context.getResources();
        C26417a aVar = new C26417a(r2);
        this.f65209g = aVar;
        aVar.mo93761a(iArr);
        mo93729a(1);
        m95674a();
    }

    /* renamed from: b */
    public void mo93732b(float f, C26417a aVar) {
        mo93728a(f, aVar);
        aVar.mo93763b(aVar.mo93773f() + (((aVar.mo93774g() - mo93725a(aVar)) - aVar.mo93773f()) * f));
        aVar.mo93766c(aVar.mo93774g());
        aVar.mo93769d(aVar.mo93778k() + ((((float) (Math.floor((double) (aVar.mo93778k() / 0.8f)) + 1.0d)) - aVar.mo93778k()) * f));
    }

    /* renamed from: a */
    public void mo93728a(float f, C26417a aVar) {
        if (f > 0.75f) {
            aVar.mo93764b(m95673a((f - 0.75f) / 0.25f, aVar.mo93775h(), aVar.mo93752a()));
        }
    }

    /* renamed from: a */
    private int m95673a(float f, int i, int i2) {
        int intValue = Integer.valueOf(i).intValue();
        int i3 = (intValue >> 24) & 255;
        int i4 = (intValue >> 16) & 255;
        int i5 = (intValue >> 8) & 255;
        int i6 = intValue & 255;
        int intValue2 = Integer.valueOf(i2).intValue();
        return ((i3 + ((int) (((float) (((intValue2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((intValue2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((intValue2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((intValue2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m95675a(double d, double d2, double d3, double d4, float f, float f2) {
        C26417a aVar = this.f65209g;
        float f3 = this.f65211i.getDisplayMetrics().density;
        double d5 = (double) f3;
        this.f65214l = d * d5;
        this.f65215m = d2 * d5;
        aVar.mo93754a(((float) d4) * f3);
        aVar.mo93753a(d3 * d5);
        aVar.mo93767c(0);
        aVar.mo93755a(f * f3, f2 * f3);
        aVar.mo93757a((int) this.f65214l, (int) this.f65215m);
    }
}
