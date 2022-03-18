package com.ss.android.lark.calendar.impl.features.search.filter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class SearchFilterViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchFilterViewHolder f82886a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SearchFilterViewHolder searchFilterViewHolder = this.f82886a;
        if (searchFilterViewHolder != null) {
            this.f82886a = null;
            searchFilterViewHolder.mSearchFilterView = null;
            searchFilterViewHolder.mSearchFilterHeaderHolder = null;
            searchFilterViewHolder.mSearchFilterFooterHolder = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchFilterViewHolder_ViewBinding(SearchFilterViewHolder searchFilterViewHolder, View view) {
        this.f82886a = searchFilterViewHolder;
        searchFilterViewHolder.mSearchFilterView = (SearchFilterView) Utils.findRequiredViewAsType(view, R.id.search_filter_view, "field 'mSearchFilterView'", SearchFilterView.class);
        searchFilterViewHolder.mSearchFilterHeaderHolder = Utils.findRequiredView(view, R.id.search_filter_header_holder, "field 'mSearchFilterHeaderHolder'");
        searchFilterViewHolder.mSearchFilterFooterHolder = Utils.findRequiredView(view, R.id.search_filter_footer_holder, "field 'mSearchFilterFooterHolder'");
    }
}
