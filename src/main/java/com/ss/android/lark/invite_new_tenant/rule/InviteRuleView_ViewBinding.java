package com.ss.android.lark.invite_new_tenant.rule;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class InviteRuleView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InviteRuleView f103050a;

    @Override // butterknife.Unbinder
    public void unbind() {
        InviteRuleView inviteRuleView = this.f103050a;
        if (inviteRuleView != null) {
            this.f103050a = null;
            inviteRuleView.mRichTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InviteRuleView_ViewBinding(InviteRuleView inviteRuleView, View view) {
        this.f103050a = inviteRuleView;
        inviteRuleView.mRichTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.activity_invite_content, "field 'mRichTextView'", TextView.class);
    }
}
