package com.ss.android.lark.favorite.common.header;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.joooonho.SelectableRoundedImageView;

public class DetailHeaderHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public View f95430a;
    @BindView(8644)
    public TextView mChatNameTV;
    @BindView(8647)
    public TextView mSaveBoxSaveDateTV;
    @BindView(8649)
    public TextView mSaveBoxUserNameTV;
    @BindView(8648)
    public SelectableRoundedImageView mUserAvatarIV;

    public DetailHeaderHolder(View view, LayoutInflater layoutInflater) {
        super(view);
        this.f95430a = view;
        ButterKnife.bind(this, view);
    }
}
