package com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/widgets/viewpager/viewpager2/widget/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "child", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "initialX", "", "initialY", "parentViewPager", "Lcom/bytedance/ee/bear/widgets/viewpager/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Lcom/bytedance/ee/bear/widgets/viewpager/viewpager2/widget/ViewPager2;", "touchSlop", "", "canChildScroll", "", "orientation", "delta", "handleInterceptTouchEvent", "", "e", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class NestedScrollableHost extends FrameLayout {
    private HashMap _$_findViewCache;
    private float initialX;
    private float initialY;
    private int touchSlop;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final ViewPager2 getParentViewPager() {
        ViewParent parent = getParent();
        ViewPager2 viewPager2 = null;
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        while (view != null && !(view instanceof ViewPager2)) {
            ViewParent parent2 = view.getParent();
            if (!(parent2 instanceof View)) {
                parent2 = null;
            }
            view = (View) parent2;
        }
        if (view instanceof ViewPager2) {
            viewPager2 = view;
        }
        return viewPager2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "e");
        handleInterceptTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
    }

    private final void handleInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            float f2 = 1.0f;
            if (!canChildScroll(orientation, -1.0f) && !canChildScroll(orientation, 1.0f)) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                this.initialX = motionEvent.getX();
                this.initialY = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.initialX;
                float y = motionEvent.getY() - this.initialY;
                if (orientation == 0) {
                    z = true;
                } else {
                    z = false;
                }
                float abs = Math.abs(x);
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                float f3 = abs * f;
                float abs2 = Math.abs(y);
                if (!z) {
                    f2 = 0.5f;
                }
                float f4 = abs2 * f2;
                int i = this.touchSlop;
                if (f3 > ((float) i) || f4 > ((float) i)) {
                    if (!z) {
                        x = y;
                    }
                    if (canChildScroll(orientation, x)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "ViewConfiguration.get(context)");
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
    }

    private final boolean canChildScroll(int i, float f) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i2);
            }
            return false;
        } else if (i == 1) {
            View child2 = getChild();
            if (child2 != null) {
                return child2.canScrollVertically(i2);
            }
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
