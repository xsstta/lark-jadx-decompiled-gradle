package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout;

public class InviteSingleByMobileView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteSingleByMobileView f103018a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InviteSingleByMobileView inviteSingleByMobileView = this.f103018a;
        if (inviteSingleByMobileView != null) {
            this.f103018a = null;
            inviteSingleByMobileView.mMobileCodeTv = null;
            inviteSingleByMobileView.mMobileMumEt = null;
            inviteSingleByMobileView.mSubmitBtn = null;
            inviteSingleByMobileView.mTipIv = null;
            inviteSingleByMobileView.mTipTextTv = null;
            inviteSingleByMobileView.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteSingleByMobileView_ViewBinding(InviteSingleByMobileView inviteSingleByMobileView, View view) {
        this.f103018a = inviteSingleByMobileView;
        inviteSingleByMobileView.mMobileCodeTv = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_single_by_mobile_area_num, "field 'mMobileCodeTv'", TextView.class);
        inviteSingleByMobileView.mMobileMumEt = (EditText) Utils.findRequiredViewAsType(view, R.id.invite_single_by_mobile_num, "field 'mMobileMumEt'", EditText.class);
        inviteSingleByMobileView.mSubmitBtn = (Button) Utils.findRequiredViewAsType(view, R.id.invite_single_by_mobile_confirm_invite, "field 'mSubmitBtn'", Button.class);
        inviteSingleByMobileView.mTipIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.invite_single_by_mobile_tip_image, "field 'mTipIv'", ImageView.class);
        inviteSingleByMobileView.mTipTextTv = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_single_by_mobile_tip_text, "field 'mTipTextTv'", TextView.class);
        inviteSingleByMobileView.mRootView = (KeyboardDetectorFrameLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", KeyboardDetectorFrameLayout.class);
    }
}
