package com.ss.android.lark.invite_new_tenant.invite.all.qrcode;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.RotateLoadingView;

public class InviteAllByQrView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteAllByQrView f102981a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InviteAllByQrView inviteAllByQrView = this.f102981a;
        if (inviteAllByQrView != null) {
            this.f102981a = null;
            inviteAllByQrView.mSaveImgBtn = null;
            inviteAllByQrView.mQrIv = null;
            inviteAllByQrView.mNameTv = null;
            inviteAllByQrView.mAvatarIv = null;
            inviteAllByQrView.mLoadingView = null;
            inviteAllByQrView.mInviteRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteAllByQrView_ViewBinding(InviteAllByQrView inviteAllByQrView, View view) {
        this.f102981a = inviteAllByQrView;
        inviteAllByQrView.mSaveImgBtn = (Button) Utils.findRequiredViewAsType(view, R.id.invite_all_by_qrcode_save_to_album_btn, "field 'mSaveImgBtn'", Button.class);
        inviteAllByQrView.mQrIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.invite_all_by_qrcode_iv, "field 'mQrIv'", ImageView.class);
        inviteAllByQrView.mNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_all_by_qrcode_contact_name, "field 'mNameTv'", TextView.class);
        inviteAllByQrView.mAvatarIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.invite_all_by_qrcode_contact_avatar, "field 'mAvatarIv'", ImageView.class);
        inviteAllByQrView.mLoadingView = (RotateLoadingView) Utils.findRequiredViewAsType(view, R.id.invite_all_by_qrcode_loading, "field 'mLoadingView'", RotateLoadingView.class);
        inviteAllByQrView.mInviteRootView = Utils.findRequiredView(view, R.id.invite_all_by_qrcode_layout, "field 'mInviteRootView'");
    }
}
