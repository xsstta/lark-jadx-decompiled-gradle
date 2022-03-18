package com.ss.android.lark.forward.impl.view;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class BaseForwardView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseForwardView f98844a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseForwardView baseForwardView = this.f98844a;
        if (baseForwardView != null) {
            this.f98844a = null;
            baseForwardView.mTitleBar = null;
            baseForwardView.mChatPicker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseForwardView_ViewBinding(BaseForwardView baseForwardView, View view) {
        this.f98844a = baseForwardView;
        baseForwardView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        baseForwardView.mChatPicker = (ChatPicker) Utils.findRequiredViewAsType(view, R.id.forward_chat_picker, "field 'mChatPicker'", ChatPicker.class);
    }
}
