package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p028b.C0745a;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.AbstractC0873g;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.C0959c;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C22365r;
import com.google.android.material.p988i.C22313c;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: H */
    private static final int f54026H = 2131887303;

    /* renamed from: A */
    private int f54027A;

    /* renamed from: B */
    private boolean f54028B;

    /* renamed from: C */
    private boolean f54029C;

    /* renamed from: D */
    private C22398l f54030D;

    /* renamed from: E */
    private boolean f54031E;

    /* renamed from: F */
    private BottomSheetBehavior<V>.RunnableC22178b f54032F;

    /* renamed from: G */
    private ValueAnimator f54033G;

    /* renamed from: I */
    private boolean f54034I;

    /* renamed from: J */
    private int f54035J;

    /* renamed from: K */
    private boolean f54036K;

    /* renamed from: L */
    private int f54037L;

    /* renamed from: M */
    private final ArrayList<AbstractC22177a> f54038M = new ArrayList<>();

    /* renamed from: N */
    private VelocityTracker f54039N;

    /* renamed from: O */
    private int f54040O;

    /* renamed from: P */
    private Map<View, Integer> f54041P;

    /* renamed from: Q */
    private final C0959c.AbstractC0962a f54042Q = new C0959c.AbstractC0962a() {
        /* class com.google.android.material.bottomsheet.BottomSheetBehavior.C221744 */

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4896b(View view) {
            if (BottomSheetBehavior.this.f54053k) {
                return BottomSheetBehavior.this.f54059q;
            }
            return BottomSheetBehavior.this.f54051i;
        }

        /* renamed from: c */
        private boolean m79994c(View view) {
            if (view.getTop() > (BottomSheetBehavior.this.f54059q + BottomSheetBehavior.this.mo76699a()) / 2) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            if (i == 1 && BottomSheetBehavior.this.f54055m) {
                m79993a(BottomSheetBehavior.this, 1);
            }
        }

        /* renamed from: a */
        public static void m79993a(BottomSheetBehavior bottomSheetBehavior, int i) {
            try {
                bottomSheetBehavior.mo76720e(i);
            } catch (NullPointerException unused) {
                Log.m165383e("BottomSheetBehaviorNPE", "BottomSheetBehavior setStateInternal occurred NPE");
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            View view2;
            if (BottomSheetBehavior.this.f54056n == 1 || BottomSheetBehavior.this.f54063u) {
                return false;
            }
            if (BottomSheetBehavior.this.f54056n == 3 && BottomSheetBehavior.this.f54062t == i) {
                if (BottomSheetBehavior.this.f54061s != null) {
                    view2 = BottomSheetBehavior.this.f54061s.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            if (BottomSheetBehavior.this.f54060r == null || BottomSheetBehavior.this.f54060r.get() != view) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            int i3;
            int a = BottomSheetBehavior.this.mo76699a();
            if (BottomSheetBehavior.this.f54053k) {
                i3 = BottomSheetBehavior.this.f54059q;
            } else {
                i3 = BottomSheetBehavior.this.f54051i;
            }
            return C0745a.m3627a(i, a, i3);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                if (BottomSheetBehavior.this.f54043a) {
                    i = BottomSheetBehavior.this.f54048f;
                } else if (view.getTop() > BottomSheetBehavior.this.f54049g) {
                    i = BottomSheetBehavior.this.f54049g;
                    i2 = 6;
                    BottomSheetBehavior.this.mo76705a(view, i2, i, true);
                } else {
                    i = BottomSheetBehavior.this.f54047e;
                }
            } else if (!BottomSheetBehavior.this.f54053k || !BottomSheetBehavior.this.mo76708a(view, f2)) {
                if (f2 == BitmapDescriptorFactory.HUE_RED || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f54043a) {
                        if (top < BottomSheetBehavior.this.f54049g) {
                            if (top < Math.abs(top - BottomSheetBehavior.this.f54051i)) {
                                i = BottomSheetBehavior.this.f54047e;
                            } else {
                                i = BottomSheetBehavior.this.f54049g;
                            }
                        } else if (Math.abs(top - BottomSheetBehavior.this.f54049g) < Math.abs(top - BottomSheetBehavior.this.f54051i)) {
                            i = BottomSheetBehavior.this.f54049g;
                        } else {
                            i = BottomSheetBehavior.this.f54051i;
                            BottomSheetBehavior.this.mo76705a(view, i2, i, true);
                        }
                        i2 = 6;
                        BottomSheetBehavior.this.mo76705a(view, i2, i, true);
                    } else if (Math.abs(top - BottomSheetBehavior.this.f54048f) < Math.abs(top - BottomSheetBehavior.this.f54051i)) {
                        i = BottomSheetBehavior.this.f54048f;
                    } else {
                        i = BottomSheetBehavior.this.f54051i;
                        BottomSheetBehavior.this.mo76705a(view, i2, i, true);
                    }
                } else {
                    if (BottomSheetBehavior.this.f54043a) {
                        i = BottomSheetBehavior.this.f54051i;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f54049g) < Math.abs(top2 - BottomSheetBehavior.this.f54051i)) {
                            i = BottomSheetBehavior.this.f54049g;
                            i2 = 6;
                        } else {
                            i = BottomSheetBehavior.this.f54051i;
                        }
                    }
                    BottomSheetBehavior.this.mo76705a(view, i2, i, true);
                }
            } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m79994c(view)) {
                i = BottomSheetBehavior.this.f54059q;
                i2 = 5;
                BottomSheetBehavior.this.mo76705a(view, i2, i, true);
            } else if (BottomSheetBehavior.this.f54043a) {
                i = BottomSheetBehavior.this.f54048f;
            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f54047e) < Math.abs(view.getTop() - BottomSheetBehavior.this.f54049g)) {
                i = BottomSheetBehavior.this.f54047e;
            } else {
                i = BottomSheetBehavior.this.f54049g;
                i2 = 6;
                BottomSheetBehavior.this.mo76705a(view, i2, i, true);
            }
            i2 = 3;
            BottomSheetBehavior.this.mo76705a(view, i2, i, true);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo76722f(i2);
        }
    };

    /* renamed from: a */
    public boolean f54043a = true;

    /* renamed from: b */
    public int f54044b;

    /* renamed from: c */
    public MaterialShapeDrawable f54045c;

    /* renamed from: d */
    public int f54046d;

    /* renamed from: e */
    int f54047e;

    /* renamed from: f */
    int f54048f;

    /* renamed from: g */
    int f54049g;

    /* renamed from: h */
    float f54050h = 0.5f;

    /* renamed from: i */
    int f54051i;

    /* renamed from: j */
    float f54052j = -1.0f;

    /* renamed from: k */
    boolean f54053k;

    /* renamed from: l */
    public boolean f54054l;

    /* renamed from: m */
    public boolean f54055m = true;

    /* renamed from: n */
    int f54056n = 4;

    /* renamed from: o */
    C0959c f54057o;

    /* renamed from: p */
    int f54058p;

    /* renamed from: q */
    int f54059q;

    /* renamed from: r */
    WeakReference<V> f54060r;

    /* renamed from: s */
    WeakReference<View> f54061s;

    /* renamed from: t */
    int f54062t;

    /* renamed from: u */
    boolean f54063u;

    /* renamed from: v */
    private int f54064v;

    /* renamed from: w */
    private boolean f54065w;

    /* renamed from: x */
    private float f54066x;

    /* renamed from: y */
    private boolean f54067y;

    /* renamed from: z */
    private int f54068z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public static abstract class AbstractC22177a {
        /* renamed from: a */
        public abstract void mo24937a(View view, float f);

        /* renamed from: a */
        public abstract void mo24938a(View view, int i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: b */
    public boolean mo76712b() {
        return this.f54053k;
    }

    /* renamed from: d */
    public int mo76717d() {
        return this.f54056n;
    }

    /* renamed from: a */
    public void mo76707a(boolean z) {
        if (this.f54043a != z) {
            this.f54043a = z;
            if (this.f54060r != null) {
                m79958f();
            }
            m79954a(this, (!this.f54043a || this.f54056n != 6) ? this.f54056n : 3);
            m79966k();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76703a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f54067y
            if (r4 != 0) goto L_0x0015
            r3.f54067y = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f54067y
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f54044b
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f54067y = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f54044b = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.mo76711b(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo76703a(int, boolean):void");
    }

    /* renamed from: a */
    public void mo76706a(AbstractC22177a aVar) {
        android.util.Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f54038M.clear();
        if (aVar != null) {
            this.f54038M.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo76708a(View view, float f) {
        if (this.f54054l) {
            return true;
        }
        if (view.getTop() < this.f54051i) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f54051i)) / ((float) m79957e()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76704a(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f54051i;
        } else if (i == 6) {
            int i4 = this.f54049g;
            if (!this.f54043a || i4 > (i3 = this.f54048f)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo76699a();
        } else if (!this.f54053k || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f54059q;
        }
        mo76705a(view, i, i2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo76705a(View view, int i, int i2, boolean z) {
        C0959c cVar = this.f54057o;
        if (cVar != null && (!z ? cVar.mo4868a(view, view.getLeft(), i2) : cVar.mo4866a(view.getLeft(), i2))) {
            m79954a(this, 2);
            m79963h(i);
            if (this.f54032F == null) {
                this.f54032F = new RunnableC22178b(view, i);
            }
            if (!this.f54032F.f54082a) {
                this.f54032F.f54083b = i;
                ViewCompat.m4046a(view, this.f54032F);
                this.f54032F.f54082a = true;
                return;
            }
            this.f54032F.f54083b = i;
            return;
        }
        m79954a(this, i);
    }

    /* renamed from: g */
    private void m79959g() {
        this.f54049g = (int) (((float) this.f54059q) * (1.0f - this.f54050h));
    }

    /* renamed from: h */
    private void m79962h() {
        this.f54062t = -1;
        VelocityTracker velocityTracker = this.f54039N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f54039N = null;
        }
    }

    /* renamed from: c */
    public boolean mo76716c() {
        return this.f54029C;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f54060r = null;
        this.f54057o = null;
    }

    /* renamed from: f */
    private void m79958f() {
        int e = m79957e();
        if (this.f54043a) {
            this.f54051i = Math.max(this.f54059q - e, this.f54048f);
        } else {
            this.f54051i = this.f54059q - e;
        }
    }

    /* renamed from: j */
    private float m79965j() {
        VelocityTracker velocityTracker = this.f54039N;
        if (velocityTracker == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f54066x);
        return this.f54039N.getYVelocity(this.f54062t);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class RunnableC22178b implements Runnable {

        /* renamed from: a */
        public boolean f54082a;

        /* renamed from: b */
        int f54083b;

        /* renamed from: d */
        private final View f54085d;

        public void run() {
            if (BottomSheetBehavior.this.f54057o == null || !BottomSheetBehavior.this.f54057o.mo4869a(true)) {
                m80008a(BottomSheetBehavior.this, this.f54083b);
            } else {
                ViewCompat.m4046a(this.f54085d, this);
            }
            this.f54082a = false;
        }

        /* renamed from: a */
        public static void m80008a(BottomSheetBehavior bottomSheetBehavior, int i) {
            try {
                bottomSheetBehavior.mo76720e(i);
            } catch (NullPointerException unused) {
                Log.m165383e("BottomSheetBehaviorNPE", "BottomSheetBehavior setStateInternal occurred NPE");
            }
        }

        RunnableC22178b(View view, int i) {
            this.f54085d = view;
            this.f54083b = i;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: e */
    private int m79957e() {
        int i;
        if (this.f54067y) {
            return Math.min(Math.max(this.f54068z, this.f54059q - ((this.f54058p * 9) / 16)), this.f54037L);
        }
        if (this.f54029C || (i = this.f54046d) <= 0) {
            return this.f54044b;
        }
        return Math.max(this.f54044b, i + this.f54027A);
    }

    /* renamed from: i */
    private void m79964i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f54033G = ofFloat;
        ofFloat.setDuration(500L);
        this.f54033G.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.C221722 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.f54045c != null) {
                    BottomSheetBehavior.this.f54045c.mo77983p(floatValue);
                }
            }
        });
    }

    /* renamed from: k */
    private void m79966k() {
        V v;
        WeakReference<V> weakReference = this.f54060r;
        if (weakReference != null && (v = weakReference.get()) != null) {
            ViewCompat.m4075e((View) v, 524288);
            ViewCompat.m4075e((View) v, 262144);
            ViewCompat.m4075e((View) v, 1048576);
            if (this.f54053k && this.f54056n != 5) {
                m79952a(v, C0864d.C0865a.f3389u, 5);
            }
            int i = this.f54056n;
            int i2 = 6;
            if (i == 3) {
                if (this.f54043a) {
                    i2 = 4;
                }
                m79952a(v, C0864d.C0865a.f3388t, i2);
            } else if (i == 4) {
                if (this.f54043a) {
                    i2 = 3;
                }
                m79952a(v, C0864d.C0865a.f3387s, i2);
            } else if (i == 6) {
                m79952a(v, C0864d.C0865a.f3388t, 4);
                m79952a(v, C0864d.C0865a.f3387s, 3);
            }
        }
    }

    /* renamed from: a */
    public int mo76699a() {
        if (this.f54043a) {
            return this.f54048f;
        }
        return this.f54047e;
    }

    /* renamed from: c */
    public void mo76713c(int i) {
        this.f54064v = i;
    }

    /* renamed from: e */
    public void mo76721e(boolean z) {
        this.f54055m = z;
    }

    /* renamed from: f */
    public void mo76723f(boolean z) {
        this.f54029C = z;
    }

    /* renamed from: c */
    public void mo76714c(AbstractC22177a aVar) {
        this.f54038M.remove(aVar);
    }

    /* renamed from: d */
    public void mo76719d(boolean z) {
        this.f54054l = z;
    }

    /* renamed from: b */
    public void mo76709b(int i) {
        if (i >= 0) {
            this.f54047e = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f54060r = null;
        this.f54057o = null;
    }

    /* renamed from: c */
    private void m79956c(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !mo76716c() && !this.f54067y) {
            C22365r.m81023a(view, new C22365r.AbstractC22370a() {
                /* class com.google.android.material.bottomsheet.BottomSheetBehavior.C221733 */

                @Override // com.google.android.material.internal.C22365r.AbstractC22370a
                /* renamed from: a */
                public C0883ab mo76565a(View view, C0883ab abVar, C22365r.C22371b bVar) {
                    BottomSheetBehavior.this.f54046d = abVar.mo4658m().f3134e;
                    BottomSheetBehavior.this.mo76711b(false);
                    return abVar;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo76710b(AbstractC22177a aVar) {
        if (!this.f54038M.contains(aVar)) {
            this.f54038M.add(aVar);
        }
    }

    /* renamed from: d */
    public void mo76718d(int i) {
        if (i != this.f54056n) {
            if (this.f54060r != null) {
                m79960g(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f54053k && i == 5)) {
                this.f54056n = i;
            }
        }
    }

    /* renamed from: a */
    private void m79953a(SavedState savedState) {
        int i = this.f54064v;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f54044b = savedState.f54078b;
            }
            int i2 = this.f54064v;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f54043a = savedState.f54079d;
            }
            int i3 = this.f54064v;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f54053k = savedState.f54080e;
            }
            int i4 = this.f54064v;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f54054l = savedState.f54081f;
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m79955b(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: g */
    private void m79960g(final int i) {
        final V v = this.f54060r.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent == null || !parent.isLayoutRequested() || !ViewCompat.m4015I(v)) {
                mo76704a((View) v, i);
            } else {
                v.post(new Runnable() {
                    /* class com.google.android.material.bottomsheet.BottomSheetBehavior.RunnableC221711 */

                    public void run() {
                        BottomSheetBehavior.this.mo76704a(v, i);
                    }
                });
            }
        }
    }

    /* renamed from: h */
    private void m79963h(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f54031E != z) {
                this.f54031E = z;
                if (this.f54045c != null && (valueAnimator = this.f54033G) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f54033G.reverse();
                        return;
                    }
                    if (z) {
                        f = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f = 1.0f;
                    }
                    this.f54033G.setFloatValues(1.0f - f, f);
                    this.f54033G.start();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo76715c(boolean z) {
        if (this.f54053k != z) {
            this.f54053k = z;
            if (!z && this.f54056n == 5) {
                mo76718d(4);
            }
            m79966k();
        }
    }

    /* renamed from: b */
    public void mo76711b(boolean z) {
        V v;
        if (this.f54060r != null) {
            m79958f();
            if (this.f54056n == 4 && (v = this.f54060r.get()) != null) {
                if (z) {
                    m79960g(this.f54056n);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo76720e(int i) {
        V v;
        if (this.f54056n != i) {
            this.f54056n = i;
            WeakReference<V> weakReference = this.f54060r;
            if (!(weakReference == null || (v = weakReference.get()) == null)) {
                if (i == 3) {
                    m79961g(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m79961g(false);
                }
                m79963h(i);
                for (int i2 = 0; i2 < this.f54038M.size(); i2++) {
                    this.f54038M.get(i2).mo24938a((View) v, i);
                }
                m79966k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo76722f(int i) {
        float f;
        float f2;
        V v = this.f54060r.get();
        if (!(v == null || this.f54038M.isEmpty())) {
            int i2 = this.f54051i;
            if (i > i2 || i2 == mo76699a()) {
                int i3 = this.f54051i;
                f = (float) (i3 - i);
                f2 = (float) (this.f54059q - i3);
            } else {
                int i4 = this.f54051i;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo76699a());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f54038M.size(); i5++) {
                this.f54038M.get(i5).mo24937a(v, f3);
            }
        }
    }

    /* renamed from: g */
    private void m79961g(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f54060r;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f54041P == null) {
                        this.f54041P = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f54060r.get()) {
                        if (z) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f54041P.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f54065w) {
                                ViewCompat.m4069d(childAt, 4);
                            }
                        } else if (this.f54065w && (map = this.f54041P) != null && map.containsKey(childAt)) {
                            ViewCompat.m4069d(childAt, this.f54041P.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f54041P = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo76700a(View view) {
        if (ViewCompat.m4010D(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo76700a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo76701a(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f54050h = f;
        if (this.f54060r != null) {
            m79959g();
        }
    }

    /* renamed from: a */
    public void mo76702a(int i) {
        mo76703a(i, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.C221761 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f54077a;

        /* renamed from: b */
        int f54078b;

        /* renamed from: d */
        boolean f54079d;

        /* renamed from: e */
        boolean f54080e;

        /* renamed from: f */
        boolean f54081f;

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f54077a = bottomSheetBehavior.f54056n;
            this.f54078b = bottomSheetBehavior.f54044b;
            this.f54079d = bottomSheetBehavior.f54043a;
            this.f54080e = bottomSheetBehavior.f54053k;
            this.f54081f = bottomSheetBehavior.f54054l;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f54077a);
            parcel.writeInt(this.f54078b);
            parcel.writeInt(this.f54079d ? 1 : 0);
            parcel.writeInt(this.f54080e ? 1 : 0);
            parcel.writeInt(this.f54081f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            boolean z2;
            this.f54077a = parcel.readInt();
            this.f54078b = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f54079d = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f54080e = z2;
            this.f54081f = parcel.readInt() == 1 ? true : z3;
        }
    }

    /* renamed from: a */
    public static void m79954a(BottomSheetBehavior bottomSheetBehavior, int i) {
        try {
            bottomSheetBehavior.mo76720e(i);
        } catch (NullPointerException unused) {
            Log.m165383e("BottomSheetBehaviorNPE", "BottomSheetBehavior setStateInternal occurred NPE");
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54027A = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay});
        this.f54028B = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            m79951a(context, attributeSet, hasValue, C22313c.m80795a(context, obtainStyledAttributes, 1));
        } else {
            m79950a(context, attributeSet, hasValue);
        }
        m79964i();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f54052j = obtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || peekValue.data != -1) {
            mo76702a(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            mo76702a(peekValue.data);
        }
        mo76715c(obtainStyledAttributes.getBoolean(6, false));
        mo76723f(obtainStyledAttributes.getBoolean(10, false));
        mo76707a(obtainStyledAttributes.getBoolean(4, true));
        mo76719d(obtainStyledAttributes.getBoolean(9, false));
        mo76721e(obtainStyledAttributes.getBoolean(2, true));
        mo76713c(obtainStyledAttributes.getInt(8, 0));
        mo76701a(obtainStyledAttributes.getFloat(5, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo76709b(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        } else {
            mo76709b(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.f54066x = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private void m79950a(Context context, AttributeSet attributeSet, boolean z) {
        m79951a(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: a */
    private void m79952a(V v, C0864d.C0865a aVar, final int i) {
        ViewCompat.m4041a(v, aVar, null, new AbstractC0873g() {
            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.C221755 */

            @Override // androidx.core.view.p029a.AbstractC0873g
            /* renamed from: a */
            public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                BottomSheetBehavior.this.mo76718d(i);
                return true;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.mo4902a());
        m79953a(savedState);
        if (savedState.f54077a == 1 || savedState.f54077a == 2) {
            this.f54056n = 4;
        } else {
            this.f54056n = savedState.f54077a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f54056n == 1 && actionMasked == 0) {
            return true;
        }
        C0959c cVar = this.f54057o;
        if (cVar != null) {
            cVar.mo4872b(motionEvent);
        }
        if (actionMasked == 0) {
            m79962h();
        }
        if (this.f54039N == null) {
            this.f54039N = VelocityTracker.obtain();
        }
        this.f54039N.addMovement(motionEvent);
        if (this.f54057o != null && actionMasked == 2 && !this.f54034I && Math.abs(((float) this.f54040O) - motionEvent.getY()) > ((float) this.f54057o.mo4884f())) {
            this.f54057o.mo4865a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f54034I;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0959c cVar;
        boolean z;
        View view;
        if (!v.isShown() || !this.f54055m) {
            this.f54034I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m79962h();
        }
        if (this.f54039N == null) {
            this.f54039N = VelocityTracker.obtain();
        }
        this.f54039N.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f54040O = (int) motionEvent.getY();
            if (this.f54056n != 2) {
                WeakReference<View> weakReference = this.f54061s;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.mo3944a(view, x, this.f54040O)) {
                    this.f54062t = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f54063u = true;
                }
            }
            if (this.f54062t != -1 || coordinatorLayout.mo3944a(v, x, this.f54040O)) {
                z = false;
            } else {
                z = true;
            }
            this.f54034I = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f54063u = false;
            this.f54062t = -1;
            if (this.f54034I) {
                this.f54034I = false;
                return false;
            }
        }
        if (!this.f54034I && (cVar = this.f54057o) != null && cVar.mo4867a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f54061s;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.f54034I || this.f54056n == 1 || coordinatorLayout.mo3944a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f54057o == null || Math.abs(((float) this.f54040O) - motionEvent.getY()) <= ((float) this.f54057o.mo4884f())) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean z;
        float f;
        MaterialShapeDrawable materialShapeDrawable;
        if (ViewCompat.m4109x(coordinatorLayout) && !ViewCompat.m4109x(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f54060r == null) {
            this.f54068z = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            m79956c(v);
            this.f54060r = new WeakReference<>(v);
            if (this.f54028B && (materialShapeDrawable = this.f54045c) != null) {
                ViewCompat.m4039a(v, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f54045c;
            if (materialShapeDrawable2 != null) {
                float f2 = this.f54052j;
                if (f2 == -1.0f) {
                    f2 = ViewCompat.m4104s(v);
                }
                materialShapeDrawable2.mo77985r(f2);
                if (this.f54056n == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f54031E = z;
                MaterialShapeDrawable materialShapeDrawable3 = this.f54045c;
                if (z) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = 1.0f;
                }
                materialShapeDrawable3.mo77983p(f);
            }
            m79966k();
            if (ViewCompat.m4076f(v) == 0) {
                ViewCompat.m4069d((View) v, 1);
            }
        }
        if (this.f54057o == null) {
            this.f54057o = C0959c.m4642a(coordinatorLayout, this.f54042Q);
        }
        int top = v.getTop();
        coordinatorLayout.mo3939a(v, i);
        this.f54058p = coordinatorLayout.getWidth();
        this.f54059q = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f54037L = height;
        this.f54048f = Math.max(0, this.f54059q - height);
        m79959g();
        m79958f();
        int i2 = this.f54056n;
        if (i2 == 3) {
            ViewCompat.m4087i((View) v, mo76699a());
        } else if (i2 == 6) {
            ViewCompat.m4087i((View) v, this.f54049g);
        } else if (this.f54053k && i2 == 5) {
            ViewCompat.m4087i((View) v, this.f54059q);
        } else if (i2 == 4) {
            ViewCompat.m4087i((View) v, this.f54051i);
        } else if (i2 == 1 || i2 == 2) {
            ViewCompat.m4087i((View) v, top - v.getTop());
        }
        this.f54061s = new WeakReference<>(mo76700a(v));
        return true;
    }

    /* renamed from: a */
    private void m79951a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f54028B) {
            this.f54030D = C22398l.m81160a(context, attributeSet, (int) R.attr.bottomSheetStyle, f54026H).mo78024a();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f54030D);
            this.f54045c = materialShapeDrawable;
            materialShapeDrawable.mo77965a(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f54045c.setTint(typedValue.data);
                return;
            }
            this.f54045c.mo77973g(colorStateList);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == mo76699a()) {
            m79954a(this, 3);
            return;
        }
        WeakReference<View> weakReference = this.f54061s;
        if (weakReference != null && view == weakReference.get() && this.f54036K) {
            if (this.f54035J > 0) {
                if (this.f54043a) {
                    i2 = this.f54048f;
                } else {
                    int top = v.getTop();
                    int i4 = this.f54049g;
                    if (top > i4) {
                        i2 = i4;
                    } else {
                        i2 = this.f54047e;
                    }
                }
                mo76705a((View) v, i3, i2, false);
                this.f54036K = false;
            } else if (!this.f54053k || !mo76708a(v, m79965j())) {
                if (this.f54035J == 0) {
                    int top2 = v.getTop();
                    if (!this.f54043a) {
                        int i5 = this.f54049g;
                        if (top2 < i5) {
                            if (top2 < Math.abs(top2 - this.f54051i)) {
                                i2 = this.f54047e;
                                mo76705a((View) v, i3, i2, false);
                                this.f54036K = false;
                            }
                            i2 = this.f54049g;
                        } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.f54051i)) {
                            i2 = this.f54049g;
                        } else {
                            i2 = this.f54051i;
                        }
                    } else if (Math.abs(top2 - this.f54048f) < Math.abs(top2 - this.f54051i)) {
                        i2 = this.f54048f;
                        mo76705a((View) v, i3, i2, false);
                        this.f54036K = false;
                    } else {
                        i2 = this.f54051i;
                    }
                } else if (this.f54043a) {
                    i2 = this.f54051i;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f54049g) < Math.abs(top3 - this.f54051i)) {
                        i2 = this.f54049g;
                    } else {
                        i2 = this.f54051i;
                    }
                }
                i3 = 4;
                mo76705a((View) v, i3, i2, false);
                this.f54036K = false;
            } else {
                i2 = this.f54059q;
                i3 = 5;
                mo76705a((View) v, i3, i2, false);
                this.f54036K = false;
            }
            i3 = 6;
            mo76705a((View) v, i3, i2, false);
            this.f54036K = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f54061s;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f54056n != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f54035J = 0;
        this.f54036K = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f54061s;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo76699a()) {
                        iArr[1] = top - mo76699a();
                        ViewCompat.m4087i((View) v, -iArr[1]);
                        m79954a(this, 3);
                    } else if (this.f54055m) {
                        iArr[1] = i2;
                        ViewCompat.m4087i((View) v, -i2);
                        m79954a(this, 1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f54051i;
                    if (i4 > i5 && !this.f54053k) {
                        iArr[1] = top - i5;
                        ViewCompat.m4087i((View) v, -iArr[1]);
                        m79954a(this, 4);
                    } else if (this.f54055m) {
                        iArr[1] = i2;
                        ViewCompat.m4087i((View) v, -i2);
                        m79954a(this, 1);
                    } else {
                        return;
                    }
                }
                mo76722f(v.getTop());
                this.f54035J = i2;
                this.f54036K = true;
            }
        }
    }
}
