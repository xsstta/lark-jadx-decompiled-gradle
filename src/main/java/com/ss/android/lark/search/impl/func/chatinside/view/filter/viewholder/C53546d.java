package com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder;

import com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.d */
public class C53546d implements AbstractC53547e {
    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.AbstractC53547e
    /* renamed from: a */
    public void mo182773a(SearchFilterViewData searchFilterViewData, SearchFilterViewHolder searchFilterViewHolder) {
        m207348b(searchFilterViewData, searchFilterViewHolder);
    }

    /* renamed from: b */
    private void m207348b(SearchFilterViewData searchFilterViewData, SearchFilterViewHolder searchFilterViewHolder) {
        if (searchFilterViewData.mo182355e() == null) {
            searchFilterViewHolder.mSearchFilterView.setUnSelectedText(searchFilterViewData.mo182356f());
        } else {
            searchFilterViewHolder.mSearchFilterView.mo200827a(searchFilterViewData.mo182356f(), new ArrayList());
        }
    }
}
