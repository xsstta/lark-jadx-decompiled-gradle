package com.ss.android.lark.search.impl.binder;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53343b;

/* renamed from: com.ss.android.lark.search.impl.binder.c */
public class C53355c {

    /* renamed from: a */
    private SparseArray<AbstractC53349a> f131867a;

    /* renamed from: b */
    private final EmptyBinder f131868b;

    /* renamed from: a */
    public AbstractC53349a mo181996a(int i) {
        AbstractC53349a aVar = this.f131867a.get(i);
        if (aVar != null) {
            return aVar;
        }
        Log.m165383e("LarkSearch.Search.SearchBinderFactory", "result type not found");
        return this.f131868b;
    }

    public C53355c(Context context) {
        SparseArray<AbstractC53349a> sparseArray = new SparseArray<>(2);
        this.f131867a = sparseArray;
        sparseArray.put(1, new C53357d(context));
        this.f131867a.put(8, new C53360e(context));
        this.f131868b = new EmptyBinder(context);
    }

    /* renamed from: a */
    public void mo181998a(boolean z) {
        int size = this.f131867a.size();
        for (int i = 0; i < size; i++) {
            AbstractC53349a valueAt = this.f131867a.valueAt(i);
            if (valueAt != null) {
                valueAt.mo181990a(z);
            }
        }
    }

    /* renamed from: a */
    public RecyclerView.ViewHolder mo181995a(int i, ViewGroup viewGroup) {
        return mo181996a(i).mo181985a(viewGroup);
    }

    /* renamed from: a */
    public void mo181997a(RecyclerView.ViewHolder viewHolder, SearchBaseViewData searchBaseViewData, AbstractC53343b bVar, int i) {
        mo181996a(searchBaseViewData.getSearchResultType()).mo181986a(viewHolder, searchBaseViewData, bVar, i);
    }
}
