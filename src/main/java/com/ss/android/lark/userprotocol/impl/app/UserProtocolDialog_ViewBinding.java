package com.ss.android.lark.userprotocol.impl.app;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext.RichTextView;

public class UserProtocolDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UserProtocolDialog f142219a;

    @Override // butterknife.Unbinder
    public void unbind() {
        UserProtocolDialog userProtocolDialog = this.f142219a;
        if (userProtocolDialog != null) {
            this.f142219a = null;
            userProtocolDialog.titleView = null;
            userProtocolDialog.userPtocolContent = null;
            userProtocolDialog.userPtocolCheckGroup = null;
            userProtocolDialog.userPtocolCheckIcon = null;
            userProtocolDialog.userPtocolConfirm = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserProtocolDialog_ViewBinding(UserProtocolDialog userProtocolDialog, View view) {
        this.f142219a = userProtocolDialog;
        userProtocolDialog.titleView = (TextView) Utils.findRequiredViewAsType(view, R.id.dialog_title, "field 'titleView'", TextView.class);
        userProtocolDialog.userPtocolContent = (RichTextView) Utils.findRequiredViewAsType(view, R.id.user_ptocol_content, "field 'userPtocolContent'", RichTextView.class);
        userProtocolDialog.userPtocolCheckGroup = Utils.findRequiredView(view, R.id.user_ptocol_check_group, "field 'userPtocolCheckGroup'");
        userProtocolDialog.userPtocolCheckIcon = (ImageButton) Utils.findRequiredViewAsType(view, R.id.user_ptocol_check_icon, "field 'userPtocolCheckIcon'", ImageButton.class);
        userProtocolDialog.userPtocolConfirm = (TextView) Utils.findRequiredViewAsType(view, R.id.user_ptocol_confirm, "field 'userPtocolConfirm'", TextView.class);
    }
}
