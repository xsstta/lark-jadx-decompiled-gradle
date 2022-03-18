package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.C1850g;
import com.airbnb.lottie.model.layer.C1855b;
import com.airbnb.lottie.p070b.C1781a;
import com.airbnb.lottie.p070b.C1782b;
import com.airbnb.lottie.p071c.C1787d;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p071c.Choreographer$FrameCallbackC1788e;
import com.airbnb.lottie.p072d.C1795c;
import com.airbnb.lottie.parser.C1902s;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LottieDrawable extends Drawable implements Animatable, Drawable.Callback {

    /* renamed from: e */
    private static final String f5851e = "LottieDrawable";

    /* renamed from: a */
    public final Choreographer$FrameCallbackC1788e f5852a;

    /* renamed from: b */
    C1733a f5853b;

    /* renamed from: c */
    C1868o f5854c;

    /* renamed from: d */
    public C1855b f5855d;

    /* renamed from: f */
    private final Matrix f5856f = new Matrix();

    /* renamed from: g */
    private C1792d f5857g;

    /* renamed from: h */
    private float f5858h;

    /* renamed from: i */
    private boolean f5859i;

    /* renamed from: j */
    private boolean f5860j;

    /* renamed from: k */
    private final Set<Object> f5861k;

    /* renamed from: l */
    private final ArrayList<AbstractC1732a> f5862l;

    /* renamed from: m */
    private final ValueAnimator.AnimatorUpdateListener f5863m;

    /* renamed from: n */
    private ImageView.ScaleType f5864n;

    /* renamed from: o */
    private C1782b f5865o;

    /* renamed from: p */
    private String f5866p;

    /* renamed from: q */
    private AbstractC1780b f5867q;

    /* renamed from: r */
    private C1781a f5868r;

    /* renamed from: s */
    private boolean f5869s;

    /* renamed from: t */
    private int f5870t;

    /* renamed from: u */
    private boolean f5871u;

    /* renamed from: v */
    private boolean f5872v;

    /* renamed from: w */
    private boolean f5873w;

    /* renamed from: x */
    private boolean f5874x;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.airbnb.lottie.LottieDrawable$a */
    public interface AbstractC1732a {
        /* renamed from: a */
        void mo8927a(C1792d dVar);
    }

    /* renamed from: a */
    public boolean mo8868a(C1792d dVar) {
        return m7660a(this, dVar);
    }

    /* renamed from: g */
    public void mo8893g() {
        this.f5873w = false;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: i */
    public void mo8899i() {
        m7659a(this);
    }

    /* renamed from: A */
    public C1792d mo8845A() {
        return this.f5857g;
    }

    /* renamed from: e */
    public String mo8889e() {
        return this.f5866p;
    }

    public int getAlpha() {
        return this.f5870t;
    }

    /* renamed from: h */
    public boolean mo8898h() {
        return this.f5872v;
    }

    public void start() {
        mo8904k();
    }

    public void stop() {
        mo8905l();
    }

    /* renamed from: x */
    public C1868o mo8923x() {
        return this.f5854c;
    }

    /* renamed from: z */
    public float mo8925z() {
        return this.f5858h;
    }

    /* renamed from: a */
    public boolean mo8867a() {
        C1855b bVar = this.f5855d;
        return bVar != null && bVar.mo9304f();
    }

    /* renamed from: a */
    public void mo8866a(boolean z) {
        if (this.f5869s != z) {
            if (Build.VERSION.SDK_INT < 19) {
                C1787d.m7973b("Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f5869s = z;
            if (this.f5857g != null) {
                m7653E();
            }
        }
    }

    /* renamed from: a */
    public void mo8864a(String str) {
        this.f5866p = str;
    }

    /* renamed from: a */
    public void mo8854a(final int i) {
        if (this.f5857g == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass11 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8854a(i);
                }
            });
        } else {
            this.f5852a.mo9025a(i);
        }
    }

    /* renamed from: a */
    public void mo8865a(final String str, final String str2, final boolean z) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17253 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8865a(str, str2, z);
                }
            });
            return;
        }
        C1850g c = dVar.mo9061c(str);
        if (c != null) {
            int i = (int) c.f6376a;
            C1850g c2 = this.f5857g.mo9061c(str2);
            if (str2 != null) {
                mo8855a(i, (int) (c2.f6376a + (z ? 1.0f : BitmapDescriptorFactory.HUE_RED)));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: a */
    public void mo8855a(final int i, final int i2) {
        if (this.f5857g == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17264 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8855a(i, i2);
                }
            });
        } else {
            this.f5852a.mo9024a((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: a */
    public void mo8857a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5852a.addUpdateListener(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8863a(Boolean bool) {
        this.f5859i = bool.booleanValue();
    }

    /* renamed from: a */
    public void mo8860a(AbstractC1780b bVar) {
        this.f5867q = bVar;
        C1782b bVar2 = this.f5865o;
        if (bVar2 != null) {
            bVar2.mo9001a(bVar);
        }
    }

    /* renamed from: a */
    public void mo8859a(C1733a aVar) {
        this.f5853b = aVar;
        C1781a aVar2 = this.f5868r;
        if (aVar2 != null) {
            aVar2.mo8998a(aVar);
        }
    }

    /* renamed from: a */
    public void mo8862a(C1868o oVar) {
        this.f5854c = oVar;
    }

    /* renamed from: a */
    public <T> void mo8861a(final C1847d dVar, final T t, final C1795c<T> cVar) {
        if (this.f5855d == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17308 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8861a(dVar, t, cVar);
                }
            });
            return;
        }
        boolean z = true;
        if (dVar == C1847d.f6370a) {
            this.f5855d.mo8935a(t, cVar);
        } else if (dVar.mo9256a() != null) {
            dVar.mo9256a().mo8935a(t, cVar);
        } else {
            List<C1847d> a = mo8851a(dVar);
            for (int i = 0; i < a.size(); i++) {
                a.get(i).mo9256a().mo8935a(t, cVar);
            }
            z = true ^ a.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == AbstractC1810j.f6194A) {
                mo8882d(mo8848D());
            }
        }
    }

    /* renamed from: D */
    public float mo8848D() {
        return this.f5852a.mo9031d();
    }

    public boolean isRunning() {
        return mo8922w();
    }

    /* renamed from: n */
    public float mo8907n() {
        return this.f5852a.mo9045m();
    }

    /* renamed from: o */
    public float mo8908o() {
        return this.f5852a.mo9046n();
    }

    /* renamed from: p */
    public void mo8909p() {
        this.f5852a.mo9035g();
    }

    /* renamed from: q */
    public float mo8910q() {
        return this.f5852a.mo9039h();
    }

    /* renamed from: s */
    public void mo8912s() {
        this.f5852a.removeAllListeners();
    }

    /* renamed from: t */
    public int mo8918t() {
        return (int) this.f5852a.mo9033e();
    }

    /* renamed from: u */
    public int mo8919u() {
        return this.f5852a.getRepeatMode();
    }

    /* renamed from: v */
    public int mo8921v() {
        return this.f5852a.getRepeatCount();
    }

    /* renamed from: B */
    public void mo8846B() {
        this.f5862l.clear();
        this.f5852a.cancel();
    }

    /* renamed from: C */
    public void mo8847C() {
        this.f5862l.clear();
        this.f5852a.mo9043k();
    }

    /* renamed from: c */
    public boolean mo8881c() {
        return this.f5869s;
    }

    /* renamed from: d */
    public boolean mo8886d() {
        return this.f5869s;
    }

    /* renamed from: f */
    public C1815m mo8892f() {
        C1792d dVar = this.f5857g;
        if (dVar != null) {
            return dVar.mo9060c();
        }
        return null;
    }

    /* renamed from: l */
    public void mo8905l() {
        this.f5862l.clear();
        this.f5852a.mo9042j();
    }

    /* renamed from: r */
    public void mo8911r() {
        this.f5852a.removeAllUpdateListeners();
        this.f5852a.addUpdateListener(this.f5863m);
    }

    /* renamed from: w */
    public boolean mo8922w() {
        Choreographer$FrameCallbackC1788e eVar = this.f5852a;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    /* renamed from: E */
    private void m7653E() {
        this.f5855d = new C1855b(this, C1902s.m8522a(this.f5857g), this.f5857g.mo9067i(), this.f5857g);
    }

    /* renamed from: H */
    private C1781a m7656H() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f5868r == null) {
            this.f5868r = new C1781a(getCallback(), this.f5853b);
        }
        return this.f5868r;
    }

    /* renamed from: I */
    private Context m7657I() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public int getIntrinsicHeight() {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo9062d().height()) * mo8925z());
    }

    public int getIntrinsicWidth() {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            return -1;
        }
        return (int) (((float) dVar.mo9062d().width()) * mo8925z());
    }

    public void invalidateSelf() {
        if (!this.f5874x) {
            this.f5874x = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    /* renamed from: j */
    public void mo8903j() {
        if (this.f5852a.isRunning()) {
            this.f5852a.cancel();
        }
        this.f5857g = null;
        this.f5855d = null;
        this.f5865o = null;
        this.f5852a.mo9034f();
        invalidateSelf();
    }

    /* renamed from: y */
    public boolean mo8924y() {
        if (this.f5854c != null || this.f5857g.mo9068j().mo3049b() <= 0) {
            return false;
        }
        return true;
    }

    public LottieDrawable() {
        Choreographer$FrameCallbackC1788e eVar = new Choreographer$FrameCallbackC1788e();
        this.f5852a = eVar;
        this.f5858h = 1.0f;
        this.f5859i = true;
        this.f5860j = false;
        this.f5861k = new HashSet();
        this.f5862l = new ArrayList<>();
        C17231 r3 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.airbnb.lottie.LottieDrawable.C17231 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LottieDrawable.this.f5855d != null) {
                    LottieDrawable.this.f5855d.mo9293a(LottieDrawable.this.f5852a.mo9031d());
                }
            }
        };
        this.f5863m = r3;
        this.f5870t = 255;
        this.f5873w = true;
        this.f5874x = false;
        eVar.addUpdateListener(r3);
    }

    /* renamed from: F */
    private void m7654F() {
        if (this.f5857g != null) {
            float z = mo8925z();
            setBounds(0, 0, (int) (((float) this.f5857g.mo9062d().width()) * z), (int) (((float) this.f5857g.mo9062d().height()) * z));
        }
    }

    /* renamed from: G */
    private C1782b m7655G() {
        if (getCallback() == null) {
            return null;
        }
        C1782b bVar = this.f5865o;
        if (bVar != null && !bVar.mo9002a(m7657I())) {
            this.f5865o = null;
        }
        if (this.f5865o == null) {
            this.f5865o = new C1782b(getCallback(), this.f5866p, this.f5867q, this.f5857g.mo9070l());
        }
        return this.f5865o;
    }

    /* renamed from: k */
    public void mo8904k() {
        float f;
        if (this.f5855d == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17319 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8904k();
                }
            });
            return;
        }
        if (this.f5859i || mo8921v() == 0) {
            this.f5852a.mo9040i();
        }
        if (!this.f5859i) {
            if (mo8910q() < BitmapDescriptorFactory.HUE_RED) {
                f = mo8907n();
            } else {
                f = mo8908o();
            }
            mo8878c((int) f);
            this.f5852a.mo9042j();
        }
    }

    /* renamed from: m */
    public void mo8906m() {
        float f;
        if (this.f5855d == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass10 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8906m();
                }
            });
            return;
        }
        if (this.f5859i || mo8921v() == 0) {
            this.f5852a.mo9044l();
        }
        if (!this.f5859i) {
            if (mo8910q() < BitmapDescriptorFactory.HUE_RED) {
                f = mo8907n();
            } else {
                f = mo8908o();
            }
            mo8878c((int) f);
            this.f5852a.mo9042j();
        }
    }

    /* renamed from: b */
    public boolean mo8875b() {
        C1855b bVar = this.f5855d;
        if (bVar == null || !bVar.mo9305g()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8858a(ImageView.ScaleType scaleType) {
        this.f5864n = scaleType;
    }

    /* renamed from: c */
    public void mo8880c(boolean z) {
        this.f5872v = z;
    }

    /* renamed from: d */
    public void mo8885d(boolean z) {
        this.f5860j = z;
    }

    /* renamed from: a */
    public void mo8856a(Animator.AnimatorListener animatorListener) {
        this.f5852a.addListener(animatorListener);
    }

    /* renamed from: b */
    public void mo8871b(Animator.AnimatorListener animatorListener) {
        this.f5852a.removeListener(animatorListener);
    }

    /* renamed from: c */
    public void mo8877c(float f) {
        this.f5852a.mo9028c(f);
    }

    /* renamed from: d */
    public void mo8883d(int i) {
        this.f5852a.setRepeatMode(i);
    }

    /* renamed from: e */
    public void mo8890e(float f) {
        this.f5858h = f;
        m7654F();
    }

    public void setAlpha(int i) {
        this.f5870t = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1787d.m7973b("Use addColorFilter instead.");
    }

    /* renamed from: a */
    private void m7658a(Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.f5864n) {
            m7662c(canvas);
        } else {
            m7663d(canvas);
        }
    }

    /* renamed from: b */
    public void mo8872b(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5852a.removeUpdateListener(animatorUpdateListener);
    }

    /* renamed from: e */
    public Bitmap mo8888e(String str) {
        C1782b G = m7655G();
        if (G != null) {
            return G.mo8999a(str);
        }
        return null;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: a */
    public static void m7659a(LottieDrawable lottieDrawable) {
        synchronized (lottieDrawable) {
            lottieDrawable.mo8903j();
        }
    }

    /* renamed from: b */
    public void mo8870b(final int i) {
        if (this.f5857g == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass13 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8870b(i);
                }
            });
        } else {
            this.f5852a.mo9027b(((float) i) + 0.99f);
        }
    }

    /* renamed from: c */
    public void mo8878c(final int i) {
        if (this.f5857g == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17286 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8878c(i);
                }
            });
        } else {
            this.f5852a.mo9023a((float) i);
        }
    }

    public void draw(Canvas canvas) {
        this.f5874x = false;
        C1783c.m7956a("Drawable#draw");
        if (this.f5860j) {
            try {
                m7658a(canvas);
            } catch (Throwable th) {
                C1787d.m7974b("Lottie crashed in draw!", th);
            }
        } else {
            m7658a(canvas);
        }
        C1783c.m7957b("Drawable#draw");
    }

    /* renamed from: e */
    public void mo8891e(int i) {
        this.f5852a.setRepeatCount(i);
    }

    /* renamed from: b */
    private float m7661b(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f5857g.mo9062d().width()), ((float) canvas.getHeight()) / ((float) this.f5857g.mo9062d().height()));
    }

    /* renamed from: c */
    public void mo8879c(final String str) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass16 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8879c(str);
                }
            });
            return;
        }
        C1850g c = dVar.mo9061c(str);
        if (c != null) {
            mo8870b((int) (c.f6376a + c.f6377b));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: d */
    public void mo8882d(final float f) {
        if (this.f5857g == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17297 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8882d(f);
                }
            });
            return;
        }
        C1783c.m7956a("Drawable#setProgress");
        this.f5852a.mo9023a(C1790g.m8000a(this.f5857g.mo9064f(), this.f5857g.mo9065g(), f));
        C1783c.m7957b("Drawable#setProgress");
    }

    /* renamed from: c */
    private void m7662c(Canvas canvas) {
        float f;
        if (this.f5855d != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f5857g.mo9062d().width());
            float height = ((float) bounds.height()) / ((float) this.f5857g.mo9062d().height());
            if (this.f5873w) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.f5856f.reset();
            this.f5856f.preScale(width, height);
            this.f5855d.mo8932a(canvas, this.f5856f, this.f5870t);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: d */
    private void m7663d(Canvas canvas) {
        float f;
        if (this.f5855d != null) {
            float f2 = this.f5858h;
            float b = m7661b(canvas);
            if (f2 > b) {
                f = this.f5858h / b;
            } else {
                b = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f5857g.mo9062d().width()) / 2.0f;
                float height = ((float) this.f5857g.mo9062d().height()) / 2.0f;
                float f3 = width * b;
                float f4 = height * b;
                canvas.translate((mo8925z() * width) - f3, (mo8925z() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f5856f.reset();
            this.f5856f.preScale(b, b);
            this.f5855d.mo8932a(canvas, this.f5856f, this.f5870t);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: b */
    public void mo8869b(final float f) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass14 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8869b(f);
                }
            });
        } else {
            mo8870b((int) C1790g.m8000a(dVar.mo9064f(), this.f5857g.mo9065g(), f));
        }
    }

    /* renamed from: b */
    public void mo8873b(final String str) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass15 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8873b(str);
                }
            });
            return;
        }
        C1850g c = dVar.mo9061c(str);
        if (c != null) {
            mo8854a((int) c.f6376a);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: d */
    public void mo8884d(final String str) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17242 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8884d(str);
                }
            });
            return;
        }
        C1850g c = dVar.mo9061c(str);
        if (c != null) {
            int i = (int) c.f6376a;
            mo8855a(i, ((int) c.f6377b) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: a */
    public List<C1847d> mo8851a(C1847d dVar) {
        if (this.f5855d == null) {
            C1787d.m7973b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f5855d.mo8934a(dVar, 0, arrayList, new C1847d(new String[0]));
        return arrayList;
    }

    /* renamed from: b */
    public void mo8874b(boolean z) {
        this.f5871u = z;
        C1792d dVar = this.f5857g;
        if (dVar != null) {
            dVar.mo9059b(z);
        }
    }

    /* renamed from: a */
    public void mo8852a(final float f) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.AnonymousClass12 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8852a(f);
                }
            });
        } else {
            mo8854a((int) C1790g.m8000a(dVar.mo9064f(), this.f5857g.mo9065g(), f));
        }
    }

    /* renamed from: b */
    public boolean mo8876b(C1792d dVar) {
        if (this.f5857g == dVar) {
            return false;
        }
        this.f5874x = false;
        mo8899i();
        this.f5857g = dVar;
        m7653E();
        this.f5852a.mo9026a(dVar);
        mo8882d(this.f5852a.getAnimatedFraction());
        mo8890e(this.f5858h);
        m7654F();
        Iterator it = new ArrayList(this.f5862l).iterator();
        while (it.hasNext()) {
            ((AbstractC1732a) it.next()).mo8927a(dVar);
            it.remove();
        }
        this.f5862l.clear();
        dVar.mo9059b(this.f5871u);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public static boolean m7660a(LottieDrawable lottieDrawable, C1792d dVar) {
        boolean b;
        synchronized (lottieDrawable) {
            b = lottieDrawable.mo8876b(dVar);
        }
        return b;
    }

    /* renamed from: a */
    public Bitmap mo8849a(String str, Bitmap bitmap) {
        C1782b G = m7655G();
        if (G == null) {
            C1787d.m7973b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap a = G.mo9000a(str, bitmap);
        invalidateSelf();
        return a;
    }

    /* renamed from: a */
    public Typeface mo8850a(String str, String str2) {
        C1781a H = m7656H();
        if (H != null) {
            return H.mo8997a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public void mo8853a(final float f, final float f2) {
        C1792d dVar = this.f5857g;
        if (dVar == null) {
            this.f5862l.add(new AbstractC1732a() {
                /* class com.airbnb.lottie.LottieDrawable.C17275 */

                @Override // com.airbnb.lottie.LottieDrawable.AbstractC1732a
                /* renamed from: a */
                public void mo8927a(C1792d dVar) {
                    LottieDrawable.this.mo8853a(f, f2);
                }
            });
        } else {
            mo8855a((int) C1790g.m8000a(dVar.mo9064f(), this.f5857g.mo9065g(), f), (int) C1790g.m8000a(this.f5857g.mo9064f(), this.f5857g.mo9065g(), f2));
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }
}
