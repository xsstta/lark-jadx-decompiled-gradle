package com.ss.android.lark.tab.space.list.mvp.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.adapter.BaseCommonListTabBinder;
import com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabBinder;

/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.d */
public class C55309d {

    /* renamed from: a */
    private final Context f136505a;

    /* renamed from: b */
    private final SparseArray<BaseCommonListTabBinder<? extends RecyclerView.ViewHolder, ? extends BaseListViewData>> f136506b;

    /* renamed from: a */
    private BaseCommonListTabBinder<? extends RecyclerView.ViewHolder, ? extends BaseListViewData> m214513a(int i) {
        return this.f136506b.get(i);
    }

    public C55309d(Context context) {
        SparseArray<BaseCommonListTabBinder<? extends RecyclerView.ViewHolder, ? extends BaseListViewData>> sparseArray = new SparseArray<>(5);
        this.f136506b = sparseArray;
        this.f136505a = context;
        sparseArray.put(1, new SpaceListTabBinder(context));
    }

    /* renamed from: a */
    public void mo188539a(boolean z) {
        int size = this.f136506b.size();
        for (int i = 0; i < size; i++) {
            BaseCommonListTabBinder<? extends RecyclerView.ViewHolder, ? extends BaseListViewData> valueAt = this.f136506b.valueAt(i);
            if (valueAt != null) {
                valueAt.mo188520a(z);
            }
        }
    }

    /* renamed from: a */
    public RecyclerView.ViewHolder mo188537a(int i, ViewGroup viewGroup) {
        return m214513a(i).mo188518a(viewGroup);
    }

    /* renamed from: a */
    public void mo188538a(RecyclerView.ViewHolder viewHolder, BaseListViewData baseListViewData, OnItemListener onItemListener, int i) {
        m214513a(baseListViewData.getType()).mo188519a(viewHolder, baseListViewData, onItemListener, i);
    }
}
