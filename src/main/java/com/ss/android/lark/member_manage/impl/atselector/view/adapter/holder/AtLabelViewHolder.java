package com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AtLabelViewHolder extends RecyclerView.ViewHolder {
    @BindView(6804)
    public TextView mLabelTV;

    public AtLabelViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
