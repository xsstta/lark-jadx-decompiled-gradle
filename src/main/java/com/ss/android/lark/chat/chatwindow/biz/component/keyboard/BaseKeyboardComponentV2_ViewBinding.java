package com.ss.android.lark.chat.chatwindow.biz.component.keyboard;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class BaseKeyboardComponentV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseKeyboardComponentV2 f85001a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseKeyboardComponentV2 baseKeyboardComponentV2 = this.f85001a;
        if (baseKeyboardComponentV2 != null) {
            this.f85001a = null;
            baseKeyboardComponentV2.mKeyboardContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseKeyboardComponentV2_ViewBinding(BaseKeyboardComponentV2 baseKeyboardComponentV2, View view) {
        this.f85001a = baseKeyboardComponentV2;
        baseKeyboardComponentV2.mKeyboardContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.chat_window_keyboard_container, "field 'mKeyboardContainer'", FrameLayout.class);
    }
}
