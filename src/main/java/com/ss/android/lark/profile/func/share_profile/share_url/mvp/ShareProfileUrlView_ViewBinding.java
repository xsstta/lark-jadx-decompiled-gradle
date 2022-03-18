package com.ss.android.lark.profile.func.share_profile.share_url.mvp;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class ShareProfileUrlView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShareProfileUrlView f130014a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ShareProfileUrlView shareProfileUrlView = this.f130014a;
        if (shareProfileUrlView != null) {
            this.f130014a = null;
            shareProfileUrlView.mContactAvatar = null;
            shareProfileUrlView.mContactName = null;
            shareProfileUrlView.mShareProfileUrl = null;
            shareProfileUrlView.mCopyContactProfileUrlLinkBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareProfileUrlView_ViewBinding(ShareProfileUrlView shareProfileUrlView, View view) {
        this.f130014a = shareProfileUrlView;
        shareProfileUrlView.mContactAvatar = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.share_profile_url_contact_avatar, "field 'mContactAvatar'", LKUIRoundedImageView.class);
        shareProfileUrlView.mContactName = (TextView) Utils.findRequiredViewAsType(view, R.id.share_profile_url_contact_name, "field 'mContactName'", TextView.class);
        shareProfileUrlView.mShareProfileUrl = (TextView) Utils.findRequiredViewAsType(view, R.id.share_profile_url, "field 'mShareProfileUrl'", TextView.class);
        shareProfileUrlView.mCopyContactProfileUrlLinkBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.share_profile_url_copy_link_btn, "field 'mCopyContactProfileUrlLinkBtn'", TextView.class);
    }
}
