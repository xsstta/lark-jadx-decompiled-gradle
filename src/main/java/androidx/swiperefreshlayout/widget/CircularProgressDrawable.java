package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
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
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C0845f;
import androidx.p031d.p032a.p033a.C0966b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {

    /* renamed from: c */
    private static final Interpolator f5113c = new LinearInterpolator();

    /* renamed from: d */
    private static final Interpolator f5114d = new C0966b();

    /* renamed from: e */
    private static final int[] f5115e = {-16777216};

    /* renamed from: a */
    float f5116a;

    /* renamed from: b */
    boolean f5117b;

    /* renamed from: f */
    private final C1456a f5118f;

    /* renamed from: g */
    private float f5119g;

    /* renamed from: h */
    private Resources f5120h;

    /* renamed from: i */
    private Animator f5121i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    /* renamed from: a */
    private int m6644a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.swiperefreshlayout.widget.CircularProgressDrawable$a */
    public static class C1456a {

        /* renamed from: a */
        final RectF f5126a = new RectF();

        /* renamed from: b */
        final Paint f5127b;

        /* renamed from: c */
        final Paint f5128c;

        /* renamed from: d */
        final Paint f5129d;

        /* renamed from: e */
        float f5130e;

        /* renamed from: f */
        float f5131f;

        /* renamed from: g */
        float f5132g;

        /* renamed from: h */
        float f5133h;

        /* renamed from: i */
        int[] f5134i;

        /* renamed from: j */
        int f5135j;

        /* renamed from: k */
        float f5136k;

        /* renamed from: l */
        float f5137l;

        /* renamed from: m */
        float f5138m;

        /* renamed from: n */
        boolean f5139n;

        /* renamed from: o */
        Path f5140o;

        /* renamed from: p */
        float f5141p;

        /* renamed from: q */
        float f5142q;

        /* renamed from: r */
        int f5143r;

        /* renamed from: s */
        int f5144s;

        /* renamed from: t */
        int f5145t;

        /* renamed from: u */
        int f5146u;

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo7735d() {
            return this.f5145t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public float mo7737e() {
            return this.f5133h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public float mo7739f() {
            return this.f5130e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo7741g() {
            return this.f5136k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public float mo7742h() {
            return this.f5137l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo7744j() {
            return this.f5131f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public float mo7745k() {
            return this.f5142q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public float mo7746l() {
            return this.f5138m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7732c() {
            mo7731b(mo7729b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo7743i() {
            return this.f5134i[this.f5135j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7719a() {
            return this.f5134i[mo7729b()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7729b() {
            return (this.f5135j + 1) % this.f5134i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo7747m() {
            this.f5136k = this.f5130e;
            this.f5137l = this.f5131f;
            this.f5138m = this.f5132g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo7748n() {
            this.f5136k = BitmapDescriptorFactory.HUE_RED;
            this.f5137l = BitmapDescriptorFactory.HUE_RED;
            this.f5138m = BitmapDescriptorFactory.HUE_RED;
            mo7730b(BitmapDescriptorFactory.HUE_RED);
            mo7733c(BitmapDescriptorFactory.HUE_RED);
            mo7736d(BitmapDescriptorFactory.HUE_RED);
        }

        C1456a() {
            Paint paint = new Paint();
            this.f5127b = paint;
            Paint paint2 = new Paint();
            this.f5128c = paint2;
            Paint paint3 = new Paint();
            this.f5129d = paint3;
            this.f5130e = BitmapDescriptorFactory.HUE_RED;
            this.f5131f = BitmapDescriptorFactory.HUE_RED;
            this.f5132g = BitmapDescriptorFactory.HUE_RED;
            this.f5133h = 5.0f;
            this.f5141p = 1.0f;
            this.f5145t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7722a(int i) {
            this.f5146u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7730b(float f) {
            this.f5130e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7733c(float f) {
            this.f5131f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7720a(float f) {
            this.f5133h = f;
            this.f5127b.setStrokeWidth(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7736d(float f) {
            this.f5132g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo7738e(float f) {
            this.f5142q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7734c(int i) {
            this.f5145t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo7740f(float f) {
            if (f != this.f5141p) {
                this.f5141p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7731b(int i) {
            this.f5135j = i;
            this.f5146u = this.f5134i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7725a(ColorFilter colorFilter) {
            this.f5127b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7726a(Paint.Cap cap) {
            this.f5127b.setStrokeCap(cap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7727a(boolean z) {
            if (this.f5139n != z) {
                this.f5139n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7728a(int[] iArr) {
            this.f5134i = iArr;
            mo7731b(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7721a(float f, float f2) {
            this.f5143r = (int) f;
            this.f5144s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7724a(Canvas canvas, Rect rect) {
            RectF rectF = this.f5126a;
            float f = this.f5142q;
            float f2 = (this.f5133h / 2.0f) + f;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f5143r) * this.f5141p) / 2.0f, this.f5133h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f5130e;
            float f4 = this.f5132g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f5131f + f4) * 360.0f) - f5;
            this.f5127b.setColor(this.f5146u);
            this.f5127b.setAlpha(this.f5145t);
            float f7 = this.f5133h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f5129d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f5127b);
            mo7723a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7723a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f5139n) {
                Path path = this.f5140o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f5140o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f5140o.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.f5140o.lineTo(((float) this.f5143r) * this.f5141p, BitmapDescriptorFactory.HUE_RED);
                Path path3 = this.f5140o;
                float f3 = this.f5141p;
                path3.lineTo((((float) this.f5143r) * f3) / 2.0f, ((float) this.f5144s) * f3);
                this.f5140o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f5143r) * this.f5141p) / 2.0f), rectF.centerY() + (this.f5133h / 2.0f));
                this.f5140o.close();
                this.f5128c.setColor(this.f5146u);
                this.f5128c.setAlpha(this.f5145t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f5140o, this.f5128c);
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public void mo7700a(boolean z) {
        this.f5118f.mo7727a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo7701a(int... iArr) {
        this.f5118f.mo7728a(iArr);
        this.f5118f.mo7731b(0);
        invalidateSelf();
    }

    /* renamed from: a */
    public float mo7693a() {
        return this.f5118f.mo7737e();
    }

    /* renamed from: b */
    public float mo7702b() {
        return this.f5118f.mo7745k();
    }

    public int getAlpha() {
        return this.f5118f.mo7735d();
    }

    public boolean isRunning() {
        return this.f5121i.isRunning();
    }

    public void stop() {
        this.f5121i.cancel();
        m6648e(BitmapDescriptorFactory.HUE_RED);
        this.f5118f.mo7727a(false);
        this.f5118f.mo7731b(0);
        this.f5118f.mo7748n();
        invalidateSelf();
    }

    /* renamed from: c */
    private void m6647c() {
        final C1456a aVar = this.f5118f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class androidx.swiperefreshlayout.widget.CircularProgressDrawable.C14541 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.mo7696a(floatValue, aVar);
                CircularProgressDrawable.this.mo7697a(floatValue, aVar, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5113c);
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class androidx.swiperefreshlayout.widget.CircularProgressDrawable.C14552 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.f5116a = BitmapDescriptorFactory.HUE_RED;
            }

            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.mo7697a(1.0f, aVar, true);
                aVar.mo7747m();
                aVar.mo7732c();
                if (CircularProgressDrawable.this.f5117b) {
                    CircularProgressDrawable.this.f5117b = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo7727a(false);
                    return;
                }
                CircularProgressDrawable.this.f5116a += 1.0f;
            }
        });
        this.f5121i = ofFloat;
    }

    public void start() {
        this.f5121i.cancel();
        this.f5118f.mo7747m();
        if (this.f5118f.mo7744j() != this.f5118f.mo7739f()) {
            this.f5117b = true;
            this.f5121i.setDuration(666);
            this.f5121i.start();
            return;
        }
        this.f5118f.mo7731b(0);
        this.f5118f.mo7748n();
        this.f5121i.setDuration(1332);
        this.f5121i.start();
    }

    /* renamed from: e */
    private void m6648e(float f) {
        this.f5119g = f;
    }

    /* renamed from: a */
    public void mo7694a(float f) {
        this.f5118f.mo7720a(f);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo7703b(float f) {
        this.f5118f.mo7738e(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo7704c(float f) {
        this.f5118f.mo7740f(f);
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo7705d(float f) {
        this.f5118f.mo7736d(f);
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f5118f.mo7734c(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5118f.mo7725a(colorFilter);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5119g, bounds.exactCenterX(), bounds.exactCenterY());
        this.f5118f.mo7724a(canvas, bounds);
        canvas.restore();
    }

    public CircularProgressDrawable(Context context) {
        this.f5120h = ((Context) C0845f.m3991a(context)).getResources();
        C1456a aVar = new C1456a();
        this.f5118f = aVar;
        aVar.mo7728a(f5115e);
        mo7694a(2.5f);
        m6647c();
    }

    /* renamed from: a */
    public void mo7698a(int i) {
        if (i == 0) {
            m6645a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m6645a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo7699a(Paint.Cap cap) {
        this.f5118f.mo7726a(cap);
        invalidateSelf();
    }

    /* renamed from: b */
    private void m6646b(float f, C1456a aVar) {
        mo7696a(f, aVar);
        aVar.mo7730b(aVar.mo7741g() + (((aVar.mo7742h() - 0.01f) - aVar.mo7741g()) * f));
        aVar.mo7733c(aVar.mo7742h());
        aVar.mo7736d(aVar.mo7746l() + ((((float) (Math.floor((double) (aVar.mo7746l() / 0.8f)) + 1.0d)) - aVar.mo7746l()) * f));
    }

    /* renamed from: a */
    public void mo7695a(float f, float f2) {
        this.f5118f.mo7730b(f);
        this.f5118f.mo7733c(f2);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7696a(float f, C1456a aVar) {
        if (f > 0.75f) {
            aVar.mo7722a(m6644a((f - 0.75f) / 0.25f, aVar.mo7743i(), aVar.mo7719a()));
        } else {
            aVar.mo7722a(aVar.mo7743i());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7697a(float f, C1456a aVar, boolean z) {
        float f2;
        float f3;
        if (this.f5117b) {
            m6646b(f, aVar);
        } else if (f != 1.0f || z) {
            float l = aVar.mo7746l();
            if (f < 0.5f) {
                f2 = aVar.mo7741g();
                f3 = (f5114d.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float g = aVar.mo7741g() + 0.79f;
                f2 = g - (((1.0f - f5114d.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = g;
            }
            aVar.mo7730b(f2);
            aVar.mo7733c(f3);
            aVar.mo7736d(l + (0.20999998f * f));
            m6648e((f + this.f5116a) * 216.0f);
        }
    }

    /* renamed from: a */
    private void m6645a(float f, float f2, float f3, float f4) {
        C1456a aVar = this.f5118f;
        float f5 = this.f5120h.getDisplayMetrics().density;
        aVar.mo7720a(f2 * f5);
        aVar.mo7738e(f * f5);
        aVar.mo7731b(0);
        aVar.mo7721a(f3 * f5, f4 * f5);
    }
}
