package com.ss.android.lark.search.impl.func.chatinside.view.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SpacePickViewHolder extends RecyclerView.ViewHolder {
    @BindView(7695)
    public ImageView mSpaceTypeIV;
    @BindView(7698)
    public TextView mSpaceTypeTV;

    public SpacePickViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
