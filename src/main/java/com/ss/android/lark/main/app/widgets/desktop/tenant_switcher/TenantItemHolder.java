package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;

public class TenantItemHolder extends RecyclerView.ViewHolder {
    @BindView(6667)
    public LKUIRoundedImageView mAvatar;
    @BindView(7076)
    public View mCurrentUserIndicator;
    @BindView(7286)
    public View mMaskView;

    public TenantItemHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
