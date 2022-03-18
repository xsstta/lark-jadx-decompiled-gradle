package com.ss.android.lark.money.redpacket.history.fragment.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;

public class RedPacketHistoryHolder extends RecyclerView.ViewHolder {
    @BindView(6353)
    public LKUIRoundedImageView mAvatarIV;
    @BindView(6518)
    public TextView mDateTV;
    @BindView(6922)
    public TextView mMoneyTV;
    @BindView(6967)
    public TextView mNameTV;
    @BindView(7275)
    public TextView mStatusTV;

    public RedPacketHistoryHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
