package com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder;

import android.graphics.Bitmap;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.a */
public class C53543a implements AbstractC53547e {
    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder.AbstractC53547e
    /* renamed from: a */
    public void mo182773a(SearchFilterViewData searchFilterViewData, SearchFilterViewHolder searchFilterViewHolder) {
        m207342b(searchFilterViewData, searchFilterViewHolder);
    }

    /* renamed from: b */
    private void m207342b(SearchFilterViewData searchFilterViewData, SearchFilterViewHolder searchFilterViewHolder) {
        List<Bitmap> a = searchFilterViewData.mo182347a();
        if (CollectionUtils.isEmpty(a)) {
            searchFilterViewHolder.mSearchFilterView.setUnSelectedText(searchFilterViewData.mo182356f());
            return;
        }
        searchFilterViewHolder.mSearchFilterView.setDisplayIconLimit(3);
        searchFilterViewHolder.mSearchFilterView.mo200827a(searchFilterViewData.mo182356f(), a);
    }
}
