package com.ss.android.lark.main.app.drawer.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.imageview.LKUIBadgeView;

public class TenantItemHolder extends RecyclerView.ViewHolder {
    @BindView(6667)
    public SelectableRoundedImageView mAvatar;
    @BindView(7076)
    public View mCurrentUserIndicator;
    @BindView(7771)
    public LKUIBadgeView mTenantAvatarBadge;
    @BindView(7902)
    public TextView mTenantName;
    @BindView(7127)
    public ImageView unvalidTipView;

    public TenantItemHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
