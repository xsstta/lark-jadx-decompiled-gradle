package com.ss.android.lark.chatsetting.impl.group.avatar.mvp;

import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.DefaultAvatarView;
import com.ss.android.lark.chatsetting.impl.group.avatar.view.LineBreakRadioGroup;
import com.ss.android.lark.ui.CommonTitleBar;

public class AvatarEditView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarEditView f89325a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AvatarEditView avatarEditView = this.f89325a;
        if (avatarEditView != null) {
            this.f89325a = null;
            avatarEditView.mColorList = null;
            avatarEditView.mDefaultAvatar = null;
            avatarEditView.mRecommendTitleGroup = null;
            avatarEditView.mTitleBar = null;
            avatarEditView.mRoundedAvatar = null;
            avatarEditView.mEditText = null;
            avatarEditView.mCameraBtn = null;
            avatarEditView.mCustomizedTextTv = null;
            avatarEditView.mSelectColorTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarEditView_ViewBinding(AvatarEditView avatarEditView, View view) {
        this.f89325a = avatarEditView;
        avatarEditView.mColorList = (GridView) Utils.findRequiredViewAsType(view, R.id.color_list, "field 'mColorList'", GridView.class);
        avatarEditView.mDefaultAvatar = (DefaultAvatarView) Utils.findRequiredViewAsType(view, R.id.text_avatar, "field 'mDefaultAvatar'", DefaultAvatarView.class);
        avatarEditView.mRecommendTitleGroup = (LineBreakRadioGroup) Utils.findRequiredViewAsType(view, R.id.recommended_word_group, "field 'mRecommendTitleGroup'", LineBreakRadioGroup.class);
        avatarEditView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleBar'", CommonTitleBar.class);
        avatarEditView.mRoundedAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.img_avatar, "field 'mRoundedAvatar'", LKUIRoundedImageView.class);
        avatarEditView.mEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.edit_title_text, "field 'mEditText'", EditText.class);
        avatarEditView.mCameraBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.img_camera, "field 'mCameraBtn'", ImageView.class);
        avatarEditView.mCustomizedTextTv = (TextView) Utils.findRequiredViewAsType(view, R.id.customized_text_tv, "field 'mCustomizedTextTv'", TextView.class);
        avatarEditView.mSelectColorTv = (TextView) Utils.findRequiredViewAsType(view, R.id.select_color_tv, "field 'mSelectColorTv'", TextView.class);
    }
}
