package com.ss.android.appcenter.business.activity.appsort;

import android.graphics.Canvas;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.activity.appsort.d */
public class C27687d extends ItemTouchHelper.AbstractC1303a {
    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6569a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        return (i2 > 0 ? 1 : -1) * 10;
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
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return m5979b(15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public void mo6584b(RecyclerView.ViewHolder viewHolder, int i) {
        super.mo6584b(viewHolder, i);
        if (i == 2 && viewHolder != null) {
            new C27683b(viewHolder.itemView.getContext(), viewHolder.itemView).mo98634a();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: e */
    public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.mo6591e(recyclerView, viewHolder);
        if (recyclerView != null) {
            try {
                ((SortAdapter) recyclerView.getAdapter()).notifyDataSetChanged();
            } catch (IllegalStateException e) {
                C28184h.m103247a("App_Add_Page", "clearView notifyDataSetChanged exception.", e);
            }
        }
    }

    /* renamed from: a */
    private float m101197a(int i, int i2, float f) {
        return Math.max(f, ((-(((float) (i2 - i)) + 0.5f)) * SortAdapter.f69142a) - (((float) i) * SortAdapter.f69143b));
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: b */
    public boolean mo6586b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        List<ItemInfo> list;
        SortAdapter sortAdapter = (SortAdapter) recyclerView.getAdapter();
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        int k = sortAdapter.mo100102k(adapterPosition);
        int k2 = sortAdapter.mo100102k(adapterPosition2);
        int j = sortAdapter.mo100101j(adapterPosition);
        int j2 = sortAdapter.mo100101j(adapterPosition2);
        if (k != k2 || j != j2) {
            return false;
        }
        int e = sortAdapter.mo98621e(k);
        int b = sortAdapter.mo100097b(k, adapterPosition);
        int b2 = sortAdapter.mo100097b(k2, adapterPosition2);
        if (e == 2) {
            list = sortAdapter.mo98373a();
        } else {
            list = sortAdapter.mo98619c();
        }
        if (b < b2) {
            while (b < b2) {
                int i = b + 1;
                Collections.swap(list, b, i);
                b = i;
            }
        } else {
            while (b > b2) {
                Collections.swap(list, b, b - 1);
                b--;
            }
        }
        recyclerView.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6573a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        if (i == 2) {
            int adapterPosition = viewHolder.getAdapterPosition();
            super.mo6573a(canvas, recyclerView, viewHolder, BitmapDescriptorFactory.HUE_RED, m101197a(((SortAdapter) recyclerView.getAdapter()).mo100102k(adapterPosition), adapterPosition, f2), i, z);
        }
    }
}
