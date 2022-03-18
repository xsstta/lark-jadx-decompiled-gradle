package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Scroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;
import com.bytedance.ee.bear.drive.view.preview.wrapper.FooterBehavior;
import com.bytedance.ee.bear.drive.view.preview.wrapper.WebViewFooterBehavior;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class WebViewFooterBehavior extends FooterBehavior {

    /* renamed from: b */
    protected int f20389b = 150;

    /* renamed from: c */
    protected int f20390c = 150;

    /* renamed from: d */
    public Scroller f20391d;

    /* renamed from: e */
    public ViewTreeObserver$OnPreDrawListenerC7544a f20392e;

    /* renamed from: f */
    private RunnableC7545b f20393f;

    /* renamed from: g */
    private View f20394g;

    /* renamed from: h */
    private View f20395h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29456a(Runnable runnable) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return (i & 2) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.WebViewFooterBehavior$a */
    public class ViewTreeObserver$OnPreDrawListenerC7544a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        private int f20397b;

        /* renamed from: c */
        private int f20398c;

        /* renamed from: d */
        private int f20399d;

        /* renamed from: e */
        private int f20400e;

        /* renamed from: f */
        private ViewTreeObserver f20401f;

        /* renamed from: a */
        public void mo29459a() {
            ViewTreeObserver viewTreeObserver = this.f20401f;
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m30224d() {
            C13479a.m54772d("FooterBehavior", "onPreDraw, offset is beyond distanceSlop, offsetY = " + WebViewFooterBehavior.this.f20390c + ", lastOffsetY = " + this.f20398c);
        }

        public boolean onPreDraw() {
            if (this.f20397b < 0) {
                this.f20397b = (int) (((double) WebViewFooterBehavior.this.f20389b) * 0.8d);
            }
            if (Math.abs(WebViewFooterBehavior.this.f20390c - this.f20398c) > this.f20397b) {
                this.f20400e = 0;
                this.f20399d = 3;
                WebViewFooterBehavior.this.mo29456a(new Runnable() {
                    /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$WebViewFooterBehavior$a$z787_WNpMwWyAhdTgTfAFKm38 */

                    public final void run() {
                        WebViewFooterBehavior.ViewTreeObserver$OnPreDrawListenerC7544a.this.m30224d();
                    }
                });
            }
            this.f20398c = WebViewFooterBehavior.this.f20390c;
            if (this.f20400e < this.f20399d) {
                WebViewFooterBehavior.this.mo29456a($$Lambda$WebViewFooterBehavior$a$6SuoJ7fGfZwAyRdzlqEBFAHXljg.INSTANCE);
                this.f20400e++;
                return false;
            }
            WebViewFooterBehavior.this.mo29456a($$Lambda$WebViewFooterBehavior$a$xcUMoSEVGWJ5WWo8TAUXqaOx7vs.INSTANCE);
            this.f20401f.removeOnPreDrawListener(this);
            WebViewFooterBehavior.this.f20392e = null;
            return true;
        }

        /* renamed from: a */
        public void mo29460a(ViewTreeObserver viewTreeObserver) {
            this.f20401f = viewTreeObserver;
        }

        private ViewTreeObserver$OnPreDrawListenerC7544a() {
            this.f20397b = -1;
            this.f20400e = this.f20399d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.WebViewFooterBehavior$b */
    public class RunnableC7545b implements Runnable {

        /* renamed from: b */
        private final View f20403b;

        /* renamed from: c */
        private final View f20404c;

        /* renamed from: d */
        private final View f20405d;

        /* renamed from: e */
        private int f20406e;

        /* renamed from: f */
        private int f20407f;

        /* renamed from: a */
        public void mo29462a() {
            this.f20404c.removeCallbacks(this);
        }

        public void run() {
            if (WebViewFooterBehavior.this.mo29457a(this.f20406e, this.f20405d)) {
                WebViewFooterBehavior webViewFooterBehavior = WebViewFooterBehavior.this;
                if (webViewFooterBehavior.mo29454a(webViewFooterBehavior.f20391d.getCurrY() - this.f20407f) != 0) {
                    WebViewFooterBehavior.this.mo29458b(this.f20403b);
                }
            }
            this.f20407f = WebViewFooterBehavior.this.f20391d.getCurrY();
            WebViewFooterBehavior.this.mo29455a(this.f20405d);
        }

        /* renamed from: a */
        public void mo29463a(int i) {
            this.f20406e = i;
            this.f20407f = 0;
        }

        public RunnableC7545b(View view, View view2, View view3) {
            this.f20403b = view;
            this.f20404c = view2;
            this.f20405d = view3;
        }
    }

    /* access modifiers changed from: private */
    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.FooterBehavior
    /* renamed from: b */
    public /* synthetic */ void m30215b() {
        C13479a.m54772d("FooterBehavior", "updateChildHeight, offsetY = " + this.f20390c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        this.f20390c = 0;
        View view = this.f20394g;
        if (!(view == null || this.f20395h == null)) {
            mo29458b(view);
        }
        Scroller scroller = this.f20391d;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        RunnableC7545b bVar = this.f20393f;
        if (bVar != null) {
            bVar.mo29462a();
        }
        ViewTreeObserver$OnPreDrawListenerC7544a aVar = this.f20392e;
        if (aVar != null) {
            aVar.mo29459a();
        }
    }

    public WebViewFooterBehavior(FooterBehavior.AbstractC7534a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public int mo29454a(int i) {
        int a = C0745a.m3627a(this.f20390c - i, 0, this.f20389b);
        int i2 = this.f20390c - a;
        this.f20390c = a;
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m30216c(View view) {
        C13479a.m54772d("FooterBehavior", "checkNeedMeasure, canScrollVertically = " + view.canScrollVertically(-1));
    }

    /* renamed from: a */
    public void mo29455a(View view) {
        Scroller scroller = this.f20391d;
        if (scroller != null && scroller.computeScrollOffset()) {
            ViewCompat.m4046a(view, this.f20393f);
        }
    }

    /* renamed from: b */
    public void mo29458b(View view) {
        mo29456a(new Runnable() {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$WebViewFooterBehavior$mbXljHgHY_3qzM81SWq_mQNlWag */

            public final void run() {
                WebViewFooterBehavior.this.m30215b();
            }
        });
        this.f20394g = view;
        View findViewById = view.findViewById(R.id.drive_sdk_preview_viewpager);
        this.f20395h = findViewById;
        if (findViewById != null) {
            this.f20395h.setPadding(0, this.f20390c, 0, findViewById.getPaddingBottom());
            if (this.f20392e == null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC7544a aVar = new ViewTreeObserver$OnPreDrawListenerC7544a();
                this.f20392e = aVar;
                aVar.mo29460a(viewTreeObserver);
                viewTreeObserver.addOnPreDrawListener(this.f20392e);
            }
        }
    }

    /* renamed from: a */
    public boolean mo29457a(int i, View view) {
        if (i > 0) {
            return true;
        }
        mo29456a(new Runnable(view) {
            /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$WebViewFooterBehavior$8F0tugWOIBmXjlr9oLpUUT6hcVE */
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                WebViewFooterBehavior.m30216c(this.f$0);
            }
        });
        return !view.canScrollVertically(-1);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Scroller scroller;
        if (motionEvent.getAction() != 0 || (scroller = this.f20391d) == null) {
            return false;
        }
        scroller.abortAnimation();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (this.f20391d == null) {
            this.f20391d = new Scroller(coordinatorLayout.getContext());
        }
        RunnableC7545b bVar = this.f20393f;
        if (bVar != null) {
            bVar.mo29462a();
        } else {
            this.f20393f = new RunnableC7545b(coordinatorLayout, view, view2);
        }
        this.f20393f.mo29463a((int) f2);
        this.f20391d.fling(0, view2.getScrollY(), 0, Math.round(f2), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        mo29455a(view2);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        this.f20394g = coordinatorLayout;
        coordinatorLayout.mo3940a(view, i, i2, i3, i4);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i2 == -2147483647) {
            mo29458b(coordinatorLayout);
        } else if (mo29457a(i2, view2)) {
            iArr[1] = mo29454a(i2);
            if (iArr[1] != 0) {
                mo29458b(coordinatorLayout);
            }
        }
    }
}
