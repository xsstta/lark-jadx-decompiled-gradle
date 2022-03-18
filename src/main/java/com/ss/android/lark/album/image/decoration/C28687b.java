package com.ss.android.lark.album.image.decoration;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.lark.album.image.AbstractC28693f;

/* renamed from: com.ss.android.lark.album.image.decoration.b */
public class C28687b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f72181a;

    /* renamed from: b */
    private int f72182b;

    /* renamed from: c */
    private int f72183c;

    /* renamed from: d */
    private int[] f72184d;

    /* renamed from: e */
    private RecyclerView.Adapter f72185e;

    /* renamed from: f */
    private StickyHeadContainer f72186f;

    /* renamed from: g */
    private boolean f72187g = true;

    /* renamed from: h */
    private AbstractC28693f f72188h;

    /* renamed from: a */
    public void mo102054a() {
        this.f72186f.mo102042a();
    }

    /* renamed from: a */
    public void mo102055a(AbstractC28693f fVar) {
        this.f72188h = fVar;
    }

    /* renamed from: b */
    private boolean m105167b(int i) {
        if (this.f72181a == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m105162a(int i) {
        while (i >= 0) {
            if (m105167b(this.f72185e.getItemViewType(i))) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: b */
    private void m105166b(RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (this.f72185e != adapter) {
            this.f72185e = adapter;
            this.f72183c = -1;
            adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                /* class com.ss.android.lark.album.image.decoration.C28687b.C286881 */

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    C28687b.this.mo102054a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2) {
                    C28687b.this.mo102054a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i, int i2) {
                    C28687b.this.mo102054a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i, int i2) {
                    C28687b.this.mo102054a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i, int i2, int i3) {
                    C28687b.this.mo102054a();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i, int i2, Object obj) {
                    C28687b.this.mo102054a();
                }
            });
        }
    }

    /* renamed from: a */
    private int m105163a(RecyclerView.LayoutManager layoutManager) {
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
        this.f72184d = iArr;
        staggeredGridLayoutManager.mo7253a(iArr);
        int i = Integer.MAX_VALUE;
        for (int i2 : this.f72184d) {
            i = Math.min(i2, i);
        }
        return i;
    }

    /* renamed from: a */
    private void m105164a(RecyclerView recyclerView) {
        int a = m105163a(recyclerView.getLayoutManager());
        this.f72182b = a;
        int a2 = m105162a(a);
        if (a2 >= 0 && this.f72183c != a2) {
            this.f72183c = a2;
        }
    }

    public C28687b(StickyHeadContainer stickyHeadContainer, int i) {
        this.f72186f = stickyHeadContainer;
        this.f72181a = i;
    }

    /* renamed from: a */
    private boolean m105165a(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return false;
        }
        return m105167b(this.f72185e.getItemViewType(childAdapterPosition));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        super.onDraw(canvas, recyclerView, state);
        m105166b(recyclerView);
        if (this.f72185e != null) {
            m105164a(recyclerView);
            if (!this.f72187g || this.f72182b < (i = this.f72183c) || i == -1) {
                AbstractC28693f fVar = this.f72188h;
                if (fVar != null) {
                    fVar.mo101984a();
                    return;
                }
                return;
            }
            View findChildViewUnder = recyclerView.findChildViewUnder((float) (canvas.getWidth() / 2), ((float) this.f72186f.getChildHeight()) + 0.01f);
            this.f72186f.mo102044b(this.f72183c);
            if (!m105165a(recyclerView, findChildViewUnder) || findChildViewUnder.getTop() <= 0) {
                i2 = 0;
            } else {
                i2 = findChildViewUnder.getTop() - this.f72186f.getChildHeight();
            }
            AbstractC28693f fVar2 = this.f72188h;
            if (fVar2 != null) {
                fVar2.mo101985a(i2);
            }
        }
    }
}
