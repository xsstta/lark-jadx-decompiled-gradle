package com.ss.android.lark.sticker.ui.emoticon.manager;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.b */
public class C55161b extends ItemTouchHelper.AbstractC1303a {

    /* renamed from: a */
    private AbstractC55162a f136196a;

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.b$a */
    public interface AbstractC55162a {
        /* renamed from: a */
        boolean mo188089a(int i, int i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public long mo6571a(RecyclerView recyclerView, int i, float f, float f2) {
        return i == 8 ? 200 : 350;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public boolean mo6577a() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6585b() {
        return false;
    }

    public C55161b(AbstractC55162a aVar) {
        this.f136196a = aVar;
    }

    /* renamed from: a */
    private int m214048a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof StaggeredGridLayoutManager)) {
            return 15;
        }
        return 3;
    }

    /* renamed from: a */
    private boolean m214049a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0) {
            viewHolder.itemView.setBackgroundResource(R.drawable.ic_sticker_set_item_bg);
            viewHolder.itemView.findViewById(R.id.sticker_set_view_bottom_line).setVisibility(8);
        }
        super.mo6584b(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return m5979b(m214048a(recyclerView), 48);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: e */
    public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.mo6591e(recyclerView, viewHolder);
        viewHolder.itemView.setBackgroundColor(UIUtils.getColor(viewHolder.itemView.getContext(), R.color.bg_body));
        viewHolder.itemView.findViewById(R.id.sticker_set_view_bottom_line).setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (m214049a(viewHolder, viewHolder2) || !this.f136196a.mo188089a(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition())) {
            return false;
        }
        return true;
    }
}
