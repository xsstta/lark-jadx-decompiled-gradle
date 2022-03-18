package com.ss.android.appcenter.engine.vlayout;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.appcenter.engine.vlayout.g */
public abstract class AbstractC28285g {

    /* renamed from: a */
    protected final ExposeLinearLayoutManagerEx f71036a;

    /* renamed from: b */
    private int f71037b;

    /* renamed from: a */
    public abstract int mo100797a(View view);

    /* renamed from: a */
    public abstract void mo100799a(int i);

    /* renamed from: b */
    public abstract int mo100801b(View view);

    /* renamed from: c */
    public abstract int mo100802c();

    /* renamed from: c */
    public abstract int mo100803c(View view);

    /* renamed from: d */
    public abstract int mo100804d();

    /* renamed from: d */
    public abstract int mo100805d(View view);

    /* renamed from: e */
    public abstract int mo100806e();

    /* renamed from: f */
    public abstract int mo100807f();

    /* renamed from: g */
    public abstract int mo100808g();

    /* renamed from: a */
    public void mo100798a() {
        this.f71037b = mo100807f();
    }

    /* renamed from: b */
    public int mo100800b() {
        if (Integer.MIN_VALUE == this.f71037b) {
            return 0;
        }
        return mo100807f() - this.f71037b;
    }

    /* renamed from: a */
    public static AbstractC28285g m103735a(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        return new AbstractC28285g(exposeLinearLayoutManagerEx) {
            /* class com.ss.android.appcenter.engine.vlayout.AbstractC28285g.C282861 */

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: c */
            public int mo100802c() {
                return this.f71036a.getPaddingLeft();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: e */
            public int mo100806e() {
                return this.f71036a.getWidth();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: g */
            public int mo100808g() {
                return this.f71036a.getPaddingRight();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: d */
            public int mo100804d() {
                return this.f71036a.getWidth() - this.f71036a.getPaddingRight();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: f */
            public int mo100807f() {
                return (this.f71036a.getWidth() - this.f71036a.getPaddingLeft()) - this.f71036a.getPaddingRight();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: a */
            public void mo100799a(int i) {
                this.f71036a.offsetChildrenHorizontal(i);
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: a */
            public int mo100797a(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.f71036a.isEnableMarginOverLap()) {
                    return this.f71036a.getDecoratedLeft(view) - layoutParams.leftMargin;
                }
                return this.f71036a.getDecoratedLeft(view);
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: b */
            public int mo100801b(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.f71036a.isEnableMarginOverLap()) {
                    return this.f71036a.getDecoratedRight(view) + layoutParams.rightMargin;
                }
                return this.f71036a.getDecoratedRight(view);
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: d */
            public int mo100805d(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f71036a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: c */
            public int mo100803c(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.f71036a.isEnableMarginOverLap()) {
                    return this.f71036a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
                }
                return this.f71036a.getDecoratedMeasuredWidth(view);
            }
        };
    }

    /* renamed from: b */
    public static AbstractC28285g m103737b(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        return new AbstractC28285g(exposeLinearLayoutManagerEx) {
            /* class com.ss.android.appcenter.engine.vlayout.AbstractC28285g.C282872 */

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: c */
            public int mo100802c() {
                return this.f71036a.getPaddingTop();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: e */
            public int mo100806e() {
                return this.f71036a.getHeight();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: g */
            public int mo100808g() {
                return this.f71036a.getPaddingBottom();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: d */
            public int mo100804d() {
                return this.f71036a.getHeight() - this.f71036a.getPaddingBottom();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: f */
            public int mo100807f() {
                return (this.f71036a.getHeight() - this.f71036a.getPaddingTop()) - this.f71036a.getPaddingBottom();
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: a */
            public void mo100799a(int i) {
                this.f71036a.offsetChildrenVertical(i);
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: a */
            public int mo100797a(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.f71036a.isEnableMarginOverLap()) {
                    return this.f71036a.getDecoratedTop(view) - layoutParams.topMargin;
                }
                return this.f71036a.getDecoratedTop(view);
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: b */
            public int mo100801b(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.f71036a.isEnableMarginOverLap()) {
                    return this.f71036a.getDecoratedBottom(view) + layoutParams.bottomMargin;
                }
                return this.f71036a.getDecoratedBottom(view);
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: d */
            public int mo100805d(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f71036a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28285g
            /* renamed from: c */
            public int mo100803c(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!this.f71036a.isEnableMarginOverLap()) {
                    return this.f71036a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
                }
                return this.f71036a.getDecoratedMeasuredHeight(view);
            }
        };
    }

    private AbstractC28285g(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        this.f71037b = Integer.MIN_VALUE;
        this.f71036a = exposeLinearLayoutManagerEx;
    }

    /* renamed from: a */
    public static AbstractC28285g m103736a(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, int i) {
        if (i == 0) {
            return m103735a(exposeLinearLayoutManagerEx);
        }
        if (i == 1) {
            return m103737b(exposeLinearLayoutManagerEx);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}
