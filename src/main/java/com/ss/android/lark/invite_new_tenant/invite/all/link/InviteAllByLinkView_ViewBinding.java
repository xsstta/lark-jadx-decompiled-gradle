package com.ss.android.lark.invite_new_tenant.invite.all.link;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class InviteAllByLinkView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteAllByLinkView f102969a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InviteAllByLinkView inviteAllByLinkView = this.f102969a;
        if (inviteAllByLinkView != null) {
            this.f102969a = null;
            inviteAllByLinkView.mCopyBtn = null;
            inviteAllByLinkView.mInviteUrlTv = null;
            inviteAllByLinkView.mNameTv = null;
            inviteAllByLinkView.mAvatarIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteAllByLinkView_ViewBinding(InviteAllByLinkView inviteAllByLinkView, View view) {
        this.f102969a = inviteAllByLinkView;
        inviteAllByLinkView.mCopyBtn = (Button) Utils.findRequiredViewAsType(view, R.id.invite_all_link_url_copy_link_btn, "field 'mCopyBtn'", Button.class);
        inviteAllByLinkView.mInviteUrlTv = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_all_link_url, "field 'mInviteUrlTv'", TextView.class);
        inviteAllByLinkView.mNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.invite_all_by_link_name, "field 'mNameTv'", TextView.class);
        inviteAllByLinkView.mAvatarIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.invite_all_by_link_avatar, "field 'mAvatarIv'", ImageView.class);
    }
}
