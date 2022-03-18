package com.ss.android.lark.widget.recyclerview;

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
/* renamed from: com.ss.android.lark.widget.recyclerview.b */
public class C58975b extends RecyclerView.AbstractC1335d implements RecyclerView.AbstractC1338g {

    /* renamed from: k */
    private static final int[] f146128k = {16842919};

    /* renamed from: l */
    private static final int[] f146129l = new int[0];

    /* renamed from: A */
    private int f146130A;

    /* renamed from: B */
    private final int[] f146131B = new int[2];

    /* renamed from: C */
    private final int[] f146132C = new int[2];

    /* renamed from: D */
    private final Runnable f146133D;

    /* renamed from: E */
    private final RecyclerView.OnScrollListener f146134E;

    /* renamed from: a */
    public final StateListDrawable f146135a;

    /* renamed from: b */
    public final Drawable f146136b;

    /* renamed from: c */
    int f146137c;

    /* renamed from: d */
    int f146138d;

    /* renamed from: e */
    float f146139e;

    /* renamed from: f */
    int f146140f;

    /* renamed from: g */
    int f146141g;

    /* renamed from: h */
    float f146142h;

    /* renamed from: i */
    public final ValueAnimator f146143i;

    /* renamed from: j */
    public int f146144j;

    /* renamed from: m */
    private final int f146145m;

    /* renamed from: n */
    private final int f146146n;

    /* renamed from: o */
    private final int f146147o;

    /* renamed from: p */
    private final int f146148p;

    /* renamed from: q */
    private final StateListDrawable f146149q;

    /* renamed from: r */
    private final Drawable f146150r;

    /* renamed from: s */
    private final int f146151s;

    /* renamed from: t */
    private final int f146152t;

    /* renamed from: u */
    private int f146153u;

    /* renamed from: v */
    private int f146154v;

    /* renamed from: w */
    private RecyclerView f146155w;

    /* renamed from: x */
    private boolean f146156x;

    /* renamed from: y */
    private boolean f146157y;

    /* renamed from: z */
    private int f146158z;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: a */
    public void mo6561a(boolean z) {
    }

    /* renamed from: f */
    private void m228908f() {
        this.f146155w.removeCallbacks(this.f146133D);
    }

    /* renamed from: a */
    public void mo200082a() {
        this.f146155w.invalidate();
    }

    /* renamed from: e */
    private boolean m228907e() {
        if (ViewCompat.m4082h(this.f146155w) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int[] m228909g() {
        int[] iArr = this.f146131B;
        int i = this.f146146n;
        iArr[0] = i;
        iArr[1] = this.f146154v - i;
        return iArr;
    }

    /* renamed from: h */
    private int[] m228910h() {
        int[] iArr = this.f146132C;
        int i = this.f146146n;
        iArr[0] = i;
        iArr[1] = this.f146153u - i;
        return iArr;
    }

    /* renamed from: c */
    private void m228904c() {
        this.f146155w.addItemDecoration(this);
        this.f146155w.addOnItemTouchListener(this);
        this.f146155w.addOnScrollListener(this.f146134E);
    }

    /* renamed from: d */
    private void m228906d() {
        this.f146155w.removeItemDecoration(this);
        this.f146155w.removeOnItemTouchListener(this);
        this.f146155w.removeOnScrollListener(this.f146134E);
        m228908f();
    }

    /* renamed from: b */
    public void mo200087b() {
        int i = this.f146144j;
        if (i != 0) {
            if (i == 3) {
                this.f146143i.cancel();
            } else {
                return;
            }
        }
        this.f146144j = 1;
        ValueAnimator valueAnimator = this.f146143i;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f146143i.setDuration(500L);
        this.f146143i.setStartDelay(0);
        this.f146143i.start();
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.b$a */
    private class C58978a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f146162b;

        public void onAnimationCancel(Animator animator) {
            this.f146162b = true;
        }

        private C58978a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f146162b) {
                this.f146162b = false;
            } else if (((Float) C58975b.this.f146143i.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                C58975b.this.f146144j = 0;
                C58975b.this.mo200083a(0);
            } else {
                C58975b.this.f146144j = 2;
                C58975b.this.mo200082a();
            }
        }
    }

    /* renamed from: com.ss.android.lark.widget.recyclerview.b$b */
    private class C58979b implements ValueAnimator.AnimatorUpdateListener {
        private C58979b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C58975b.this.f146135a.setAlpha(floatValue);
            C58975b.this.f146136b.setAlpha(floatValue);
            C58975b.this.mo200082a();
        }
    }

    /* renamed from: c */
    private void m228905c(int i) {
        m228908f();
        this.f146155w.postDelayed(this.f146133D, (long) i);
    }

    /* renamed from: b */
    private void m228903b(Canvas canvas) {
        int i = this.f146154v;
        int i2 = this.f146151s;
        int i3 = i - i2;
        int i4 = this.f146141g;
        int i5 = this.f146140f;
        int i6 = i4 - (i5 / 2);
        this.f146149q.setBounds(0, 0, i5, i2);
        this.f146150r.setBounds(0, 0, this.f146153u, this.f146152t);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i3);
        this.f146150r.draw(canvas);
        canvas.translate((float) i6, BitmapDescriptorFactory.HUE_RED);
        this.f146149q.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: a */
    public void mo200083a(int i) {
        if (i == 2 && this.f146158z != 2) {
            this.f146135a.setState(f146128k);
            m228908f();
        }
        if (i == 0) {
            mo200082a();
        } else {
            mo200087b();
        }
        if (this.f146158z == 2 && i != 2) {
            this.f146135a.setState(f146129l);
            m228905c(1200);
        } else if (i == 1) {
            m228905c(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f146158z = i;
    }

    /* renamed from: a */
    private void m228900a(float f) {
        int[] g = m228909g();
        float max = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f146138d) - max) >= 2.0f) {
            int a = m228899a(this.f146139e, max, g, this.f146155w.computeVerticalScrollRange(), this.f146155w.computeVerticalScrollOffset(), this.f146154v);
            if (a != 0) {
                this.f146155w.scrollBy(0, a);
            }
            this.f146139e = max;
        }
    }

    /* renamed from: b */
    private void m228902b(float f) {
        int[] h = m228910h();
        float max = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f146141g) - max) >= 2.0f) {
            int a = m228899a(this.f146142h, max, h, this.f146155w.computeHorizontalScrollRange(), this.f146155w.computeHorizontalScrollOffset(), this.f146153u);
            if (a != 0) {
                this.f146155w.scrollBy(a, 0);
            }
            this.f146142h = max;
        }
    }

    /* renamed from: a */
    private void m228901a(Canvas canvas) {
        int i = this.f146153u;
        int i2 = this.f146147o;
        int i3 = i - i2;
        int i4 = this.f146138d;
        int i5 = this.f146137c;
        int i6 = i4 - (i5 / 2);
        this.f146135a.setBounds(0, 0, i2, i5);
        this.f146136b.setBounds(0, 0, this.f146148p, this.f146154v);
        if (m228907e()) {
            this.f146136b.draw(canvas);
            canvas.translate((float) this.f146147o, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f146135a.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f146147o), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, BitmapDescriptorFactory.HUE_RED);
        this.f146136b.draw(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i6);
        this.f146135a.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo200088b(int i) {
        int i2 = this.f146144j;
        if (i2 == 1) {
            this.f146143i.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f146144j = 3;
        ValueAnimator valueAnimator = this.f146143i;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f146143i.setDuration((long) i);
        this.f146143i.start();
    }

    /* renamed from: a */
    public void mo200085a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f146155w;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m228906d();
            }
            this.f146155w = recyclerView;
            if (recyclerView != null) {
                m228904c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo200084a(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f146155w.computeVerticalScrollRange();
        int i3 = this.f146154v;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.f146145m) {
            z = false;
        } else {
            z = true;
        }
        this.f146156x = z;
        int computeHorizontalScrollRange = this.f146155w.computeHorizontalScrollRange();
        int i4 = this.f146153u;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.f146145m) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f146157y = z2;
        boolean z3 = this.f146156x;
        if (z3 || z2) {
            if (z3) {
                float f = (float) i3;
                this.f146138d = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f146137c = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f146157y) {
                float f2 = (float) i4;
                this.f146141g = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f146140f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f146158z;
            if (i5 == 0 || i5 == 1) {
                mo200083a(1);
            }
        } else if (this.f146158z != 0) {
            mo200083a(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: b */
    public void mo6563b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f146158z != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = mo200086a(motionEvent.getX(), motionEvent.getY());
                boolean b = mo200089b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f146130A = 1;
                        this.f146142h = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f146130A = 2;
                        this.f146139e = (float) ((int) motionEvent.getY());
                    }
                    mo200083a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f146158z == 2) {
                this.f146139e = BitmapDescriptorFactory.HUE_RED;
                this.f146142h = BitmapDescriptorFactory.HUE_RED;
                mo200083a(1);
                this.f146130A = 0;
            } else if (motionEvent.getAction() == 2 && this.f146158z == 2) {
                mo200087b();
                if (this.f146130A == 1) {
                    m228902b(motionEvent.getX());
                }
                if (this.f146130A == 2) {
                    m228900a(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo200086a(float f, float f2) {
        if (!m228907e() ? f >= ((float) (this.f146153u - this.f146147o)) : f <= ((float) (this.f146147o / 2))) {
            int i = this.f146138d;
            int i2 = this.f146137c;
            if (f2 < ((float) (i - (i2 / 2))) || f2 > ((float) (i + (i2 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo200089b(float f, float f2) {
        if (f2 >= ((float) (this.f146154v - this.f146151s))) {
            int i = this.f146141g;
            int i2 = this.f146140f;
            if (f < ((float) (i - (i2 / 2))) || f > ((float) (i + (i2 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1338g
    /* renamed from: a */
    public boolean mo6562a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f146158z;
        if (i == 1) {
            boolean a = mo200086a(motionEvent.getX(), motionEvent.getY());
            boolean b = mo200089b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.f146130A = 1;
                this.f146142h = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f146130A = 2;
                this.f146139e = (float) ((int) motionEvent.getY());
            }
            mo200083a(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f146153u != this.f146155w.getWidth() || this.f146154v != this.f146155w.getHeight()) {
            this.f146153u = this.f146155w.getWidth();
            this.f146154v = this.f146155w.getHeight();
            mo200083a(0);
        } else if (this.f146144j != 0) {
            if (this.f146156x) {
                m228901a(canvas);
            }
            if (this.f146157y) {
                m228903b(canvas);
            }
        }
    }

    /* renamed from: a */
    private int m228899a(float f, float f2, int[] iArr, int i, int i2, int i3) {
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

    C58975b(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f146143i = ofFloat;
        this.f146144j = 0;
        this.f146133D = new Runnable() {
            /* class com.ss.android.lark.widget.recyclerview.C58975b.RunnableC589761 */

            public void run() {
                C58975b.this.mo200088b(ParticipantRepo.f117150c);
            }
        };
        this.f146134E = new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.widget.recyclerview.C58975b.C589772 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C58975b.this.mo200084a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
            }
        };
        this.f146135a = stateListDrawable;
        this.f146136b = drawable;
        this.f146149q = stateListDrawable2;
        this.f146150r = drawable2;
        this.f146147o = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f146148p = Math.max(i, drawable.getIntrinsicWidth());
        this.f146151s = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f146152t = Math.max(i, drawable2.getIntrinsicWidth());
        this.f146145m = i2;
        this.f146146n = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C58978a());
        ofFloat.addUpdateListener(new C58979b());
        mo200085a(recyclerView);
    }
}
