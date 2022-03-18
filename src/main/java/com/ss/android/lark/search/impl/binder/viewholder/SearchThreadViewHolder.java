package com.ss.android.lark.search.impl.binder.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;

public class SearchThreadViewHolder extends RecyclerView.ViewHolder {
    @BindView(6839)
    public ImageView mDelayTagIV;
    @BindView(7810)
    public ImageView mThreadAvatarIV;
    @BindView(7811)
    public EllipsizedEmojiconTextView mThreadDescTV;
    @BindView(6949)
    public ImageView mThreadIcon;
    @BindView(7812)
    public TextView mThreadNameTV;
    @BindView(7813)
    public TextView mThreadTimeTV;

    public SearchThreadViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }
}
