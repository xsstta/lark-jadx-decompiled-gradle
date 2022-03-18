package com.bytedance.ee.bear.edit.component.toolbar2;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.j */
public class C7642j extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private int f20735a;

    /* renamed from: b */
    private int f20736b;

    /* renamed from: c */
    private AbstractC7643a f20737c;

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.j$a */
    public interface AbstractC7643a {
        /* renamed from: a */
        void mo29947a(int i);
    }

    /* renamed from: a */
    public void mo30033a(AbstractC7643a aVar) {
        this.f20737c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || this.f20737c == null) {
            C13479a.m54758a("RecyclerViewScrollBottomListener", "layoutManager or scrollPositionListener is null");
            return;
        }
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f20735a = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
            this.f20736b = gridLayoutManager.findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f20735a = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            this.f20736b = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        }
        int childCount = layoutManager.getChildCount();
        int itemCount = layoutManager.getItemCount();
        if (childCount > 0 && this.f20736b >= itemCount - 1) {
            this.f20737c.mo29947a(2);
        } else if (childCount <= 0 || this.f20735a != 0) {
            this.f20737c.mo29947a(1);
        } else {
            this.f20737c.mo29947a(0);
        }
    }
}
