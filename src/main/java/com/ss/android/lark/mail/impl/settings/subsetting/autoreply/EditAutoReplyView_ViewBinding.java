package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class EditAutoReplyView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditAutoReplyView f110458a;

    @Override // butterknife.Unbinder
    public void unbind() {
        EditAutoReplyView editAutoReplyView = this.f110458a;
        if (editAutoReplyView != null) {
            this.f110458a = null;
            editAutoReplyView.mCloseView = null;
            editAutoReplyView.mSaveView = null;
            editAutoReplyView.container = null;
            editAutoReplyView.mWebviewContainer = null;
            editAutoReplyView.mComposeScrollView = null;
            editAutoReplyView.mToolbarHeightView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditAutoReplyView_ViewBinding(EditAutoReplyView editAutoReplyView, View view) {
        this.f110458a = editAutoReplyView;
        editAutoReplyView.mCloseView = Utils.findRequiredView(view, R.id.mail_label_close, "field 'mCloseView'");
        editAutoReplyView.mSaveView = Utils.findRequiredView(view, R.id.mail_save_tv, "field 'mSaveView'");
        editAutoReplyView.container = Utils.findRequiredView(view, R.id.activity_container, "field 'container'");
        editAutoReplyView.mWebviewContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.webview_mail_container, "field 'mWebviewContainer'", LinearLayout.class);
        editAutoReplyView.mComposeScrollView = (ScrollView) Utils.findRequiredViewAsType(view, R.id.page_scroller, "field 'mComposeScrollView'", ScrollView.class);
        editAutoReplyView.mToolbarHeightView = Utils.findRequiredView(view, R.id.mail_toolbar_height, "field 'mToolbarHeightView'");
    }
}
