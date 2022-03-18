package com.ss.android.lark.search.impl.func.chatinside.view.filter.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ss.android.lark.widget.searchfilter.SearchFilterView;

public class SearchFilterViewHolder extends RecyclerView.ViewHolder {
    @BindView(7607)
    public View mSearchFilterFooterHolder;
    @BindView(7608)
    public View mSearchFilterHeaderHolder;
    @BindView(7610)
    public SearchFilterView mSearchFilterView;

    public SearchFilterViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
