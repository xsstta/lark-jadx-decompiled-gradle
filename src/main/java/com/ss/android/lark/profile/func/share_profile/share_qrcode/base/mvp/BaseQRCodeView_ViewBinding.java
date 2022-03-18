package com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.RotateLoadingView;

public class BaseQRCodeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseQRCodeView f129970a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseQRCodeView baseQRCodeView = this.f129970a;
        if (baseQRCodeView != null) {
            this.f129970a = null;
            baseQRCodeView.mContactProfileQRCodeIV = null;
            baseQRCodeView.mContactProfileQRCodeLoading = null;
            baseQRCodeView.mSaveContactProfileQRCodeToAlbumBtn = null;
            baseQRCodeView.mContactAvatar = null;
            baseQRCodeView.mContactName = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseQRCodeView_ViewBinding(BaseQRCodeView baseQRCodeView, View view) {
        this.f129970a = baseQRCodeView;
        baseQRCodeView.mContactProfileQRCodeIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.share_profile_qrcode_iv, "field 'mContactProfileQRCodeIV'", ImageView.class);
        baseQRCodeView.mContactProfileQRCodeLoading = (RotateLoadingView) Utils.findRequiredViewAsType(view, R.id.share_profile_qrcode_loading, "field 'mContactProfileQRCodeLoading'", RotateLoadingView.class);
        baseQRCodeView.mSaveContactProfileQRCodeToAlbumBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.share_profile_qrcode_save_to_album_btn, "field 'mSaveContactProfileQRCodeToAlbumBtn'", TextView.class);
        baseQRCodeView.mContactAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.share_profile_qrcode_contact_avatar, "field 'mContactAvatar'", LKUIRoundedImageView.class);
        baseQRCodeView.mContactName = (TextView) Utils.findRequiredViewAsType(view, R.id.share_profile_qrcode_contact_name, "field 'mContactName'", TextView.class);
    }
}
