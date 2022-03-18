package com.ss.android.lark.mm.module.detail.main;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45850b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.MmSmoothScroller;
import com.ss.android.lark.ui.p2892a.C57582a;

public final class MmDetailStickyNavLayout extends LinearLayout implements NestedScrollingParent2 {

    /* renamed from: a */
    public boolean f116106a;

    /* renamed from: b */
    private View f116107b;

    /* renamed from: c */
    private View f116108c;

    /* renamed from: d */
    private ViewPager f116109d;

    /* renamed from: e */
    private AbstractC46077a f116110e;

    /* renamed from: f */
    private Rect f116111f = new Rect();

    /* renamed from: g */
    private MmSmoothScroller f116112g;

    /* renamed from: h */
    private int f116113h = C57582a.m223600a(20);

    /* renamed from: i */
    private int f116114i = 0;

    /* renamed from: j */
    private boolean f116115j = true;

    /* renamed from: k */
    private int f116116k = 0;

    /* renamed from: l */
    private int f116117l = 0;

    /* renamed from: m */
    private boolean f116118m = true;

    /* renamed from: com.ss.android.lark.mm.module.detail.main.MmDetailStickyNavLayout$a */
    public interface AbstractC46077a {
        /* renamed from: a */
        void mo161884a();

        /* renamed from: a */
        void mo161885a(boolean z);

        /* renamed from: b */
        void mo161886b();

        /* renamed from: b */
        void mo161887b(boolean z);

        /* renamed from: c */
        void mo161888c();
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
        if (this.f116112g.computeScrollOffset()) {
            scrollTo(this.f116112g.getCurrX(), this.f116112g.getCurrY());
            postInvalidate();
        }
    }

    /* renamed from: b */
    private void m182502b() {
        int i;
        this.f116107b.getLocalVisibleRect(this.f116111f);
        ViewGroup.LayoutParams layoutParams = this.f116109d.getLayoutParams();
        if (Math.abs(this.f116111f.bottom) > Math.abs(this.f116111f.top)) {
            i = this.f116111f.bottom - this.f116111f.top;
        } else {
            i = 0;
        }
        layoutParams.height = (getMeasuredHeight() - this.f116117l) - i;
        this.f116109d.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo161875a() {
        boolean z;
        int scrollY = getScrollY();
        int i = this.f116116k;
        if (scrollY < i) {
            scrollBy(0, i - getScrollY());
            AbstractC46077a aVar = this.f116110e;
            if (getScrollY() == 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo161885a(z);
            this.f116110e.mo161887b(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f116107b = getChildAt(0);
        this.f116108c = getChildAt(1);
        View findViewById = findViewById(R.id.viewPager);
        if ((findViewById instanceof ViewPager) || !C45850b.m181645a()) {
            this.f116109d = (ViewPager) findViewById;
            return;
        }
        throw new IllegalArgumentException("[MmStickNavLayout] R.id.viewPager view's type is not ViewPager");
    }

    public void setEnableScroll(boolean z) {
        this.f116118m = z;
    }

    public void setListener(AbstractC46077a aVar) {
        this.f116110e = aVar;
    }

    public void setForceHideTopView(Boolean bool) {
        this.f116106a = bool.booleanValue();
        if (bool.booleanValue()) {
            mo161875a();
        }
    }

    public void scrollTo(int i, int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f116116k;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 != getScrollY()) {
            super.scrollTo(i, i2);
        }
    }

    public MmDetailStickyNavLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f116112g = new MmSmoothScroller(context);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C45855f.m181663b("StickyNavLayout", "onScrollChanged current t" + i2 + ", oldt: " + i4);
        int i5 = i2 - i4;
        int i6 = this.f116114i;
        int i7 = this.f116113h;
        if (i6 > i7 && this.f116115j) {
            AbstractC46077a aVar = this.f116110e;
            if (aVar != null) {
                aVar.mo161886b();
            }
            this.f116115j = false;
            this.f116114i = 0;
        } else if (i6 < (-i7) && !this.f116115j) {
            AbstractC46077a aVar2 = this.f116110e;
            if (aVar2 != null) {
                aVar2.mo161888c();
            }
            this.f116115j = true;
            this.f116114i = 0;
        }
        boolean z = this.f116115j;
        if ((z && i5 > 0) || (!z && i5 < 0)) {
            this.f116114i += i5;
        }
        m182502b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C45855f.m181663b("StickyNavLayout", "onLayout");
        this.f116116k = this.f116107b.getMeasuredHeight();
        this.f116117l = this.f116108c.getMeasuredHeight();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f116118m) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!this.f116106a || getScrollY() < this.f116116k) {
                if (i2 <= 0 || getScrollY() >= this.f116116k) {
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
                AbstractC46077a aVar = this.f116110e;
                if (aVar != null) {
                    if (getScrollY() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.mo161885a(z3);
                    AbstractC46077a aVar2 = this.f116110e;
                    if (getScrollY() < this.f116116k) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aVar2.mo161887b(z4);
                    if (i3 == 1 && getScrollY() == 0) {
                        this.f116110e.mo161884a();
                    }
                }
                if (getScrollY() == 0) {
                    this.f116112g.abortAnimation();
                }
                if (z || z2) {
                    scrollBy(0, i2);
                    iArr[1] = i2;
                }
            } else if (i3 == 1) {
                this.f116110e.mo161884a();
            }
        }
    }
}
