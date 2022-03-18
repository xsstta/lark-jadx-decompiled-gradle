package com.bytedance.ee.bear.list.homepage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.framework.thread.CoreThreadPool;
import java.lang.reflect.Field;

public class FlingBehavior extends AppBarLayout.Behavior {

    /* renamed from: a */
    private boolean f22836a;

    /* renamed from: b */
    private boolean f22837b;

    /* renamed from: c */
    private volatile boolean f22838c;

    /* renamed from: d */
    private volatile boolean f22839d;

    /* renamed from: e */
    private volatile Field f22840e;

    /* renamed from: f */
    private volatile Field f22841f;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m35037c() {
        try {
            m35034a();
            m35036b();
        } catch (Exception e) {
            C13479a.m54759a("AppbarLayoutBehavior", "Async Reflection Error.", e);
        }
    }

    public FlingBehavior() {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.bytedance.ee.bear.list.homepage.$$Lambda$FlingBehavior$vniZHQDtbUmJfz5KXiNR7_JUMNA */

            public final void run() {
                FlingBehavior.this.m35037c();
            }
        });
    }

    /* renamed from: a */
    private synchronized Field m35034a() {
        if (this.f22838c) {
            return this.f22840e;
        }
        try {
            Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
            if (superclass != null) {
                this.f22840e = superclass.getDeclaredField("flingRunnable");
                if (this.f22840e != null) {
                    this.f22840e.setAccessible(true);
                }
            } else {
                this.f22840e = null;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        this.f22838c = true;
        return this.f22840e;
    }

    /* renamed from: b */
    private synchronized Field m35036b() {
        if (this.f22839d) {
            return this.f22841f;
        }
        try {
            Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
            if (superclass != null) {
                this.f22841f = superclass.getDeclaredField("scroller");
                if (this.f22841f != null) {
                    this.f22841f.setAccessible(true);
                }
            } else {
                this.f22841f = null;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        this.f22839d = true;
        return this.f22841f;
    }

    /* renamed from: a */
    private void m35035a(AppBarLayout appBarLayout) {
        Runnable runnable;
        try {
            Field a = m35034a();
            if (!(a == null || (runnable = (Runnable) a.get(this)) == null)) {
                C13479a.m54772d("AppbarLayoutBehavior", "there is a flingRunnable");
                appBarLayout.removeCallbacks(runnable);
                a.set(this, null);
            }
            OverScroller overScroller = (OverScroller) m35036b().get(this);
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        this.f22837b = this.f22836a;
        if (motionEvent.getActionMasked() == 0) {
            m35035a(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.f22836a = false;
        this.f22837b = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        m35035a(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            this.f22836a = true;
        }
        if (!this.f22837b) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }
    }

    /* renamed from: a */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        if (!this.f22837b) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }
}
