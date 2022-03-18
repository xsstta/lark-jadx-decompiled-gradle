package com.ss.android.lark.mine.impl.status.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconEditText;

public class UserStatusView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UserStatusView f115614a;

    @Override // butterknife.Unbinder
    public void unbind() {
        UserStatusView userStatusView = this.f115614a;
        if (userStatusView != null) {
            this.f115614a = null;
            userStatusView.mTitleBar = null;
            userStatusView.mInputTV = null;
            userStatusView.mCountTextView = null;
            userStatusView.mHistoryStatusRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserStatusView_ViewBinding(UserStatusView userStatusView, View view) {
        this.f115614a = userStatusView;
        userStatusView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        userStatusView.mInputTV = (EmojiconEditText) Utils.findRequiredViewAsType(view, R.id.ed_input, "field 'mInputTV'", EmojiconEditText.class);
        userStatusView.mCountTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_count, "field 'mCountTextView'", TextView.class);
        userStatusView.mHistoryStatusRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.rv_history_status, "field 'mHistoryStatusRV'", RecyclerView.class);
    }
}
