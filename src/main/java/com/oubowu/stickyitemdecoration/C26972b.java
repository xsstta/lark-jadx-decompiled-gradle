package com.oubowu.stickyitemdecoration;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: com.oubowu.stickyitemdecoration.b */
public class C26972b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f66934a;

    /* renamed from: b */
    private int f66935b;

    /* renamed from: c */
    private int f66936c;

    /* renamed from: d */
    private int[] f66937d;

    /* renamed from: e */
    private RecyclerView.Adapter f66938e;

    /* renamed from: f */
    private StickyHeadContainer f66939f;

    /* renamed from: g */
    private boolean f66940g = true;

    /* renamed from: h */
    private AbstractC26971a f66941h;

    /* renamed from: a */
    public void mo95885a() {
        this.f66939f.mo95873a();
    }

    /* renamed from: a */
    public void mo95886a(AbstractC26971a aVar) {
        this.f66941h = aVar;
    }

    /* renamed from: b */
    private boolean m98020b(int i) {
        if (this.f66934a == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m98015a(int i) {
        while (i >= 0) {
            if (m98020b(this.f66938e.getItemViewType(i))) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: b */
    private void m98019b(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f66938e != adapter) {
            this.f66938e = adapter;
            this.f66936c = -1;
            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                /* class com.oubowu.stickyitemdecoration.C26972b.C269731 */

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    C26972b.this.mo95885a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    C26972b.this.mo95885a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    C26972b.this.mo95885a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i, int i2) {
                    C26972b.this.mo95885a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i, int i2, int i3) {
                    C26972b.this.mo95885a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2, Object obj) {
                    C26972b.this.mo95885a();
                }
            });
        }
    }

    /* renamed from: a */
    private int m98016a(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.mo7259c()];
        this.f66937d = iArr;
        staggeredGridLayoutManager.mo7253a(iArr);
        int i = Integer.MAX_VALUE;
        for (int i2 : this.f66937d) {
            i = Math.min(i2, i);
        }
        return i;
    }

    /* renamed from: a */
    private void m98017a(RecyclerView recyclerView) {
        int a = m98016a(recyclerView.getLayoutManager());
        this.f66935b = a;
        int a2 = m98015a(a);
        if (this.f66936c != a2) {
            this.f66936c = a2;
        }
    }

    public C26972b(StickyHeadContainer stickyHeadContainer, int i) {
        this.f66939f = stickyHeadContainer;
        this.f66934a = i;
    }

    /* renamed from: a */
    private boolean m98018a(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        return m98020b(this.f66938e.getItemViewType(childAdapterPosition));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        super.onDraw(canvas, recyclerView, state);
        m98019b(recyclerView);
        if (this.f66938e != null) {
            m98017a(recyclerView);
            if (!this.f66940g || this.f66935b < (i = this.f66936c) || i == -1) {
                AbstractC26971a aVar = this.f66941h;
                if (aVar != null) {
                    aVar.mo44891a();
                    return;
                }
                return;
            }
            View findChildViewUnder = recyclerView.findChildViewUnder(((float) canvas.getWidth()) / 2.0f, ((float) this.f66939f.getChildHeight()) + 0.01f);
            this.f66939f.mo95875b(this.f66936c);
            if (!m98018a(recyclerView, findChildViewUnder) || findChildViewUnder.getTop() <= 0) {
                i2 = 0;
            } else {
                i2 = findChildViewUnder.getTop() - this.f66939f.getChildHeight();
            }
            AbstractC26971a aVar2 = this.f66941h;
            if (aVar2 != null) {
                aVar2.mo44892a(i2);
            }
        }
    }
}
