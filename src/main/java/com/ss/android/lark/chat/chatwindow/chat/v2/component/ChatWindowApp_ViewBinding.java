package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class ChatWindowApp_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatWindowApp f86333a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatWindowApp chatWindowApp = this.f86333a;
        if (chatWindowApp != null) {
            this.f86333a = null;
            chatWindowApp.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatWindowApp_ViewBinding(ChatWindowApp chatWindowApp, View view) {
        this.f86333a = chatWindowApp;
        chatWindowApp.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", FrameLayout.class);
    }
}
