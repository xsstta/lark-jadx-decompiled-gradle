package com.ss.android.lark.threadtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;

public class ReboundStickyNavLayout extends LinearLayout implements NestedScrollingParent {

    /* renamed from: a */
    public static int f138348a;

    /* renamed from: b */
    public boolean f138349b;

    /* renamed from: c */
    public ReboundView f138350c;

    /* renamed from: d */
    private C0911m f138351d = new C0911m(this);

    /* renamed from: e */
    private RecyclerView f138352e;

    /* renamed from: f */
    private AbstractC55983a f138353f;

    /* renamed from: g */
    private View f138354g;

    /* renamed from: com.ss.android.lark.threadtab.view.ReboundStickyNavLayout$a */
    public interface AbstractC55983a {
        /* renamed from: a */
        void mo190821a();
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return 0;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(0);
        if (getChildAt(0) instanceof RecyclerView) {
            this.f138352e = (RecyclerView) getChildAt(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(f138348a, -1);
            addView(this.f138354g, 0, layoutParams);
            addView(this.f138350c, getChildCount(), layoutParams);
            scrollBy(f138348a, 0);
            this.f138352e.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.threadtab.view.ReboundStickyNavLayout.View$OnTouchListenerC559821 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return ReboundStickyNavLayout.this.f138349b;
                }
            });
        }
    }

    public void setOnReboundListener(AbstractC55983a aVar) {
        this.f138353f = aVar;
    }

    /* renamed from: com.ss.android.lark.threadtab.view.ReboundStickyNavLayout$b */
    private class C55984b extends Animation {
        private C55984b() {
            ReboundStickyNavLayout.this.f138349b = true;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            ReboundStickyNavLayout.this.scrollBy((int) (((float) (ReboundStickyNavLayout.f138348a - ReboundStickyNavLayout.this.getScrollX())) * f), 0);
            if (f == 1.0f) {
                ReboundStickyNavLayout.this.f138349b = false;
                ReboundStickyNavLayout.this.f138350c.mo190824a();
            }
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            setDuration(300);
            setInterpolator(new AccelerateInterpolator());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC55983a aVar;
        this.f138351d.mo4708a(view);
        if (f138348a != getScrollX()) {
            startAnimation(new C55984b());
        }
        int scrollX = getScrollX();
        int i = f138348a;
        if (scrollX > i + (i / 2) && (aVar = this.f138353f) != null) {
            aVar.mo190821a();
        }
    }

    public void scrollTo(int i, int i2) {
        if (i < 0) {
            i = 0;
        } else {
            int i3 = f138348a;
            if (i > i3 * 2) {
                i = i3 * 2;
            }
        }
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RecyclerView recyclerView = this.f138352e;
        if (recyclerView != null) {
            recyclerView.getLayoutParams().width = getMeasuredWidth();
        }
    }

    public ReboundStickyNavLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View view = new View(context);
        this.f138354g = view;
        view.setBackgroundColor(C57582a.m223616d(context, R.color.bg_body));
        ReboundView reboundView = new ReboundView(context);
        this.f138350c = reboundView;
        reboundView.setBackgroundColor(C57582a.m223616d(context, R.color.bg_body));
        f138348a = UIHelper.dp2px(32.0f);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f138351d.mo4710a(view, view2, i);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if (getScrollX() != f138348a) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!(view2 instanceof RecyclerView) || this.f138349b) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (i <= 0 || getScrollX() >= f138348a || ViewCompat.m4051a(view, -1)) {
            z = false;
        } else {
            z = true;
        }
        if (i >= 0 || ViewCompat.m4051a(view, -1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i >= 0 || getScrollX() <= f138348a || ViewCompat.m4051a(view, 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i <= 0 || ViewCompat.m4051a(view, 1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z || z2 || z3 || z4) {
            scrollBy(i / 2, 0);
            iArr[0] = i;
        }
        if (z3 || z4) {
            this.f138350c.mo190825a(i / 2);
        }
        if (i > 0 && getScrollX() > f138348a && !ViewCompat.m4051a(view, -1)) {
            scrollTo(f138348a, 0);
        }
        if (i < 0 && getScrollX() < f138348a && !ViewCompat.m4051a(view, 1)) {
            scrollTo(f138348a, 0);
        }
    }
}
