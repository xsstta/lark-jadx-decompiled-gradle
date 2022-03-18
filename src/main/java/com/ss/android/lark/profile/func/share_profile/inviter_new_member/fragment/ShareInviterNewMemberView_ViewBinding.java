package com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView_ViewBinding;
import com.ss.android.lark.ui.RotateLoadingView;

public class ShareInviterNewMemberView_ViewBinding extends BaseQRCodeView_ViewBinding {

    /* renamed from: a */
    private ShareInviterNewMemberView f129933a;

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView_ViewBinding, butterknife.Unbinder
    public void unbind() {
        ShareInviterNewMemberView shareInviterNewMemberView = this.f129933a;
        if (shareInviterNewMemberView != null) {
            this.f129933a = null;
            shareInviterNewMemberView.mInviterNewMemberTips = null;
            shareInviterNewMemberView.qrCodeLayout = null;
            shareInviterNewMemberView.fragmentQrCodeError = null;
            shareInviterNewMemberView.fragmentLoading = null;
            shareInviterNewMemberView.errorMsg = null;
            shareInviterNewMemberView.errorIcon = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareInviterNewMemberView_ViewBinding(ShareInviterNewMemberView shareInviterNewMemberView, View view) {
        super(shareInviterNewMemberView, view);
        this.f129933a = shareInviterNewMemberView;
        shareInviterNewMemberView.mInviterNewMemberTips = (TextView) Utils.findRequiredViewAsType(view, R.id.inviter_new_member_tips, "field 'mInviterNewMemberTips'", TextView.class);
        shareInviterNewMemberView.qrCodeLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.qrcode_layout, "field 'qrCodeLayout'", RelativeLayout.class);
        shareInviterNewMemberView.fragmentQrCodeError = Utils.findRequiredView(view, R.id.error_page, "field 'fragmentQrCodeError'");
        shareInviterNewMemberView.fragmentLoading = (RotateLoadingView) Utils.findRequiredViewAsType(view, R.id.fragment_loading, "field 'fragmentLoading'", RotateLoadingView.class);
        shareInviterNewMemberView.errorMsg = (TextView) Utils.findRequiredViewAsType(view, R.id.error_msg, "field 'errorMsg'", TextView.class);
        shareInviterNewMemberView.errorIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.error_icon, "field 'errorIcon'", ImageView.class);
    }
}
