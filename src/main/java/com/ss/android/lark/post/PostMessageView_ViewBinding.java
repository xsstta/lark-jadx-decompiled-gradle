package com.ss.android.lark.post;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;

public class PostMessageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PostMessageView f129418a;

    @Override // butterknife.Unbinder
    public void unbind() {
        PostMessageView postMessageView = this.f129418a;
        if (postMessageView != null) {
            this.f129418a = null;
            postMessageView.mKeyboardDetectorView = null;
            postMessageView.mEditContainer = null;
            postMessageView.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PostMessageView_ViewBinding(PostMessageView postMessageView, View view) {
        this.f129418a = postMessageView;
        postMessageView.mKeyboardDetectorView = (SysKeyBoardObserveFrameLayout) Utils.findRequiredViewAsType(view, R.id.keyboard_detector_view, "field 'mKeyboardDetectorView'", SysKeyBoardObserveFrameLayout.class);
        postMessageView.mEditContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.edit_keyboard_container, "field 'mEditContainer'", FrameLayout.class);
        postMessageView.mFragmentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.group_select_fragment, "field 'mFragmentContainer'", FrameLayout.class);
    }
}
