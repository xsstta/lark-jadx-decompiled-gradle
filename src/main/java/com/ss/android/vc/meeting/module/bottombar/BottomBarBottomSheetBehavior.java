package com.ss.android.vc.meeting.module.bottombar;

import android.content.Context;
import android.content.res.TypedArray;
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
import androidx.core.view.ViewCompat;
import androidx.customview.p030a.C0959c;
import androidx.customview.view.AbsSavedState;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class BottomBarBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    int f154067a;

    /* renamed from: b */
    int f154068b;

    /* renamed from: c */
    boolean f154069c;

    /* renamed from: d */
    int f154070d = 4;

    /* renamed from: e */
    C0959c f154071e;

    /* renamed from: f */
    int f154072f;

    /* renamed from: g */
    WeakReference<V> f154073g;

    /* renamed from: h */
    WeakReference<View> f154074h;

    /* renamed from: i */
    int f154075i;

    /* renamed from: j */
    boolean f154076j;

    /* renamed from: k */
    private float f154077k;

    /* renamed from: l */
    private int f154078l;

    /* renamed from: m */
    private boolean f154079m;

    /* renamed from: n */
    private int f154080n;

    /* renamed from: o */
    private boolean f154081o;

    /* renamed from: p */
    private boolean f154082p;

    /* renamed from: q */
    private int f154083q;

    /* renamed from: r */
    private boolean f154084r;

    /* renamed from: s */
    private AbstractC61442a f154085s;

    /* renamed from: t */
    private VelocityTracker f154086t;

    /* renamed from: u */
    private int f154087u;

    /* renamed from: v */
    private float f154088v;

    /* renamed from: w */
    private float f154089w;

    /* renamed from: x */
    private final C0959c.AbstractC0962a f154090x = new C0959c.AbstractC0962a() {
        /* class com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.C614402 */

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            if (i == 1) {
                BottomBarBottomSheetBehavior.this.mo212992c(1);
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4896b(View view) {
            int i;
            int i2;
            if (BottomBarBottomSheetBehavior.this.f154069c) {
                i = BottomBarBottomSheetBehavior.this.f154072f;
                i2 = BottomBarBottomSheetBehavior.this.f154067a;
            } else {
                i = BottomBarBottomSheetBehavior.this.f154068b;
                i2 = BottomBarBottomSheetBehavior.this.f154067a;
            }
            return i - i2;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            View b;
            if (BottomBarBottomSheetBehavior.this.f154070d == 1 || BottomBarBottomSheetBehavior.this.f154076j) {
                return false;
            }
            if ((BottomBarBottomSheetBehavior.this.f154070d != 3 || BottomBarBottomSheetBehavior.this.f154075i != i || (b = BottomBarBottomSheetBehavior.this.mo212989b()) == null || !b.canScrollVertically(-1)) && BottomBarBottomSheetBehavior.this.f154073g != null && BottomBarBottomSheetBehavior.this.f154073g.get() == view) {
                return true;
            }
            return false;
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
            int i4 = BottomBarBottomSheetBehavior.this.f154067a;
            if (BottomBarBottomSheetBehavior.this.f154069c) {
                i3 = BottomBarBottomSheetBehavior.this.f154072f;
            } else {
                i3 = BottomBarBottomSheetBehavior.this.f154068b;
            }
            return C0745a.m3627a(i, i4, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4893a(android.view.View r5, float r6, float r7) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.C614402.mo4893a(android.view.View, float, float):void");
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            BottomBarBottomSheetBehavior.this.mo212993d(i2);
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* renamed from: com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior$a */
    public static abstract class AbstractC61442a {
        /* renamed from: a */
        public abstract void mo213001a(View view, float f);

        /* renamed from: a */
        public abstract void mo213002a(View view, int i);
    }

    /* renamed from: a */
    public final int mo212982a() {
        return this.f154070d;
    }

    public BottomBarBottomSheetBehavior() {
    }

    /* renamed from: c */
    private void m239801c() {
        this.f154075i = -1;
        VelocityTracker velocityTracker = this.f154086t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f154086t = null;
        }
    }

    /* renamed from: b */
    public View mo212989b() {
        WeakReference<View> weakReference = this.f154074h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior$b */
    public class RunnableC61443b implements Runnable {

        /* renamed from: b */
        private final View f154097b;

        /* renamed from: c */
        private final int f154098c;

        public void run() {
            if (BottomBarBottomSheetBehavior.this.f154071e == null || !BottomBarBottomSheetBehavior.this.f154071e.mo4869a(true)) {
                BottomBarBottomSheetBehavior.this.mo212992c(this.f154098c);
            } else {
                ViewCompat.m4046a(this.f154097b, this);
            }
        }

        RunnableC61443b(View view, int i) {
            this.f154097b = view;
            this.f154098c = i;
        }
    }

    /* renamed from: d */
    private float m239802d() {
        VelocityTracker velocityTracker = this.f154086t;
        if (velocityTracker == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f154077k);
        return this.f154086t.getYVelocity(this.f154075i);
    }

    /* renamed from: b */
    public void mo212991b(boolean z) {
        this.f154081o = z;
    }

    /* renamed from: a */
    public void mo212986a(AbstractC61442a aVar) {
        this.f154085s = aVar;
    }

    /* renamed from: a */
    public void mo212987a(boolean z) {
        this.f154069c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo212992c(int i) {
        WeakReference<V> weakReference;
        AbstractC61442a aVar;
        if (this.f154070d != i && (weakReference = this.f154073g) != null) {
            this.f154070d = i;
            V v = weakReference.get();
            if (v != null && (aVar = this.f154085s) != null) {
                aVar.mo213002a((View) v, i);
            }
        }
    }

    /* renamed from: a */
    private boolean m239799a(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        float abs = Math.abs(y - this.f154089w);
        float abs2 = Math.abs(x - this.f154088v);
        if (abs <= ((float) this.f154071e.mo4884f()) || abs <= abs2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static <V extends View> BottomBarBottomSheetBehavior<V> m239800b(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomBarBottomSheetBehavior) {
                return (BottomBarBottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo212993d(int i) {
        V v;
        AbstractC61442a aVar;
        WeakReference<V> weakReference = this.f154073g;
        if (weakReference != null && (v = weakReference.get()) != null && (aVar = this.f154085s) != null) {
            int i2 = this.f154068b;
            if (i > i2) {
                aVar.mo213001a(v, ((float) (i2 - i)) / ((float) (this.f154072f - i2)));
            } else {
                aVar.mo213001a(v, ((float) (i2 - i)) / ((float) (i2 - this.f154067a)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo212983a(View view) {
        if (ViewCompat.m4010D(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo212983a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo212990b(final int i) {
        if (i != this.f154070d) {
            WeakReference<V> weakReference = this.f154073g;
            if (weakReference != null) {
                final V v = weakReference.get();
                if (v != null) {
                    ViewParent parent = v.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.m4015I(v)) {
                        mo212985a((View) v, i);
                    } else {
                        v.post(new Runnable() {
                            /* class com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.RunnableC614391 */

                            public void run() {
                                BottomBarBottomSheetBehavior.this.mo212985a(v, i);
                            }
                        });
                    }
                }
            } else if (i == 4 || i == 3 || (this.f154069c && i == 5)) {
                this.f154070d = i;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo212984a(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f154079m
            if (r4 != 0) goto L_0x0015
            r3.f154079m = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f154079m
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f154078l
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f154079m = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f154078l = r1
            int r1 = r3.f154072f
            int r1 = r1 - r4
            r3.f154068b = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f154070d
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.f154073g
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.mo212984a(int):void");
    }

    /* access modifiers changed from: protected */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.ss.android.vc.meeting.module.bottombar.BottomBarBottomSheetBehavior.SavedState.C614411 */

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
        final int f154095a;

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f154095a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f154095a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f154095a);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.f154070d);
    }

    public BottomBarBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay});
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || peekValue.data != -1) {
            mo212984a(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            mo212984a(peekValue.data);
        }
        mo212987a(obtainStyledAttributes.getBoolean(6, false));
        mo212991b(obtainStyledAttributes.getBoolean(9, false));
        obtainStyledAttributes.recycle();
        this.f154077k = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo212985a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f154068b;
        } else if (i == 3) {
            i2 = this.f154067a;
        } else if (!this.f154069c || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f154072f;
        }
        C0959c cVar = this.f154071e;
        if (cVar == null || !cVar.mo4868a(view, view.getLeft(), i2)) {
            mo212992c(i);
            return;
        }
        mo212992c(2);
        ViewCompat.m4046a(view, new RunnableC61443b(view, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo212988a(View view, float f) {
        if (this.f154081o) {
            return true;
        }
        if (view.getTop() >= this.f154068b && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f154068b)) / ((float) this.f154078l) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.mo4902a());
        if (savedState.f154095a == 1 || savedState.f154095a == 2) {
            this.f154070d = 4;
        } else {
            this.f154070d = savedState.f154095a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f154067a) {
            mo212992c(3);
            return;
        }
        WeakReference<View> weakReference = this.f154074h;
        if (weakReference != null && view == weakReference.get() && this.f154084r) {
            if (this.f154083q > 0) {
                i = this.f154067a;
            } else if (!this.f154069c || !mo212988a(v, m239802d())) {
                if (this.f154083q == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f154067a) < Math.abs(top - this.f154068b)) {
                        i = this.f154067a;
                    } else {
                        i = this.f154068b;
                    }
                } else {
                    i = this.f154068b;
                }
                i2 = 4;
            } else {
                i = this.f154072f;
                i2 = 5;
            }
            C0959c cVar = this.f154071e;
            if (cVar == null || !cVar.mo4868a((View) v, v.getLeft(), i)) {
                mo212992c(i2);
            } else {
                mo212992c(2);
                ViewCompat.m4046a(v, new RunnableC61443b(v, i2));
            }
            this.f154084r = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        try {
            if (!v.isShown()) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.f154070d == 1 && actionMasked == 0) {
                return true;
            }
            C0959c cVar = this.f154071e;
            if (cVar != null) {
                cVar.mo4872b(motionEvent);
            }
            if (actionMasked == 0) {
                m239801c();
            }
            if (this.f154086t == null) {
                this.f154086t = VelocityTracker.obtain();
            }
            this.f154086t.addMovement(motionEvent);
            if (actionMasked == 2 && !this.f154082p && this.f154071e != null && Math.abs(((float) this.f154087u) - motionEvent.getY()) > ((float) this.f154071e.mo4884f()) && Math.abs(((float) this.f154087u) - motionEvent.getY()) > Math.abs(this.f154088v - motionEvent.getX())) {
                this.f154071e.mo4865a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.f154082p;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0959c cVar;
        boolean z;
        if (!v.isShown()) {
            this.f154082p = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m239801c();
        }
        if (this.f154086t == null) {
            this.f154086t = VelocityTracker.obtain();
        }
        this.f154086t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f154088v = motionEvent.getX();
            this.f154089w = motionEvent.getY();
            int x = (int) motionEvent.getX();
            this.f154087u = (int) motionEvent.getY();
            View b = mo212989b();
            if (b != null && coordinatorLayout.mo3944a(b, x, this.f154087u)) {
                this.f154075i = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f154076j = true;
            }
            if (this.f154075i != -1 || coordinatorLayout.mo3944a(v, x, this.f154087u)) {
                z = false;
            } else {
                z = true;
            }
            this.f154082p = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f154076j = false;
            this.f154075i = -1;
            if (this.f154082p) {
                this.f154082p = false;
                return false;
            }
        }
        if (!this.f154082p && (cVar = this.f154071e) != null && cVar.mo4867a(motionEvent)) {
            return true;
        }
        View b2 = mo212989b();
        if (this.f154071e != null && actionMasked == 2 && b2 != null && !this.f154082p && this.f154070d != 1 && !coordinatorLayout.mo3944a(b2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f154087u) - motionEvent.getY()) > ((float) this.f154071e.mo4884f()) && Math.abs(((float) this.f154087u) - motionEvent.getY()) > Math.abs(this.f154088v - motionEvent.getX()) && m239799a(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (ViewCompat.m4109x(coordinatorLayout) && !ViewCompat.m4109x(v)) {
            ViewCompat.m4059b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.mo3939a(v, i);
        this.f154072f = coordinatorLayout.getHeight();
        if (this.f154079m) {
            if (this.f154080n == 0) {
                this.f154080n = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            }
            i2 = Math.max(this.f154080n, this.f154072f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f154078l;
        }
        int max = Math.max(0, this.f154072f - v.getHeight());
        this.f154067a = max;
        int max2 = Math.max(this.f154072f - i2, max);
        this.f154068b = max2;
        int i3 = this.f154070d;
        if (i3 == 3) {
            ViewCompat.m4087i((View) v, this.f154067a);
        } else if (this.f154069c && i3 == 5) {
            ViewCompat.m4087i((View) v, this.f154072f);
        } else if (i3 == 4) {
            ViewCompat.m4087i((View) v, max2);
        } else if (i3 == 1 || i3 == 2) {
            ViewCompat.m4087i((View) v, top - v.getTop());
        }
        if (this.f154071e == null) {
            this.f154071e = C0959c.m4642a(coordinatorLayout, this.f154090x);
        }
        this.f154073g = new WeakReference<>(v);
        this.f154074h = new WeakReference<>(mo212983a(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f154083q = 0;
        this.f154084r = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view != mo212989b() || (this.f154070d == 3 && !super.onNestedPreFling(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == mo212989b()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f154067a;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    ViewCompat.m4087i((View) v, -iArr[1]);
                    mo212992c(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.m4087i((View) v, -i2);
                    mo212992c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f154068b;
                if (i3 <= i5 || this.f154069c) {
                    iArr[1] = i2;
                    ViewCompat.m4087i((View) v, -i2);
                    mo212992c(1);
                } else {
                    iArr[1] = top - i5;
                    ViewCompat.m4087i((View) v, -iArr[1]);
                    mo212992c(4);
                }
            }
            mo212993d(v.getTop());
            this.f154083q = i2;
            this.f154084r = true;
        }
    }
}
