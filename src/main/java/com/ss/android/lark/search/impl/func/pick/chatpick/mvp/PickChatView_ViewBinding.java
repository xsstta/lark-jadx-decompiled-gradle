package com.ss.android.lark.search.impl.func.pick.chatpick.mvp;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class PickChatView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PickChatView f132437a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PickChatView pickChatView = this.f132437a;
        if (pickChatView != null) {
            this.f132437a = null;
            pickChatView.mTitleBar = null;
            pickChatView.mChatPicker = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PickChatView_ViewBinding(PickChatView pickChatView, View view) {
        this.f132437a = pickChatView;
        pickChatView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        pickChatView.mChatPicker = (ChatPicker) Utils.findRequiredViewAsType(view, R.id.chat_picker, "field 'mChatPicker'", ChatPicker.class);
    }
}
