package com.ss.android.lark.money.redpacket.history.fragment.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RedPacketHistoryEmptyHolder extends RecyclerView.ViewHolder {
    @BindView(6593)
    public TextView mEmptyTV;

    public RedPacketHistoryEmptyHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
