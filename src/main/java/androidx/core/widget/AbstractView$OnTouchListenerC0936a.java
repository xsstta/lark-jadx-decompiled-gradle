package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: androidx.core.widget.a */
public abstract class AbstractView$OnTouchListenerC0936a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f3532r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0937a f3533a = new C0937a();

    /* renamed from: b */
    final View f3534b;

    /* renamed from: c */
    boolean f3535c;

    /* renamed from: d */
    boolean f3536d;

    /* renamed from: e */
    boolean f3537e;

    /* renamed from: f */
    private final Interpolator f3538f = new AccelerateInterpolator();

    /* renamed from: g */
    private Runnable f3539g;

    /* renamed from: h */
    private float[] f3540h = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: i */
    private float[] f3541i = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    private int f3542j;

    /* renamed from: k */
    private int f3543k;

    /* renamed from: l */
    private float[] f3544l = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: m */
    private float[] f3545m = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: n */
    private float[] f3546n = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o */
    private boolean f3547o;

    /* renamed from: p */
    private boolean f3548p;

    /* renamed from: q */
    private boolean f3549q;

    /* renamed from: a */
    static float m4510a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m4513a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract void mo4802a(int i, int i2);

    /* renamed from: e */
    public abstract boolean mo4812e(int i);

    /* renamed from: f */
    public abstract boolean mo4813f(int i);

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    public static class C0937a {

        /* renamed from: a */
        private int f3550a;

        /* renamed from: b */
        private int f3551b;

        /* renamed from: c */
        private float f3552c;

        /* renamed from: d */
        private float f3553d;

        /* renamed from: e */
        private long f3554e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f3555f;

        /* renamed from: g */
        private int f3556g;

        /* renamed from: h */
        private int f3557h;

        /* renamed from: i */
        private long f3558i = -1;

        /* renamed from: j */
        private float f3559j;

        /* renamed from: k */
        private int f3560k;

        /* renamed from: a */
        private float m4532a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: g */
        public int mo4824g() {
            return this.f3556g;
        }

        /* renamed from: h */
        public int mo4825h() {
            return this.f3557h;
        }

        C0937a() {
        }

        /* renamed from: e */
        public int mo4822e() {
            float f = this.f3552c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo4823f() {
            float f = this.f3553d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: a */
        public void mo4815a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3554e = currentAnimationTimeMillis;
            this.f3558i = -1;
            this.f3555f = currentAnimationTimeMillis;
            this.f3559j = 0.5f;
            this.f3556g = 0;
            this.f3557h = 0;
        }

        /* renamed from: b */
        public void mo4818b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3560k = AbstractView$OnTouchListenerC0936a.m4513a((int) (currentAnimationTimeMillis - this.f3554e), 0, this.f3551b);
            this.f3559j = m4533a(currentAnimationTimeMillis);
            this.f3558i = currentAnimationTimeMillis;
        }

        /* renamed from: c */
        public boolean mo4820c() {
            if (this.f3558i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f3558i + ((long) this.f3560k)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public void mo4821d() {
            if (this.f3555f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m4532a(m4533a(currentAnimationTimeMillis));
                this.f3555f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3555f)) * a;
                this.f3556g = (int) (this.f3552c * f);
                this.f3557h = (int) (f * this.f3553d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo4817a(int i) {
            this.f3550a = i;
        }

        /* renamed from: b */
        public void mo4819b(int i) {
            this.f3551b = i;
        }

        /* renamed from: a */
        private float m4533a(long j) {
            long j2 = this.f3554e;
            if (j < j2) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j3 = this.f3558i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC0936a.m4510a(((float) (j - j2)) / ((float) this.f3550a), (float) BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            float f = this.f3559j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0936a.m4510a(((float) (j - j3)) / ((float) this.f3560k), (float) BitmapDescriptorFactory.HUE_RED, 1.0f));
        }

        /* renamed from: a */
        public void mo4816a(float f, float f2) {
            this.f3552c = f;
            this.f3553d = f2;
        }
    }

    /* renamed from: d */
    private void m4515d() {
        if (this.f3535c) {
            this.f3537e = false;
        } else {
            this.f3533a.mo4818b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4806b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.f3534b.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    private void m4514c() {
        int i;
        if (this.f3539g == null) {
            this.f3539g = new RunnableC0938b();
        }
        this.f3537e = true;
        this.f3535c = true;
        if (this.f3547o || (i = this.f3543k) <= 0) {
            this.f3539g.run();
        } else {
            ViewCompat.m4047a(this.f3534b, this.f3539g, (long) i);
        }
        this.f3547o = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    public class RunnableC0938b implements Runnable {
        public void run() {
            if (AbstractView$OnTouchListenerC0936a.this.f3537e) {
                if (AbstractView$OnTouchListenerC0936a.this.f3535c) {
                    AbstractView$OnTouchListenerC0936a.this.f3535c = false;
                    AbstractView$OnTouchListenerC0936a.this.f3533a.mo4815a();
                }
                C0937a aVar = AbstractView$OnTouchListenerC0936a.this.f3533a;
                if (aVar.mo4820c() || !AbstractView$OnTouchListenerC0936a.this.mo4803a()) {
                    AbstractView$OnTouchListenerC0936a.this.f3537e = false;
                    return;
                }
                if (AbstractView$OnTouchListenerC0936a.this.f3536d) {
                    AbstractView$OnTouchListenerC0936a.this.f3536d = false;
                    AbstractView$OnTouchListenerC0936a.this.mo4806b();
                }
                aVar.mo4821d();
                AbstractView$OnTouchListenerC0936a.this.mo4802a(aVar.mo4824g(), aVar.mo4825h());
                ViewCompat.m4046a(AbstractView$OnTouchListenerC0936a.this.f3534b, this);
            }
        }

        RunnableC0938b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4803a() {
        C0937a aVar = this.f3533a;
        int f = aVar.mo4823f();
        int e = aVar.mo4822e();
        if ((f == 0 || !mo4813f(f)) && (e == 0 || !mo4812e(e))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0936a mo4800a(int i) {
        this.f3542j = i;
        return this;
    }

    /* renamed from: b */
    public AbstractView$OnTouchListenerC0936a mo4805b(int i) {
        this.f3543k = i;
        return this;
    }

    /* renamed from: c */
    public AbstractView$OnTouchListenerC0936a mo4808c(int i) {
        this.f3533a.mo4817a(i);
        return this;
    }

    /* renamed from: d */
    public AbstractView$OnTouchListenerC0936a mo4810d(int i) {
        this.f3533a.mo4819b(i);
        return this;
    }

    public AbstractView$OnTouchListenerC0936a(View view) {
        this.f3534b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = (float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f));
        mo4799a(f, f);
        float f2 = (float) ((int) ((displayMetrics.density * 315.0f) + 0.5f));
        mo4804b(f2, f2);
        mo4800a(1);
        mo4811e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo4809d(0.2f, 0.2f);
        mo4807c(1.0f, 1.0f);
        mo4805b(f3532r);
        mo4808c(ParticipantRepo.f117150c);
        mo4810d(ParticipantRepo.f117150c);
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0936a mo4801a(boolean z) {
        if (this.f3548p && !z) {
            m4515d();
        }
        this.f3548p = z;
        return this;
    }

    /* renamed from: b */
    public AbstractView$OnTouchListenerC0936a mo4804b(float f, float f2) {
        float[] fArr = this.f3545m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public AbstractView$OnTouchListenerC0936a mo4807c(float f, float f2) {
        float[] fArr = this.f3544l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public AbstractView$OnTouchListenerC0936a mo4811e(float f, float f2) {
        float[] fArr = this.f3541i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public AbstractView$OnTouchListenerC0936a mo4799a(float f, float f2) {
        float[] fArr = this.f3546n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: d */
    public AbstractView$OnTouchListenerC0936a mo4809d(float f, float f2) {
        float[] fArr = this.f3540h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: f */
    private float m4516f(float f, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i = this.f3542j;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    return 1.0f - (f / f2);
                }
                if (!this.f3537e || i != 1) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < BitmapDescriptorFactory.HUE_RED) {
            return f / (-f2);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3548p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m4515d()
            goto L_0x0058
        L_0x001a:
            r5.f3536d = r2
            r5.f3547o = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3534b
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m4512a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3534b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m4512a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3533a
            r7.mo4816a(r0, r6)
            boolean r6 = r5.f3537e
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo4803a()
            if (r6 == 0) goto L_0x0058
            r5.m4514c()
        L_0x0058:
            boolean r6 = r5.f3549q
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3537e
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC0936a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private float m4511a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m4510a(f * f2, (float) BitmapDescriptorFactory.HUE_RED, f3);
        float f6 = m4516f(f2 - f4, a) - m4516f(f4, a);
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            f5 = -this.f3538f.getInterpolation(-f6);
        } else if (f6 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            f5 = this.f3538f.getInterpolation(f6);
        }
        return m4510a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m4512a(int i, float f, float f2, float f3) {
        float a = m4511a(this.f3540h[i], f2, this.f3541i[i], f);
        int i2 = (a > BitmapDescriptorFactory.HUE_RED ? 1 : (a == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i2 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f4 = this.f3544l[i];
        float f5 = this.f3545m[i];
        float f6 = this.f3546n[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m4510a(a * f7, f5, f6);
        }
        return -m4510a((-a) * f7, f5, f6);
    }
}
