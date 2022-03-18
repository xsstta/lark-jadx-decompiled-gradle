package com.larksuite.framework.ui.p1198b;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.p1199a.AbstractC26184a;
import com.larksuite.framework.ui.p1198b.p1200b.C26189a;
import com.larksuite.framework.ui.p1198b.p1202d.AbstractC26196b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.larksuite.framework.ui.b.c */
public class C26190c {

    /* renamed from: a */
    private final AbstractC26197e f64669a;

    /* renamed from: b */
    private final AbstractC26196b f64670b;

    /* renamed from: c */
    private final AbstractC26184a f64671c;

    /* renamed from: d */
    private final C26189a f64672d;

    /* renamed from: e */
    private final Rect f64673e = new Rect();

    /* renamed from: f */
    private final Rect f64674f = new Rect();

    /* renamed from: a */
    public boolean mo93169a(RecyclerView recyclerView, View view, View view2, int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f64672d.mo93165a(this.f64673e, view2);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || this.f64671c.mo93161a(recyclerView, childAdapterPosition) != view2) {
            return false;
        }
        if (i == 1) {
            if (view.getTop() - layoutParams.topMargin >= m94727a(recyclerView) + view2.getBottom() + this.f64673e.bottom + this.f64673e.top) {
                return false;
            }
        } else if (view.getLeft() - layoutParams.leftMargin >= m94732b(recyclerView) + view2.getRight() + this.f64673e.right + this.f64673e.left) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m94730a(int i) {
        if (i < 0 || i >= this.f64669a.getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m94727a(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: b */
    private int m94732b(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager().getClipToPadding()) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.ui.b.c$a */
    public static class C26192a {

        /* renamed from: a */
        View f64676a;

        /* renamed from: b */
        int f64677b;

        public C26192a(View view, int i) {
            this.f64676a = view;
            this.f64677b = i;
        }
    }

    /* renamed from: b */
    private View m94733b(RecyclerView recyclerView, View view) {
        int i;
        int i2;
        boolean b = this.f64670b.mo93175b(recyclerView);
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
        ArrayList arrayList = new ArrayList(recyclerView.getChildCount());
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View childAt = recyclerView.getChildAt(i3);
            arrayList.add(new C26192a(childAt, recyclerView.getChildAdapterPosition(childAt)));
        }
        Collections.sort(arrayList, new Comparator<C26192a>() {
            /* class com.larksuite.framework.ui.p1198b.C26190c.C261911 */

            /* renamed from: a */
            public int compare(C26192a aVar, C26192a aVar2) {
                return aVar.f64677b - aVar2.f64677b;
            }
        });
        while (i2 >= 0 && i2 <= recyclerView.getChildCount() - 1) {
            View view2 = ((C26192a) arrayList.get(i2)).f64676a;
            if (!mo93169a(recyclerView, view2, view, this.f64670b.mo93174a(recyclerView))) {
                return view2;
            }
            i2 += i;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m94731a(RecyclerView recyclerView, View view) {
        View b = m94733b(recyclerView, view);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(b);
        if (childAdapterPosition == -1) {
            return false;
        }
        boolean b2 = this.f64670b.mo93175b(recyclerView);
        if (childAdapterPosition > 0 && mo93167a(childAdapterPosition, b2)) {
            View a = this.f64671c.mo93161a(recyclerView, childAdapterPosition);
            this.f64672d.mo93165a(this.f64673e, a);
            this.f64672d.mo93165a(this.f64674f, view);
            if (this.f64670b.mo93174a(recyclerView) == 1) {
                if (((b.getTop() - this.f64673e.bottom) - a.getHeight()) - this.f64673e.top < recyclerView.getPaddingTop() + view.getBottom() + this.f64674f.top + this.f64674f.bottom) {
                    return true;
                }
            } else if (((b.getLeft() - this.f64673e.right) - a.getWidth()) - this.f64673e.left < recyclerView.getPaddingLeft() + view.getRight() + this.f64674f.left + this.f64674f.right) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo93167a(int i, boolean z) {
        int i2;
        int i3;
        if (m94730a(i)) {
            return false;
        }
        long a = this.f64669a.mo93176a(i);
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
        if (!m94730a(i4)) {
            j = this.f64669a.mo93176a(i4);
        }
        if (z) {
            i3 = this.f64669a.getItemCount() - 1;
        } else {
            i3 = 0;
        }
        if (i == i3 || a != j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo93168a(View view, int i, int i2) {
        int i3;
        int i4;
        this.f64672d.mo93165a(this.f64673e, view);
        if (i == 1) {
            i4 = view.getTop();
            i3 = this.f64673e.top;
        } else {
            i4 = view.getLeft();
            i3 = this.f64673e.left;
        }
        if (i4 > i3 || this.f64669a.mo93176a(i2) < 0) {
            return false;
        }
        return true;
    }

    public C26190c(AbstractC26197e eVar, AbstractC26184a aVar, AbstractC26196b bVar, C26189a aVar2) {
        this.f64669a = eVar;
        this.f64671c = aVar;
        this.f64670b = bVar;
        this.f64672d = aVar2;
    }

    /* renamed from: a */
    public void mo93166a(Rect rect, RecyclerView recyclerView, View view, View view2, boolean z) {
        m94728a(rect, recyclerView, view, view2, this.f64670b.mo93174a(recyclerView));
        if (z && m94731a(recyclerView, view)) {
            View b = m94733b(recyclerView, view);
            m94729a(recyclerView, this.f64670b.mo93174a(recyclerView), rect, view, b, this.f64671c.mo93161a(recyclerView, recyclerView.getChildAdapterPosition(b)));
        }
    }

    /* renamed from: a */
    private void m94728a(Rect rect, RecyclerView recyclerView, View view, View view2, int i) {
        int i2;
        int i3;
        int i4;
        this.f64672d.mo93165a(this.f64673e, view);
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
            i3 = (view2.getLeft() - i2) + this.f64673e.left;
            i4 = Math.max(((view2.getTop() - i5) - view.getHeight()) - this.f64673e.bottom, m94727a(recyclerView) + this.f64673e.top);
        } else {
            int top = (view2.getTop() - i5) + this.f64673e.top;
            i3 = Math.max(((view2.getLeft() - i2) - view.getWidth()) - this.f64673e.right, m94732b(recyclerView) + this.f64673e.left);
            i4 = top;
        }
        rect.set(i3, i4, view.getWidth() + i3, view.getHeight() + i4);
    }

    /* renamed from: a */
    private void m94729a(RecyclerView recyclerView, int i, Rect rect, View view, View view2, View view3) {
        this.f64672d.mo93165a(this.f64673e, view3);
        this.f64672d.mo93165a(this.f64674f, view);
        if (i == 1) {
            int a = m94727a(recyclerView) + this.f64674f.top + this.f64674f.bottom;
            int top = ((((view2.getTop() - view3.getHeight()) - this.f64673e.bottom) - this.f64673e.top) - view.getHeight()) - a;
            if (top < a) {
                rect.top += top;
                return;
            }
            return;
        }
        int b = m94732b(recyclerView) + this.f64674f.left + this.f64674f.right;
        int left = ((((view2.getLeft() - view3.getWidth()) - this.f64673e.right) - this.f64673e.left) - view.getWidth()) - b;
        if (left < b) {
            rect.left += left;
        }
    }
}
