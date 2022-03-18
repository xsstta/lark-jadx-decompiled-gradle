package com.bytedance.ee.bear.facade.common.widget.recyclerview;

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
import java.util.ArrayList;
import java.util.List;

public class SwipeMenuLayout extends ViewGroup {

    /* renamed from: c */
    private static boolean f20976c;

    /* renamed from: d */
    private static SwipeMenuLayout f20977d;

    /* renamed from: a */
    public boolean f20978a;

    /* renamed from: b */
    private final String f20979b;

    /* renamed from: e */
    private final int f20980e;

    /* renamed from: f */
    private int f20981f;

    /* renamed from: g */
    private int f20982g;

    /* renamed from: h */
    private int f20983h;

    /* renamed from: i */
    private int f20984i;

    /* renamed from: j */
    private int f20985j;

    /* renamed from: k */
    private View f20986k;

    /* renamed from: l */
    private PointF f20987l;

    /* renamed from: m */
    private boolean f20988m;

    /* renamed from: n */
    private boolean f20989n;

    /* renamed from: o */
    private boolean f20990o;

    /* renamed from: p */
    private VelocityTracker f20991p;

    /* renamed from: q */
    private ValueAnimator f20992q;

    /* renamed from: r */
    private ValueAnimator f20993r;

    /* renamed from: s */
    private DocsLinearLayoutManager f20994s;

    /* renamed from: t */
    private List<AbstractC7739a> f20995t;

    /* renamed from: u */
    private AbstractC7740b f20996u;

    /* renamed from: v */
    private int f20997v;

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout$a */
    public interface AbstractC7739a {
        void onMenuStateChanged(SwipeMenuLayout swipeMenuLayout, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout$b */
    public interface AbstractC7740b {
        void onSwipe(SwipeMenuLayout swipeMenuLayout, boolean z);
    }

    public static SwipeMenuLayout getViewCache() {
        return f20977d;
    }

    public boolean getSwipeEnable() {
        return this.f20990o;
    }

    /* renamed from: e */
    public void mo30349e() {
        this.f20995t.clear();
    }

    /* renamed from: g */
    private void m31006g() {
        VelocityTracker velocityTracker = this.f20991p;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f20991p.recycle();
            this.f20991p = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        SwipeMenuLayout swipeMenuLayout = f20977d;
        if (this == swipeMenuLayout) {
            swipeMenuLayout.mo30347d();
            f20977d = null;
        }
        super.onDetachedFromWindow();
    }

    public boolean performLongClick() {
        if (getScrollX() > this.f20981f) {
            return false;
        }
        return super.performLongClick();
    }

    /* renamed from: f */
    private void m31005f() {
        ValueAnimator valueAnimator = this.f20993r;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f20993r.cancel();
        }
        ValueAnimator valueAnimator2 = this.f20992q;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f20992q.cancel();
        }
    }

    /* renamed from: d */
    public void mo30347d() {
        DocsLinearLayoutManager docsLinearLayoutManager = this.f20994s;
        if (docsLinearLayoutManager != null) {
            docsLinearLayoutManager.mo30335a(true);
        }
        if (this == f20977d) {
            m31005f();
            f20977d.scrollTo(0, 0);
            f20977d = null;
            this.f20978a = false;
            mo30344a(false);
        }
    }

    /* renamed from: c */
    public void mo30346c() {
        f20977d = this;
        DocsLinearLayoutManager docsLinearLayoutManager = this.f20994s;
        if (docsLinearLayoutManager != null) {
            docsLinearLayoutManager.mo30335a(false);
        }
        View view = this.f20986k;
        if (view != null) {
            view.setLongClickable(false);
        }
        m31005f();
        scrollTo(Math.max(this.f20997v, this.f20984i), 0);
        this.f20978a = true;
        mo30344a(true);
    }

    /* renamed from: b */
    public void mo30345b() {
        f20977d = null;
        DocsLinearLayoutManager docsLinearLayoutManager = this.f20994s;
        if (docsLinearLayoutManager != null) {
            docsLinearLayoutManager.mo30335a(true);
        }
        View view = this.f20986k;
        if (view != null) {
            view.setLongClickable(true);
        }
        m31005f();
        ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), 0);
        this.f20993r = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.facade.common.widget.recyclerview.$$Lambda$SwipeMenuLayout$VRgVBJzCvAjHLUEFuilVNAzu4U4 */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwipeMenuLayout.this.m31001a((SwipeMenuLayout) valueAnimator);
            }
        });
        this.f20993r.setInterpolator(new AccelerateInterpolator());
        this.f20993r.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.C77382 */

            public void onAnimationEnd(Animator animator) {
                SwipeMenuLayout.this.f20978a = false;
                SwipeMenuLayout.this.mo30344a(false);
            }
        });
        this.f20993r.setDuration(120L).start();
        AbstractC7740b bVar = this.f20996u;
        if (bVar != null) {
            bVar.onSwipe(this, false);
        }
    }

    /* renamed from: a */
    public void mo30342a() {
        f20977d = this;
        DocsLinearLayoutManager docsLinearLayoutManager = this.f20994s;
        if (docsLinearLayoutManager != null) {
            docsLinearLayoutManager.mo30335a(false);
        }
        View view = this.f20986k;
        if (view != null) {
            view.setLongClickable(false);
        }
        m31005f();
        ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), this.f20984i);
        this.f20992q = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.facade.common.widget.recyclerview.$$Lambda$SwipeMenuLayout$aiu8lZi7rwxGvwnxsuIJI4OgX_8 */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SwipeMenuLayout.this.m31004b(valueAnimator);
            }
        });
        this.f20992q.setInterpolator(new OvershootInterpolator());
        this.f20992q.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.C77371 */

            public void onAnimationEnd(Animator animator) {
                SwipeMenuLayout.this.f20978a = true;
                SwipeMenuLayout.this.mo30344a(true);
            }
        });
        this.f20992q.setDuration(300L).start();
        AbstractC7740b bVar = this.f20996u;
        if (bVar != null) {
            bVar.onSwipe(this, true);
        }
    }

    public void setDefaultMenuWidths(int i) {
        this.f20997v = i;
    }

    public void setLayoutManager(DocsLinearLayoutManager docsLinearLayoutManager) {
        this.f20994s = docsLinearLayoutManager;
    }

    public void setOnUserSwipeMenuListener(AbstractC7740b bVar) {
        this.f20996u = bVar;
    }

    public void setSwipeEnable(boolean z) {
        this.f20990o = z;
    }

    public SwipeMenuLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31001a(ValueAnimator valueAnimator) {
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    private void m31002a(Context context) {
        this.f20981f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31004b(ValueAnimator valueAnimator) {
        scrollTo(Math.min(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f20984i), 0);
    }

    /* renamed from: a */
    private void m31003a(MotionEvent motionEvent) {
        if (this.f20991p == null) {
            this.f20991p = VelocityTracker.obtain();
        }
        this.f20991p.addMovement(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20990o) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && this.f20988m) {
                    return true;
                }
            } else if (getScrollX() > this.f20981f && motionEvent.getX() < ((float) (getWidth() - getScrollX()))) {
                if (!this.f20988m) {
                    mo30345b();
                }
                return true;
            } else if (this.f20988m) {
                return true;
            }
            if (this.f20989n) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 != 3) goto L_0x00ea;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.facade.common.widget.recyclerview.SwipeMenuLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo30343a(AbstractC7739a aVar) {
        if (!this.f20995t.contains(aVar)) {
            this.f20995t.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo30344a(boolean z) {
        for (AbstractC7739a aVar : this.f20995t) {
            aVar.onMenuStateChanged(this, z);
        }
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31000a(int i, int i2) {
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
        this.f20984i = 0;
        this.f20983h = 0;
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
                this.f20983h = Math.max(this.f20983h, childAt.getMeasuredHeight());
                if (z && marginLayoutParams.height == -1) {
                    z2 = true;
                }
                if (i4 > 0) {
                    this.f20984i += childAt.getMeasuredWidth();
                } else {
                    this.f20986k = childAt;
                    i3 = childAt.getMeasuredWidth();
                }
            }
        }
        setMeasuredDimension(getPaddingLeft() + getPaddingRight() + i3, this.f20983h + getPaddingTop() + getPaddingBottom());
        this.f20985j = this.f20984i / 5;
        if (z2) {
            m31000a(childCount, i);
        }
    }

    public SwipeMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20979b = "SwipeMenuLayout";
        this.f20980e = 2000;
        this.f20987l = new PointF();
        this.f20990o = true;
        this.f20995t = new ArrayList();
        m31002a(context);
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
