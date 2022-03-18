package com.ss.android.lark.widget.recyclerview.p2965b;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.recyclerview.FoldedLayoutManager;

/* renamed from: com.ss.android.lark.widget.recyclerview.b.b */
public class C58981b extends ItemTouchHelper.AbstractC1303a {

    /* renamed from: a */
    private AbstractC58982a f146164a;

    /* renamed from: b */
    private boolean f146165b;

    /* renamed from: c */
    private boolean f146166c;

    /* renamed from: com.ss.android.lark.widget.recyclerview.b.b$a */
    public interface AbstractC58982a {
        /* renamed from: a */
        void mo137318a(int i);

        /* renamed from: a */
        boolean mo137320a(RecyclerView recyclerView, int i, int i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public boolean mo6577a() {
        return this.f146165b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6585b() {
        return this.f146166c;
    }

    /* renamed from: a */
    public void mo200095a(boolean z) {
        this.f146165b = z;
    }

    /* renamed from: b */
    public void mo200096b(boolean z) {
        this.f146166c = z;
    }

    public C58981b(AbstractC58982a aVar) {
        this.f146164a = aVar;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC58982a aVar = this.f146164a;
        if (aVar != null) {
            aVar.mo137318a(viewHolder.getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int i = 0;
        if (layoutManager instanceof GridLayoutManager) {
            return m5979b(15, 0);
        }
        int i2 = 12;
        if (layoutManager instanceof LinearLayoutManager) {
            int orientation = ((LinearLayoutManager) layoutManager).getOrientation();
            if (orientation == 0) {
                i = 12;
                i2 = 3;
            } else if (orientation == 1) {
                i = 3;
            } else {
                i2 = 0;
            }
            return m5979b(i, i2);
        } else if (layoutManager instanceof FoldedLayoutManager) {
            return m5979b(12, 3);
        } else {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        AbstractC58982a aVar = this.f146164a;
        if (aVar != null) {
            return aVar.mo137320a(recyclerView, viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        return false;
    }
}
