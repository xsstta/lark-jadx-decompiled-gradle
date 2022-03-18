package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
public abstract class AbstractC1401r {

    /* renamed from: a */
    protected final RecyclerView.LayoutManager f4948a;

    /* renamed from: b */
    final Rect f4949b;

    /* renamed from: c */
    private int f4950c;

    /* renamed from: a */
    public abstract int mo7461a(View view);

    /* renamed from: a */
    public abstract void mo7463a(int i);

    /* renamed from: b */
    public abstract int mo7465b(View view);

    /* renamed from: c */
    public abstract int mo7466c();

    /* renamed from: c */
    public abstract int mo7467c(View view);

    /* renamed from: d */
    public abstract int mo7468d();

    /* renamed from: d */
    public abstract int mo7469d(View view);

    /* renamed from: e */
    public abstract int mo7470e();

    /* renamed from: e */
    public abstract int mo7471e(View view);

    /* renamed from: f */
    public abstract int mo7472f();

    /* renamed from: f */
    public abstract int mo7473f(View view);

    /* renamed from: g */
    public abstract int mo7474g();

    /* renamed from: h */
    public abstract int mo7475h();

    /* renamed from: i */
    public abstract int mo7476i();

    /* renamed from: a */
    public void mo7462a() {
        this.f4950c = mo7472f();
    }

    /* renamed from: b */
    public int mo7464b() {
        if (Integer.MIN_VALUE == this.f4950c) {
            return 0;
        }
        return mo7472f() - this.f4950c;
    }

    /* renamed from: a */
    public static AbstractC1401r m6390a(RecyclerView.LayoutManager layoutManager) {
        return new AbstractC1401r(layoutManager) {
            /* class androidx.recyclerview.widget.AbstractC1401r.C14021 */

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: c */
            public int mo7466c() {
                return this.f4948a.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: e */
            public int mo7470e() {
                return this.f4948a.getWidth();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: g */
            public int mo7474g() {
                return this.f4948a.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: h */
            public int mo7475h() {
                return this.f4948a.getWidthMode();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: i */
            public int mo7476i() {
                return this.f4948a.getHeightMode();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: d */
            public int mo7468d() {
                return this.f4948a.getWidth() - this.f4948a.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: f */
            public int mo7472f() {
                return (this.f4948a.getWidth() - this.f4948a.getPaddingLeft()) - this.f4948a.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: a */
            public void mo7463a(int i) {
                this.f4948a.offsetChildrenHorizontal(i);
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: a */
            public int mo7461a(View view) {
                return this.f4948a.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: b */
            public int mo7465b(View view) {
                return this.f4948a.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: c */
            public int mo7467c(View view) {
                this.f4948a.getTransformedBoundingBox(view, true, this.f4949b);
                return this.f4949b.right;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: d */
            public int mo7469d(View view) {
                this.f4948a.getTransformedBoundingBox(view, true, this.f4949b);
                return this.f4949b.left;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: e */
            public int mo7471e(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f4948a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: f */
            public int mo7473f(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f4948a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        };
    }

    /* renamed from: b */
    public static AbstractC1401r m6392b(RecyclerView.LayoutManager layoutManager) {
        return new AbstractC1401r(layoutManager) {
            /* class androidx.recyclerview.widget.AbstractC1401r.C14032 */

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: c */
            public int mo7466c() {
                return this.f4948a.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: e */
            public int mo7470e() {
                return this.f4948a.getHeight();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: g */
            public int mo7474g() {
                return this.f4948a.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: h */
            public int mo7475h() {
                return this.f4948a.getHeightMode();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: i */
            public int mo7476i() {
                return this.f4948a.getWidthMode();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: d */
            public int mo7468d() {
                return this.f4948a.getHeight() - this.f4948a.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: f */
            public int mo7472f() {
                return (this.f4948a.getHeight() - this.f4948a.getPaddingTop()) - this.f4948a.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: a */
            public void mo7463a(int i) {
                this.f4948a.offsetChildrenVertical(i);
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: a */
            public int mo7461a(View view) {
                return this.f4948a.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: b */
            public int mo7465b(View view) {
                return this.f4948a.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: c */
            public int mo7467c(View view) {
                this.f4948a.getTransformedBoundingBox(view, true, this.f4949b);
                return this.f4949b.bottom;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: d */
            public int mo7469d(View view) {
                this.f4948a.getTransformedBoundingBox(view, true, this.f4949b);
                return this.f4949b.top;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: e */
            public int mo7471e(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f4948a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // androidx.recyclerview.widget.AbstractC1401r
            /* renamed from: f */
            public int mo7473f(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.f4948a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        };
    }

    private AbstractC1401r(RecyclerView.LayoutManager layoutManager) {
        this.f4950c = Integer.MIN_VALUE;
        this.f4949b = new Rect();
        this.f4948a = layoutManager;
    }

    /* renamed from: a */
    public static AbstractC1401r m6391a(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return m6390a(layoutManager);
        }
        if (i == 1) {
            return m6392b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}
