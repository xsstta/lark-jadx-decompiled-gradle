package com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.searchfilter.SearchFilterView;

public class SearchFilterViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SearchFilterViewHolder f132263a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SearchFilterViewHolder searchFilterViewHolder = this.f132263a;
        if (searchFilterViewHolder != null) {
            this.f132263a = null;
            searchFilterViewHolder.mSearchFilterView = null;
            searchFilterViewHolder.mSearchFilterHeaderHolder = null;
            searchFilterViewHolder.mSearchFilterFooterHolder = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SearchFilterViewHolder_ViewBinding(SearchFilterViewHolder searchFilterViewHolder, View view) {
        this.f132263a = searchFilterViewHolder;
        searchFilterViewHolder.mSearchFilterView = (SearchFilterView) Utils.findRequiredViewAsType(view, R.id.search_filter_view, "field 'mSearchFilterView'", SearchFilterView.class);
        searchFilterViewHolder.mSearchFilterHeaderHolder = Utils.findRequiredView(view, R.id.search_filter_header_holder, "field 'mSearchFilterHeaderHolder'");
        searchFilterViewHolder.mSearchFilterFooterHolder = Utils.findRequiredView(view, R.id.search_filter_footer_holder, "field 'mSearchFilterFooterHolder'");
    }
}
