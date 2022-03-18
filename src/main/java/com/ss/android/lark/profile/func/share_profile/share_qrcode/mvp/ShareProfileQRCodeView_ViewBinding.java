package com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp;

import android.view.View;
import android.widget.RelativeLayout;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView_ViewBinding;

public class ShareProfileQRCodeView_ViewBinding extends BaseQRCodeView_ViewBinding {

    /* renamed from: a */
    private ShareProfileQRCodeView f129987a;

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView_ViewBinding, butterknife.Unbinder
    public void unbind() {
        ShareProfileQRCodeView shareProfileQRCodeView = this.f129987a;
        if (shareProfileQRCodeView != null) {
            this.f129987a = null;
            shareProfileQRCodeView.mContactProfileQRCodeResetBtn = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareProfileQRCodeView_ViewBinding(ShareProfileQRCodeView shareProfileQRCodeView, View view) {
        super(shareProfileQRCodeView, view);
        this.f129987a = shareProfileQRCodeView;
        shareProfileQRCodeView.mContactProfileQRCodeResetBtn = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.share_profile_qrcode_reset_layout, "field 'mContactProfileQRCodeResetBtn'", RelativeLayout.class);
    }
}
