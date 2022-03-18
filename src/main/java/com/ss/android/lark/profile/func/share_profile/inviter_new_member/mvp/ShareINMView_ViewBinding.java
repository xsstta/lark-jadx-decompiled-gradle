package com.ss.android.lark.profile.func.share_profile.inviter_new_member.mvp;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class ShareINMView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShareINMView f129946a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ShareINMView shareINMView = this.f129946a;
        if (shareINMView != null) {
            this.f129946a = null;
            shareINMView.mShareInviterNewMemberTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShareINMView_ViewBinding(ShareINMView shareINMView, View view) {
        this.f129946a = shareINMView;
        shareINMView.mShareInviterNewMemberTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.share_inviter_new_member_title_bar, "field 'mShareInviterNewMemberTitleBar'", CommonTitleBar.class);
    }
}
