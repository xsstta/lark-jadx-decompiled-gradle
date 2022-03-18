package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class ProfileViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileViewHolder f128417a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ProfileViewHolder profileViewHolder = this.f128417a;
        if (profileViewHolder != null) {
            this.f128417a = null;
            profileViewHolder.mContentView = null;
            profileViewHolder.mAvatarIV = null;
            profileViewHolder.mChatterNameTV = null;
            profileViewHolder.mTagTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileViewHolder_ViewBinding(ProfileViewHolder profileViewHolder, View view) {
        this.f128417a = profileViewHolder;
        profileViewHolder.mContentView = Utils.findRequiredView(view, R.id.content_view, "field 'mContentView'");
        profileViewHolder.mAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.avatar_iv, "field 'mAvatarIV'", LKUIRoundedImageView.class);
        profileViewHolder.mChatterNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.chatter_name_tv, "field 'mChatterNameTV'", TextView.class);
        profileViewHolder.mTagTV = (TextView) Utils.findRequiredViewAsType(view, R.id.profile_tag_tv, "field 'mTagTV'", TextView.class);
    }
}
