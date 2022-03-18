package com.bytedance.ee.bear.widgets.viewpager;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.widgets.viewpager.a */
public class C11864a extends ConstraintLayout implements NestedScrollingParent2 {

    /* renamed from: a */
    private final int f32119a = C13749l.m55738a(60);

    /* renamed from: b */
    private View f32120b;

    /* renamed from: c */
    private View f32121c;

    /* renamed from: d */
    private RecyclerView f32122d;

    /* renamed from: e */
    private C11867b f32123e = null;

    /* renamed from: f */
    private AbstractC11866a f32124f;

    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.a$a */
    public interface AbstractC11866a {
        /* renamed from: a */
        void mo34882a();

        /* renamed from: b */
        void mo34883b();
    }

    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.a$b */
    private class C11867b extends ValueAnimator {

        /* renamed from: a */
        public View f32125a;

        /* renamed from: a */
        private void m49297a() {
            setInterpolator(new animationInterpolatorC11871d());
            setDuration(350L);
            addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ee.bear.widgets.viewpager.C11864a.C11867b.C118681 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C11864a.this.scrollTo(0, (int) ((Float) C11867b.this.getAnimatedValue()).floatValue());
                    if (C11864a.this.getScrollY() > 0 && !C11867b.this.f32125a.canScrollVertically(-1) && C11867b.this.f32125a.canScrollVertically(1)) {
                        C11864a.this.scrollTo(0, 0);
                    }
                    if (C11864a.this.getScrollY() < 0 && !C11867b.this.f32125a.canScrollVertically(1) && C11867b.this.f32125a.canScrollVertically(-1)) {
                        C11864a.this.scrollTo(0, 0);
                    }
                }
            });
        }

        private C11867b() {
            m49297a();
        }

        /* renamed from: a */
        public void mo45580a(View view, float f) {
            setFloatValues(f, 0.0f);
            this.f32125a = view;
            start();
        }
    }

    public void setOnHeaderOrFooterListener(AbstractC11866a aVar) {
        this.f32124f = aVar;
    }

    public C11864a(Context context) {
        super(context);
        this.f32120b = new View(context);
        this.f32121c = new View(context);
    }

    /* renamed from: a */
    private int m49292a(int i) {
        int abs = (int) (((double) Math.abs(0 - getScrollY())) * 0.01d);
        if (abs < 2) {
            return i;
        }
        return i / abs;
    }

    /* renamed from: a */
    public void mo45577a(RecyclerView recyclerView) {
        this.f32122d = recyclerView;
        addView(recyclerView);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, this.f32119a);
        layoutParams.f2818j = 0;
        addView(this.f32120b, layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, this.f32119a);
        layoutParams2.f2817i = 0;
        addView(this.f32121c, layoutParams2);
    }

    public void scrollTo(int i, int i2) {
        int i3 = this.f32119a;
        if (i2 < (-i3)) {
            i2 = -i3;
        } else if (i2 > i3) {
            i2 = i3;
        }
        super.scrollTo(i, i2);
    }

    /* renamed from: a */
    private void m49293a(int i, View view) {
        if (view.canScrollVertically(-1) || view.canScrollVertically(1)) {
            if (i > 0 && getScrollY() > 0 && !view.canScrollVertically(-1)) {
                scrollTo(0, 0);
            }
            if (i < 0 && getScrollY() < 0 && !view.canScrollVertically(1)) {
                scrollTo(0, 0);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        AbstractC11866a aVar;
        if (getScrollY() != 0) {
            this.f32123e.mo45580a(view, (float) getScrollY());
        }
        if (getScrollY() == (-this.f32119a)) {
            AbstractC11866a aVar2 = this.f32124f;
            if (aVar2 != null) {
                aVar2.mo34882a();
            }
        } else if (getScrollY() == this.f32119a && (aVar = this.f32124f) != null) {
            aVar.mo34883b();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return view2 instanceof RecyclerView;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (this.f32123e == null) {
            this.f32123e = new C11867b();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (i3 == 0) {
            if (i2 <= 0 || getScrollY() >= 0 || view.canScrollVertically(-1)) {
                z = false;
            } else {
                z = true;
            }
            if (i2 >= 0 || view.canScrollVertically(-1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i2 >= 0 || getScrollY() <= 0 || view.canScrollVertically(1)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i2 <= 0 || view.canScrollVertically(1)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z || z2 || z3 || z4) {
                if (this.f32123e.isStarted()) {
                    this.f32123e.pause();
                }
                scrollBy(0, m49292a(i2));
                if (this.f32123e.isPaused()) {
                    this.f32123e.cancel();
                }
                iArr[1] = i2;
            }
            m49293a(i2, view);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        getParent().requestDisallowInterceptTouchEvent(true);
    }
}
