package com.ss.android.lark.chat.chatwindow.chat.v2.component.keyboardtop;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class KeyboardTopExtendComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private KeyboardTopExtendComponent f86453a;

    @Override // butterknife.Unbinder
    public void unbind() {
        KeyboardTopExtendComponent keyboardTopExtendComponent = this.f86453a;
        if (keyboardTopExtendComponent != null) {
            this.f86453a = null;
            keyboardTopExtendComponent.mTimeZoneContainer = null;
            keyboardTopExtendComponent.mSmartReplyContainer = null;
            keyboardTopExtendComponent.mExtendContainer = null;
            keyboardTopExtendComponent.mRootLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public KeyboardTopExtendComponent_ViewBinding(KeyboardTopExtendComponent keyboardTopExtendComponent, View view) {
        this.f86453a = keyboardTopExtendComponent;
        keyboardTopExtendComponent.mTimeZoneContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_timezone_container, "field 'mTimeZoneContainer'", ViewGroup.class);
        keyboardTopExtendComponent.mSmartReplyContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.fl_chat_smart_reply_container, "field 'mSmartReplyContainer'", ViewGroup.class);
        keyboardTopExtendComponent.mExtendContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.extend_container, "field 'mExtendContainer'", FrameLayout.class);
        keyboardTopExtendComponent.mRootLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.root_container, "field 'mRootLayout'", ConstraintLayout.class);
    }
}
