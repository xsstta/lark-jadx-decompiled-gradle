package com.bytedance.ee.bear.document.titlebar;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Scroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;
import com.bytedance.ee.bear.document.titlebar.ImmersiveWebContainerBehavior;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;

public class ImmersiveWebContainerBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f17235a = -1;

    /* renamed from: b */
    public int f17236b;

    /* renamed from: c */
    public Scroller f17237c;

    /* renamed from: d */
    public ViewTreeObserver$OnPreDrawListenerC6186a f17238d;

    /* renamed from: e */
    private RunnableC6187b f17239e;

    /* renamed from: f */
    private View f17240f;

    /* renamed from: g */
    private View f17241g;

    /* renamed from: a */
    public void mo24973a(Runnable runnable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return (i & 2) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.titlebar.ImmersiveWebContainerBehavior$a */
    public class ViewTreeObserver$OnPreDrawListenerC6186a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        private int f17243b;

        /* renamed from: c */
        private int f17244c;

        /* renamed from: d */
        private int f17245d;

        /* renamed from: e */
        private int f17246e;

        /* renamed from: f */
        private ViewTreeObserver f17247f;

        /* renamed from: a */
        public void mo24975a() {
            ViewTreeObserver viewTreeObserver = this.f17247f;
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m24971d() {
            C13479a.m54772d("ImmersiveWebContainerBehavior", "onPreDraw, offset is beyond distanceSlop, offsetY = " + ImmersiveWebContainerBehavior.this.f17236b + ", lastOffsetY = " + this.f17244c);
        }

        public boolean onPreDraw() {
            if (this.f17243b < 0) {
                this.f17243b = (int) (((double) ImmersiveWebContainerBehavior.this.f17235a) * 0.8d);
            }
            if (Math.abs(ImmersiveWebContainerBehavior.this.f17236b - this.f17244c) > this.f17243b) {
                this.f17246e = 0;
                this.f17245d = 3;
                ImmersiveWebContainerBehavior.this.mo24973a(new Runnable() {
                    /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$ImmersiveWebContainerBehavior$a$Rr9i8mSmaQtXaKvPXagNcFuS8fY */

                    public final void run() {
                        ImmersiveWebContainerBehavior.ViewTreeObserver$OnPreDrawListenerC6186a.this.m24971d();
                    }
                });
            }
            this.f17244c = ImmersiveWebContainerBehavior.this.f17236b;
            if (this.f17246e < this.f17245d) {
                ImmersiveWebContainerBehavior.this.mo24973a($$Lambda$ImmersiveWebContainerBehavior$a$rWnlNR2xOWG9GWlyLbNWZTDlReg.INSTANCE);
                this.f17246e++;
                return false;
            }
            ImmersiveWebContainerBehavior.this.mo24973a($$Lambda$ImmersiveWebContainerBehavior$a$jZpPwWZKGazN0nOcts9nO5sumnA.INSTANCE);
            this.f17247f.removeOnPreDrawListener(this);
            ImmersiveWebContainerBehavior.this.f17238d = null;
            return true;
        }

        /* renamed from: a */
        public void mo24976a(ViewTreeObserver viewTreeObserver) {
            this.f17247f = viewTreeObserver;
        }

        private ViewTreeObserver$OnPreDrawListenerC6186a() {
            this.f17243b = -1;
            this.f17246e = this.f17245d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.titlebar.ImmersiveWebContainerBehavior$b */
    public class RunnableC6187b implements Runnable {

        /* renamed from: b */
        private final View f17249b;

        /* renamed from: c */
        private final View f17250c;

        /* renamed from: d */
        private final View f17251d;

        /* renamed from: e */
        private int f17252e;

        /* renamed from: f */
        private int f17253f;

        /* renamed from: a */
        public void mo24978a() {
            this.f17250c.removeCallbacks(this);
        }

        public void run() {
            if (ImmersiveWebContainerBehavior.this.mo24974a(this.f17252e, this.f17251d)) {
                ImmersiveWebContainerBehavior immersiveWebContainerBehavior = ImmersiveWebContainerBehavior.this;
                if (immersiveWebContainerBehavior.mo24970a(immersiveWebContainerBehavior.f17237c.getCurrY() - this.f17253f) != 0) {
                    ImmersiveWebContainerBehavior.this.mo24972a(this.f17249b, this.f17250c);
                }
            }
            this.f17253f = ImmersiveWebContainerBehavior.this.f17237c.getCurrY();
            ImmersiveWebContainerBehavior.this.mo24971a(this.f17251d);
        }

        /* renamed from: a */
        public void mo24979a(int i) {
            this.f17252e = i;
            this.f17253f = 0;
        }

        public RunnableC6187b(View view, View view2, View view3) {
            this.f17249b = view;
            this.f17250c = view2;
            this.f17251d = view3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24960a() {
        C13479a.m54772d("ImmersiveWebContainerBehavior", "updateChildHeight, offsetY = " + this.f17236b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24961b() {
        C13479a.m54772d("ImmersiveWebContainerBehavior", "onMeasureChild, offsetY = " + this.f17236b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        View view;
        this.f17236b = 0;
        View view2 = this.f17240f;
        if (!(view2 == null || (view = this.f17241g) == null)) {
            mo24972a(view2, view);
        }
        Scroller scroller = this.f17237c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        RunnableC6187b bVar = this.f17239e;
        if (bVar != null) {
            bVar.mo24978a();
        }
        ViewTreeObserver$OnPreDrawListenerC6186a aVar = this.f17238d;
        if (aVar != null) {
            aVar.mo24975a();
        }
    }

    /* renamed from: a */
    public int mo24970a(int i) {
        int a = C0745a.m3627a(this.f17236b - i, 0, this.f17235a);
        int i2 = this.f17236b - a;
        this.f17236b = a;
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24962b(View view) {
        C13479a.m54772d("ImmersiveWebContainerBehavior", "checkNeedMeasure, canScrollVertically = " + view.canScrollVertically(-1));
    }

    /* renamed from: a */
    public void mo24971a(View view) {
        Scroller scroller = this.f17237c;
        if (scroller != null && scroller.computeScrollOffset() && view.isAttachedToWindow()) {
            ViewCompat.m4046a(view, this.f17239e);
        }
    }

    /* renamed from: a */
    public void mo24972a(View view, View view2) {
        mo24973a(new Runnable() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$ImmersiveWebContainerBehavior$Er7ew9HsXMaZPLr6uS0SgSPbnlA */

            public final void run() {
                ImmersiveWebContainerBehavior.this.m24960a();
            }
        });
        this.f17240f = view;
        this.f17241g = view2;
        view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight() - this.f17236b, 1073741824));
        view2.layout(0, view.getTop() + this.f17236b, view.getRight(), view.getBottom());
        if (this.f17238d == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserver$OnPreDrawListenerC6186a aVar = new ViewTreeObserver$OnPreDrawListenerC6186a();
            this.f17238d = aVar;
            aVar.mo24976a(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f17238d);
        }
    }

    /* renamed from: a */
    public boolean mo24974a(int i, View view) {
        if (i > 0) {
            return true;
        }
        mo24973a(new Runnable(view) {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$ImmersiveWebContainerBehavior$ziOsCh2tJz8VSRgRbbWeX7bLlM */
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                ImmersiveWebContainerBehavior.m24962b(this.f$0);
            }
        });
        return !view.canScrollVertically(-1);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        this.f17235a = 0;
        this.f17236b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Scroller scroller;
        if (motionEvent.getAction() != 0 || (scroller = this.f17237c) == null) {
            return false;
        }
        scroller.abortAnimation();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.f17235a == view2.getMeasuredHeight()) {
            return false;
        }
        int measuredHeight = view2.getMeasuredHeight();
        this.f17235a = measuredHeight;
        this.f17236b = measuredHeight;
        mo24972a(coordinatorLayout, view);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (this.f17237c == null) {
            this.f17237c = new Scroller(coordinatorLayout.getContext());
        }
        RunnableC6187b bVar = this.f17239e;
        if (bVar != null) {
            bVar.mo24978a();
        } else {
            this.f17239e = new RunnableC6187b(coordinatorLayout, view, view2);
        }
        this.f17239e.mo24979a((int) f2);
        this.f17237c.fling(0, view2.getScrollY(), 0, Math.round(f2), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        mo24971a(view2);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        if (this.f17235a < 0) {
            mo24973a($$Lambda$ImmersiveWebContainerBehavior$QbLpdtbjZOZN7SwsxaG4KVtQ3g.INSTANCE);
            View findViewById = coordinatorLayout.findViewById(R.id.doc_appbar_layout);
            if (findViewById != null) {
                int measuredHeight = findViewById.getMeasuredHeight();
                this.f17235a = measuredHeight;
                this.f17236b = measuredHeight;
            }
        }
        mo24973a(new Runnable() {
            /* class com.bytedance.ee.bear.document.titlebar.$$Lambda$ImmersiveWebContainerBehavior$vgA4cmfc6u0grI9D_WPjj0zGMxg */

            public final void run() {
                ImmersiveWebContainerBehavior.this.m24961b();
            }
        });
        coordinatorLayout.mo3940a(view, i, i2, i3, this.f17236b);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (mo24974a(i2, view2)) {
            iArr[1] = mo24970a(i2);
            if (iArr[1] != 0) {
                mo24972a(coordinatorLayout, view);
            }
        }
    }
}
