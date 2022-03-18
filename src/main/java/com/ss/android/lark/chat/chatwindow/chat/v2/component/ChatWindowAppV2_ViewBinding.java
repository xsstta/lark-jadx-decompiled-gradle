package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class ChatWindowAppV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatWindowAppV2 f86332a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatWindowAppV2 chatWindowAppV2 = this.f86332a;
        if (chatWindowAppV2 != null) {
            this.f86332a = null;
            chatWindowAppV2.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatWindowAppV2_ViewBinding(ChatWindowAppV2 chatWindowAppV2, View view) {
        this.f86332a = chatWindowAppV2;
        chatWindowAppV2.mRootView = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", FrameLayout.class);
    }
}
