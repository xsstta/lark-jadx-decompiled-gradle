package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;

public class AdvanceAvatarView extends LarkAvatarView {
    public void requestLayout() {
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            super.requestLayout();
        }
    }

    public AdvanceAvatarView(Context context) {
        super(context);
    }

    public AdvanceAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdvanceAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
