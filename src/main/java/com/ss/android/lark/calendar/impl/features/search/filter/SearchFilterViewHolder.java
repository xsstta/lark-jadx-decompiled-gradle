package com.ss.android.lark.calendar.impl.features.search.filter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchFilterViewHolder extends RecyclerView.ViewHolder {
    @BindView(10860)
    public View mSearchFilterFooterHolder;
    @BindView(10861)
    public View mSearchFilterHeaderHolder;
    @BindView(10863)
    public SearchFilterView mSearchFilterView;

    public SearchFilterViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
