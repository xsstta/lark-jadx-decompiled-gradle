package com.ss.android.lark.chatsetting.impl.group.info;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class GroupInfoView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupInfoView f89369a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupInfoView groupInfoView = this.f89369a;
        if (groupInfoView != null) {
            this.f89369a = null;
            groupInfoView.mGroupPhotoIV = null;
            groupInfoView.mGroupPhotoRegion = null;
            groupInfoView.mGroupPhotoArrowIV = null;
            groupInfoView.mGroupPhotoDescTv = null;
            groupInfoView.mGroupNameTV = null;
            groupInfoView.mGroupNameRegion = null;
            groupInfoView.mGroupNameArrowIV = null;
            groupInfoView.mGroupNameDescTv = null;
            groupInfoView.mGroupDescribeTV = null;
            groupInfoView.mGroupDescribeRegion = null;
            groupInfoView.mGroupDescArrowIV = null;
            groupInfoView.mGroupDescTv = null;
            groupInfoView.mGroupQRCodeRegion = null;
            groupInfoView.mQrcodeDescTv = null;
            groupInfoView.mTitleBar = null;
            groupInfoView.mBindTeamName = null;
            groupInfoView.mUnbindActionTip = null;
            groupInfoView.mBindTeamLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupInfoView_ViewBinding(GroupInfoView groupInfoView, View view) {
        this.f89369a = groupInfoView;
        groupInfoView.mGroupPhotoIV = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.iv_group_photo, "field 'mGroupPhotoIV'", LKUIRoundedImageView2.class);
        groupInfoView.mGroupPhotoRegion = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.rl_group_photo_region, "field 'mGroupPhotoRegion'", RelativeLayout.class);
        groupInfoView.mGroupPhotoArrowIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_right_arrow_1, "field 'mGroupPhotoArrowIV'", ImageView.class);
        groupInfoView.mGroupPhotoDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_photo_desc, "field 'mGroupPhotoDescTv'", TextView.class);
        groupInfoView.mGroupNameTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_name, "field 'mGroupNameTV'", TextView.class);
        groupInfoView.mGroupNameRegion = Utils.findRequiredView(view, R.id.rl_group_name_region, "field 'mGroupNameRegion'");
        groupInfoView.mGroupNameArrowIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_right_arrow_2, "field 'mGroupNameArrowIV'", ImageView.class);
        groupInfoView.mGroupNameDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_name_desc, "field 'mGroupNameDescTv'", TextView.class);
        groupInfoView.mGroupDescribeTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_group_describe, "field 'mGroupDescribeTV'", TextView.class);
        groupInfoView.mGroupDescribeRegion = Utils.findRequiredView(view, R.id.ll_describe_region, "field 'mGroupDescribeRegion'");
        groupInfoView.mGroupDescArrowIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_right_arrow_3, "field 'mGroupDescArrowIV'", ImageView.class);
        groupInfoView.mGroupDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_about, "field 'mGroupDescTv'", TextView.class);
        groupInfoView.mGroupQRCodeRegion = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ll_qrcode_region, "field 'mGroupQRCodeRegion'", RelativeLayout.class);
        groupInfoView.mQrcodeDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_qrcode_desc, "field 'mQrcodeDescTv'", TextView.class);
        groupInfoView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        groupInfoView.mBindTeamName = (TextView) Utils.findRequiredViewAsType(view, R.id.bind_team_name, "field 'mBindTeamName'", TextView.class);
        groupInfoView.mUnbindActionTip = (TextView) Utils.findRequiredViewAsType(view, R.id.unbind_action_tip, "field 'mUnbindActionTip'", TextView.class);
        groupInfoView.mBindTeamLayout = Utils.findRequiredView(view, R.id.bind_team_layout, "field 'mBindTeamLayout'");
    }
}
