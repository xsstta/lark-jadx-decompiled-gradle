package com.ss.android.lark.feed.app.view.scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;

public class FlingBehavior extends AppBarLayout.Behavior {

    /* renamed from: a */
    private boolean f97589a;

    /* renamed from: b */
    private boolean f97590b;

    /* renamed from: c */
    private volatile boolean f97591c;

    /* renamed from: d */
    private volatile boolean f97592d;

    /* renamed from: e */
    private volatile Field f97593e;

    /* renamed from: f */
    private volatile Field f97594f;

    public FlingBehavior() {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.feed.app.view.scroll.FlingBehavior.RunnableC380081 */

            public void run() {
                try {
                    FlingBehavior.this.mo139076a();
                    FlingBehavior.this.mo139079b();
                } catch (Exception e) {
                    Log.m165384e("AppbarLayoutBehavior", "Async Reflection Error.", e);
                }
            }
        });
    }

    /* renamed from: b */
    public synchronized Field mo139079b() {
        if (this.f97592d) {
            return this.f97594f;
        }
        try {
            Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
            if (superclass != null) {
                this.f97594f = superclass.getDeclaredField("scroller");
                if (this.f97594f != null) {
                    this.f97594f.setAccessible(true);
                }
            } else {
                this.f97594f = null;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        this.f97592d = true;
        return this.f97594f;
    }

    /* renamed from: a */
    public synchronized Field mo139076a() {
        if (this.f97591c) {
            return this.f97593e;
        }
        try {
            Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
            if (superclass != null) {
                this.f97593e = superclass.getDeclaredField("flingRunnable");
                if (this.f97593e != null) {
                    this.f97593e.setAccessible(true);
                }
            } else {
                this.f97593e = null;
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        this.f97591c = true;
        return this.f97593e;
    }

    /* renamed from: a */
    private void m149456a(AppBarLayout appBarLayout) {
        Runnable runnable;
        try {
            Field a = mo139076a();
            if (!(a == null || (runnable = (Runnable) a.get(this)) == null)) {
                Log.m165379d("AppbarLayoutBehavior", "there is a flingRunnable");
                appBarLayout.removeCallbacks(runnable);
                a.set(this, null);
            }
            OverScroller overScroller = (OverScroller) mo139079b().get(this);
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
        this.f97590b = this.f97589a;
        if (motionEvent.getActionMasked() == 0) {
            m149456a(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.f97589a = false;
        this.f97590b = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        m149456a(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.AppBarLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            this.f97589a = true;
        }
        if (!this.f97590b) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }
    }

    /* renamed from: a */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        if (!this.f97590b) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }
}
