package com.chad.library.adapter.base.p935b;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.AbstractC20916a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.chad.library.adapter.base.b.a */
public class C20922a extends ItemTouchHelper.AbstractC1303a {

    /* renamed from: a */
    private AbstractC20916a f51242a;

    /* renamed from: b */
    private float f51243b = 0.1f;

    /* renamed from: c */
    private float f51244c = 0.7f;

    /* renamed from: d */
    private int f51245d = 15;

    /* renamed from: e */
    private int f51246e = 32;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public boolean mo6577a() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6585b() {
        return this.f51242a.mo18916a();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public float mo6568a(RecyclerView.ViewHolder viewHolder) {
        return this.f51244c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public float mo6580b(RecyclerView.ViewHolder viewHolder) {
        return this.f51243b;
    }

    /* renamed from: c */
    public void mo70731c(float f) {
        this.f51243b = f;
    }

    /* renamed from: a */
    public void mo70730a(int i) {
        this.f51245d = i;
    }

    public C20922a(AbstractC20916a aVar) {
        this.f51242a = aVar;
    }

    /* renamed from: c */
    private boolean m76237c(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 273 || itemViewType == 546 || itemViewType == 819 || itemViewType == 1365) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6575a(RecyclerView.ViewHolder viewHolder, int i) {
        if (!m76237c(viewHolder)) {
            this.f51242a.mo70722f(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (m76237c(viewHolder)) {
            return m5979b(0, 0);
        }
        return m5979b(this.f51245d, this.f51246e);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2 && !m76237c(viewHolder)) {
            this.f51242a.mo70719c(viewHolder);
            viewHolder.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, true);
        } else if (i == 1 && !m76237c(viewHolder)) {
            this.f51242a.mo70720d(viewHolder);
            viewHolder.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, true);
        }
        super.mo6584b(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: e */
    public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.mo6591e(recyclerView, viewHolder);
        if (!m76237c(viewHolder)) {
            if (viewHolder.itemView.getTag(R.id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(R.id.BaseQuickAdapter_dragging_support)).booleanValue()) {
                this.f51242a.mo43415a(viewHolder);
                viewHolder.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, false);
            }
            if (viewHolder.itemView.getTag(R.id.BaseQuickAdapter_swiping_support) != null && ((Boolean) viewHolder.itemView.getTag(R.id.BaseQuickAdapter_swiping_support)).booleanValue()) {
                this.f51242a.mo70721e(viewHolder);
                viewHolder.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() == viewHolder2.getItemViewType()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6576a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.mo6576a(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        this.f51242a.mo70715a(viewHolder, viewHolder2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public void mo6582b(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.mo6582b(canvas, recyclerView, viewHolder, f, f2, i, z);
        if (i == 1 && !m76237c(viewHolder)) {
            View view = viewHolder.itemView;
            canvas.save();
            if (f > BitmapDescriptorFactory.HUE_RED) {
                canvas.clipRect((float) view.getLeft(), (float) view.getTop(), ((float) view.getLeft()) + f, (float) view.getBottom());
                canvas.translate((float) view.getLeft(), (float) view.getTop());
            } else {
                canvas.clipRect(((float) view.getRight()) + f, (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
                canvas.translate(((float) view.getRight()) + f, (float) view.getTop());
            }
            this.f51242a.mo70713a(canvas, viewHolder, f, f2, z);
            canvas.restore();
        }
    }
}
