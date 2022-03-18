package com.ss.android.lark.notification.setting.impl.setting;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SpecificMessageFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SpecificMessageFragment f122252a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SpecificMessageFragment specificMessageFragment = this.f122252a;
        if (specificMessageFragment != null) {
            this.f122252a = null;
            specificMessageFragment.mTitleBar = null;
            specificMessageFragment.mContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SpecificMessageFragment_ViewBinding(SpecificMessageFragment specificMessageFragment, View view) {
        this.f122252a = specificMessageFragment;
        specificMessageFragment.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleBar'", CommonTitleBar.class);
        specificMessageFragment.mContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.options_container, "field 'mContainer'", LinearLayout.class);
    }
}
