package com.ss.android.lark.mm.module.list.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.MmSmoothScroller;
import com.ss.android.lark.ui.p2892a.C57582a;

public class MmListStickyLayout extends LinearLayout implements NestedScrollingParent2 {

    /* renamed from: a */
    public boolean f116993a;

    /* renamed from: b */
    private View f116994b;

    /* renamed from: c */
    private View f116995c;

    /* renamed from: d */
    private View f116996d;

    /* renamed from: e */
    private AbstractC46464a f116997e;

    /* renamed from: f */
    private Rect f116998f = new Rect();

    /* renamed from: g */
    private MmSmoothScroller f116999g;

    /* renamed from: h */
    private int f117000h = C57582a.m223600a(20);

    /* renamed from: i */
    private int f117001i = 0;

    /* renamed from: j */
    private boolean f117002j = true;

    /* renamed from: k */
    private int f117003k = 0;

    /* renamed from: l */
    private int f117004l = 0;

    /* renamed from: com.ss.android.lark.mm.module.list.widget.MmListStickyLayout$a */
    public interface AbstractC46464a {
        /* renamed from: a */
        void mo162949a();

        /* renamed from: a */
        void mo162950a(boolean z);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i == 2;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f116999g.computeScrollOffset()) {
            scrollTo(this.f116999g.getCurrX(), this.f116999g.getCurrY());
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f116994b = getChildAt(0);
        this.f116995c = getChildAt(1);
        this.f116996d = getChildAt(2);
    }

    /* renamed from: a */
    private void m183808a() {
        int i;
        this.f116994b.getLocalVisibleRect(this.f116998f);
        ViewGroup.LayoutParams layoutParams = this.f116996d.getLayoutParams();
        if (Math.abs(this.f116998f.bottom) > Math.abs(this.f116998f.top)) {
            i = this.f116998f.bottom - this.f116998f.top;
        } else {
            i = 0;
        }
        layoutParams.height = (getMeasuredHeight() - this.f117004l) - i;
        this.f116996d.setLayoutParams(layoutParams);
    }

    public void setListener(AbstractC46464a aVar) {
        this.f116997e = aVar;
    }

    public void scrollTo(int i, int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f117003k;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 != getScrollY()) {
            super.scrollTo(i, i2);
        }
    }

    public MmListStickyLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f116999g = new MmSmoothScroller(context);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f117003k = this.f116994b.getMeasuredHeight();
        this.f117004l = this.f116995c.getMeasuredHeight();
        C45855f.m181663b("StickyNavLayout", "2 top height: " + this.f117003k + ", banner height: " + this.f117004l);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C45855f.m181663b("StickyNavLayout", "onScrollChanged current t" + i2 + ", oldt: " + i4);
        int i5 = i2 - i4;
        int i6 = this.f117001i;
        int i7 = this.f117000h;
        if (i6 > i7 && this.f117002j) {
            this.f117002j = false;
            this.f117001i = 0;
        } else if (i6 < (-i7) && !this.f117002j) {
            this.f117002j = true;
            this.f117001i = 0;
        }
        boolean z = this.f117002j;
        if ((z && i5 > 0) || (!z && i5 < 0)) {
            this.f117001i += i5;
        }
        m183808a();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.f116993a || getScrollY() < this.f117003k) {
            if (i2 <= 0 || getScrollY() >= this.f117003k) {
                z = false;
            } else {
                z = true;
            }
            if (i2 >= 0 || getScrollY() < 0 || ViewCompat.m4060b(view, -1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            C45855f.m181663b("StickyNavLayout", "onNestedPreScroll, hiddenTop: " + z + ", showTop: " + z2);
            AbstractC46464a aVar = this.f116997e;
            if (aVar != null) {
                if (getScrollY() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aVar.mo162950a(z3);
                if (i3 == 1 && getScrollY() == 0) {
                    this.f116997e.mo162949a();
                }
            }
            if (getScrollY() == 0) {
                this.f116999g.abortAnimation();
            }
            if (z || z2) {
                scrollBy(0, i2);
                iArr[1] = i2;
            }
        } else if (i3 == 1) {
            this.f116997e.mo162949a();
        }
    }
}
