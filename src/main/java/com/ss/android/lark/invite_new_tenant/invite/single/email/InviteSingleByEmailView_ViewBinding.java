package com.ss.android.lark.invite_new_tenant.invite.single.email;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout;

public class InviteSingleByEmailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteSingleByEmailView f103006a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InviteSingleByEmailView inviteSingleByEmailView = this.f103006a;
        if (inviteSingleByEmailView != null) {
            this.f103006a = null;
            inviteSingleByEmailView.mMobileMumEt = null;
            inviteSingleByEmailView.mSubmitBtn = null;
            inviteSingleByEmailView.mTipIv = null;
            inviteSingleByEmailView.mTipTextTv = null;
            inviteSingleByEmailView.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteSingleByEmailView_ViewBinding(InviteSingleByEmailView inviteSingleByEmailView, View view) {
        this.f103006a = inviteSingleByEmailView;
        inviteSingleByEmailView.mMobileMumEt = (EditText) Utils.findRequiredViewAsType(view, R.id.invite_single_by_email_num, "field 'mMobileMumEt'", EditText.class);
        inviteSingleByEmailView.mSubmitBtn = (Button) Utils.findRequiredViewAsType(view, R.id.invite_single_by_email_confirm_invite, "field 'mSubmitBtn'", Button.class);
        inviteSingleByEmailView.mTipIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.invite_single_by_email_tip_image, "field 'mTipIv'", ImageView.class);
        inviteSingleByEmailView.mTipTextTv = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_single_by_email_tip_text, "field 'mTipTextTv'", TextView.class);
        inviteSingleByEmailView.mRootView = (KeyboardDetectorFrameLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", KeyboardDetectorFrameLayout.class);
    }
}
