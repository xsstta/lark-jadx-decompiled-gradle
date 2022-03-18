package com.ss.android.lark.chatsetting.impl.group.info.qrcode;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.RotateLoadingView;

public class GroupQRCodeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupQRCodeView f89469a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupQRCodeView groupQRCodeView = this.f89469a;
        if (groupQRCodeView != null) {
            this.f89469a = null;
            groupQRCodeView.mGroupQRCode = null;
            groupQRCodeView.mTitleBar = null;
            groupQRCodeView.mGroupQRCodeInfoLayout = null;
            groupQRCodeView.mGroupQRCodeBlurHeader = null;
            groupQRCodeView.mGroupAvatar = null;
            groupQRCodeView.mGroupName = null;
            groupQRCodeView.mGroupDesc = null;
            groupQRCodeView.mGroupQRCodeLayout = null;
            groupQRCodeView.mGroupQRCodeIV = null;
            groupQRCodeView.mGroupQRCodeValidTipTV = null;
            groupQRCodeView.mGroupQRCodeModifyShareCardValidityPeriod = null;
            groupQRCodeView.mGroupQRCodeSaveToPhoneBtn = null;
            groupQRCodeView.mGroupQRCodeShareBtn = null;
            groupQRCodeView.mGroupQRCodeEmptyLayout = null;
            groupQRCodeView.mGroupQRCodeLoadAgainBtn = null;
            groupQRCodeView.mGroupQRCodeLoadingLayout = null;
            groupQRCodeView.mGroupQRCodeLoading = null;
            groupQRCodeView.mQRCodeAddTipTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupQRCodeView_ViewBinding(GroupQRCodeView groupQRCodeView, View view) {
        this.f89469a = groupQRCodeView;
        groupQRCodeView.mGroupQRCode = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_qrcode, "field 'mGroupQRCode'", RelativeLayout.class);
        groupQRCodeView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.group_qrcode_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        groupQRCodeView.mGroupQRCodeInfoLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.qrcode_group_info_layout, "field 'mGroupQRCodeInfoLayout'", LinearLayout.class);
        groupQRCodeView.mGroupQRCodeBlurHeader = (ImageView) Utils.findRequiredViewAsType(view, R.id.qrcode_blur_header, "field 'mGroupQRCodeBlurHeader'", ImageView.class);
        groupQRCodeView.mGroupAvatar = (ListenableImageView) Utils.findRequiredViewAsType(view, R.id.qrcode_group_avatar, "field 'mGroupAvatar'", ListenableImageView.class);
        groupQRCodeView.mGroupName = (TextView) Utils.findRequiredViewAsType(view, R.id.qrcode_group_name, "field 'mGroupName'", TextView.class);
        groupQRCodeView.mGroupDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.qrcode_group_desc, "field 'mGroupDesc'", TextView.class);
        groupQRCodeView.mGroupQRCodeLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.group_qrcode_layout, "field 'mGroupQRCodeLayout'", LinearLayout.class);
        groupQRCodeView.mGroupQRCodeIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.group_qrcode_iv, "field 'mGroupQRCodeIV'", ImageView.class);
        groupQRCodeView.mGroupQRCodeValidTipTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_qrcode_valid_tip, "field 'mGroupQRCodeValidTipTV'", TextView.class);
        groupQRCodeView.mGroupQRCodeModifyShareCardValidityPeriod = (TextView) Utils.findRequiredViewAsType(view, R.id.qrcode_group_modify_share_card_validity_period, "field 'mGroupQRCodeModifyShareCardValidityPeriod'", TextView.class);
        groupQRCodeView.mGroupQRCodeSaveToPhoneBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.group_qrcode_save_to_phone_btn, "field 'mGroupQRCodeSaveToPhoneBtn'", TextView.class);
        groupQRCodeView.mGroupQRCodeShareBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.group_qrcode_share_btn, "field 'mGroupQRCodeShareBtn'", TextView.class);
        groupQRCodeView.mGroupQRCodeEmptyLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_qrcode_empty_layout, "field 'mGroupQRCodeEmptyLayout'", RelativeLayout.class);
        groupQRCodeView.mGroupQRCodeLoadAgainBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.group_qrcode_load_again, "field 'mGroupQRCodeLoadAgainBtn'", TextView.class);
        groupQRCodeView.mGroupQRCodeLoadingLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_qrcode_loading_layout, "field 'mGroupQRCodeLoadingLayout'", RelativeLayout.class);
        groupQRCodeView.mGroupQRCodeLoading = (RotateLoadingView) Utils.findRequiredViewAsType(view, R.id.group_qrcode_loading, "field 'mGroupQRCodeLoading'", RotateLoadingView.class);
        groupQRCodeView.mQRCodeAddTipTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_qrcode_add_tip, "field 'mQRCodeAddTipTv'", TextView.class);
    }
}
