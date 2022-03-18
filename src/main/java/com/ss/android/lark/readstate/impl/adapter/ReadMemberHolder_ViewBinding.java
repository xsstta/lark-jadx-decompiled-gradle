package com.ss.android.lark.readstate.impl.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

public class ReadMemberHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ReadMemberHolder f131310a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ReadMemberHolder readMemberHolder = this.f131310a;
        if (readMemberHolder != null) {
            this.f131310a = null;
            readMemberHolder.mSingleAvatarIV = null;
            readMemberHolder.mNameTV = null;
            readMemberHolder.dingImage = null;
            readMemberHolder.atImage = null;
            readMemberHolder.divider = null;
            readMemberHolder.userStatus = null;
            readMemberHolder.shadow = null;
            readMemberHolder.readState = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ReadMemberHolder_ViewBinding(ReadMemberHolder readMemberHolder, View view) {
        this.f131310a = readMemberHolder;
        readMemberHolder.mSingleAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.single_avatar, "field 'mSingleAvatarIV'", LKUIRoundedImageView.class);
        readMemberHolder.mNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameTV'", TextView.class);
        readMemberHolder.dingImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.ding_image, "field 'dingImage'", ImageView.class);
        readMemberHolder.atImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.at_image, "field 'atImage'", ImageView.class);
        readMemberHolder.divider = Utils.findRequiredView(view, R.id.divider, "field 'divider'");
        readMemberHolder.userStatus = (UserStatusLinearLayout) Utils.findRequiredViewAsType(view, R.id.user_status, "field 'userStatus'", UserStatusLinearLayout.class);
        readMemberHolder.shadow = Utils.findRequiredView(view, R.id.shadow, "field 'shadow'");
        readMemberHolder.readState = (TextView) Utils.findRequiredViewAsType(view, R.id.read_state, "field 'readState'", TextView.class);
    }
}
