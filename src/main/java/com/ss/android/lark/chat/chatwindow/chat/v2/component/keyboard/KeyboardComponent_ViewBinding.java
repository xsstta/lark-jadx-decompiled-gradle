package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboard;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class KeyboardComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private KeyboardComponent f86405a;

    @Override // butterknife.Unbinder
    public void unbind() {
        KeyboardComponent keyboardComponent = this.f86405a;
        if (keyboardComponent != null) {
            this.f86405a = null;
            keyboardComponent.mKeyboardContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public KeyboardComponent_ViewBinding(KeyboardComponent keyboardComponent, View view) {
        this.f86405a = keyboardComponent;
        keyboardComponent.mKeyboardContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.chat_window_keyboard_container, "field 'mKeyboardContainer'", FrameLayout.class);
    }
}
