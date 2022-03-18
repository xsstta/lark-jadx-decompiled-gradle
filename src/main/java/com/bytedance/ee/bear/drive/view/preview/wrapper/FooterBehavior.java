package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;

public class FooterBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    AbstractC7534a f20360a;

    /* renamed from: b */
    private volatile boolean f20361b;

    /* renamed from: c */
    private Runnable f20362c = new Runnable() {
        /* class com.bytedance.ee.bear.drive.view.preview.wrapper.$$Lambda$FooterBehavior$hhapFOQYY81pL4s8pX6NsQBaS5U */

        public final void run() {
            FooterBehavior.this.m30172b();
        }
    };

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.FooterBehavior$a */
    public interface AbstractC7534a {
        /* renamed from: a */
        boolean mo26405a();

        /* renamed from: b */
        void mo26406b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30172b() {
        this.f20361b = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return i == 2;
    }

    /* renamed from: a */
    public AbstractC7534a mo29431a() {
        return this.f20360a;
    }

    public FooterBehavior(AbstractC7534a aVar) {
        this.f20360a = aVar;
    }

    /* renamed from: a */
    private void m30171a(Context context) {
        if (this.f20360a.mo26405a()) {
            this.f20361b = true;
            this.f20360a.mo26406b();
        }
    }

    /* renamed from: b */
    private void m30173b(Context context) {
        if (!this.f20360a.mo26405a()) {
            this.f20361b = true;
            this.f20360a.mo26406b();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        if (!this.f20361b) {
            C13479a.m54764b("FooterBehavior", "dyConsumed= " + i2 + ", dyUnconsumed " + i4 + ",target =" + view2);
            if (view2 instanceof WebView) {
                if (i4 > 1) {
                    m30173b(view2.getContext());
                } else if (i4 < -1) {
                    m30171a(view2.getContext());
                }
            } else if (i2 > 0) {
                m30173b(view2.getContext());
            } else if (i2 < 0) {
                m30171a(view2.getContext());
            }
            if (this.f20361b && !C13742g.m55709b(this.f20362c)) {
                C13742g.m55706a(this.f20362c, 150);
            }
        }
    }
}
