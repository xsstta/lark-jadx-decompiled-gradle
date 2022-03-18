package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.i */
public class C1383i extends RecyclerView.AbstractC1335d implements RecyclerView.AbstractC1338g {

    /* renamed from: k */
    private static final int[] f4883k = {16842919};

    /* renamed from: l */
    private static final int[] f4884l = new int[0];

    /* renamed from: A */
    private int f4885A;

    /* renamed from: B */
    private final int[] f4886B = new int[2];

    /* renamed from: C */
    private final int[] f4887C = new int[2];

    /* renamed from: D */
    private final Runnable f4888D;

    /* renamed from: E */
    private final RecyclerView.OnScrollListener f4889E;

    /* renamed from: a */
    final StateListDrawable f4890a;

    /* renamed from: b */
    final Drawable f4891b;

    /* renamed from: c */
    int f4892c;

    /* renamed from: d */
    int f4893d;

    /* renamed from: e */
    float f4894e;

    /* renamed from: f */
    int f4895f;

    /* renamed from: g */
    int f4896g;

    /* renamed from: h */
    float f4897h;

    /* renamed from: i */
    final ValueAnimator f4898i;

    /* renamed from: j */
    int f4899j;

    /* renamed from: m */
    private final int f4900m;

    /* renamed from: n */
    private final int f4901n;

    /* renamed from: o */
    private final int f4902o;

    /* renamed from: p */
    private final int f4903p;

    /* renamed from: q */
    private final StateListDrawable f4904q;

    /* renamed from: r */
    private final Drawable f4905r;

    /* renamed from: s */
    private final int f4906s;

    /* renamed from: t */
    private final int f4907t;

    /* renamed from: u */
    private int f4908u;

    /* renamed from: v */
    private int f4909v;

    /* renamed from: w */
    private RecyclerView f4910w;

    /* renamed from: x */
    private boolean f4911x;

    /* renamed from: y */
    private boolean f4912y;

    /* renamed from: z */
    private int f4913z;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: a */
    public void mo6561a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: a */
    public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4913z;
        if (i == 1) {
            boolean a = mo7423a(motionEvent.getX(), motionEvent.getY());
            boolean b = mo7426b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f4885A = 1;
                this.f4897h = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f4885A = 2;
                this.f4894e = (float) ((int) motionEvent.getY());
            }
            mo7420a(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m6329f() {
        this.f4910w.removeCallbacks(this.f4888D);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7419a() {
        this.f4910w.invalidate();
    }

    /* renamed from: e */
    private boolean m6328e() {
        if (ViewCompat.m4082h(this.f4910w) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int[] m6330g() {
        int[] iArr = this.f4886B;
        int i = this.f4901n;
        iArr[0] = i;
        iArr[1] = this.f4909v - i;
        return iArr;
    }

    /* renamed from: h */
    private int[] m6331h() {
        int[] iArr = this.f4887C;
        int i = this.f4901n;
        iArr[0] = i;
        iArr[1] = this.f4908u - i;
        return iArr;
    }

    /* renamed from: c */
    private void m6325c() {
        this.f4910w.addItemDecoration(this);
        this.f4910w.addOnItemTouchListener(this);
        this.f4910w.addOnScrollListener(this.f4889E);
    }

    /* renamed from: d */
    private void m6327d() {
        this.f4910w.removeItemDecoration(this);
        this.f4910w.removeOnItemTouchListener(this);
        this.f4910w.removeOnScrollListener(this.f4889E);
        m6329f();
    }

    /* renamed from: b */
    public void mo7424b() {
        int i = this.f4899j;
        if (i != 0) {
            if (i == 3) {
                this.f4898i.cancel();
            } else {
                return;
            }
        }
        this.f4899j = 1;
        ValueAnimator valueAnimator = this.f4898i;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4898i.setDuration(500L);
        this.f4898i.setStartDelay(0);
        this.f4898i.start();
    }

    /* renamed from: androidx.recyclerview.widget.i$a */
    private class C1386a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f4917b;

        public void onAnimationCancel(Animator animator) {
            this.f4917b = true;
        }

        C1386a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4917b) {
                this.f4917b = false;
            } else if (((Float) C1383i.this.f4898i.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                C1383i.this.f4899j = 0;
                C1383i.this.mo7420a(0);
            } else {
                C1383i.this.f4899j = 2;
                C1383i.this.mo7419a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    private class C1387b implements ValueAnimator.AnimatorUpdateListener {
        C1387b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1383i.this.f4890a.setAlpha(floatValue);
            C1383i.this.f4891b.setAlpha(floatValue);
            C1383i.this.mo7419a();
        }
    }

    /* renamed from: c */
    private void m6326c(int i) {
        m6329f();
        this.f4910w.postDelayed(this.f4888D, (long) i);
    }

    /* renamed from: b */
    private void m6324b(Canvas canvas) {
        int i = this.f4909v;
        int i2 = this.f4906s;
        int i3 = i - i2;
        int i4 = this.f4896g;
        int i5 = this.f4895f;
        int i6 = i4 - (i5 / 2);
        this.f4904q.setBounds(0, 0, i5, i2);
        this.f4905r.setBounds(0, 0, this.f4908u, this.f4907t);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i3);
        this.f4905r.draw(canvas);
        canvas.translate((float) i6, BitmapDescriptorFactory.HUE_RED);
        this.f4904q.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7420a(int i) {
        if (i == 2 && this.f4913z != 2) {
            this.f4890a.setState(f4883k);
            m6329f();
        }
        if (i == 0) {
            mo7419a();
        } else {
            mo7424b();
        }
        if (this.f4913z == 2 && i != 2) {
            this.f4890a.setState(f4884l);
            m6326c(1200);
        } else if (i == 1) {
            m6326c(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f4913z = i;
    }

    /* renamed from: a */
    private void m6321a(float f) {
        int[] g = m6330g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f4893d) - max) >= 2.0f) {
            int a = m6320a(this.f4894e, max, g, this.f4910w.computeVerticalScrollRange(), this.f4910w.computeVerticalScrollOffset(), this.f4909v);
            if (a != 0) {
                this.f4910w.scrollBy(0, a);
            }
            this.f4894e = max;
        }
    }

    /* renamed from: b */
    private void m6323b(float f) {
        int[] h = m6331h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f4896g) - max) >= 2.0f) {
            int a = m6320a(this.f4897h, max, h, this.f4910w.computeHorizontalScrollRange(), this.f4910w.computeHorizontalScrollOffset(), this.f4908u);
            if (a != 0) {
                this.f4910w.scrollBy(a, 0);
            }
            this.f4897h = max;
        }
    }

    /* renamed from: a */
    private void m6322a(Canvas canvas) {
        int i = this.f4908u;
        int i2 = this.f4902o;
        int i3 = i - i2;
        int i4 = this.f4893d;
        int i5 = this.f4892c;
        int i6 = i4 - (i5 / 2);
        this.f4890a.setBounds(0, 0, i2, i5);
        this.f4891b.setBounds(0, 0, this.f4903p, this.f4909v);
        if (m6328e()) {
            this.f4891b.draw(canvas);
            canvas.translate((float) this.f4902o, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4890a.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f4902o), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, BitmapDescriptorFactory.HUE_RED);
        this.f4891b.draw(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i6);
        this.f4890a.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7425b(int i) {
        int i2 = this.f4899j;
        if (i2 == 1) {
            this.f4898i.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4899j = 3;
        ValueAnimator valueAnimator = this.f4898i;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4898i.setDuration((long) i);
        this.f4898i.start();
    }

    /* renamed from: a */
    public void mo7422a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4910w;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6327d();
            }
            this.f4910w = recyclerView;
            if (recyclerView != null) {
                m6325c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7421a(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f4910w.computeVerticalScrollRange();
        int i3 = this.f4909v;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.f4900m) {
            z = false;
        } else {
            z = true;
        }
        this.f4911x = z;
        int computeHorizontalScrollRange = this.f4910w.computeHorizontalScrollRange();
        int i4 = this.f4908u;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.f4900m) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f4912y = z2;
        boolean z3 = this.f4911x;
        if (z3 || z2) {
            if (z3) {
                float f = (float) i3;
                this.f4893d = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f4892c = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f4912y) {
                float f2 = (float) i4;
                this.f4896g = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f4895f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f4913z;
            if (i5 == 0 || i5 == 1) {
                mo7420a(1);
            }
        } else if (this.f4913z != 0) {
            mo7420a(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: b */
    public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4913z != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = mo7423a(motionEvent.getX(), motionEvent.getY());
                boolean b = mo7426b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f4885A = 1;
                        this.f4897h = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f4885A = 2;
                        this.f4894e = (float) ((int) motionEvent.getY());
                    }
                    mo7420a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4913z == 2) {
                this.f4894e = BitmapDescriptorFactory.HUE_RED;
                this.f4897h = BitmapDescriptorFactory.HUE_RED;
                mo7420a(1);
                this.f4885A = 0;
            } else if (motionEvent.getAction() == 2 && this.f4913z == 2) {
                mo7424b();
                if (this.f4885A == 1) {
                    m6323b(motionEvent.getX());
                }
                if (this.f4885A == 2) {
                    m6321a(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7423a(float f, float f2) {
        if (!m6328e() ? f >= ((float) (this.f4908u - this.f4902o)) : f <= ((float) (this.f4902o / 2))) {
            int i = this.f4893d;
            int i2 = this.f4892c;
            if (f2 < ((float) (i - (i2 / 2))) || f2 > ((float) (i + (i2 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7426b(float f, float f2) {
        if (f2 >= ((float) (this.f4909v - this.f4906s))) {
            int i = this.f4896g;
            int i2 = this.f4895f;
            if (f < ((float) (i - (i2 / 2))) || f > ((float) (i + (i2 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f4908u != this.f4910w.getWidth() || this.f4909v != this.f4910w.getHeight()) {
            this.f4908u = this.f4910w.getWidth();
            this.f4909v = this.f4910w.getHeight();
            mo7420a(0);
        } else if (this.f4899j != 0) {
            if (this.f4911x) {
                m6322a(canvas);
            }
            if (this.f4912y) {
                m6324b(canvas);
            }
        }
    }

    /* renamed from: a */
    private int m6320a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    C1383i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f4898i = ofFloat;
        this.f4899j = 0;
        this.f4888D = new Runnable() {
            /* class androidx.recyclerview.widget.C1383i.RunnableC13841 */

            public void run() {
                C1383i.this.mo7425b(ParticipantRepo.f117150c);
            }
        };
        this.f4889E = new RecyclerView.OnScrollListener() {
            /* class androidx.recyclerview.widget.C1383i.C13852 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C1383i.this.mo7421a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
            }
        };
        this.f4890a = stateListDrawable;
        this.f4891b = drawable;
        this.f4904q = stateListDrawable2;
        this.f4905r = drawable2;
        this.f4902o = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4903p = Math.max(i, drawable.getIntrinsicWidth());
        this.f4906s = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4907t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4900m = i2;
        this.f4901n = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1386a());
        ofFloat.addUpdateListener(new C1387b());
        mo7422a(recyclerView);
    }
}
