package com.ss.android.lark.profile.func.friend_request.mvp;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class ReasonEditView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ReasonEditView f129670a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ReasonEditView reasonEditView = this.f129670a;
        if (reasonEditView != null) {
            this.f129670a = null;
            reasonEditView.mTitleBar = null;
            reasonEditView.mReasonET = null;
            reasonEditView.mReasonClearBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ReasonEditView_ViewBinding(ReasonEditView reasonEditView, View view) {
        this.f129670a = reasonEditView;
        reasonEditView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        reasonEditView.mReasonET = (EditText) Utils.findRequiredViewAsType(view, R.id.friend_request_reason_edit_text, "field 'mReasonET'", EditText.class);
        reasonEditView.mReasonClearBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.clear_btn, "field 'mReasonClearBtn'", ImageView.class);
    }
}
