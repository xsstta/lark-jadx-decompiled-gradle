package com.ss.android.lark.mm.widget.swipemenu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class SwipeMenuLayout extends ViewGroup {

    /* renamed from: b */
    private static boolean f118947b;

    /* renamed from: d */
    private static WeakReference<SwipeMenuLayout> f118948d;

    /* renamed from: a */
    private final String f118949a;

    /* renamed from: c */
    public boolean f118950c;

    /* renamed from: e */
    private final int f118951e;

    /* renamed from: f */
    private int f118952f;

    /* renamed from: g */
    private int f118953g;

    /* renamed from: h */
    private int f118954h;

    /* renamed from: i */
    private int f118955i;

    /* renamed from: j */
    private int f118956j;

    /* renamed from: k */
    private View f118957k;

    /* renamed from: l */
    private final PointF f118958l;

    /* renamed from: m */
    private boolean f118959m;

    /* renamed from: n */
    private boolean f118960n;

    /* renamed from: o */
    private boolean f118961o;

    /* renamed from: p */
    private VelocityTracker f118962p;

    /* renamed from: q */
    private ValueAnimator f118963q;

    /* renamed from: r */
    private ValueAnimator f118964r;

    /* renamed from: s */
    private MeetingSpaceFileListLinearLayoutManager f118965s;

    /* renamed from: t */
    private final List<AbstractC47171a> f118966t;

    /* renamed from: u */
    private AbstractC47172b f118967u;

    /* renamed from: v */
    private int f118968v;

    /* renamed from: com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout$a */
    public interface AbstractC47171a {
        /* renamed from: a */
        void mo165865a(SwipeMenuLayout swipeMenuLayout, boolean z);
    }

    /* renamed from: com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout$b */
    public interface AbstractC47172b {
        /* renamed from: a */
        void mo165866a(SwipeMenuLayout swipeMenuLayout, boolean z);
    }

    public boolean getSwipeEnable() {
        return this.f118961o;
    }

    public class MeetingSpaceFileListLinearLayoutManager extends LinearLayoutManager {

        /* renamed from: a */
        private boolean f118971a;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
        public boolean canScrollVertically() {
            if (!this.f118971a || !super.canScrollVertically()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo165864a(boolean z) {
            this.f118971a = z;
        }
    }

    /* renamed from: e */
    private void m186870e() {
        VelocityTracker velocityTracker = this.f118962p;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f118962p.recycle();
            this.f118962p = null;
        }
    }

    public static SwipeMenuLayout getViewCache() {
        return f118948d.get();
    }

    public boolean performLongClick() {
        if (getScrollX() > this.f118952f) {
            return false;
        }
        return super.performLongClick();
    }

    /* renamed from: d */
    private void m186869d() {
        ValueAnimator valueAnimator = this.f118964r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f118964r.cancel();
        }
        ValueAnimator valueAnimator2 = this.f118963q;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f118963q.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        WeakReference<SwipeMenuLayout> weakReference = f118948d;
        if (weakReference != null && this == weakReference.get()) {
            f118948d.get().mo165849c();
            f118948d = null;
        }
        super.onDetachedFromWindow();
    }

    private int getMenuWidths() {
        FrameLayout frameLayout = (FrameLayout) getChildAt(1);
        int i = 0;
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i += childAt.getMeasuredWidth();
            }
        }
        return i;
    }

    /* renamed from: c */
    public void mo165849c() {
        MeetingSpaceFileListLinearLayoutManager meetingSpaceFileListLinearLayoutManager = this.f118965s;
        if (meetingSpaceFileListLinearLayoutManager != null) {
            meetingSpaceFileListLinearLayoutManager.mo165864a(true);
        }
        if (this == f118948d.get()) {
            m186869d();
            f118948d.get().scrollTo(0, 0);
            f118948d = null;
            this.f118950c = false;
            mo165847a(false);
        }
    }

    /* renamed from: b */
    public void mo165848b() {
        f118948d = null;
        MeetingSpaceFileListLinearLayoutManager meetingSpaceFileListLinearLayoutManager = this.f118965s;
        if (meetingSpaceFileListLinearLayoutManager != null) {
            meetingSpaceFileListLinearLayoutManager.mo165864a(true);
        }
        View view = this.f118957k;
        if (view != null) {
            view.setLongClickable(true);
        }
        m186869d();
        ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), 0);
        this.f118964r = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mm.widget.swipemenu.$$Lambda$SwipeMenuLayout$Bo9JsRmvRMTlF36IRMQB7297Wik */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwipeMenuLayout.this.m186865a((SwipeMenuLayout) valueAnimator);
            }
        });
        this.f118964r.setInterpolator(new AccelerateInterpolator());
        this.f118964r.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout.C471702 */

            public void onAnimationEnd(Animator animator) {
                SwipeMenuLayout.this.f118950c = false;
                SwipeMenuLayout.this.mo165847a(false);
            }
        });
        this.f118964r.setDuration(120L).start();
        AbstractC47172b bVar = this.f118967u;
        if (bVar != null) {
            bVar.mo165866a(this, false);
        }
    }

    /* renamed from: a */
    public void mo165846a() {
        f118948d = new WeakReference<>(this);
        MeetingSpaceFileListLinearLayoutManager meetingSpaceFileListLinearLayoutManager = this.f118965s;
        if (meetingSpaceFileListLinearLayoutManager != null) {
            meetingSpaceFileListLinearLayoutManager.mo165864a(false);
        }
        View view = this.f118957k;
        if (view != null) {
            view.setLongClickable(false);
        }
        m186869d();
        ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), this.f118955i);
        this.f118963q = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mm.widget.swipemenu.$$Lambda$SwipeMenuLayout$LH3gPtFG58VhyF15W2gxQd271bw */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwipeMenuLayout.this.m186868b(valueAnimator);
            }
        });
        this.f118963q.setInterpolator(new OvershootInterpolator());
        this.f118963q.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout.C471691 */

            public void onAnimationEnd(Animator animator) {
                SwipeMenuLayout.this.f118950c = true;
                SwipeMenuLayout.this.mo165847a(true);
            }
        });
        this.f118963q.setDuration(300L).start();
        AbstractC47172b bVar = this.f118967u;
        if (bVar != null) {
            bVar.mo165866a(this, true);
        }
    }

    public void setDefaultMenuWidths(int i) {
        this.f118968v = i;
    }

    public void setLayoutManager(MeetingSpaceFileListLinearLayoutManager meetingSpaceFileListLinearLayoutManager) {
        this.f118965s = meetingSpaceFileListLinearLayoutManager;
    }

    public void setOnUserSwipeMenuListener(AbstractC47172b bVar) {
        this.f118967u = bVar;
    }

    public void setSwipeEnable(boolean z) {
        this.f118961o = z;
    }

    public SwipeMenuLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m186866a(Context context) {
        this.f118952f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m186865a(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        scrollTo(num.intValue(), 0);
        mo163292a(num.intValue());
    }

    /* renamed from: a */
    private void mo163292a(int i) {
        FrameLayout frameLayout = (FrameLayout) getChildAt(1);
        int i2 = 0;
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                int i4 = i2 + 1;
                int min = Math.min((i2 * i) / frameLayout.getChildCount(), frameLayout.getChildAt(0).getMeasuredWidth());
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.setMargins(min, 0, 0, 0);
                childAt.setLayoutParams(layoutParams);
                i2 = i4;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m186868b(ValueAnimator valueAnimator) {
        Integer valueOf = Integer.valueOf(Math.min(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f118955i));
        scrollTo(valueOf.intValue(), 0);
        mo163292a(valueOf.intValue());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f118961o) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && this.f118959m) {
                    return true;
                }
            } else if (getScrollX() > this.f118952f && motionEvent.getX() < ((float) (getWidth() - getScrollX()))) {
                if (!this.f118959m) {
                    mo165848b();
                }
                return true;
            } else if (this.f118959m) {
                return true;
            }
            if (this.f118960n) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m186867a(MotionEvent motionEvent) {
        if (this.f118962p == null) {
            this.f118962p = VelocityTracker.obtain();
        }
        this.f118962p.addMovement(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 != 3) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.widget.swipemenu.SwipeMenuLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo165847a(boolean z) {
        for (AbstractC47171a aVar : this.f118966t) {
            aVar.mo165865a(this, z);
        }
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m186864a(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (marginLayoutParams.height == -1) {
                    int i4 = marginLayoutParams.width;
                    marginLayoutParams.width = childAt.getMeasuredWidth();
                    measureChildWithMargins(childAt, i2, 0, makeMeasureSpec, 0);
                    marginLayoutParams.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        setClickable(true);
        this.f118955i = 0;
        this.f118954h = 0;
        int childCount = getChildCount();
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 0;
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.setClickable(true);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                this.f118954h = Math.max(this.f118954h, childAt.getMeasuredHeight());
                if (z && marginLayoutParams.height == -1) {
                    z2 = true;
                }
                if (i4 > 0) {
                    this.f118955i += getMenuWidths();
                } else {
                    this.f118957k = childAt;
                    i3 = childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(getPaddingLeft() + getPaddingRight() + i3, this.f118954h + getPaddingTop() + getPaddingBottom());
        this.f118956j = this.f118955i / 5;
        if (z2) {
            m186864a(childCount, i);
        }
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118949a = "SwipeMenuLayout";
        this.f118951e = 2000;
        this.f118958l = new PointF();
        this.f118961o = true;
        this.f118966t = new ArrayList();
        m186866a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                if (i6 == 0) {
                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                    i5 = childAt.getMeasuredWidth();
                } else {
                    childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                    i5 = childAt.getMeasuredWidth();
                }
                paddingLeft += i5;
            }
        }
    }
}
