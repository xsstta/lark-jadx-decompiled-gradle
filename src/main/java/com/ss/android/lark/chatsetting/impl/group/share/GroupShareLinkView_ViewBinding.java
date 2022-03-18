package com.ss.android.lark.chatsetting.impl.group.share;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.RotateLoadingView;

public class GroupShareLinkView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupShareLinkView f90289a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupShareLinkView groupShareLinkView = this.f90289a;
        if (groupShareLinkView != null) {
            this.f90289a = null;
            groupShareLinkView.mGroupAvatarIV = null;
            groupShareLinkView.mGroupTitleTV = null;
            groupShareLinkView.mGroupDescTV = null;
            groupShareLinkView.mTokenLinkTV = null;
            groupShareLinkView.mTokenValidDateTV = null;
            groupShareLinkView.mGroupModifyShareCardValidityPeriod = null;
            groupShareLinkView.mGroupAddTipTV = null;
            groupShareLinkView.mContentView = null;
            groupShareLinkView.mLoadingView = null;
            groupShareLinkView.mContentEmptyView = null;
            groupShareLinkView.mContentEmptyTipTV = null;
            groupShareLinkView.mContentRetryTipTV = null;
            groupShareLinkView.mLeftActionBtn = null;
            groupShareLinkView.mRightActionBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupShareLinkView_ViewBinding(GroupShareLinkView groupShareLinkView, View view) {
        this.f90289a = groupShareLinkView;
        groupShareLinkView.mGroupAvatarIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.group_avatar, "field 'mGroupAvatarIV'", LKUIRoundedImageView.class);
        groupShareLinkView.mGroupTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_name, "field 'mGroupTitleTV'", TextView.class);
        groupShareLinkView.mGroupDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_desc, "field 'mGroupDescTV'", TextView.class);
        groupShareLinkView.mTokenLinkTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_content_tv, "field 'mTokenLinkTV'", TextView.class);
        groupShareLinkView.mTokenValidDateTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_content_valid_tip, "field 'mTokenValidDateTV'", TextView.class);
        groupShareLinkView.mGroupModifyShareCardValidityPeriod = (TextView) Utils.findRequiredViewAsType(view, R.id.share_link_group_modify_share_card_validity_period, "field 'mGroupModifyShareCardValidityPeriod'", TextView.class);
        groupShareLinkView.mGroupAddTipTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_content_add_tip, "field 'mGroupAddTipTV'", TextView.class);
        groupShareLinkView.mContentView = Utils.findRequiredView(view, R.id.group_content_layout, "field 'mContentView'");
        groupShareLinkView.mLoadingView = (RotateLoadingView) Utils.findRequiredViewAsType(view, R.id.group_loading, "field 'mLoadingView'", RotateLoadingView.class);
        groupShareLinkView.mContentEmptyView = Utils.findRequiredView(view, R.id.group_empty_layout, "field 'mContentEmptyView'");
        groupShareLinkView.mContentEmptyTipTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_failed_tip, "field 'mContentEmptyTipTV'", TextView.class);
        groupShareLinkView.mContentRetryTipTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_load_again, "field 'mContentRetryTipTV'", TextView.class);
        groupShareLinkView.mLeftActionBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.group_share_left_btn, "field 'mLeftActionBtn'", TextView.class);
        groupShareLinkView.mRightActionBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.group_share_right_btn, "field 'mRightActionBtn'", TextView.class);
    }
}
