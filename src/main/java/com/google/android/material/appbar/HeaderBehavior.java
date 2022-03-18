package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;

/* access modifiers changed from: package-private */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    private static final int INVALID_POINTER = -1;
    private int activePointerId = -1;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop = -1;
    private VelocityTracker velocityTracker;

    /* access modifiers changed from: package-private */
    public boolean canDragView(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void onFlingFinished(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    public HeaderBehavior() {
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    public class RunnableC22138a implements Runnable {

        /* renamed from: b */
        private final CoordinatorLayout f53851b;

        /* renamed from: c */
        private final V f53852c;

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.google.android.material.appbar.HeaderBehavior */
        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: com.google.android.material.appbar.HeaderBehavior */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            if (this.f53852c != null && HeaderBehavior.this.scroller != null) {
                if (HeaderBehavior.this.scroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.setHeaderTopBottomOffset(this.f53851b, this.f53852c, headerBehavior.scroller.getCurrY());
                    ViewCompat.m4046a(this.f53852c, this);
                    return;
                }
                HeaderBehavior.this.onFlingFinished(this.f53851b, this.f53852c);
            }
        }

        RunnableC22138a(CoordinatorLayout coordinatorLayout, V v) {
            this.f53851b = coordinatorLayout;
            this.f53852c = v;
        }
    }

    /* access modifiers changed from: package-private */
    public int getMaxDragOffset(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRangeForDragFling(V v) {
        return v.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i = this.activePointerId;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!canDragView(v) || !coordinatorLayout.mo3944a(v, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.isBeingDragged = z;
            if (z) {
                this.lastMotionY = y2;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final int scroll(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(coordinatorLayout, v, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int a;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (a = C0745a.m3627a(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(a);
        return topAndBottomOffset - a;
    }

    /* access modifiers changed from: package-private */
    public final boolean fling(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.scroller.computeScrollOffset()) {
            RunnableC22138a aVar = new RunnableC22138a(coordinatorLayout, v);
            this.flingRunnable = aVar;
            ViewCompat.m4046a(v, aVar);
            return true;
        }
        onFlingFinished(coordinatorLayout, v);
        return false;
    }
}
