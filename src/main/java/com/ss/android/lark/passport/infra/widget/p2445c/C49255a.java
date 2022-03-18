package com.ss.android.lark.passport.infra.widget.p2445c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.passport.infra.widget.p2445c.p2446a.AbstractC49256a;
import com.ss.android.lark.passport.infra.widget.p2445c.p2447b.C49259a;
import com.ss.android.lark.passport.infra.widget.p2445c.p2449d.AbstractC49264b;

/* renamed from: com.ss.android.lark.passport.infra.widget.c.a */
public class C49255a {

    /* renamed from: a */
    private final AbstractC49260c f123634a;

    /* renamed from: b */
    private final AbstractC49264b f123635b;

    /* renamed from: c */
    private final AbstractC49256a f123636c;

    /* renamed from: d */
    private final C49259a f123637d;

    /* renamed from: e */
    private final Rect f123638e = new Rect();

    /* renamed from: f */
    private final Rect f123639f = new Rect();

    /* renamed from: a */
    public boolean mo171812a(View view, int i, int i2) {
        int i3;
        int i4;
        this.f123637d.mo171814a(this.f123638e, view);
        if (i == 1) {
            i4 = view.getTop();
            i3 = this.f123638e.top;
        } else {
            i4 = view.getLeft();
            i3 = this.f123638e.left;
        }
        if (i4 > i3 || this.f123634a.mo171815a(i2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m194114a(int i) {
        if (i < 0 || i >= this.f123634a.getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m194111a(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: b */
    private int m194117b(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: b */
    private View m194118b(RecyclerView recyclerView, View view) {
        int i;
        int i2;
        boolean b = this.f123635b.mo171822b(recyclerView);
        if (b) {
            i = -1;
        } else {
            i = 1;
        }
        if (b) {
            i2 = recyclerView.getChildCount() - 1;
        } else {
            i2 = 0;
        }
        while (i2 >= 0 && i2 <= recyclerView.getChildCount() - 1) {
            View childAt = recyclerView.getChildAt(i2);
            if (!m194116a(recyclerView, childAt, view, this.f123635b.mo171821a(recyclerView))) {
                return childAt;
            }
            i2 += i;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m194115a(RecyclerView recyclerView, View view) {
        View b = m194118b(recyclerView, view);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(b);
        if (childAdapterPosition == -1) {
            return false;
        }
        boolean b2 = this.f123635b.mo171822b(recyclerView);
        if (childAdapterPosition <= 0 || !mo171811a(childAdapterPosition, b2)) {
            return false;
        }
        View a = this.f123636c.mo171813a(recyclerView, childAdapterPosition);
        this.f123637d.mo171814a(this.f123638e, a);
        this.f123637d.mo171814a(this.f123639f, view);
        if (this.f123635b.mo171821a(recyclerView) == 1) {
            if (((b.getTop() - this.f123638e.bottom) - a.getHeight()) - this.f123638e.top < recyclerView.getPaddingTop() + view.getBottom() + this.f123639f.top + this.f123639f.bottom) {
                return true;
            }
            return false;
        } else if (((b.getLeft() - this.f123638e.right) - a.getWidth()) - this.f123638e.left < recyclerView.getPaddingLeft() + view.getRight() + this.f123639f.left + this.f123639f.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo171811a(int i, boolean z) {
        int i2;
        int i3;
        if (m194114a(i)) {
            return false;
        }
        long a = this.f123634a.mo171815a(i);
        if (a < 0) {
            return false;
        }
        long j = -1;
        if (z) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int i4 = i2 + i;
        if (!m194114a(i4)) {
            j = this.f123634a.mo171815a(i4);
        }
        if (z) {
            i3 = this.f123634a.getItemCount() - 1;
        } else {
            i3 = 0;
        }
        if (i == i3 || a != j) {
            return true;
        }
        return false;
    }

    public C49255a(AbstractC49260c cVar, AbstractC49256a aVar, AbstractC49264b bVar, C49259a aVar2) {
        this.f123634a = cVar;
        this.f123636c = aVar;
        this.f123635b = bVar;
        this.f123637d = aVar2;
    }

    /* renamed from: a */
    private boolean m194116a(RecyclerView recyclerView, View view, View view2, int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f123637d.mo171814a(this.f123638e, view2);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || this.f123636c.mo171813a(recyclerView, childAdapterPosition) != view2) {
            return false;
        }
        if (i == 1) {
            if (view.getTop() - layoutParams.topMargin < m194111a(recyclerView) + view2.getBottom() + this.f123638e.bottom + this.f123638e.top) {
                return true;
            }
            return false;
        } else if (view.getLeft() - layoutParams.leftMargin < m194117b(recyclerView) + view2.getRight() + this.f123638e.right + this.f123638e.left) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo171810a(Rect rect, RecyclerView recyclerView, View view, View view2, boolean z) {
        m194112a(rect, recyclerView, view, view2, this.f123635b.mo171821a(recyclerView));
        if (z && m194115a(recyclerView, view)) {
            View b = m194118b(recyclerView, view);
            m194113a(recyclerView, this.f123635b.mo171821a(recyclerView), rect, view, b, this.f123636c.mo171813a(recyclerView, recyclerView.getChildAdapterPosition(b)));
        }
    }

    /* renamed from: a */
    private void m194112a(Rect rect, RecyclerView recyclerView, View view, View view2, int i) {
        int i2;
        int i3;
        int i4;
        this.f123637d.mo171814a(this.f123638e, view);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int i5 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i6 = marginLayoutParams.leftMargin;
            i5 = marginLayoutParams.topMargin;
            i2 = i6;
        } else {
            i2 = 0;
        }
        if (i == 1) {
            i3 = (view2.getLeft() - i2) + this.f123638e.left;
            i4 = Math.max(((view2.getTop() - i5) - view.getHeight()) - this.f123638e.bottom, m194111a(recyclerView) + this.f123638e.top);
        } else {
            int top = (view2.getTop() - i5) + this.f123638e.top;
            i3 = Math.max(((view2.getLeft() - i2) - view.getWidth()) - this.f123638e.right, m194117b(recyclerView) + this.f123638e.left);
            i4 = top;
        }
        rect.set(i3, i4, view.getWidth() + i3, view.getHeight() + i4);
    }

    /* renamed from: a */
    private void m194113a(RecyclerView recyclerView, int i, Rect rect, View view, View view2, View view3) {
        this.f123637d.mo171814a(this.f123638e, view3);
        this.f123637d.mo171814a(this.f123639f, view);
        if (i == 1) {
            int a = m194111a(recyclerView) + this.f123639f.top + this.f123639f.bottom;
            int top = ((((view2.getTop() - view3.getHeight()) - this.f123638e.bottom) - this.f123638e.top) - view.getHeight()) - a;
            if (top < a) {
                rect.top += top;
                return;
            }
            return;
        }
        int b = m194117b(recyclerView) + this.f123639f.left + this.f123639f.right;
        int left = ((((view2.getLeft() - view3.getWidth()) - this.f123638e.right) - this.f123638e.left) - view.getWidth()) - b;
        if (left < b) {
            rect.left += left;
        }
    }
}
