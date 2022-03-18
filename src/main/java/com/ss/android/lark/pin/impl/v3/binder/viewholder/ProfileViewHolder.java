package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;

public class ProfileViewHolder extends AbstractC51540b.C51541a {
    @BindView(6412)
    public LKUIRoundedImageView mAvatarIV;
    @BindView(6493)
    public TextView mChatterNameTV;
    @BindView(6550)
    public View mContentView;
    @BindView(7143)
    public TextView mTagTV;

    private ProfileViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.viewholder.ProfileViewHolder$a */
    public static class C51599a {
        /* renamed from: a */
        public static ProfileViewHolder m200237a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new ProfileViewHolder(layoutInflater.inflate(R.layout.chatpin_item_profile, viewGroup, false));
        }
    }
}
